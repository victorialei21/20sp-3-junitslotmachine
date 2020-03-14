import java.util.Random; 
import java.util.Arrays; 

public class BetterSlot {

	//a method that generates an array of 5 random integers
	int[] pullTheLever() {
		
		int singleSpin[];
		
		//instantiate an instance of the Random class
		Random rand = new Random(); 
		
		//iterate and generate an interger for each member of the array
		for ( int i = 0; i < 5; i++ ) {
			
			singleSpin[i] = rand.nextInt(50) + 1;
		}
		
		return singleSpin;
	} 
	
	
	//a method that correctly computes the payoff amount for a single spin of the slot machine
	int payOff( int[] values ) {
		
		//sort array 
		Arrays.sort(values);
		int cashAmount = -2;
		
		//if all five numbers are the same
		if( values[0] == values[4] ) {
			cashAmount += 10000;
		}
		//if four out of five numbers are the same
		else if( (values[0] == values[1] && values[1] == values[2] && values[2] == values[3]) || 
				(values[1] == values[2] && values[2] == values[3] && values[3] == values[4]) ) {
			cashAmount += 10000;
		}
		//if it's a full house (three are same, two are same)
		else if( (values[0] == values[1]) && (values[1] == values[2]) && (values[3] == values[4])
				&& (values[2] != values[3])) {
			cashAmount += 5000;
		}
		//second version of full house
		else if( (values[0] == values[1]) && (values[2] == values[3]) && (values[3] == values[4])
				&& (values[1] != values[2])) {
			cashAmount += 5000;
		}
		//if any three are the same but remaining two are different
		else if( (values[0] == values[1] && values[1] == values[2]) || (values[1] == values[2] && values[2] == values[3]) 
				|| (values[2] == values[3] && values[3] == values[4])) {
			cashAmount += 100;
		}
		//if any two numbers are the same
		else if( (values[0] == values[1]) || (values[1] == values[2])
				|| (values[2] == values[3]) || (values[3] == values[4]) ) {
			cashAmount += 10;
		}
		
		
		//if any number is a perfect square
		boolean perfSquareFlag = false;
		for (int j = 0; j < 5; j++) {
			while (perfSquareFlag == false) {
				
				double sqrt = Math.sqrt(values[j]);
			
				if (sqrt*sqrt == values[j]) {
					cashAmount += 7;
					perfSquareFlag = true;
				}//end if statement
			}//end while loop	
		}//end for loop
 		
		
		//if any number is 42
		boolean fortyTwoFlag = false;
		for (int i = 0; i < 5; i++) {
			while( fortyTwoFlag == false ) {
				if (values[i] == 42) { 
					cashAmount += 2;
					fortyTwoFlag = true;
				}//end if statement
			}//end while loop
		}//end for loop
		
		//if any number is a power of two 
		boolean powerTwoFlag = false; 
		int testValue = 0;
		for (int h = 0; h < 5; h++) {
			testValue = values[h];
			if (testValue == 1) { 
				powerTwoFlag = true;
			}//end if statement
			while(testValue%2 == 0 && flag == false) {
				testValue /= 2;
			}//end while loop
			if(testValue == 1 && flag == false) {
				cashAmount +=3;
				powerTwoFlag = true;
			}//end if statement
		}//end for loop
		
		return cashAmount;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("what");
	}

}
