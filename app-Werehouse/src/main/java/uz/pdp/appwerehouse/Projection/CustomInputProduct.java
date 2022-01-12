package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();
}
