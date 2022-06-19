package HomeTask5.Task2;

public class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(User user) {
        return this.name.compareTo(user.name);
    }


}
