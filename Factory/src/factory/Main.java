package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        String planName = ob.nextLine();

        System.out.print("Enter the number of months for bill will be calculated: ");
        int months=ob.nextInt();

        BroadbandPlan p = planFactory.getBroadbandPlan(planName);

        System.out.print("Bill amount for "+planName+" of "+months+" months is: ");
        p.getRate();
        p.calculateBroadbandCost(months);
    }
}
