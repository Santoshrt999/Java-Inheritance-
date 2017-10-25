/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 * This is the SmartTelevision class file which extends Television class file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public class SmartTelevision extends Television {

    private boolean is3D;
    private boolean isAutoPowerOff;
    private boolean isGameMode;

    /**
     * This is a eleven-argument constructor which is used to initialize all the
     * instance variables of the super class and the SmartTelevision class.
     *
     * @param is3D- The parameter is3D is passed.
     * @param isAutoPowerOff- The parameter isAutoPowerOff is passed.
     * @param isGameMode- The parameter isGameMode is passed.
     * @param model- The parameter model is passed.
     * @param type- The parameter type is passed.
     * @param screensize- The parameter screen size is passed..
     * @param weight- The parameter weight is passed.
     * @param cost- The parameter cost is passed.
     * @param storeName- The parameter storeName is passed.
     * @param address- The parameter address is passed.
     * @param contactNumber- The parameter contactNumber is passed.
     */
    public SmartTelevision(boolean is3D, boolean isAutoPowerOff, boolean isGameMode, String model, String type, double screensize, double weight, double cost, String storeName, String address, String contactNumber) {
        super(model, type, screensize, weight, cost, storeName, address, contactNumber);
        this.is3D = is3D;
        this.isAutoPowerOff = isAutoPowerOff;
        this.isGameMode = isGameMode;
    }

    /**
     * This method overrides the toString from the Television class to determine
     * a string representation of an object.
     *
     * @return- The string values are returned.
     */
    @Override
    public String toString() {
        return super.toString() + "\nis3D:" + is3D + "\nisAutoPowerOff:" + isAutoPowerOff + "\nisGameMode:" + isGameMode;
    }

}
