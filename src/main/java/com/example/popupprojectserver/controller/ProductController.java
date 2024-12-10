package com.example.popupprojectserver.controller;

import com.example.popupprojectserver.model.Product;
import com.example.popupprojectserver.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    private final String uploadDir = "uploads/";

    @GetMapping
    public String showManagePage(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "manage";
    }

    @PostMapping
    public String addProduct(
            @RequestParam("name") String name,
            @RequestParam("image") MultipartFile image,
            @RequestParam(value = "inStock", required = false) boolean inStock) {

        try {
            String fileName = UUID.randomUUID().toString() + "_" + image.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, fileName);
            Files.createDirectories(filePath.getParent());
            Files.write(filePath, image.getBytes());

            Product product = new Product();
            product.setName(name);
            product.setImageUrl("/uploads/" + fileName);
            product.setInStock(inStock);
            productRepository.save(product);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/products";
    }

    @PostMapping("/{id}/stock")
    public String updateStock(@PathVariable Long id, @RequestParam(value = "inStock", required = false) boolean inStock) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setInStock(inStock);
        productRepository.save(product);
        return "redirect:/products";
    }

    @PostMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/products";
    }
}