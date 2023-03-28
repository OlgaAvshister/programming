package commands.easy;

import commands.interfaces.Easy;
/**
 * Команда Help
 */
public class CHelp implements Easy {
    @Override
    public void execute() {
        System.out.println("Команда info выводит в стандартный поток вывода информацию о коллекции");
        System.out.println("Команда show выводит в стандартный поток все элементы коллекции в строковом представлении");
        System.out.println("Команда insert добавляет новый элемент с заданным ключом");
        System.out.println("Команда update обновляет значение элемента коллекции, id которого равен заданному");
        System.out.println("Команда remove_key удаляет элемент из коллекции по его ключу");
        System.out.println("Команда clear очищает коллекцию");
        System.out.println("Команда save сохраняет коллекцию в файл");
        System.out.println("Команда execute_script считывает и исполняет скрипт из указанного файла");
        System.out.println("Команда exit завершает программу (без сохранения в файл)");
        System.out.println("Команда history выводит последние 5 команд (без их аргументов)");
        System.out.println("Команда replace_if_lowe заменяет значение по ключу, если новое значение меньше старого");
        System.out.println("Команда remove_greater_key удаляет из коллекции все элементы, ключ которых превышает заданный");
        System.out.println("Команда remove_all_by_head удаляет из коллекции все элементы, значение поля head которых эквивалентно заданному ");
        System.out.println("Команда filter_less_than_speaking выводит элементы, значение поля speaking которых меньше заданного");
        System.out.println("Команда print_descending выводит элементы коллекции в порядке убывания");
    }
}
