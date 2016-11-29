
import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Lab 5, Program #1
 *November 23nd, 2016
 * 
 */
public class Lab5A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double userValue;
		int indexOfSearched = -1;
		
		System.out.print("The vaules you can choose are: ");
		
		for(int i = 0; i < values.length; i++){
			
			System.out.print(values[i] + ", ");
			
		}
	
		System.out.println("\nPlease choose a value.");
		userValue= userInput.nextDouble();
		
		for(int i = 0; i < values.length; i++){
			
			if(values[i] == userValue){
				
				indexOfSearched = i;
				
			}
			
		}
		
		if(indexOfSearched == -1){
			System.out.println("Value cannot be found in array");
		}
		
		System.out.println("Your value is at the index of " + indexOfSearched);
		
		userInput.close();
	}

}
