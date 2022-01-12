package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Output;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();
}
