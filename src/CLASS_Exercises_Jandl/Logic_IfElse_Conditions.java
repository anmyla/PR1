package CLASS_Exercises_Jandl;

public class Logic_IfElse_Conditions {
    public static void main(String[] args) {

        System.out.println();

        //The class solution
        System.out.println("The sun is shining and it is raining.");
        boolean sunShine = false;
        boolean rain = true;
        System.out.println(sunShine && rain); //if both conditions are true then it is "true" otherwise, we get a "false"

        //The class solution
        System.out.println();
        System.out.println("Confusion and Knowledge");
        boolean confusion = true;
        boolean knowledge = false;
        System.out.println( confusion || knowledge);


        //The class solution
        System.out.println();
        System.out.println("Result");
        boolean result = 1>3 && (!(3-1 < 5)) || 2*2 == 4;
        System.out.println(result);

        //My Solution
        System.out.println((1>3 && !((3 -1) >5)) || (2*2) ==4);

        //The class solution
        System.out.println();
        System.out.println("Logical Operator");
        boolean logicalOperator = (6>= 2*3 || 2-3 < 0) && (1 *1 == 1 && 1 != 1+1 );
        System.out.println(logicalOperator);

        //My Solution
        System.out.println (((6 >= (2*3))  || (2-3) < 0) && ((1*1) == 1) && (1 != (1+1)));


    }
}
