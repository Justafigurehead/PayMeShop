package example.codeclan.com.paymeshop;


public class CreditCard implements Payable {

    private Double balance;

    public CreditCard(Double balance){
        this.balance = balance;
    }


    public void pay(){

    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
