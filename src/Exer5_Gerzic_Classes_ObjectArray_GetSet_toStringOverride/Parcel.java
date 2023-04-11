package Exer5_Gerzic_Classes_ObjectArray_GetSet_toStringOverride;

public class Parcel {
    private int id;
    private String address;

    public Parcel(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    //below method is made to override the usual toString() function to display info/String we defined
    //it must return a String value containing the data we want AND it should be named "toString"
    public String toString() {
        return id + "  " + address;
    }
}



