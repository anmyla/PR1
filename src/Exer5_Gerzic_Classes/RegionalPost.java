package Exer5_Gerzic_Classes;
import java.util.Arrays;
public class RegionalPost {
    public static void main(String[] args) {

        PostBranch branch1 = new PostBranch(3, "Fernitz");
        PostBranch branch2 = new PostBranch(10, "Graz");
        Parcel parcel1f = new Parcel(245, "Ludwigstrasse 8 Fernitz");
        Parcel parcel2f = new Parcel(246, "Irgendeinestrasse 12 Fernitz");
        Parcel parcel3f = new Parcel(247, "Koenigstrasse 15 Fernitz");
        Parcel parcel4f = new Parcel(247, "Meierweg 5 Fernitz");

        Parcel parcel1g = new Parcel(56987, "Schoenaugasse 12 Graz");


        branch1.addPacket(parcel1f);
        branch1.addPacket(parcel2f);
        branch1.addPacket(parcel3f);
        branch1.addPacket(parcel4f);

        branch1.showParcelsInBranch();
        branch2.addPacket(parcel1g);
        branch2.showParcelsInBranch();

        branch2.parcelDetails(0);
        branch2.parcelDetails(1);
        branch1.parcelDetails(0);
    }
}