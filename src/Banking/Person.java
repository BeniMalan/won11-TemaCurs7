package Banking;

public class Person {
private BankingProvider sourceOfMoney;

 public void setSourceOfMoney (BankingProvider sourceOfMoney){
     this.sourceOfMoney=sourceOfMoney;
 }
public void RetrageBani(){
sourceOfMoney.withdraw(200,300);
}
public void DepuneBani(){
    sourceOfMoney.deposit(200,500);
}

}
