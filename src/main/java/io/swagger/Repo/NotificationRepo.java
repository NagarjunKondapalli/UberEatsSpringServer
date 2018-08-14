package io.swagger.Repo;

import io.swagger.model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notifications,Integer> {
}
