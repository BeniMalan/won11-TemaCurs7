package Banking;

public class BT implements BankingProvider{
    long withdrawedAmount=0;
    long depositedAmount=0;
    @Override
    public boolean withdraw(long amount, long balance) {
        if (amount > 0 && balance >= amount) {
            withdrawedAmount = balance - amount;
            System.out.println("Ati retras din contul BT suma "+withdrawedAmount);
            return true;
        } else return false;
    }

    @Override
    public boolean deposit(long amount, long balance) {
        if (amount > 0) {
            depositedAmount = balance + amount;
            System.out.println("Ati despus in contul BT suma "+depositedAmount);
            return true;
        } else return false;
    }
}
