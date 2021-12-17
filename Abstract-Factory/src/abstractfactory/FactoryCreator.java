package abstractfactory;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("Broadband")){
            return new BroadbandFactory();
        } else if(choice.equalsIgnoreCase("Plan")){
            return new PlanFactory();
        }
        return null;
    }
}
