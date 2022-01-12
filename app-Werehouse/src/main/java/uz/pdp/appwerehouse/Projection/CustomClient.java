package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Integer getId();
}
