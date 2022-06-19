package HomeTask5.Task2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainBank {

    public static void main(String[] args) {
        Set<Account> accounts = new HashSet<>();
        DebitAccount debitAccount = new DebitAccount("1", 500.0);
        accounts.add(debitAccount);
        accounts.add(new CreditAccount(2,200.0));

        TreeSet<User> users = new TreeSet<>();
        User userC = new User("Oksana");
        users.add(userC);
        users.add(new User("Olena"));
        users.add(new User("Taras"));

        UserService userServiceImpl = new UserServiceImpl();
        userServiceImpl.showAllUsers(users);
        userServiceImpl.showAllAccounts(accounts);
        double taxForUser = userServiceImpl.getTax(debitAccount, userC);
        System.out.printf("tax: %s", taxForUser);


    }
}
