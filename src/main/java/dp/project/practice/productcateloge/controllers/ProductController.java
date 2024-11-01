package dp.project.practice.productcateloge.controllers;

import dp.project.practice.productcateloge.dtos.ProductDto;
import dp.project.practice.productcateloge.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {

    @GetMapping("/product")
    public List<Product> getProductList(){
        return null;
    }
@GetMapping("product/{id}")
    public ProductDto getProduct(@PathVariable("id") Long productId){
     Product product=new Product();
     product.setId(productId);
     product.setName("iPhone");
     product.setPrice(190000.00);
     return null;
    }

    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productDto;
    }
}
