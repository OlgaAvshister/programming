package commands.easy;

import commands.CommandsWorker;
import commands.StaticWorker;
import dragon.Dragon;
import commands.interfaces.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Команда Insert
 */
public class CInsert implements Easy {
    private HashMap<Long, Dragon> dragons;
    private Scanner scanner = new Scanner(System.in);

    public CInsert(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        long id = findMaxId(dragons);
        if (StaticWorker.checkCommsForDragon(CommandsWorker.commandsFromFile)) {
            Dragon dragon = new Dragon(scanner, ++id, CommandsWorker.commandsFromFile);
            dragons.put(dragon.getId(), dragon);
        } else {
            StaticWorker.setExternalExit(true);
            System.out.println("Ошибка исполнения скрипта.");
        }
    }

    private long findMaxId(HashMap<Long, Dragon> dragons) {
        long result = 0;
        for (Map.Entry<Long, Dragon> entry: dragons.entrySet()) {
            if (entry.getKey() > result) {
                result = entry.getKey();
            }
        }
        return result;
    }




}
