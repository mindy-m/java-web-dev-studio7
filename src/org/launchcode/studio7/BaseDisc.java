package org.launchcode.studio7;

public abstract class BaseDisc {


    private String title;
    private String author;
    private Double storageCapacity;
    private String discType;

    public BaseDisc(String title, String author, Double storageCapacity, String diskType) {
        this.title = title;
        this.author = author;
        this.storageCapacity = StorageCapacity;
        this.diskType = diskType;
    }

    public void readData() {
        System.out.println("Currently reading " + this.title + " disc...");
    }

    public void storeData() {
        System.out.println("Saving to " + this.discType + "...");
    }

    public boolean writeData(double dataSize) {
        if (dataSize > storageCapacity) {
            return false;
        }
        return true;
    }

    public void returnInformation() {

    }
}
