package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomSupplier;
import uz.pdp.appwerehouse.entity.Supplier;
import uz.pdp.appwerehouse.entity.User;

@RepositoryRestResource(path = "supplier", excerptProjection = CustomSupplier.class)
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
