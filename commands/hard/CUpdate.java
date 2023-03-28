package commands.hard;

import commands.CommandsWorker;
import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.HashMap;
import java.util.Scanner;
/**
 * Команда Update
 */
public class CUpdate implements Hard {

    private HashMap<Long, Dragon> dragons;

    public CUpdate(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        Long key = StaticWorker.checkEnteredLong(arguments[1]);
        if (key != -1) {
            System.out.println("Создайте нового дракона");
            if (StaticWorker.checkCommsForDragon(CommandsWorker.commandsFromFile)) {
                Dragon dragon = new Dragon(new Scanner(System.in), key, CommandsWorker.commandsFromFile);
                dragons.remove(key);
                dragons.put(dragon.getId(), dragon);
            } else {
                StaticWorker.setExternalExit(true);
                System.out.println("Ошибка исполнения скрипта.");
            }
        }
    }

}
