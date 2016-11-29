
import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment Lab 5, Program #3
 *November 28th, 2016
 * 
 */
public class Lab5C {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int maximum;
		int values[] = new int [5];
		int index = 0;
		
		for(int i = 0; i < values.length; i++){
			
			System.out.print("Enter an integer value: ");
			values[i] = userInput.nextInt(); 
		}
		
		maximum = values[0];
		
		for(int i = 0; i <values.length; i++){
			
			if(values[i] > maximum){
				
				maximum = values[i];
				
				
				if(values[i] == maximum){
					
					index = i;
					
				}
				
			}
	
		}

		System.out.println("The maximum value is: " + maximum + "\nAnd is located at the index: " + index);
		
	}

}