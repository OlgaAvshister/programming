package commands.hard;

import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Команда Filter_Less_Than_Speaking
 */
public class CFilter_Less_Than_Speaking implements Hard { // todo
    private HashMap<Long, Dragon> dragons;

    public CFilter_Less_Than_Speaking(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println();
        if (!dragons.isEmpty()) {
            if (StaticWorker.checkLegalArgumentFromLessThanSpeaking(arguments[1])) {
                ArrayList<Long> keys = new ArrayList<>();
                boolean isNotSpeaking = arguments[1].equals("0") || arguments[1].equals("false");
                for (Map.Entry<Long, Dragon> entry : dragons.entrySet()) {
                    Dragon temp = dragons.get(entry.getKey());
                    if (temp.getSpeaking() && !isNotSpeaking) {
                        keys.add(entry.getKey());
                    }
                    if (!temp.getSpeaking() && isNotSpeaking) {
                        keys.add(entry.getKey());
                    }
                }
                for (int i = 0; i < keys.size(); i++) {
                    this.dragons.remove(keys.get(i));
                }
            } else {
                System.out.println("Ошибка в аргументах");
            }
        } else {
            System.out.println("Список драконов пуст!");
        }
    }
}