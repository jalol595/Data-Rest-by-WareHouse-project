package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomWarehouse;

@RepositoryRestResource(path = "warehouse", excerptProjection = CustomWarehouse.class)
public interface Warehouse extends JpaRepository<uz.pdp.appwerehouse.entity.Warehouse, Integer> {
}
