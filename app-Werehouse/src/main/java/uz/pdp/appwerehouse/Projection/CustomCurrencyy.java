package uz.pdp.appwerehouse.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwerehouse.entity.Currencyy;

@Projection(types = Currencyy.class)
public interface CustomCurrencyy {
    Integer getId();
}
