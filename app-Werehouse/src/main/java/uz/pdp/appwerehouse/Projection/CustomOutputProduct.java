package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();
}
