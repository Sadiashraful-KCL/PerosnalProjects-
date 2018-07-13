public class RaceTrack{
	
	private int averageLapTime;
	private boolean isRaining;

	public RaceTrack(int averageLapTime, boolean isRaining){
		this.averageLapTime = averageLapTime;
		this.isRaining = isRaining;
	}

	public void setAverageLapTime(int averageLapTime){
		this.averageLapTime = averageLapTime;
	}

	public int getAverageLapTime(){
		return averageLapTime;
	}

	public void setIsRaining(boolean isRaining){
		this.isRaining = true;
	}

	public void setIsNotRaining(boolean isRaining){
		this.isRaining = false;
	}

	public boolean getIsRaining(){
		return isRaining;
	}

	public Car determineRaceLeader(Car car1, Car car2, Car car3){
		if(car1.getTotalTime() < car2.getTotalTime() && 
			car1.getTotalTime() < car3.getTotalTime()){
				return car1;
			}

			else if(car2.getTotalTime() < car1.getTotalTime() && 
			car2.getTotalTime() < car3.getTotalTime()){
				return car2;
			}

			else {
				return car3;
			}
	}



}