package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class DiscountApplierTest {

    @Test
    public void homeProductGets10PercentOff() {
        // HOME: 100 → 90
        Product home = new Product("Chair", "HOME", 100.0);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(home));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(90.0, home.getPrice(), 0.001);
    }

    @Test
    public void businessProductGets10PercentMore() {
        // BUSINESS: 100 → 110
        Product business = new Product("Desk", "BUSINESS", 100.0);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(business));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(110.0, business.getPrice(), 0.001);
    }

    @Test
    public void mixedProducts() {
        Product home     = new Product("Chair", "HOME", 200.0);
        Product business = new Product("Desk", "BUSINESS", 200.0);

        ProductDao dao = Mockito.mock(ProductDao.class);
        Mockito.when(dao.all()).thenReturn(Arrays.asList(home, business));

        DiscountApplier applier = new DiscountApplier(dao);
        applier.setNewPrices();

        Assertions.assertEquals(180.0, home.getPrice(), 0.001);
        Assertions.assertEquals(220.0, business.getPrice(), 0.001);
    }
}
