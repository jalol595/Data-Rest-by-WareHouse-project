package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomClient;
import uz.pdp.appwerehouse.entity.Client;

@RepositoryRestResource(path = "client", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
