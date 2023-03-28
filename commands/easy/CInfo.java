package commands.easy;

import dragon.Dragon;
import commands.interfaces.Easy;

import java.time.LocalDate;
import java.util.HashMap;

/**
 * Команда Info
 */
public class CInfo implements Easy {
    private HashMap<Long, Dragon> dragons;
    private LocalDate start = LocalDate.now();

    public CInfo(HashMap<Long, Dragon> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void execute() {
        System.out.println(dragons.getClass());
        System.out.println(start);
        System.out.println(dragons.size());
    }
}
