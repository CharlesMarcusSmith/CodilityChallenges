package challenges;

public class TimeInSeconds {
//	Given a time T in seconds, converts it into a string in the format "<<hours>>h<<minutes>>m<<seconds>>s".
//	For example, given T=7500 the function should return 2h5m0s.
//	Given T=83643 the function should return 23h14m3s.
//	Assume that:
//	T is an integer within the range [0..86,399].
//	In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
//	Copyright 2009–2023 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
	
	public TimeInSeconds() {
		
	}

	public String solution(int T) {
		// Implement your solution here
		int hours = 0;
		int mins = 0;
		int secs = 0;

		// Hours
		while (T >= 3600) {
			hours++;
			T = T - 3600;
		}

		// Hours
		while (T >= 60) {
			mins++;
			T = T - 60;
		}

		String solution = hours + "h" + mins + "m" + T + "s";
		return solution;
	}
	
	//Notes: 
	// 1: The 'secs' variable is completely useless here and is a waste of data, although minute as its only allocated once per class.
	// 2: The loop is inefficient in the sense that it loops repeatedly until no longer possible, which for a larger number will cause inefficiency
	// ^: When discussed, it was suggested that this could be solved using modulus but not explicitly how.
	// 3: The variable names in this challenge however are mostly good except 'T'.
	// Theory: by dividing the number by 3600 firstly we get the number of hours, then we can use modulus of the same division to get the remainder.
	// ^ This process can then be conducted for minutes
	
	public String revised(int secs) {
		// Implement your solution here
		int hours = 0;
		int mins = 0;
		

		// Hours
		hours = secs / 3600;
		secs = secs % 3600;
		// Minutes:
		mins = secs / 60;
		// Seconds:
		secs = secs % 60;
		

		String solution = hours + "h" + mins + "m" + secs + "s";
		return solution;
	}
	
}
	
	

