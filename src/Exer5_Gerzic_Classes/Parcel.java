package Exer5_Gerzic_Classes;

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

    public String toString() {
        return id + "  " +address;
    }
}



