package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import com.pluralsight.NorthwindTradersAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ProductController {

    @Autowired
    public ProductController() {

    }

    @RequestMapping(path="/products", method=RequestMethod.GET)
    public ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        return products;
    }

    @RequestMapping(path="/products/5", method= RequestMethod.GET)
    public Product getProductById() {
        return new Product(1, "Sand", 17, 50.00);
    }
}
