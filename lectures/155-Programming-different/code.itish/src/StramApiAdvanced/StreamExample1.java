package StramApiAdvanced;


import java.util.Arrays;
import java.util.List;

class Transaction {
    private String category;
    private int amount;

    public Transaction(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
}
public class StreamExample1 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Grocery",2500),
                new Transaction("Entertainment",500),
                new Transaction("Utilites",1500),
                new Transaction("Travel",2000),
                new Transaction("Entertainment",2500),
                new Transaction("Grocery",2500)

        );

        // usecase 1 : calculate the total amount spent on groceries
        int amount = transactions.stream()
                .filter(c->c.getCategory().equalsIgnoreCase("grocery"))
                .mapToInt(Transaction::getAmount)
                .sum();

        System.out.println(amount);

        // usecase 2 : Find the average expense across all category
        double avgExpense = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .average().orElse(0.0);

        System.out.println("Average Expense " + avgExpense);

    }

}
