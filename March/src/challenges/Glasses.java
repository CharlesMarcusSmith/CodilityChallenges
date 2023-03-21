package challenges;

public class Glasses {
//	Given two integers N and K, returns the minimum number of glasses that are needed to contain exactly K liters of water. If it is not possible to
//	pour exactly K liters of water into glasses then the function should return −1.
//	Examples:
//	1. Given N = 5 and K = 8, the function should return 2. There are five glasses of capacity 1, 2, 3, 4 and 5. You can use two glasses with capacity 3
//	and 5 to hold 8 liters of water.
//	2. Given N = 4 and K = 10, the function should return 4. You must use all the glasses to contain 10 liters of water.
//	3. Given N = 1 and K = 2, the function should return −1. There is only one glass with capacity 1, so you cannot pour 2 liters of water.
//	4. Given N = 10 and K = 5, the function should return 1. You can use the glass with capacity 5.
//	Write an efficient algorithm for the following assumptions:
//	N is an integer within the range [1..1,000,000];
//	K is an integer within the range [1..1,000,000,000].


	public Glasses() {

	}

	public int solution(int N, int K) {
		// Implement your solution here
		// This solution counts down, by subtracting the total by that glass capacity.
		int tK = K;
		int nC = 0;

		// For loop to cycle down through N
		for (int i = N; i > 0; i--) {

			// If it fits, reduce it from the total and count 1 glass
			if (tK >= i) {
				tK = tK - i;
				nC++;
			}
		}
		if (tK == 0) {
			return nC;
		} else {
			return -1;
		}
	}
	

	//NOTES:
	// 1: One thing I observed about this in hindsight: as we loop and keep reducing the glasses, each loop we could check if the size of litres is smaller than the glass in question
	// ^ If so we can guarantee that the required glass is available somewhere, and would certainly only need 1 more count.
	// 2: The second obvious thing is this will loop entirely, when really we can break the loop at the point above.
	// 3: The variable names in this challenges hard to follow and can be improved.
	// Theory: Loop as before, however once the litre remaining is smaller than glass, increase the count once then break.
	
	public int revised(int inGlasses, int litres) {
		// Implement your solution here
		// This solution counts down, by subtracting the total by that glass capacity.
		int glassCount = 0;

		// For loop to cycle down through N(glasses).
		for (int i = inGlasses; i > 0; i--) {
			// If it fits, reduce it from the total and count 1 glass
			if(litres >= i) {
				litres = litres - i;
				glassCount++;
			}
			//Breaking out off loop when we can guarantee we have required glass. 
			if(litres<i-1) {
				glassCount++;
				litres = 0;
				break;
			}
			
		}
		if (litres == 0) {
			return glassCount;
		} else {
			return -1;
		}
	}
}
