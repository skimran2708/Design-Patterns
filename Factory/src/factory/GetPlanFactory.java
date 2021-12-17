package factory;

public class GetPlanFactory {
    //use getBroadbandPlan method to get object of type BroadbandPlan

    public BroadbandPlan getBroadbandPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("CABLEMODEM")) {
            return new CableModemBroadbandPlan();
        }
        else if(planType.equalsIgnoreCase("DSL")){
            return new DslBroadbandPlan();
        }
        return null;
    }
}
