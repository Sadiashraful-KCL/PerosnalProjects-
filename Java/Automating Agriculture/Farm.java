public class Farm{

    private Field fields;
    private Harvester harvesters;
    private int profit;
    private CombineHarvester combineHarvester;

    public void setFields(Field fields){
      this.fields = fields;
    }

   public Field getFields(){
     return fields;
   }

    public void setHarvester(Harvester harvesters){
      this.harvester = harvester;
    }

    public int getHarvester(Harvester harvester){
      return harvester;
    }

    public Harvester addHarvester(){
      return this.harvesters + 1;
    }

    public CombineHarvester addCombineHarvester(){
      combineHarvester = combineHarvester + 1
      return combineHarvester;
    }

    public Field addField(){
      return this.fields + 1;
    }

    public int harvest(Field fields, int profit, Harvester harvesters){
      fields.harvest();
      int fieldsHarvested = this.harvesters.getHarvestingCapacity();
      if (fieldsHarvested < fields){
        System.out.println("Not all the fields are harvested");
      }else if (fieldsHarvested >= fields){
        System.out.println("All fields are harvested");

        profit = (fields.getCrops()) * fields.getCrops().getValue();
        return profit;
      }
    }
}
