package com.rakovets.course.javabasics.practice.concurrency;

import java.io.*;

public class Finder extends Thread {
    private String path;
    private String word;

    public Finder(String path, String word) {
        this.path = path;
        this.word = word;
    }

    public void run() {
        String sep = File.separator;
        String resultPath = "src" + sep + "main" + sep + "resources" + sep + "result.txt";
        File resultFile = new File(resultPath);
        File dir = new File(path);
        StringBuffer data = new StringBuffer();
        StringBuffer result = new StringBuffer();
        String line = "";
        if (dir.exists()) {
            String[] files = dir.list();
            for (String fileName : files) {
                try {
                    File file = new File(path + sep + fileName);
                    if (file.isFile()) {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        while ((line = reader.readLine()) != null)
                            data.append(line + "\n");
                        reader.close();
                        if (data.indexOf(word) > -1) {
                            result.append(data);
                        }
                        data.delete(0, data.length());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (!resultFile.exists())
                    resultFile.createNewFile();
                FileWriter writer = new FileWriter(resultFile);
                writer.write(String.valueOf(result));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("Directory not found!");
    }
}
