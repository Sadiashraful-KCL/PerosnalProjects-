public class Car{
	
	private int id;
	private int fuel;
	private int lowFuelBoost;
	private int highFuelSlowdown;
	private int fuelConsumptionPerLap;
	private int pitStopTime;
	private int rainSlowdown;
	private int totalTime;


	public Car(
	int id,
	int fuel,
	int lowFuelBoost,
	int highFuelSlowdown,
	int fuelConsumptionPerLap,
	int pitStopTime,
	int rainSlowdown,
	int totalTime) {

		this.id= id;
		this.fuel = fuel;
		this.lowFuelBoost = lowFuelBoost;
		this.highFuelSlowdown = highFuelSlowdown;
		this.fuelConsumptionPerLap = fuelConsumptionPerLap;
		this.pitStopTime = pitStopTime;
		this.rainSlowdown = rainSlowdown;
		this.totalTime = totalTime;
	}

	public int getCarId(){
		return id;
	}

	public void setTotalTime(int totalTime){
		this.totalTime = totalTime;
	}

	public int getTotalTime(){
		return totalTime;
	}

	public int completeLap(RaceTrack raceTrack){

		int lapTime = raceTrack.getAverageLapTime();

		if(fuel > 50){
			lapTime = lapTime + highFuelSlowdown;
		} else {
			lapTime = lapTime - lowFuelBoost;
		}
		
		if(raceTrack.getIsRaining()){
			lapTime = lapTime + rainSlowdown;
		}

		fuel = fuel - fuelConsumptionPerLap;

		if(fuel < fuelConsumptionPerLap){
			fuel = 100;
			lapTime = lapTime + pitStopTime;
		}

		totalTime = totalTime + lapTime;
		return lapTime;
	}








}