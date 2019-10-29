import java.util.Scanner;


/**
 * Класс для взаимодействия с пользователем.
 */
public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод запроса на ввод с чтением данных с консоли.
     *
     * @param question Вводимые данные.
     * @return Валидированная комманда.
     */
    public String ask(String question) {
        System.out.println("\n" + question);
        return scanner.nextLine();
    }
}
