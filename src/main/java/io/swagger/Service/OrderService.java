package io.swagger.Service;

import io.swagger.Repo.NotificationRepo;
import io.swagger.Repo.OrderRepo;
import io.swagger.model.Notifications;
import io.swagger.model.Order;
import io.swagger.model.Restaurant;
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


//      @Transactional(propagation = Propagation.REQUIRED)
//      public void addOrder(Order order)
//    {
//          orderRepo.save(order);
//          notificationService.addCustomerNotification(order);
//          notificationService.addRestaurantNotification(order);
//
//   }
}
