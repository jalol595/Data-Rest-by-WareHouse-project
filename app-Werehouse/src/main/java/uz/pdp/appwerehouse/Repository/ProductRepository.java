package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomProduct;
import uz.pdp.appwerehouse.entity.Product;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
