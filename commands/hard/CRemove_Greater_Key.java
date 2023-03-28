package commands.hard;

import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Команда Remove_Greater_Key
 */
public class CRemove_Greater_Key implements Hard {
    private HashMap<Long, Dragon> dragons;

    public CRemove_Greater_Key(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        Long key = StaticWorker.checkEnteredLong(arguments[1]);
        ArrayList<Long> keys = new ArrayList<>();
        for (Map.Entry<Long, Dragon> entry : dragons.entrySet()) {
            if (entry.getKey() > key) {
                keys.add(entry.getKey());
            }
        }
        for (int i = 0; i < keys.size(); i++) {
            dragons.remove(keys.get(i));
        }
    }


}
