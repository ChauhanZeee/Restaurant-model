package com.geekster.Restaurant.service;

import com.geekster.Restaurant.model.RestaurantModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    private static List<RestaurantModel> restaurantModels= new ArrayList<>();

    static {
        restaurantModels.add(new RestaurantModel("Doon Darb-ar", "near clock tower, dehradun", "987654321", "briyani", 40, true));
        restaurantModels.add(new RestaurantModel("zaayka", "Gola market, srinagar garwhal", "897654321", "chopsy", 10, false));
        restaurantModels.add(new RestaurantModel("vatika", "Gola market, srinagar garwhal", "983654321", "momos", 11, false));
    }
    public static List<RestaurantModel> findAll(){
        return restaurantModels;
    }

    public static ArrayList<RestaurantModel>  getRestaurantInfo(String restaurantName) {
        ArrayList<RestaurantModel> restaurantList = new ArrayList<>();
        RestaurantModel res = null;
        for (int i = 0; i < restaurantModels.size(); i++) {
            res = restaurantModels.get(i);
            if (res.getRestaurantName().equals(restaurantName)) {
                restaurantList.add(res);
                return restaurantList;
            }
        }
        restaurantList.add(res);
        return restaurantList;
    }
    public void addRestaurant(RestaurantModel restaurantList){
        restaurantModels.add(restaurantList);
    }
//    public void deleteRestaurant(String restaurantName){
//
//    }

    public void updateRestaurant(String restaurantName, RestaurantModel newRestaurantModel){
        RestaurantModel restaurantList = getRestaurantInfo(restaurantName);

        restaurantList.setRestaurantName(newRestaurantModel.getRestaurantName());
        restaurantList.setAddress(newRestaurantModel.getAddress());
        restaurantList.setNumber(newRestaurantModel.getNumber());
        restaurantList.setSpeciality(newRestaurantModel.getSpeciality());
        restaurantList.setTotalStaff(newRestaurantModel.getTotalStaff());
        restaurantList.setHomeDelivery(newRestaurantModel.isHomeDelivery());
    }


}
