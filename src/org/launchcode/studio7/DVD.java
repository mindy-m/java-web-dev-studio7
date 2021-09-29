package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDiscInterface {
    public DVD(String title, String author, Double storageCapacity, String diskType) {
        super(title, author, storageCapacity, diskType);
    }

    public DVD(String title, String author, Double storageCapacity, String diskType) {
        super(title, author, 4700.0, diskType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
