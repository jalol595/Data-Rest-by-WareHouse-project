package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomInputProduct;
import uz.pdp.appwerehouse.entity.InputProduct;
import uz.pdp.appwerehouse.entity.User;

@RepositoryRestResource(path = "inputProduct", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {

}
