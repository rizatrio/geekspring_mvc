package com.geekbrains.controllers;


import com.geekbrains.entites.Product;
import com.geekbrains.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/showProductById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product showStudentById(@PathVariable("id") int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/all")
    public String getAllProducts(Model model) {
        model.addAttribute("all_products", productService.getProducts());
        return "products";
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        return "product-form-result";
    }

}
