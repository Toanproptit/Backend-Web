package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String showPrducts(Model model){
        List<String> products = Arrays.asList("lap top","dien thoai","tai nghe");
        model.addAttribute("products",products);
        return "product_list";
    }
}
