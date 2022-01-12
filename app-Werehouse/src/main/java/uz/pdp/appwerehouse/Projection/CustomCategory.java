package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();
}
