package factory;

public class DslBroadbandPlan extends BroadbandPlan {

    @Override
    public void getRate() {
        rate = 500;
    }
}
