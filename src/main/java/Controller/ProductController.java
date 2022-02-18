package Controller;

import Model.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8000/")
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository){ this.productRepository = productRepository; }

    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/products/{id}")
    public Product getProductById(@PathVariable(value = "id") String id){
        return productRepository.findByProductId(id);
    }
}
