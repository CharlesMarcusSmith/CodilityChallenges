package challenges;

public class Runner {
	public static void main(String[] args) {
		TimeInSeconds tis = new TimeInSeconds();
		//TESTS:
		System.out.println();
		System.out.println("Time In Seconds:");
		
		//For example, given T=7500 the function should return 2h5m0s.
		System.out.println(tis.revised(7500));
		
		//Given T=83643 the function should return 23h14m3s.
		System.out.println(tis.revised(83643));
		
		
		FindRepeatingLetter frl = new FindRepeatingLetter();
		//TESTS
		System.out.println();
		System.out.println("Find Repeating Letter:");
		
		//Given S = "aba", the function should return "a".
		System.out.println(frl.revised("aba"));		
		//Given S = "zz", the function should return "z".
		System.out.println(frl.revised("zz"));
		//Given S = "codility", the function should return "i".
		System.out.println(frl.revised("codility"));
		
		
		CountBananas cb = new CountBananas();
		//TESTS
		System.out.println();
		System.out.println("Count Bananas:");
		
		//Given S = "NAABXXAN", the function should return 1.
		System.out.println(cb.revised("NAABXXAN"));
		//Given S = "NAANAAXNABABYNNBZ", the function should return 2.
		System.out.println(cb.revised("NAANAAXNABABYNNBZ"));
		//Given S = "QABAAAWOBL", the function should return 0.
		System.out.println(cb.revised("QABAAAWOBL"));
		
		
		
		Glasses gl = new Glasses();
		//TESTS:
		System.out.println();
		System.out.println("Glasses:");
		
		//Given N = 5 and K = 8, the function should return 2. There are five glasses of capacity 1, 2, 3, 4 and 5. You can use two glasses with capacity 3
		//and 5 to hold 8 liters of water.
		System.out.println(gl.revised(5,  8));
		//Given N = 4 and K = 10, the function should return 4. You must use all the glasses to contain 10 liters of water.
		System.out.println(gl.revised(4,  10));
		//Given N = 1 and K = 2, the function should return −1. There is only one glass with capacity 1, so you cannot pour 2 liters of water.
		System.out.println(gl.revised(1, 2));
		//Given N = 10 and K = 5, the function should return 1. You can use the glass with capacity 5.
		System.out.println(gl.revised(10, 5));
		
	}
}

