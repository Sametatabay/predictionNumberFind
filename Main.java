import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        int number = rand.nextInt(100);
        Scanner inp=new Scanner(System.in);
        int right=0;
        int selected;
        int[]wrong=new int[5];
        System.out.println(number);
        boolean isWin=false;
        while (right<5){
            System.out.print("Please Prediction Enter :");
            selected=inp.nextInt();

            if (selected <0   || selected >100){
                System.out.println("Please 0-100 between number enter");
                continue;
            }

            if (selected==number){
                System.out.println("Congratulations Prediction True.");
                isWin=true;
                break;
            }else{

                System.out.println("Incorrect number you entered!" );
                if (selected<number){
                    System.out.println(selected+" "+"Number,scret from the number small");
                }else{
                    System.out.println(selected+" "+"Number,scret from the number big");
                }
                right++;
                wrong[right]=selected;
                System.out.println("Reaminder right :"+(5-right));
            }
        }
        if (!isWin){
            System.out.println("You Lost");
            System.out.println(" You Predictions"+Arrays.toString(wrong));
        }

    }
}
