package edu.wctc;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] answer = {"You prefer life to be calm and organized", "You prefer a good balance in life", "You prefer life to be spontaneous and active"};
	String[] prompts = {"mild or spicy", "tea or coffee", "breakfast or brunch", "summer or winter","paper or plastic"};
    int[] count={5,5,5,5,5};
    boolean done=false;

	System.out.println("Welcome to the Preference Quiz");

    while(!done) {
        int total = 0;
        for (int i = 0; i < prompts.length; i++) {
            System.out.println("Do you prefer " + prompts[i] + "?");
            System.out.println("Enter 0 for the preference on the left.");
            System.out.println("Enter 1 for the preference on the right.");
            count[i] = input.nextInt();
        }
        for (int i : count) {
            total = total + i;
        }
        System.out.println("Your score is " + total);
        if(total<3){
            end(answer[0]);
        }
        else if(total==3){
            end(answer[1]);
        }
        else{
            end(answer[2]);
        }
        System.out.println("Again? Enter 1 to play again or any other key to exit.");
        int exit = input.nextInt();

        if(exit!=1){
            done=true;
        }
    }
    }
    static void end(String stop){
        System.out.println(stop);
    }
}
