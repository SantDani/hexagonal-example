package hexagonal.infraestructure.database.h2.mapper;

import hexagonal.domain.model.Product;
import hexagonal.infraestructure.database.h2.entity.ProductEntity;

public class ProductMapper {

    public static Product fromProductEntityToProduct(ProductEntity productEntity) {
        return new Product(
                productEntity.getProductId(),
                productEntity.getName(),
                productEntity.getDescription(),
                productEntity.getPrice(),
                productEntity.getCurrency()
        );
    }
}