package example.codeclan.com.paymeshop;


import java.util.HashMap;

public class Customer {

    private String name;
    private HashMap<String, Payable> payments;

    public Customer(String name){
       this.name = name;
       this.payments = new HashMap<String, Payable>();
    }
}
