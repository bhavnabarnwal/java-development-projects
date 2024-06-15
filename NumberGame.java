import java.util.Random;
import java.util.Scanner;

class Game2{
    int userinput,cominput;int noofguesses=0;
    Game2(){
        Random rand=new Random();
        cominput =rand.nextInt(100);
    }
    int userInput()
    {
        System.out.println("Guess the number:");
        Scanner sc=new Scanner(System.in);
        userinput=sc.nextInt();
        return userinput;
    }
    boolean isCorrectNumber(int n){
        noofguesses++;
        if(n==cominput){
            System.out.format("you guessed it right\n in %d attempts",noofguesses);
            System.out.println();
            return true;}
        else if (n>cominput) {
            System.out.println("it is vry high");
        } else if (n<cominput) {
            System.out.println("it is vry low");
        }
        return false;
    }
    int getNoofguesses(){
        return noofguesses;
    }
    void setNoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }

}
public class NumberGame {
    public static void main(String[] args) {
        Game2 g=new Game2();
        boolean b=false;
        while(!b){
        int n=g.userInput();
        b= g.isCorrectNumber(n);
        }
    }
}
