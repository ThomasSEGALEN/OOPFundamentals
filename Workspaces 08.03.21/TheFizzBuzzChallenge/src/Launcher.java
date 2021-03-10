// Method While

public class Launcher {

	public static void main(String[] args) {

		int i = 0;

		while (i < 100) {

			i = i + 1;

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("fizzbuzz ");
			}

			else if (i % 3 == 0) {
				System.out.print("fizz ");
			}

			else if (i % 5 == 0) {
				System.out.print("buzz ");
			}

			else {
				System.out.print(i + " ");
			}

			if (i % 10 == 9) {
				System.out.println("");
			}

		}

	}

}

// Method For

//public class Launcher {
//
//	public static void main(String[] args) {
//		
//        for(int i = 1; i <= 100; i++) {
//    			
//    		if (i % 3 == 0 && i % 5 == 0) {
//    			System.out.print("fizzbuzz ");
//    		}
//    			
//    		else if (i % 3 == 0) {
//    			System.out.print("fizz ");
//    		}
//    				
//    		else if (i % 5 == 0) {
//    			System.out.print("buzz ");
//    		}
//    			
//    		else  {
//    			System.out.print(i + " ");
//    		}
//    			
//    		if (i % 10 == 9) {
//    			System.out.println("");
//    		}
//    			
//        }
//    				
//	}
//
//}