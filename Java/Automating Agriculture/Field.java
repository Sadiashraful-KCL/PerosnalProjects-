public class Field{

  private Crop crops;              //Maximum number of crops is 10

  public Field(Crop crops){
    crops.setType();
    crops.setValue();
    plant();
  }

  public int plant(Crop crops){
    return crops.setValue(10);
  }

  public int harvest(Crop crops){


    crops.getValue();
    this.crops.setValue(0);
  }

  public int getCrops(){
    return this.crops;
  }
}
