package hexagonal.domain.port;

import hexagonal.domain.model.Product;

public interface ProductServicePortRest  {
    Product getProductById(String productId);
}