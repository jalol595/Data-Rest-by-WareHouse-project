package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {
    Integer getId();
}
