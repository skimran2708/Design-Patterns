package singleton.lazyInstantiation;

import singleton.eagerInstantiation.DBManager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static int count=1;
    static int  choice;

    public static void main(String[] args) throws SQLException, IOException {
        DBManager dbManager= DBManager.getInstance();
        Scanner ob=new Scanner(System.in);

        do {
            System.out.println(" DATABASE OPERATIONS");
            System.out.println(" -------------------");
            System.out.println(" 1. Insertion ");
            System.out.println(" 2. View      ");
            System.out.println(" 3. Exit      ");
            System.out.println();
            System.out.print("Please enter the choice what you want to perform in the database: ");
            choice = ob.nextInt();

            switch(choice){
                case 1:{
                    System.out.print("Enter the userid you want to insert data into the database: ");
                    int userid = ob.nextInt();
                    System.out.print("Enter the username you want to insert data into the database: ");
                    String username = ob.next();
                    System.out.print("Enter the password you want to insert data into the database: ");
                    String password=ob.next();

                    try {
                        int i= dbManager.insert(userid, username, password);
                        if (i>0) {
                            System.out.println((count++) + " Data has been inserted successfully");
                        }else{
                            System.out.println("Data has not been inserted ");
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                }//End of case 1
                break;

                case 2:{
                    try  {
                        dbManager.view();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                }//End of case 2
                break;

                default:
                    System.out.println("\tEXITING");
                    return;
            }
        }while(choice!=3);
    }
}

