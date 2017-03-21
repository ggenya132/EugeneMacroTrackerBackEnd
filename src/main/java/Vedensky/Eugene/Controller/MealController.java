package Vedensky.Eugene.Controller;

import Vedensky.Eugene.Entity.Meal;
import Vedensky.Eugene.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping("/meals")

public class MealController {

    @Autowired
    MealService mealService;
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Meal> getAllMeals(){

        return this.mealService.getAllMeals();
    }

    @RequestMapping(value  = "/{id}", method = RequestMethod.GET)
    public Meal getMealByID(@PathVariable("id") int id){

        return mealService.getMealByID(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMealById(@PathVariable("id") int id){

        mealService.removeMealById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateMeal(@RequestBody Meal meal){

        mealService.updateMeal(meal);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertMealById(@RequestBody Meal meal){

        mealService.insertMeal(meal);
    }



}