package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();
}
