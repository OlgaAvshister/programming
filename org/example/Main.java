package org.example;

import commands.CommandsWorker;

import java.io.IOException;

/**
 * Main класс
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CommandsWorker cw = new CommandsWorker("src/main/dragons.txt");
        cw.work();
    }
}
