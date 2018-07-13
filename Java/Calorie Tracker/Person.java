public class Person { 

private int calories;

	public void eat(Meal meal){
		calories = calories + meal.calculateCalories();
	}

	public void walk(int minutes){
		calories = calories - minutes;
	}

	public int getCalories(){
		return calories;
	}

}