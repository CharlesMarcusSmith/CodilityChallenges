package challenges;

public class FindRepeatingLetter {
//	Given a string S, in which one letter occurs twice. Every other letter occurs at most once.
//	Write a function:
//	class Solution { public String solution(String S); }
//	which, given a string S, returns a single-character string: the letter that occurs twice.
//	Examples:
//	1. Given S = "aba", the function should return "a".
//	2. Given S = "zz", the function should return "z".
//	3. Given S = "codility", the function should return "i".

	public String solution(String S) {
		// Implement your solution here
		
		String solution = ""; //Variable used to hold the solution when 2 instances of char found in the String
		
		
		//For loop used for cycling through each letter as a subject of test
		for(int i = 0; i < S.length(); i++){
			char c = S.charAt(i);
			int count = 0;
		
			//For loop for counting test char occurences

		
			for(int x = 0; x < S.length(); x++){
				if (c == S.charAt(x)) {
					count++;
				}
	
			}
			if(count ==2) {
				solution = Character.toString(c);
			}
		}
		return solution;
	}
	
	
	//NOTES:
	//1: This could be quickly improved by simply breaking the loop when the solution is found.
	//2: The second issue is the use of two loops here; although logical its efficiency and simplicity could still be improved.
	//3: The variable names in this challenges hard to follow and can be improved.
	//Theory: One way to improve this which would be Java specific would be the use of indexOf() and lastIndexOf().
	//^: If they differ, we know that there are multiple characters.
	//^: In practice, we can use last index of to test each char in the loop, and if the current position being checked isnt the same as 
	//   the result of lastIndexOf(), then we know there are multiple.
	//^: Although originally I thought this to be a cheat way out as its a java specific method, it also appears in Python and i'd be suprised
	//   if it does not appear in other languages.
	
	public String revised(String inString) {
		// Implement your solution here
		
		String solution = ""; //Variable used to hold the solution.
		
		
		//For loop used for cycling through each letter as a subject of test
		for(int i = 0; i < inString.length(); i++){
			if(inString.lastIndexOf(inString.charAt(i)) != i) {
				solution = String.valueOf(inString.charAt(i));
				break;
			}
		}
		
		return solution;
	}
	
}
