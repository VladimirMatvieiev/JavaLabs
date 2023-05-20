package edu.nmu.matvieiev.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.nmu.matvieiev.model.University;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonManage {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void toJson(University university, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            String json = gson.toJson(university);
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University fromJson(String filePath) {
        try {
            String json = new String(Files.readAllBytes(Paths.get(filePath)));
            return gson.fromJson(json, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
