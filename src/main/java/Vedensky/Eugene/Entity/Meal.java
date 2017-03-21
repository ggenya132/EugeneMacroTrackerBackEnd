package Vedensky.Eugene.Entity;

/**
 * Created by eugenevendensky on 3/21/17.
 */
public class Meal {
    private int id;



    private int protein;
    private int carbs;
    private int fats;
    private String name;



    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getProtein() {

        return protein;
    }

    public Meal(int id, int protein, int carbs, int fats) {
        this.id = id;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

    public int getCarbs() {
        return carbs;

    }

    public int getId() {
        return id;
    }

    public int getFats() {
        return fats;

    }


    public Meal(int protein, int carbs, int fats) {
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Meal(int id, int protein, int carbs, int fats, String name) {
        this.id = id;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
        this.name = name;
    }

    public Meal(){}
}
