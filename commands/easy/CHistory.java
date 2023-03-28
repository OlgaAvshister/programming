package commands.easy;

import commands.interfaces.Easy;
/**
 * Команда History
 */
public class CHistory implements Easy {
    String[] history;

    public CHistory(String[] history) {
        this.history = history;
    }

    @Override
    public void execute() {
        for (int i = 0; i < history.length; i++) {
            if (!history[i].equals("")) {
                System.out.println(history[i]);
            }
        }
    }
}
