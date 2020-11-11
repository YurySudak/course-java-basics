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
        StringBuilder data = new StringBuilder();
        StringBuffer result = new StringBuffer();
        String line;
        if (dir.exists()) {
            String[] files = dir.list();
            try {
                assert files != null;
                for (String fileName : files) {
                File file = new File(path + sep + fileName);
                if (file.isFile()) {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    while ((line = reader.readLine()) != null)
                        data.append(line).append("\n");
                    data.append("\n");
                    reader.close();
                    if (data.indexOf(word) > -1) {
                        result.append(data);
                    }
                    data.delete(0, data.length());
                }
            }
                if (!resultFile.exists())
                    resultFile.createNewFile();
                FileWriter writer = new FileWriter(resultFile);
                writer.write(String.valueOf(result));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Directory not found!");
            interrupt();
        }
    }
}
