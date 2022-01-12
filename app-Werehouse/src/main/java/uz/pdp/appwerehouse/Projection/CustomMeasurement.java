package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

     Integer getId();

     String getName();

//     boolean getActive();
}
