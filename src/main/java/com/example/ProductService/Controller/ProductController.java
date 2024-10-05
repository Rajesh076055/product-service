package com.example.ProductService.Controller;
import com.example.ProductService.DTO.ProductRequest;
import com.example.ProductService.DTO.ProductResponse;
import com.example.ProductService.Model.Product;
import com.example.ProductService.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        this.productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return this.productService.getAllProducts();
    }


    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteAllProducts() { this.productService.deleteAllProducts();}


    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public ProductResponse getProduct(@PathVariable("name") String skuCode)
    {
        return this.productService.getProduct(skuCode);
    }
}
