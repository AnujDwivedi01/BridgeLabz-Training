/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/
import java.util.Scanner;
public class QuizApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking array for questions
		String[] questions = {
            "1. What is the size of int in Java?\nA. 2 bytes\nB. 4 bytes\nC. 8 bytes\nD. Depends on system",
            "2. Which keyword is used to inherit a class?\nA. implement\nB. inherits\nC. extends\nD. super",
            "3. Which method is the entry point of Java program?\nA. start()\nB. run()\nC. main()\nD. init()",
            "4. Which loop is best when number of iterations is known?\nA. while\nB. do-while\nC. for\nD. infinite",
            "5. Which data type stores true/false values?\nA. int\nB. boolean\nC. char\nD. double"
        };
		
		// Correct answers
        char[] correctAnswers = { 'B', 'C', 'C', 'C', 'B' };
		
		//score
		int score = 0;
		
		//for loop 
		for(int i =0;i<questions.length;i++){
			
			System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = input.next().toUpperCase().charAt(0);
			
			
			//switch case for updating score value
			switch (userAnswer) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println(" Correct!");
                        score++;
                    } else {
                        System.out.println(" Wrong! Correct answer is: " + correctAnswers[i]);
                    }
                    break;

                default:
                    System.out.println("Invalid option! No marks awarded.");
            }
			
			

		}
		 // final Score
        System.out.println("\n Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);
		
		//closing input
		input.close();
		

	}
}