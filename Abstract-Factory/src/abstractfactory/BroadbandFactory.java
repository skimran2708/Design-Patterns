package abstractfactory;

public class BroadbandFactory extends AbstractFactory{
    public Broadband getBroadband(String broadband) {
        if(broadband == null){
            return null;
        }
        if(broadband.equalsIgnoreCase("CABLEMODEM")) {
            return new CableModemBroadband();
        }
        else if(broadband.equalsIgnoreCase("DSL")){
            return new DslBroadband();
        }
        return null;
    }

    @Override
    public Plan getPlan(String plan) {
        return null;
    }
}
