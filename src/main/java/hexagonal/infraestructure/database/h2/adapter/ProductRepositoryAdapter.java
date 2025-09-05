package hexagonal.infraestructure.database.h2.adapter;

import hexagonal.domain.model.Product;
import hexagonal.domain.repository.IProductRepository;
import hexagonal.infraestructure.database.h2.entity.ProductEntity;
import hexagonal.infraestructure.database.h2.mapper.ProductMapper;
import hexagonal.infraestructure.database.h2.repository.ProductJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductRepositoryAdapter implements IProductRepository {

    @Override
    public Product findProductByProductId(String productId) {
        ProductEntity productEntity = repository.findProductByProductId(productId);
        return  ProductMapper.fromProductEntityToProduct(productEntity);
    }

    private final ProductJpaRepository repository;

    public ProductRepositoryAdapter(ProductJpaRepository repository) {
        this.repository = repository;
    }
}