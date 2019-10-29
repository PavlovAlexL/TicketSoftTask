public class StartUI {

    private Service service;
    private ConsoleInput input;
    private boolean stopProgram = false;

    public StartUI(Service service, ConsoleInput input) {
        this.service = service;
        this.input = input;
    }

    public static void main(String[] args) {
        ConsoleInput input = new ConsoleInput();
        Service service = new Service();
        new StartUI(service, input).init();
    }

    /**
     * Инициализация работы приложения.
     */
    void init() {
        do {
            showMenu();
            String command = input.ask("Input command:");
            switch (command) {
                case "1":
                    service.add(input);
                    break;
                case "2":
                    service.getResult();
                    break;
                case "3":
                    service.clear();
                    break;
                case "4":
                    System.out.println("Завершение работы");
                    stop();
                    break;
                default:
                    System.out.println("Wrong input");
                    showMenu();
            }
        } while (!stopProgram);
    }

    /**
     * Метод печати меню.
     */
    void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Добавить пользователя в формате Name -> email, email...");
        System.out.println("2. Получить результат");
        System.out.println("3. Отчистить результат");
        System.out.println("4. Завершить работу");
    }

    /**
     * Завершить выполнение программы.
     */
    void stop() {
        this.stopProgram = true;
    }


}
