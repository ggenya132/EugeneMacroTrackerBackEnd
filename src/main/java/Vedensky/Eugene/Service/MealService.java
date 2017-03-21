package Vedensky.Eugene.Service;

import Vedensky.Eugene.DAO.MealDAO;
import Vedensky.Eugene.Entity.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by eugenevendensky on 3/21/17.
 */

@Service
public class MealService {
    @Autowired
    MealDAO mealDAO;

    public Collection<Meal> getAllMeals() {

        return this.mealDAO.getAllMeals();
    }


    public Meal getMealByID(int id) {

        return this.mealDAO.getMealByID(id);
    }


    public void removeMealById(int id) {
        this.mealDAO.removeMealById(id);
    }


    public void updateMeal(Meal mealRequested) {


     this.mealDAO.updateMeal(mealRequested);

    }

    public void insertMeal(Meal mealToBeInserted) {

        this.mealDAO.insertMeal(mealToBeInserted);

    }
}
