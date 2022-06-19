package HomeTask5.Task2;

import java.util.Set;
import java.util.TreeSet;

public interface UserService<A extends Account, U extends User & Comparable<User>> {

    void showAllUsers(TreeSet<U> listUsers);

    void showAllAccounts(Set<A> listAccounts);

    double getTax(A account, U user);
}
