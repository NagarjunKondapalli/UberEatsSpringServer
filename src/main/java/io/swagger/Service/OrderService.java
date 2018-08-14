package io.swagger.Service;
import io.swagger.Repo.OrderRepo;

import io.swagger.model.UberOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private NotificationService notificationService;


       @Transactional(propagation = Propagation.REQUIRED)
        public void addOrder(UberOrder order)
        {
         orderRepo.save(order);
         notificationService.addCustomerNotification(order);
         notificationService.addRestaurantNotification(order);

        }
}
