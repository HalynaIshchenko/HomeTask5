package HomeTask5.Task2;

public class CreditAccount extends Account{

   public CreditAccount(int id, Double sum) {
      super(id,sum);
   }

   @Override
   public String toString() {
      return "CreditAccount{" +
              "id=" + id +
              '}';
   }
}
