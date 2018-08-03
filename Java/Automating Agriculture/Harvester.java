public class Harvester{

  private int fuelTankSize;
  private int topSpeed;
  private int harvestingCapacity = fuelTankSize + topSpeed ;

  public Harvester(int fuelTankSize, int topSpeed){
    this.fuelTankSize = fuelTankSize;
    this.topSpeed = topSpeed;
  }


    // public int getFuelTankSize(){
    //   return this.fuelTankSize;
    // }
    //
    // public int getTopSpeed(){
    //   return this.topSpeed;
    // }

    public int getHarvestingCapacity (){
      return this.harvestingCapacity;
    }








  }
