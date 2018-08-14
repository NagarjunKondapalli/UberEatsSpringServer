package io.swagger.Repo;
import io.swagger.model.UberOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<UberOrder,Integer> {
}
