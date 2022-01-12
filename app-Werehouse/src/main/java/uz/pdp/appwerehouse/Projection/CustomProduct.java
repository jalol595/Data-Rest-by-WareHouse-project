package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();
}
