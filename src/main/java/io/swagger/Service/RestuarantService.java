package io.swagger.Service;

import io.swagger.Repo.CategoriesRepo;
import io.swagger.Repo.RestaurantRepo;
import io.swagger.model.Categories;
import io.swagger.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestuarantService
{
    @Autowired
    private RestaurantRepo restaurantRepo;
    @Autowired
    private CategoriesRepo categoriesRepo;
   // @Autowired
   // private Categories categories;

    public void addRestaurant(Restaurant restaurant)
    {
        restaurantRepo.save(restaurant);
    }
    public void updateRestaurant(Restaurant restaurant)
    {
        Integer id=restaurant.getId();
        Restaurant restaurant1=restaurantRepo.findOne(id);
        restaurant1.setCategoryId(restaurant.getCategoryId());
        restaurant1.setCity(restaurant.getCity());
        restaurant1.setName(restaurant.getName());
        restaurant1.setPostalCode(restaurant.getPostalCode());
        restaurant1.setStreetNameNumber(restaurant.getStreetNameNumber());
        restaurant1.setProvince(restaurant.getProvince());
        restaurantRepo.save(restaurant1);
    }
    public void deleteRestaurant(Integer id)
    {
        restaurantRepo.delete(id);
    }
    public List<Restaurant> getAllStores()
    {
        List<Restaurant> restaurants=new ArrayList<>();
        for (Restaurant restaurant: restaurantRepo.findAll())
        {
             restaurants.add(restaurant);
        }
        return restaurants;
    }

    public List<Restaurant> getrestaurantByCategory(String category)
    {
        Integer id = null;
        List<Restaurant> restaurants=new ArrayList<>();
        for (Categories categories:categoriesRepo.findAll()) 
        {
            if(categories.getCategoryName()==category)
            {
                id=categories.getId();
            }
        }
         

          for (Restaurant restaurant:restaurantRepo.findAll())
          {
             restaurants.add(restaurant.categoryId(id));
          }

            return restaurants;
    }

    public List<Restaurant> findRestaurantByLocation(String postalcode)
    {
        List<Restaurant> restaurants=new ArrayList<>();
        for (Restaurant restaurant:restaurantRepo.findAll()
             )
        {
            restaurants.add(restaurant.postalCode(postalcode));
        }
        return restaurants;
    }

}
