/*
1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guessis correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.

6. Add the option for multiple rounds, allowing the user to play again.

7. Display the user's score, which can be based on the number of attempts taken or rounds won
*/

import java.util.*;

class NumberGame{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.println("==============================================");
         System.out.println("==============================================");
         System.out.println("==========WELCOME TO THE NUMBER GAME==========");
         System.out.println("==============================================");
         System.out.println("==============================================");

         try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*Hint */
        System.out.println("  ");
        System.out.println("                            HINT       ");
        System.out.println(" ");
        System.out.println("If the number entered does not show 'Too High' or 'Too Low' Text then the number is in between +10 to -10 from the entered number");
        System.out.println(" ");

         int round = 1;
         int roundWon = 0;
         int totalScore = 0;

         while(round <=round && round <=3){

            System.out.println("         ROUND : "+round);

         //(int)(Math.random() * 100) + 1;
        
         int totalAttempts = 3;
         int attemptsLeft =  3;

         int score = 0;
              System.out.println("Random Number Generated");

         for(int i=1;i<=totalAttempts;i++){

            Random  random = new Random();
            int randomNumber = random.nextInt(1, 100);
            System.out.println(randomNumber+i*10);//for the understading of programmers

              System.out.println("       Number of Attempts Left : "+attemptsLeft);
              System.out.println(" ");
              System.out.print("Enter Your Guess : ");
              int userGuess = sc.nextInt();
              try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
              System.out.println(" ");          

              score = (attemptsLeft * 3) + 1;

              if(userGuess == randomNumber){
              System.out.println("Hurray! Your Guess Is Correct");
              System.out.println(" ");
              System.out.println("Your Score Is : "+score);
              System.out.println(" ");
              totalScore += score;
              roundWon++;
              break;
        }
        else{
            int res = randomNumber - userGuess;
            System.out.println("Wrong Guess ");
            if(res >= 5){
                System.out.println("Your Guess is too low");
            }
            else if (res <= -5) {
               System.out.println("Your Guess is too high"); 
            }
            System.out.println("Try Again");
            System.out.println(" ");
          }
          --attemptsLeft;
         }

        ++round; 
        }
        System.out.println("Rounds Won = "+roundWon);
        System.out.println("Your Total Score of All 3 Rounds Is : "+totalScore);
        sc.close();
    }
}