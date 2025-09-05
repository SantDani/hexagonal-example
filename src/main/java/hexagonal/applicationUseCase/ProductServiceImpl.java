package hexagonal.applicationUseCase;

import hexagonal.domain.model.Product;
import hexagonal.domain.repository.IProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {


    @Override
    public Product findProductById(String productId) {
        return productRepository.findProductByProductId(productId);
    }


    private final IProductRepository productRepository;

    public ProductServiceImpl(IProductRepository IProductRepository) {
        this.productRepository = IProductRepository;
    }
}