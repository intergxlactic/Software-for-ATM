import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmOperationInf{

    ATM atm = new ATM();
    Map<Double,String> operations = new HashMap<>();

    @Override
    public void showBalance() {
        System.out.println("Ваш баланс - " + atm.getBalance());
    }

    @Override
    public void withdraw_amount(double withdraw_amount) {
        operations.put(withdraw_amount," были сняты");
        if (withdraw_amount <= atm.getBalance()){
            System.out.println(withdraw_amount + " были сняты с вашего счета");
            atm.setBalance(atm.getBalance() - withdraw_amount);
            showBalance();
        } else {
            System.out.println("На вашем счету недостаточно денег");
        }
    }

    @Override
    public void deposit_amount(double deposit_amount) {
        operations.put(deposit_amount," было внесено");
        System.out.println(deposit_amount + " было внесено на ваш счет");
        atm.setBalance(atm.getBalance() + deposit_amount);
        showBalance();
    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String> m:operations.entrySet()){
            System.out.println(m.getKey() + m.getValue());
        }
    }
}
