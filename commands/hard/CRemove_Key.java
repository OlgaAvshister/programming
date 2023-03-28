package commands.hard;

import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.HashMap;
/**
 * Команда Remove_Key
 */
public class CRemove_Key implements Hard {
    private HashMap<Long, Dragon> dragons;

    public CRemove_Key(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        Long key = StaticWorker.checkEnteredLong(arguments[1]);
        dragons.remove(key);
    }

}
