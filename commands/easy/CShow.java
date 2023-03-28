package commands.easy;

import dragon.Dragon;
import commands.interfaces.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Команда show
 */
public class CShow implements Easy {
    private HashMap<Long, Dragon> dragons;

    public CShow(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        for (Map.Entry<Long, Dragon> entry : dragons.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
