package HomeTask5.Task2;

import java.util.Set;
import java.util.TreeSet;

public class UserServiceImpl implements UserService<Account, User> {

    @Override
    public void showAllUsers(TreeSet<User> listUsers) {
        listUsers.forEach(System.out::println);
    }

    @Override
    public void showAllAccounts(Set<Account> listAccounts) {
        listAccounts.forEach(System.out::println);
    }

    @Override
    public  double getTax(Account account, User user) {
        return account.sum * 0.05;
    }


}
