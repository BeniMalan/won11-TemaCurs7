package Advertasing;

public class Main {
    public static void main(String[] args) {
Company company=new Company();
      company.setSourceOfAdvertising(new Facebook());
      company.advertizeOn();

    }
}