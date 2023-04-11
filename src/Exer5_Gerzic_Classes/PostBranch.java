package Exer5_Gerzic_Classes;

import java.util.Arrays;

public class PostBranch {
    private Parcel[] parcelArray;
    private String branch;
    int numOfPackets = 0;


    public PostBranch(int maxNumOfPackets, String branch) {
        this.branch = branch;
        parcelArray = new Parcel[maxNumOfPackets];
    }

//    public int maxNumberOfPackets(int maxNumOfPackets){
//        return maxNumOfPackets;
//    }
    public void addPacket(Parcel parcel) {
        if (numOfPackets < parcelArray.length) {
            parcelArray[numOfPackets] = parcel;
            System.out.println("We confirm the receipt of this parcel.");
            numOfPackets++;
        }
        else {
            System.out.println("This branch has reached the max number of packages it can take. Please try another branch.");
        }
    }

    public void removePacket(int id) {
        for(int i = 0; i < parcelArray.length; i++) {
            if (parcelArray[i].getId() == id){
                System.out.println("The packet it ID: " + id +  " is delivered and will be removed from the records.");
                parcelArray[i] = null;
            }
            else {
                System.out.println("No packets with ID: " + id + " is found in the system. Please check your input again. ");
            }
        }
    }

    public void showParcelsInBranch() {
        System.out.println("The post in " + branch + " has the following parcels: " + Arrays.toString(parcelArray));
    }

    public void parcelDetails(int parcelPositionInArray) {
            if (parcelArray[parcelPositionInArray] != null) {
                System.out.println("The parcel with the ID: " +parcelArray[parcelPositionInArray].getId() + " has the following details: " + parcelArray[parcelPositionInArray].getAddress());
            }
            else {
                System.out.println("This position contains no record.");
            }
        }
    }
