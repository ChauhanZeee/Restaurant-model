package com.geekster.Restaurant.controller;

import com.geekster.Restaurant.model.RestaurantModel;
import com.geekster.Restaurant.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurant-app") //master end point;
public class RestaurantController {

    public RestaurantService restaurantService;

    @PostMapping("/add-restaurant")
    public void addRestaurant(@RequestBody RestaurantModel restaurantList){
        restaurantService.addRestaurant(restaurantList);
    }

    @GetMapping("/find-by/restaurantName/{restaurantName}")
    public ArrayList<RestaurantModel> getRestaurantInfo(@PathVariable String restaurantName){
        return restaurantService.getRestaurantInfo(restaurantName);
    }

    @GetMapping("/find-all")
    public List<RestaurantModel> findAll(){
        return restaurantService.findAll();
    }

    @PutMapping("/update-restaurant/restaurantName/{restaurantName}")
    public void updateRestaurant(@PathVariable String restaurantName, @RequestBody RestaurantModel restaurantList){
        restaurantService.updateRestaurant(restaurantName, restaurantList);
    }
//    @DeleteMapping("delete-restaurant/restaurantName/{restaurantName}")
//    public void deleteRestaurant(@PathVariable String restaurantName){
//        restaurantService.deleteRestaurant(restaurantName);
//    }


}
