package Banking;

public interface BankingProvider {
    boolean withdraw (long amount,long balance);
   boolean  deposit(long amount,long balance);
}
