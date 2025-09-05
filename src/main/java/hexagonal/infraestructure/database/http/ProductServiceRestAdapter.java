package hexagonal.infraestructure.database.http;

import hexagonal.domain.model.Product;
import hexagonal.domain.port.ProductServicePortRest;
import org.springframework.web.client.RestTemplate;

public class ProductServiceRestAdapter implements ProductServicePortRest {

    @Override
    public Product getProductById(String productId) {
        /*
        The response will probably not come in the Product.class format, so we will need to map it
        to our entity. Example like ProductMapper
        * */
        return restTemplate.getForObject("http://localhost:8080/products/" + productId, Product.class);
    }

    private final RestTemplate restTemplate;

    public ProductServiceRestAdapter(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}