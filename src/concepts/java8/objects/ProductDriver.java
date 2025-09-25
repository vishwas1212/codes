package concepts.java8.objects;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDriver {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", "Electronics", 999.99, 10),
                new Product(2, "Smartphone", "Electronics", 699.99, 15),
                new Product(3, "Desk Chair", "Furniture", 199.99, 5),
                new Product(4, "Coffee Mug", "Kitchen", 9.99, 50),
                new Product(5, "Monitor", "Electronics", 249.99, 8)
        );

        //Q1: Total value of inventory by category

        Map<String, Double> collected = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.summingDouble(p -> p.getStock() * p.getPrice())));
        System.out.println(collected);

        //Q2: Find products with low stock (< 10)

        List<Product> list = products.stream()
                .filter(p -> p.getStock() < 10)
                .collect(Collectors.toList());
        System.out.println(list);

        //Q3: Get average price by category

        Map<String, Double> averagePriceCat = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        System.out.println(averagePriceCat);

        //Q4: Find most expensive product in each category

        Map<String, Optional<Product>> mostExpensiveCat = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))));
        mostExpensiveCat.forEach((cat, product) ->{
            System.out.println(cat+": "+product.map(Product::getPrice).orElse(0.0));
        } );

    }
}
