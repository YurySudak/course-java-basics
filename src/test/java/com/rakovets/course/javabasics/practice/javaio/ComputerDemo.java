package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("4,3GHz", "1Tb", "16Gb");
        String sep = File.separator;
        String path =  "src" + sep + "main" + sep + "resources" + sep + "computer.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(computer);
            out.flush();
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            computer = (Computer)in.readObject();
            System.out.println(computer.getCPU() + " " + computer.getHDD() + " " + computer.getRAM());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
