package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;


public class DiscountApplierTest {

    @Mock
    ProductDao productDao;

    @Test
    public void setNewPrices() {
        MockitoAnnotations.initMocks(this);

        List<Product> products = new ArrayList<>();
        products.add(new Product("potato", 2, "BUSINESS"));
        products.add(new Product("toy", 9, "HOME"));
        Mockito.when(productDao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        Assertions.assertEquals(2.2, products.get(0).getPrice());
        Assertions.assertEquals(8.1, products.get(1).getPrice());
    }

}
