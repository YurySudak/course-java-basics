package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;

public class NotebookDemo {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("4,3GHz", "1Tb", "16Gb", new Touchpad(4,5), "15.6\"");
        String sep = File.separator;
        String path =  "src" + sep + "main" + sep + "resources" + sep + "notebook.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(notebook);
            out.flush();
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            notebook = (Notebook) in.readObject();
            System.out.print(notebook.getCPU() + " " + notebook.getHDD() + " " + notebook.getRAM());
            System.out.println(" " + notebook.getTouchpad().getHigh() + " " + notebook.getTouchpad().getWidth());
            System.out.println("Display: " + notebook.getDisplay());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
