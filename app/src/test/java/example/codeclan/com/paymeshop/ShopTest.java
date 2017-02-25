package example.codeclan.com.paymeshop;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



public class ShopTest {

    private Shop shop;
    @Before
    public void before(){
        shop = new Shop();
    }

    @Test
    public void testCanAddStockAndPriceToHashAndReturnValue(){
        shop.addKeyValueToStock("television", 100.0);
        assertEquals(100.0, shop.getStockValue("television"), 0.01);
    }



}
