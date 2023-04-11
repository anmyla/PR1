package Basics;

public class PingPong {
    public static void main(String[] args) {
        int ping = 0;
        int pong = 0;
        int pingpong = 0;
        int counter = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 6 == 0) {
                pingpong++;

            }

            else if (i % 3 == 0) {
                pong++;

            }

            else if (i % 2 == 0) {
                ping++;

            }

            else {
                counter++;

            }
        }
        System.out.println(pingpong + " ping pong");
        System.out.println(pong + " pong");
        System.out.println(ping + " ping ");
        System.out.println(counter + " -");
    }
}

//PingPong
//Create a new class with a main method.
// Write a while loop that increments a variable
// from 1 to 100. For each number, check if it is divisible
// by the following values and output the respective term on the console:
//Divisible by
//Print out
//Example
//2
//ping
//2 ping 8 ping
//3
//pong
//3 pong 9 pong
//6
//ping pong
//12 ping pong
//Else
//„-„
//5 -
//
//Bonus: Now write it with a for loop!