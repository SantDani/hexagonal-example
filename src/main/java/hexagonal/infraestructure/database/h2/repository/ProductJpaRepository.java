package hexagonal.infraestructure.database.h2.repository;



import hexagonal.infraestructure.database.h2.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, UUID> {
    ProductEntity findProductByProductId(String productId);
}