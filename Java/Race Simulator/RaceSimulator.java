public class RaceSimulator{
	
	public static void main (String [] args){

		RaceTrack silverstone = new RaceTrack(92, false);

		Car car1 = new Car(1, 70, 8, 7, 35, 27, 10, 0);
		Car car2 = new Car(2, 49, 3, 6, 30, 30, 12, 0);
		Car car3 = new Car(3, 60, 5, 5, 25, 20, 15, 0);

		
		 System.out.println("Car 1 Lap time: " + car1.completeLap(silverstone));
		 System.out.println("Car 2 Lap time: " + car2.completeLap(silverstone));
		 System.out.println("Car 3 Lap time: " + car3.completeLap(silverstone));
		System.out.println("The leader for the first lap is Car " + silverstone.determineRaceLeader(car1, car2, car3).getCarId());
		
		 car1.completeLap(silverstone);
		 car2.completeLap(silverstone);
		 car3.completeLap(silverstone);
		System.out.println("The leader for the second lap is Car " + silverstone.determineRaceLeader(car1, car2, car3).getCarId());

		 car1.completeLap(silverstone);
		 car2.completeLap(silverstone);
		 car3.completeLap(silverstone);
		System.out.println("The leader for the third lap is Car " + silverstone.determineRaceLeader(car1, car2, car3).getCarId());
		
		 car1.completeLap(silverstone);
		 car2.completeLap(silverstone);
		 car3.completeLap(silverstone);
		System.out.println("The leader for the fourth lap is Car " + silverstone.determineRaceLeader(car1, car2, car3).getCarId());

	}

}