package commands.easy;

import dragon.Dragon;
import commands.interfaces.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Команда Print_descending
 */
public class CPrint_Descending implements Easy {
    private HashMap<Long, Dragon> dragons;

    public CPrint_Descending(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        ArrayList<Dragon> list = new ArrayList<>();
        for (Map.Entry<Long, Dragon> entry : dragons.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
