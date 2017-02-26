package example.codeclan.com.paymeshop;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {

    private int numOfSales;
    private double totalProfits;
    private HashMap<String, Double> stock;
    private ArrayList<Transaction> transactions;

    public Shop(){
        this.numOfSales = 0;
        this.totalProfits = 0;
        this.transactions = new ArrayList<Transaction>();
        this.stock = new HashMap <String, Double>();
    }


    public void addKeyValueToStock(String key, Double value){
        this.stock.put(key, value);
    }

    public Double getStockValue(String key){
        return stock.get(key);
    }

    public void addNewTransaction(Transaction value){
        transactions.add(value);
        this.numOfSales ++;
    }

    public int getNumOfSales() {
        return numOfSales;
    }

    public int getTransactionSize(){
        return transactions.size();
    }

    public Double getTotalProfits(Double transTotal){
        this.totalProfits += transTotal;
    }

}
