package commands.easy;

import com.fasterxml.jackson.databind.ObjectMapper;
import dragon.Dragon;
import commands.interfaces.Easy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Команда Save
 */
public class CSave implements Easy {
    private String file;
    private HashMap<Long, Dragon> dragons;

    public CSave(File file, HashMap<Long, Dragon> dragons) {
        this.file = String.valueOf(file);
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        try (FileWriter fw = new FileWriter(file)) {
            ObjectMapper om = new ObjectMapper(); // запись в файл при помощи ObjectMapper (с использованием геттеров)
            String json = om.writeValueAsString(dragons);
            fw.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}