package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.User;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();
}
