import java.util.Scanner;
import java.util.Random;

public class numbergame {

    public static void main(String args[]){
        int lower=1;
        int upper=100;

        //generate the target number

        Random randomData=new Random();
        int target=randomData.nextInt(lower,upper+1);

        System.out.printf("guess a number between %d and %d",lower,upper);
        Scanner userInput=new Scanner(System.in);
        int guess=0;

        while(guess!=target){
            guess=userInput.nextInt();
            if(guess==target) {
                System.out.printf("correct number");
            }else if(guess>target){
                System.out.printf("guess lower");
            }else{
                System.out.println("guess higher");
            }

        }

        System.out.printf("%d and %d",target,guess);


    }

}
