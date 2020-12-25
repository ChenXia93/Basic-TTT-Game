package JavaBasic.Chapter_1_Intro.TTT;
import java.util.Scanner;

//Code learned From Udemy : Java for Absolute Beginners
public class Main {
    public static void main(String [] args){
        char [] array = {' ', ' ' , ' ', ' ', ' ',' ',' ',' ', ' '};
        Scanner input = new Scanner(System.in);
        char turn = 'X';
        int symbols;
        int countTurns = 1;
        System.out.println("Welcome To TTT Game");
      while(true) {
            do {
                 symbols = input.nextInt();
            }while(array[symbols -1] == 'X' || array[symbols-1] == 'O');

          if(turn == 'X'){
              System.out.println("Player O turn");
              turn = 'O';
          } else if ( turn == 'O'){
              System.out.println("Player X turn");
              turn = 'X';
          }
          array[symbols - 1] = turn;

          //Display GameBoard
          System.out.println(array[0] + " | " + array[1] + "| " + array[2]);
          System.out.println("---------");
          System.out.println(array[3] + " | " + array[4] + "| " + array[5]);
          System.out.println("---------");
          System.out.println(array[6] + " | " + array[7] + "| " + array[8]);


            //Checks if 3 rows line up
            if(array[0] == turn && array[1] == turn && array[ 2] == turn
                    || array[3] == turn && array[4]== turn &&array[5] == turn
                    || array[6] == turn && array[7] == turn && array[8] == turn
                    || array[0] == turn && array[3] == turn && array[6] == turn
                    || array[1] == turn && array[4] == turn && array[7] == turn
                    || array[2] == turn && array[5] == turn && array[8]== turn
                    || array[2] == turn && array[4] == turn && array[6] == turn
                    || array[0] == turn && array[4] == turn && array[8] == turn ) {
                System.out.println(turn + " is the winner");
                break;
            }
          countTurns++;

          if(countTurns > 9){
              System.out.println("It's a draw!");
              break;
          }

      }




    }
}
