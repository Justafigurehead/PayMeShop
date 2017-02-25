package example.codeclan.com.paymeshop;

import java.util.HashMap;

public class Shop {

    private int numOfSales;
    private double totalProfits;
    private HashMap<String, Double> stock;

    public Shop(){
        this.numOfSales = 0;
        this.totalProfits = 0;
        this.stock = new HashMap <String, Double>();
    }


    public void addKeyValueToStock(String key, Double value){
        this.stock.put(key, value);
    }

    public Double getStockValue(String key){
        return stock.get(key);
    }
}
