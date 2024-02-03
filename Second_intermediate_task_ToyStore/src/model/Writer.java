package model;

import java.io.*;

public class Writer {
    public void save(int t_id, String name) {
        try (FileWriter writer = new FileWriter("ToyOutput.txt", true);
             BufferedWriter bufferWriter = new BufferedWriter(writer);
        ) {
            bufferWriter.write(t_id +" " + name + " выдан");



        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");

        }

    }
}
