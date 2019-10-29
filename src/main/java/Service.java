import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * Основной сервис логики приложения.
 */
public class Service {

    private ArrayList<User> userList = new ArrayList<>();

    /**
     * Метод обработки списка пользователей.
     * @param users Список пользователей для обработки.
     * @return обработаный список.
     */
    static ArrayList<User> merge(ArrayList<User> users) {
        User tempUser;
        String tempEmail;
        Map<String, User> map = new HashMap<>();
        Iterator<User> usersIterator = users.iterator();
        Iterator<String> emailsIterator;
        while (usersIterator.hasNext()) {
            tempUser = usersIterator.next();
            emailsIterator = tempUser.getEmail().iterator();
            while (emailsIterator.hasNext()) {
                tempEmail = emailsIterator.next();
                if (map.get(tempEmail) == null) {
                    map.put(tempEmail, tempUser);
                    continue;
                } else {
                    User user = map.get(tempEmail);
                    while (emailsIterator.hasNext()) {
                        tempEmail = emailsIterator.next();
                        if (map.get(tempEmail) == null) {
                            user.getEmail().add(tempEmail);
                            map.put(tempEmail, user);
                        }
                    }
                    usersIterator.remove();
                }
            }
        }
        return users;
    }

    /**
     * Доабавить пользователя для обработки.
     * @param input Позволяет напечатать в консоль запрос для пользователя.
     */
    void add(ConsoleInput input) {
        String command = input.ask("Введите пользователя:");
        String[] temp = command.split("( -> |, )");
        String name = temp[0];
        List<String> emails = new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(temp, 1, temp.length)));
        User user = new User(name, emails);
        System.out.println("You added new user: " + user);
        userList.add(user);
    }

    /**
     * Метод получения результата.
     */
    void getResult() {

        System.out.println(merge(userList));
    }

    /**
     * Метод отчистки списка пользователей.
     */
    void clear() {
        userList.clear();
    }

}
