package abstractfactory;

abstract class Plan {
    protected double planRate;
    abstract void getPlanRate();

    public void calculateBillPayment(int months) {
        double amount;
        amount=months * planRate;
        System.out.println("Your total bill is "+amount+" for "+months+" months");
    }

}
