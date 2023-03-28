package commands.hard;

import commands.StaticWorker;
import commands.interfaces.Hard;
import dragon.Dragon;

import java.util.HashMap;
/**
 * Команда Replace_If_lowe
 */
public class CReplace_If_lowe implements Hard {
    private HashMap<Long, Dragon> dragons;

    public CReplace_If_lowe(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute(String[] arguments) {
        if (dragons.size() < 2) {
            System.out.println("Слишком мало драконов!");
        } else {
            if (arguments.length < 3) {
                System.out.println("Некорректные данные");
            } else {
                Long idFirst = StaticWorker.checkEnteredLong(arguments[1]);
                Long idSecond = StaticWorker.checkEnteredLong(arguments[2]);
                if (idFirst != -1 && idSecond != -1) {
                    Dragon dragonFirst = dragons.get(idFirst);
                    Dragon dragonSecond = dragons.get(idSecond);
                    if (dragonFirst.compareTo(dragonSecond) > 0) {
                        dragons.remove(dragonFirst.getId());
                        dragons.remove(dragonSecond.getId());
                        dragonSecond.setId(dragonFirst.getId());
                        dragons.put(dragonSecond.getId(), dragonSecond);
                    }
                }
            }
        }
    }


}
