package example.codeclan.com.paymeshop;

import java.util.ArrayList;

public class Transaction {
    private TransactionType saleType;
    private Customer customer;
    private Payable payment;
    private ArrayList<String> stockBought;
    private Double total;


    public Transaction(TransactionType saleType, Payable payment, Customer customer, Double total){
        this.saleType = saleType;
        this.payment = payment;
        this.customer = customer;
        this.stockBought = new ArrayList<String>();
        this.total = total;
    }

    public TransactionType getSaleType() {
        return saleType;
    }

    public void setSaleType(TransactionType saleType) {
        this.saleType = saleType;
    }

    public Payable getPayment() {
        return payment;
    }

    public void setPayment(Payable payment) {
        this.payment = payment;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
