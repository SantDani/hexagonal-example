package hexagonal.infraestructure.database.rest.controller;

import hexagonal.applicationUseCase.IProductService;
import hexagonal.domain.model.Product;
import hexagonal.domain.port.ProductServicePortRest;
import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    private IProductService productService;
    private ProductServicePortRest productRest;

    @GetMapping("/database/{productId}")
    public Product findProductById(String productId) {
        /*
        Do we return Product instead of a DTO?
        As a general rule, it is better to communicate between layers with DTOs.

        However, this means that we have to remap Product to ProductDTO. This would be a second mapping.

        Sometimes, to avoid this second mapping, we can return the domain object directly.

        Source: https://floriankempenich.com/the-dto-dilemma
        * */
        return productService.findProductById(productId);
    }

    @GetMapping("/rest/{productId}")
    public Product getProductById(String productId) {
        return productRest.getProductById(productId);
    }
}