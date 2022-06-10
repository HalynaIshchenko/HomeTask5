package HomeTask5.Task2;

public class DebitAccount extends Account {

    public DebitAccount(String id, Double sum) {
        super(id, sum);

    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "id=" + id +
                '}';
    }


}


