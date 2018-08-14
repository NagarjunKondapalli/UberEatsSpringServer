package io.swagger.Service;

import io.swagger.Repo.DishRepo;
import io.swagger.Repo.NotificationRepo;
import io.swagger.Repo.OrderRepo;
import io.swagger.Repo.RestaurantRepo;
import io.swagger.model.Dishes;
import io.swagger.model.Notifications;
import io.swagger.model.UberOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NotificationService {

    @Autowired
    private NotificationRepo notificationRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private RestaurantRepo restaurantRepo;

    @Autowired
    private DishRepo dishRepo;

    private Notifications notifications;


    public void addCustomerNotification(UberOrder order)
    {
        Integer CustomerID=order.getCustomerId();
        notifications.setRecipientId(CustomerID);
        notificationRepo.save(notifications);

    }

    public void addRestaurantNotification(UberOrder order)
    {
        Integer CustomerID=order.getCustomerId();
        Integer DishID=order.getDishId();
        Integer restaurantid=null;
        for (Dishes dishes:dishRepo.findAll()
             )
        {
            if(dishes.getId()==DishID)
            {
                restaurantid=dishes.getRestaurantId();
            }
        }
        notifications.setRecipientId(restaurantid);
        notificationRepo.save(notifications);

    }

    public List<Notifications> getAllNotification()
    {
        List<Notifications> notificationslist=new ArrayList<>();
        for (Notifications notifications: notificationRepo.findAll())
        {
            notificationslist.add(notifications);
        }
           return notificationslist;
    }


}
