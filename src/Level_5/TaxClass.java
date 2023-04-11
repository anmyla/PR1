package Level_5;

public class TaxClass {
    int [][] property = {
            {1,30,40},
            {2,20,50},
            {3,10,30}
    };
    double tax = 0;

    public void calculateTax(){
     for (int i = 0; i< property.length; i++){
         for (int j= 0; j < property[i].length; j++){
             if (property[i][0] == 1){
                 tax = (property[i][1] * property[i][2])* 3.20;
             }
             else if (property[i][0] == 2){
                 tax = (property[i][1] * property[i][2])* 2.10;
             }
             else {
                 tax = (property[i][1] * property[i][2])* 0.90;
             }

         }
         System.out.println("Type : " + property[i][0] + " Property tax: " + tax );
     }


    }

}


