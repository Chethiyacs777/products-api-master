package uk.ac.westminster.products_api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tutorial5ProductTest {
    @Test
    void summariesUseRuntimeType() {
        ProductService service = new ProductService();
        assertEquals(2, service.getAllSummaries().size());
        assertTrue(service.getAllSummaries().get(0).startsWith("Digital:"));
        assertTrue(service.getAllSummaries().get(1).startsWith("Physical:"));
    }

    @Test
    void discountsFollowDifferentRules() {
        DigitalProduct digital = new DigitalProduct(1L, "Book", 100, "/dl", 2);
        PhysicalProduct physical = new PhysicalProduct(2L, "Monitor", 100, 5, "1x1");
        digital.applyDiscount(0.30);
        physical.applyDiscount(0.30);
        assertEquals(70, digital.getDiscountedPrice(), 0.001);
        assertEquals(80, physical.getDiscountedPrice(), 0.001);
    }
}
