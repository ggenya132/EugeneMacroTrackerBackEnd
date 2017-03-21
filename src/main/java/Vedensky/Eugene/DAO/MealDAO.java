package Vedensky.Eugene.DAO;

import Vedensky.Eugene.Entity.Meal;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by eugenevendensky on 3/21/17.
 */


@Repository
public class MealDAO {

    private static Map<Integer, Meal> meals;

    static {
        meals = new HashMap<Integer, Meal>(){


            {


                put(1, new Meal(1, 10, 10, 10, "Meal 1" ));
                put(2, new Meal(2, 10, 10, 10, "Meal 2" ));
                put(3, new Meal(3, 10, 10, 10, "Meal 3" ));
                put(4, new Meal(4, 10, 10, 10, "Meal 4" ));

            }
        };


    }


    public Collection<Meal> getAllMeals() {

        return this.meals.values();
    }


    public Meal getMealByID(int id) {

        return this.meals.get(id);
    }


    public void removeMealById(int id) {
        this.meals.remove(id);
    }


    public void updateMeal(Meal mealRequested) {


        Meal updatedMeal = meals.get(mealRequested.getId());
        updatedMeal.setProtein(mealRequested.getProtein());
        updatedMeal.setCarbs(mealRequested.getCarbs());
        updatedMeal.setFats(mealRequested.getFats());


        meals.put(mealRequested.getId(), updatedMeal);

    }

    public void insertMeal(Meal mealToBeInserted) {

        this.meals.put(mealToBeInserted.getId(), mealToBeInserted);

    }
}
