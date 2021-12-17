package abstractfactory;

public class PlanFactory extends AbstractFactory{
    @Override
    public Broadband getBroadband(String broadband) {
        return null;
    }

    @Override
    public Plan getPlan(String plan) {
        if(plan == null){
            return null;
        }
        if(plan.equalsIgnoreCase("HIGH")) {
            return new HighSpeedPlan();
        }
        else if(plan.equalsIgnoreCase("LOW")){
            return new LowSpeedPlan();
        }
        return null;
    }
}
