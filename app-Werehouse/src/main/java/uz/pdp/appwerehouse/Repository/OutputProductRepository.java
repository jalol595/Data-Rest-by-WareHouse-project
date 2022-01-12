package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomOutputProduct;
import uz.pdp.appwerehouse.entity.OutputProduct;
import uz.pdp.appwerehouse.entity.User;

@RepositoryRestResource(path = "outputProduct", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}
