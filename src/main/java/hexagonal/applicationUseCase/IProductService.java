package hexagonal.applicationUseCase;

import hexagonal.domain.model.Product;

public interface IProductService {
    Product findProductById(String productId);
}