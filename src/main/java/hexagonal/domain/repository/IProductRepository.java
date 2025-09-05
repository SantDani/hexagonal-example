package hexagonal.domain.repository;

import hexagonal.domain.model.Product;

public interface IProductRepository {
    Product findProductByProductId(String productId);
}