/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is the Main Class file of ElectronicStoreDriver.
 *
 * @author Goteti Santosh Ravi Teja
 */
public class ElectronicStoreDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        Scanner sc = new Scanner(new File("electronics.txt"));

        ElectronicStore es = new ElectronicStore(sc.nextLine(), sc.nextLine(), sc.nextLine());
        Mobile m = new Mobile();
        System.out.println("Electronic Store Details:" + es.toString());
        System.out.println("*****************************************************************\n");
        while (sc.hasNext()) {
            switch (sc.nextLine()) {

                case "Mobile":

                    String model = sc.nextLine();

                    String processor = sc.nextLine();
                    String operatingsystem = sc.nextLine();
                    String body = sc.nextLine();

                    double battery = Double.parseDouble(sc.nextLine());
                    double intialPrice = Double.parseDouble(sc.nextLine());

                    String accesories = sc.nextLine();
                    int hours = Integer.parseInt(sc.nextLine());

                    if (model.equals("iPhone")) {
                        Apple m1 = new Apple(model, processor, operatingsystem, body, battery, intialPrice, es.getStoreName(), es.getAddress(), es.getContactNumber());
                        m1.addAccessories(accesories);
                        m1.calculateBatteryLife(hours);
                        System.out.println("iPhone Details: " + m1.toString());
                        System.out.println("*****************************************************************\n");
                    }
                    if (model.equals("Samsung")) {
                        Samsung s1 = new Samsung(model, processor, operatingsystem, body, battery, intialPrice, es.getStoreName(), es.getAddress(), es.getContactNumber());
                        s1.addAccessories(accesories);
                        s1.calculateBatteryLife(hours);

                        System.out.println("Samsung Phone Details: " + s1.toString());
                        System.out.println("*****************************************************************\n");
                    }
                    break;

                case "Television":
                    String tvModel = sc.nextLine();
                    String tvType = sc.nextLine();
                    double tvSize = Double.parseDouble(sc.nextLine());
                    double tvWeight = Double.parseDouble(sc.nextLine());
                    double tvCost = Double.parseDouble(sc.nextLine());
                    boolean tv3D = Boolean.parseBoolean(sc.nextLine());
                    boolean tvAutoPowerOff = Boolean.parseBoolean(sc.nextLine());
                    boolean tvGameMode = Boolean.parseBoolean(sc.nextLine());

                    if (tvModel.equals("Samsung J5205")) {

                        Television t1 = new SmartTelevision(tv3D, tvAutoPowerOff, tvGameMode, tvModel, tvType, tvSize, tvWeight, tvCost, es.getStoreName(), es.getAddress(), es.getContactNumber());
                       // t1.calculateCost(tv3D, tvAutoPowerOff, tvGameMode);

                        System.out.println(t1.toString() + "\nTotal Cost: $" + t1.calculateCost(tv3D, tvAutoPowerOff, tvGameMode));
                        System.out.println("*****************************************************************\n");
                    }
                    if (tvModel.equals("LG 22LF430A")) {
                        Television t1 = new SmartTelevision(tv3D, tvAutoPowerOff, tvGameMode, tvModel, tvType, tvSize, tvWeight, tvCost, es.getStoreName(), es.getAddress(), es.getContactNumber());

                        System.out.println(t1.toString() + "\nTotal Cost: $" + t1.calculateCost(tv3D, tvAutoPowerOff, tvGameMode));
                        System.out.println("*****************************************************************\n");

                    }

            }

        }

    }

}
