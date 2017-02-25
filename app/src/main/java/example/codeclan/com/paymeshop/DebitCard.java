package example.codeclan.com.paymeshop;

public class DebitCard implements Payable {

    private Double balance;

    public DebitCard(Double balance){
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
