package example.codeclan.com.paymeshop;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class ShopTest {

    private Shop shop;
    private Customer customer;

    @Before
    public void before(){
        shop = new Shop();
        shop.addKeyValueToStock("television", 100.0);
        customer = new Customer("Michaela");
    }

    @Test
    public void testCanAddStockAndPriceToHashAndReturnValue(){
        assertEquals(100.0, shop.getStockValue("television"), 0.01);
    }

    @Test
    public void testCustomerFundsGoDown(){
        Payable creditCard = customer.getCreditCard();
        Transaction transactionOne = new Transaction(TransactionType.SALE, creditCard, customer, shop.getStockValue("television"));
        assertEquals();

    }

}
