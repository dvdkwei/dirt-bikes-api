package Repository;

import Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;
import java.util.Optional;

@Repository
@Table(name="WI2_ACU008_PRODUCT")
public interface ProductRepository extends JpaRepository<Product, String> {

    Product findByProductId(String productId);

    List<Product> findAll();
}
