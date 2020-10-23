package fitr;

import fitr.Calorie;
import fitr.Food;
import org.junit.jupiter.api.Test;

import static fitr.DateManager.getCurrentDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {
    Calorie tempCalorie = new Calorie(500);

    @Test
    public void getCaloriesConsumed_validFoodAndCalorie_success() {
        Food tempExercise = new Food("food",tempCalorie);
        assertEquals(500,tempCalorie.get());
    }

    @Test
    public void getNameOfFood_validFoodAndCalorie_success() {
        Food tempExercise = new Food("exercise",tempCalorie);
        assertEquals("exercise",tempExercise.getFoodName());
    }

    @Test
    public void getAmountOfFoodSpecified_validFoodWithSpecifiedAmount_success() {
        Food tempExercise = new Food("exercise",tempCalorie,2, getCurrentDate());
        assertEquals(2,tempExercise.getAmountOfFood());
    }

    @Test
    public void getAmountOfFoodUnspecified_validFoodWithSpecifiedAmount_success() {
        Food tempExercise = new Food("exercise",tempCalorie);
        assertEquals(1,tempExercise.getAmountOfFood());
    }
}
