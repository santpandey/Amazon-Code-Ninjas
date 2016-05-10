import java.util.HashMap;
import java.util.Scanner;


public class JumboTail {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no. of trips to be taken");
		
		int trips = s.nextInt();
		
		/*Creating a boolean array which will be become true when an alphabet is encountered in input*/
		boolean[] citiesArray = new boolean[26];
		
		for(int i = 0 ; i < 25 ; i++)
			citiesArray[i] = false;
		
		int count = 0;
		
		System.out.println("Enter the cities");
		
		String[] inputArray = s.next().toUpperCase().split("->");
		
		int inputSize = inputArray.length;
	
		/*Creating a Hash Map for all the alphabets*/
			HashMap myMap = new HashMap<>();
			
			myMap.put("A", 0);
			myMap.put("B", 1);
			myMap.put("C", 2);
			myMap.put("D", 3);
			myMap.put("E", 4);
			myMap.put("F", 5);
			myMap.put("G", 6);
			myMap.put("H", 7);
			myMap.put("I", 8);
			myMap.put("J", 9);
			myMap.put("K", 10);
			myMap.put("L", 11);
			myMap.put("M", 12);
			myMap.put("N", 13);
			myMap.put("O", 14);
			myMap.put("P", 15);
			myMap.put("Q", 16);
			myMap.put("R", 17);
			myMap.put("S", 18);
			myMap.put("T", 19);
			myMap.put("U", 20);
			myMap.put("V", 21);
			myMap.put("W", 22);
			myMap.put("X", 23);
			myMap.put("Y", 24);
			myMap.put("Z", 25);
			
			
		
			/*I am setting the corresponding index to true on which the alphabet 
			 * is encountered. I am getting corresponding numeric value from hashMap 
			 * for the alphaet encountered and setting the index of that numeric value
			 * to true in the boolean value
			 */
			
			for(int i = 0 ; i < inputSize ; i++)
			{
				if(!citiesArray[(int) myMap.get(inputArray[i])])
				{
					
					count = count + 1;
					citiesArray[(int) myMap.get(inputArray[i])] = true;
				}
			}
			
			//System.out.println("count is "+count);
			
			if(inputSize < trips || count!=trips)
			{
				System.out.println("Invalid Input");
				
			}
			
			/*
			 * The logic is here is that if the boolean array indices is already true
			 * then it means that the city is visited twice. At that time we have found 
			 * a loop and will increment the count variable
			 */
		
			else{
				
				count = 0;
				
				for(int i = 0 ; i < 26 ; i++)
					citiesArray[i] = false;
				
				for(int i = 0 ; i < inputSize ; i++)
				{
					if(citiesArray[(int) myMap.get(inputArray[i])])
					{
						count = count + 1;
					}
					else
					{
						citiesArray[(int) myMap.get(inputArray[i])] = true;
					}
				}
			
			System.out.println(count);
				
			}
			
		
	}

}
