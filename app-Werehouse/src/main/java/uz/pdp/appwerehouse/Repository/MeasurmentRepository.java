package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomMeasurement;
import uz.pdp.appwerehouse.entity.Measurement;


@RepositoryRestResource(path = "measurement", excerptProjection = CustomMeasurement.class)
public interface MeasurmentRepository extends JpaRepository<Measurement, Integer> {

}
