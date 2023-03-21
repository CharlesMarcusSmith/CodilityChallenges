package challenges;

public class CountBananas {
//	Given a string S of length N, returns the maximum number of moves that can be applied.
//	Examples:
//	1. Given S = "NAABXXAN", the function should return 1.
//
//	2. Given S = "NAANAAXNABABYNNBZ", the function should return 2.
//
//	3. Given S = "QABAAAWOBL", the function should return 0.
//
//	Write an efficient algorithm for the following assumptions:
//	N is an integer within the range [1..100,000];
//	string S is made only of uppercase letters (A−Z).
	
	public CountBananas() {

	}

	public int solution(String S) {
		// Implement your solution here

		// A_detemines_result WRONG ANSWER: I have not fixed this as I am unsure what it
		// is refering too.

		boolean comp = false;
		int bC = 0; // 'b' count
		int aC = 0; // 'a' count
		int nC = 0; // 'n' count
		int count = 0; // counts how many times we can make Banana

		// Counting total of each char in String
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'B') {
				bC++;
			}
			if (S.charAt(i) == 'A') {
				aC++;
			}
			if (S.charAt(i) == 'N') {
				nC++;
			}
		}

		// Working out how many times move can be applied, by reducing the move cost
		// from total available characters of each char.

		while (comp == false) {
			if (bC >= 1 && aC >= 2 && nC >= 2) {
				bC--;
				aC = aC - 2;
				nC = nC - 2;
				count++;
			} else {
				comp = true;
			}
		}

		return count;
	}
	
	
	//NOTES:
	//1: This is incorrect as we are only checking for 2 A's in the while loop instead of 3.
	//2: We can then eliminate the second loop completely 
	//3: The variable names colour be improved slightly.
	//Theory: Eliminate the first loop/conditionals by using dividing the number by the required number,
	//^: Then overwrite the lowest number.
	
	public int revised(String inString) {
		// Implement your solution here

		int bCount = 0; // 'b' count.
		int aCount = 0; // 'a' count.
		int nCount = 0; // 'n' count.
		int count = 0; //used for return statement.

		// Counting total of each char in String.
		for (int i = 0; i < inString.length(); i++) {
			if (inString.charAt(i) == 'B') {
				bCount++;
			}
			if (inString.charAt(i) == 'A') {
				aCount++;
			}
			if (inString.charAt(i) == 'N') {
				nCount++;
			}
		}
		
		//Finding lowest count, as all letters required.
		
		//Start with B as 1 required.
		count = bCount;
		
		//N: 2 required
		if(nCount/2 < count) {
			count = nCount/2;
		}
		
		//A: 3 required.
		if(aCount/3 < count) {
			count = aCount/3;
		}
		
		return count;
	}
}
