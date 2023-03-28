package commands.easy;

import dragon.Dragon;
import commands.interfaces.Easy;

import java.util.HashMap;
/**
 * Команда Clear
 */
public class CClear implements Easy {
    private HashMap<Long, Dragon> dragons;

    public CClear(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        dragons.clear();
    }
}
