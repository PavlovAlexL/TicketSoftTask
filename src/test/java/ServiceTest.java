import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    private static Service service;

    private static User user1;
    private static User user2;
    private static User user3;
    private static User user4;
    private static User user5;
    private static ArrayList<User> users;

    /**
     * Подготовка тестовой среды.
     */
    @BeforeClass
    public static void loadClass(){
        service = new Service();
    }

    @Test
    public void whenAddValidDataThenReturnValidOutput(){
        user1 = new User("user1", new ArrayList<String>(Arrays.asList("xxx@ya.ru", "foo@gmail.com", "lol@mail.ru")));
        user2 = new User("user2", new ArrayList<String>(Arrays.asList("foo@gmail.com", "ups@pisem.net")));
        user3 = new User("user3", new ArrayList<String>(Arrays.asList("xyz@pisem.net", "vasya@pupkin.com")));
        user4 = new User("user4", new ArrayList<String>(Arrays.asList("ups@pisem.net", "aaa@bbb.ru")));
        user5 = new User("user5", new ArrayList<String>(Arrays.asList("xyz@pisem.net")));
        users = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));

        User ExpectedUser1 = new User("user1", new ArrayList<String>(Arrays.asList("xxx@ya.ru", "foo@gmail.com", "lol@mail.ru", "ups@pisem.net", "aaa@bbb.ru")));
        User ExpectedUser2 = new User("user3", new ArrayList<String>(Arrays.asList("xyz@pisem.net", "vasya@pupkin.com")));
        ArrayList<User> ExpectedUsers = new ArrayList<>(Arrays.asList(ExpectedUser1, ExpectedUser2));

        assertEquals(service.merge(users), ExpectedUsers);
    }


}
