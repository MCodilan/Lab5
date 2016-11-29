
import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Lab 5, Program #2
 *November 24th, 2016
 * 
 */
public class Lab5B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int userElement;
		int index = 0;
		int values[] = new int [10];
		int numOfNum = 0;
		
		for(int i = 0; i < values.length; i++){
			
			System.out.print("Enter an integer value: ");
			values[i] = userInput.nextInt(); 
		}
		
		System.out.println("What element do you want to search for?");
		userElement = userInput.nextInt();
		
		for(int i = 0; i < values.length; i++){
			
			if(values[i] == userElement){
				numOfNum ++;
			}
			
		}
		
		System.out.println("The number of times your element has been entered is: " + numOfNum); 
		userInput.close();
	}

}
