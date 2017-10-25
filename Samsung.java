/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *This is a Samsung class file which extends Mobile class file.
 * @author Goteti Santosh Ravi Teja
 */
public class Samsung extends Mobile {

    private int STANDARD_BATTERY_LIFE = 10;

    /**
     *This is a no-argument constructor which initializes super class no-argument constructor.
     */
    public Samsung() {

        super();
    }

    /**
     *This is a nine-argument constructor which initializes all instance variables of the super class except accessories.
     * @param model- The parameter model is passed.
     * @param processor- The parameter processor is passed.
     * @param operatingSystem- The operatingSystem Model is passed.
     * @param body- The parameter body is passed.
     * @param battery- The parameter battery is passed.
     * @param initialPrice- The parameter initialPrice is passed.
     * @param storeName- The parameter storeName is passed.
     * @param address- The parameter address is passed.
     * @param contactNumber- The parameter contactNumber is passed.
     */
    public Samsung(String model, String processor, String operatingSystem, String body, double battery, double initialPrice, String storeName, String address, String contactNumber) {
        super(model, processor, operatingSystem, body, battery, initialPrice, storeName, address, contactNumber);
    
    }

    /**
     *This method is used to get value for the variable totalCost.
     * @return - This returns the caluclateCost value property.
     */
    

    public double calculateCost() {

        double totalCost = 0;
       totalCost = getInitialPrice();
        if (getAccessories().contains("Bluetooth headsets")) {

            totalCost += 79;
        }
        if (getAccessories().contains("USB cable")) {
            totalCost += 17;
        }
        if (getAccessories().contains("Wired headsets with mic")) {
            totalCost += 39;
        }
        if (getAccessories().contains("Extended 1 year warranty")) {
            totalCost += 89;
        }
        if (getAccessories().contains("Charging Adapter")) {
            totalCost += 29;
        }
        return totalCost;
    }

    double batteryLife = 0.0;
    /**
     *This method is used to get the value of the variable batteryLife.
     * @param noOfHoursin4G - The parameter no0fHoursin4G is passed.
     * @return - This returns the CalculateBatteryLife value property.
     */
    public double calculateBatteryLife(int noOfHoursin4G) {

     batteryLife = STANDARD_BATTERY_LIFE/noOfHoursin4G;
     return batteryLife;
    }
    /**
     * This method overrides the toString from the super class to determine a
     * string representation of an object.
     *
     * @return 
     * @return- The string values are returned.
     */
    @Override
        public String toString() {
        String bl = String.format("%.2f", batteryLife);//(how to format, what to format)
        String tp = String.format("%.2f", calculateCost());
        return super.toString() + "\nBattery Life: " + bl+"hours"+ "\nTotal Price: $" + tp;
    }

}
