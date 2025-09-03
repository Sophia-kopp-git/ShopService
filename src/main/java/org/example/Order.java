package org.example;

import java.math.BigDecimal;
import java.util.List;

public record Order(String orderId, List<Product> orderedProducts ,int amount, BigDecimal price) {
}
