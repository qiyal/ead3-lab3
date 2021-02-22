package kz.iitu.spring.demo_atm;

public interface BankService {
    double checkBalance(String cardNumber);
    boolean withdraw(double amount, String cardNumber);
    boolean topUp(double amount, String cardNumber);
    void changePinCode(String newPinCode, String cardNumber);
}
