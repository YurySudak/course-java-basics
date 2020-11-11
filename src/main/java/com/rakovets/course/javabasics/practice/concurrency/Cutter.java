package com.rakovets.course.javabasics.practice.concurrency;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Cutter extends Thread {
    Finder finder;

    public Cutter(Finder finder) {
        this.finder = finder;
    }

    public void run() {
        try {
            finder.join();
            if (!finder.isInterrupted()) {
                String sep = File.separator;
                String path = "src" + sep + "main" + sep + "resources" + sep + "result.txt";
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String string;
                StringBuffer data = new StringBuffer();
                while ((string = reader.readLine()) != null) {
                    data.append(string).append("\n");
                }
                reader.close();

                String forbiddenPath = "src" + sep + "main" + sep + "resources" + sep + "forbidden.txt";
                reader = new BufferedReader(new FileReader(forbiddenPath));
                Set<String> badWords = new HashSet<>();
                while ((string = reader.readLine()) != null) {
                    badWords.add(string);
                }
                reader.close();

                string = String.valueOf(data);
                for (String badWord : badWords) {
                    string = string.replaceAll(badWord, "");
                }
                FileWriter writer = new FileWriter(path);
                writer.write(string);
                writer.flush();
                writer.close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
