package abstractfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the name of broadband type: ");
        String broadbandName = ob.nextLine();

        System.out.print("Enter the type of plan speed e.g low or high: ");
        String planName=ob.nextLine();

        AbstractFactory broadbandFactory=FactoryCreator.getFactory("Broadband");
        Broadband broadband=broadbandFactory.getBroadband(broadbandName);

        System.out.print("Enter the number of months for "+broadband.getBroadbandName()+": ");
        int months= ob.nextInt();

        System.out.println("You are taking "+planName+" speed plan of "+broadband.getBroadbandName()+" broadband type");

        AbstractFactory planFactory=FactoryCreator.getFactory("Plan");
        Plan plan=planFactory.getPlan(planName);

        plan.getPlanRate();
        plan.calculateBillPayment(months);

    }
}
