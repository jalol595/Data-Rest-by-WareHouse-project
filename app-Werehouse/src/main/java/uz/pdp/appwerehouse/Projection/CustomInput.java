package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Input;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();
}
