/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a Mobile class file which extends ElectronicStore class file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public class Mobile extends ElectronicStore {

    private String model;
    private String processor;
    private String operatingSystem;
    private String body;
    private double battery;
    private double initialPrice;
    private List<String> accessories;

    /**
     * This is a no-argument constructor which initializes all variables of
     * super class and accessories to an ArrayList.
     */
    public Mobile() {

        super("", "", "");// no arg constructor initialization
        this.accessories = new ArrayList<String>();
    }

    /**
     * This is a nine-argument constructor which initializes all instance
     * variables of super class and Mobile.
     *
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
    public Mobile(String model, String processor, String operatingSystem, String body, double battery, double initialPrice, String storeName, String address, String contactNumber) {

        super(storeName, address, contactNumber);
        this.model = model;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.body = body;
        this.battery = battery;
        this.initialPrice = initialPrice;
        this.accessories = new ArrayList<String>();
    }

    /**
     * This method is used to get model.
     *
     * @return-The value of getModel is called.
     */
    public String getModel() {
        return model;
    }

    /**
     * This method is used to get the processor.
     *
     * @return-The value of getProcessor is called.
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * This method is used to get the operatingSystem.
     *
     * @return-The value of getOperatingSystem is called.
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * This method is used to get the body.
     *
     * @return-The value of getBody is called.
     */
    public String getBody() {
        return body;
    }

    /**
     * This method is used to get the battery.
     *
     * @return-The value of getBattery is called.
     */
    public double getBattery() {
        return battery;
    }

    /**
     * This method is used to get the screen size.
     *
     * @return-The value of getScreensize is called.
     */
    public double getInitialPrice() {
        return initialPrice;
    }

    /**
     * This method is used to get the accessories.
     *
     * @return-The value of getAccessories is called.
     */
    public List<String> getAccessories() {
        return accessories;
    }

    /**
     * This method is used to add accessories to the List.
     *
     * @param items- The parameter items is passed.
     * @return- The value of the addAccessories is called.
     */
    public List<String> addAccessories(String items) {

       for (String c: items.split(",")){
           
           accessories.add(c);
       }
        return accessories;
    
    }

    /**
     * This method overrides the toString from the electronicStore to determine
     * a string representation of an object.
     *
     * @return- The string values are returned.
     */
    @Override
    public String toString() {
        String initprice = String.format("%.2f", getInitialPrice());
        return "\nModel: " + model + "\nProcessor: " + processor + "\nBattery: " + battery + "mAh" + "\nBody: " + body + "\nOperating System: " + operatingSystem + "\nInitial Price: $" + initprice;
    }

}
