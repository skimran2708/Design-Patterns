package factory;

abstract class BroadbandPlan {
    protected double rate;
    abstract void getRate();

    public void calculateBroadbandCost(int months){
        System.out.println(months*rate);
    }
}
