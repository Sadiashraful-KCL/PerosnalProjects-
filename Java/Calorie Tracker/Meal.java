public class Meal {

	private Dish starter;
	private Dish main;
	private Dish dessert;

 	public int calculateCalories(){
 		return starter.getCalories() + main.getCalories() + dessert.getCalories();
 	}

 	public void setStarter(Dish starter){
 		this.starter = starter;
 	}
 	
 	public void setMain(Dish main){
 		this.main = main;
 	}

 	public void setDessert(Dish dessert){
 		this.dessert = dessert;
 	}

 	



}