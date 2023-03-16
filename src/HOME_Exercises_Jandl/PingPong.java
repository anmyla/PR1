package HOME_Exercises_Jandl;

public class PingPong {
    public static void main(String[] args) {
        pingPongMethod();
    }
    public static void pingPongMethod() {
        int x = 1;
        int ping = 0;
        int pong = 0;
        int pingpong = 0;
        int negative = 0;

        while (x < 100) {
            if ((x % 6) == 0) {
                System.out.println("Ping pong");
                pingpong = pingpong + 1;
            } else if ((x % 3) == 0){
                System.out.println("Pong");
                pong = pong + 1;
            } else if ((x % 2) == 0) {
                System.out.println("Ping");
                ping = ping + 1;
            }
            else {
                System.out.println("-");
                negative = negative + 1;
            }
            x = x + 1;
        }
        System.out.println("There are " + ping + " pings");
        System.out.println("There are " + pong + " pongs");
        System.out.println("There are " + pingpong + " pingpongs");
        System.out.println("There are " + negative + " -");

    }
}

//Create a new class with a main method.
// Write a while loop that increments a variable from 1 to 100.
// For each number, check if it is divisible by the following
// values and output the respective term on the console: