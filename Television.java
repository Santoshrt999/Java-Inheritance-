/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 * This is the Television class file which extends ElectronicStore class file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public class Television extends ElectronicStore {

    private String model;
    private String type;
    private double screensize;
    private double weight;
    private double cost;

    /**
     * This is a eight argument constructor which initializes all instance
     * variables of super class and television class.
     *
     * @param model- The parameter model is passed.
     * @param type- The parameter type is passed.
     * @param screensize- The parameter screen size is passed..
     * @param weight- The parameter weight is passed.
     * @param cost- The parameter cost is passed.
     * @param storeName- The parameter storeName is passed.
     * @param address- The parameter address is passed.
     * @param contactNumber- The parameter contactNumber is passed.
     */
    public Television(String model, String type, double screensize, double weight, double cost, String storeName, String address, String contactNumber) {
        super(storeName, address, contactNumber);
        this.model = model;
        this.type = type;
        this.screensize = screensize;
        this.weight = weight;
        this.cost = cost;
    }

    public Television() {
        
        super("","","");
    }
    

    /**
     * This method is used to get the model.
     *
     * @return-The value of getModel is called.
     */
    public String getModel() {
        return model;
    }

    /**
     * This method is used to get the type.
     *
     * @return-The value of getType is called.
     */
    public String getType() {
        return type;
    }

    /**
     * This method is used to get the screen size.
     *
     * @return-The value of getScreensize is called.
     */
    public double getScreensize() {
        return screensize;
    }

    /**
     * This method is used to get the weight.
     *
     * @return-The value of getWeight is called.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method is used to get the cost.
     *
     * @return-The value of getCost is called.
     */
    public double getCost() {
        return cost;
    }

    /**
     * This method is used to Calculate the cost.
     *
     * @param is3D- The parameter is3D is passed.
     * @param isAutoPowerOff- The parameter isAutoPowerOff is passed.
     * @param isGameMode- The parameter isGameMode is passed.
     * @return- The value of the calculateCost is returned.
     */
    public double calculateCost(boolean is3D, boolean isAutoPowerOff, boolean isGameMode) {
        double totalcost = getCost();

        if (is3D) {
            totalcost += 100;
        }
        if (isAutoPowerOff) {
            totalcost += 25;
        }
        if (isGameMode) {
            totalcost += 25;

        }

        return totalcost;
    }

    /**
     * This method overrides the toString from the electronicStore to determine
     * a string representation of an object.
     *
     * @return- The string values are returned.
     */
    @Override
    public String toString() {

        return "Television Details:" + "\nModel:" + model + "\nType:" + type + "\nScreen size:" + screensize + " inches" + "\nWeight:" + weight + " kgs";
    }

}
