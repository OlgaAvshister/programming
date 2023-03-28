package commands.easy;

import commands.interfaces.Easy;
/**
 * Команда Exit
 */
public class CExit implements Easy {
    @Override
    public void execute() {
        System.out.println("Спасибо за пользование программой");
        System.exit(0);
    }
}
