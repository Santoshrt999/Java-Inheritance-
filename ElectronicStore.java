/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 * This is a ElectronicStore class file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public class ElectronicStore {

    private String storeName;
    private String address;
    private String contactNumber;

    /**
     * This is a no-argument constructor.
     */
    public ElectronicStore() {
    }

    /**
     * This is a three-argument constructor which initializes all instance
     * variables.
     *
     * @param storeName- The parameter storeName is passed.
     * @param address- The parameter address is passed.
     * @param contactNumber- the parameter contactNumber is passed.
     */
    public ElectronicStore(String storeName, String address, String contactNumber) {
        this.storeName = storeName;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    /**
     * This method is used to get the storeName.
     *
     * @return-The value of getStoreName is called.
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * This method is used to get the address.
     *
     * @return-The value of getAddress is called.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method is used to get the ContactNumber.
     *
     * @return-The value of getContactNumber is called.
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * This method is overridden to determine a string representation of an
     * object.
     *
     * @return- The string values are returned.
     */
    @Override
    public String toString() {
        return "\nStore Name:" + storeName + "\nStore Address:" + address + "\nStore Contact Number:" + contactNumber;
    }

}
