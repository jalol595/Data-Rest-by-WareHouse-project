package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwerehouse.Projection.CustomUser;
import uz.pdp.appwerehouse.entity.User;
@RepositoryRestResource(path = "user", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
