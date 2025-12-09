package com.pluralsight.NorthwindTradersAPI.controllers;

import com.pluralsight.NorthwindTradersAPI.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoriesController {

    @Autowired
    public CategoriesController() {

    }

    @RequestMapping(path="/categories", method= RequestMethod.GET)
    public ArrayList<Category> getCategories() {
        return new ArrayList<Category>();
    }

    @RequestMapping(path="/categories/17", method= RequestMethod.GET)
    public Category getCategoryById() {
        return new Category(17, "Spanish");
    }

}
