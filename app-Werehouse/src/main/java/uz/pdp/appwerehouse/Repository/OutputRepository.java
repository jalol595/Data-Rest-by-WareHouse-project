package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomOutput;
import uz.pdp.appwerehouse.entity.Output;
import uz.pdp.appwerehouse.entity.User;

@RepositoryRestResource(path = "output", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
