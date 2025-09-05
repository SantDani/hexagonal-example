package hexagonal.infraestructure.database.h2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Table(name = "products")
@Entity
public class ProductEntity {

    public UUID getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    private UUID id;
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String currency;
}