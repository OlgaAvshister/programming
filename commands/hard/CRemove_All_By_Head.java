package commands.hard;

import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * Команда Remove_All_By_Head
 */
public class CRemove_All_By_Head implements Hard {
    private HashMap<Long, Dragon> dragons;

    public CRemove_All_By_Head(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        long size = StaticWorker.checkEnteredLong(arguments[1]);
        if (size > 0) {
            ArrayList<Long> keys = new ArrayList<>();
            for (Map.Entry<Long, Dragon> entry : dragons.entrySet()) {
                Dragon temp = dragons.get(entry.getKey());
                if (size == temp.getHead().getSize()) {
                    keys.add(entry.getKey());
                }
            }
            for (int i = 0; i < keys.size(); i++) {
                this.dragons.remove(keys.get(i));
            }
        }
    }

}
