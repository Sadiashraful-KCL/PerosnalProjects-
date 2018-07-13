public class CalorieTracker {
	public static void main(String [] args){


		Person person = new Person();
		System.out.println("Starting calories is " + person.getCalories());

		//First Meal 
		Dish toast = new Dish();
		toast.setCalories(90);

		Dish omelette = new Dish ();
		omelette.setCalories(250);

		Dish banana = new Dish();
		banana.setCalories(95);

		Meal omeletteBreakfast = new Meal();
		omeletteBreakfast.setStarter(toast);
		omeletteBreakfast.setMain(omelette);
		omeletteBreakfast.setDessert(banana);
		System.out.println("Calories in omelete Breakfast is " + omeletteBreakfast.calculateCalories());

		//Second Meal
		Dish fruitYoghurt = new Dish();
		fruitYoghurt.setCalories(160);

		Dish pancakes = new Dish ();
		pancakes.setCalories(705);

		Dish strawberries = new Dish();
		strawberries.setCalories(135);

		Meal pancakeBreakfast = new Meal();
		pancakeBreakfast.setStarter(fruitYoghurt);
		pancakeBreakfast.setMain(pancakes);
		pancakeBreakfast.setDessert(strawberries);
		System.out.println("Calories in pancake breakfast is " + pancakeBreakfast.calculateCalories());

		//Third Meal
		Dish potatoGrain = new Dish();
		potatoGrain.setCalories(330);

		Dish pie = new Dish();
		pie.setCalories(750);

		Dish gelato = new Dish();
		gelato.setCalories(220);

		Meal pieLunch = new Meal();
		pieLunch.setStarter(potatoGrain);
		pieLunch.setMain(pie);
		pieLunch.setDessert(gelato);
		System.out.println("Calories in pie lunch is " + pieLunch.calculateCalories());

		//Time to eat now
		person.eat(omeletteBreakfast);
		person.eat(pancakeBreakfast);
		person.eat(pieLunch);
		System.out.println("Total calories consumed so far is " + person.getCalories());
		if(person.getCalories() >= 2000){
			person.walk(735);

		}
		
		System.out.println("After burning calories now is " + person.getCalories());

		


	}
}