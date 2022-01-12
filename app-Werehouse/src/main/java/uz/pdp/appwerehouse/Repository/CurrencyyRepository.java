package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomCurrencyy;
import uz.pdp.appwerehouse.entity.Currencyy;

@RepositoryRestResource(path = "currencyy", excerptProjection = CustomCurrencyy.class)
public interface CurrencyyRepository extends JpaRepository<Currencyy, Integer> {
}
