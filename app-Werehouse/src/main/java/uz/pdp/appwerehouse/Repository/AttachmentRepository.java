package uz.pdp.appwerehouse.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerehouse.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, Integer> {
}
