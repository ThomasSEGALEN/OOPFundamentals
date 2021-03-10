public class Launcher {

	public static void main(String[] args) {

//		line(5);
//		square(5);
		triangle(5);

	}

// Line example
//	static void line(int n) {
//		
//		int i = 0;
//		while (i < n) {
//			
//			i = i + 1;
//			System.out.print("* ");
//			
//		}
//		
//	}
//	
//}

// Square example
// First Method
//	static void square(int n) {
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j < n; j++) {
//				System.out.print("* ");
//				
//			}
//	
//			System.out.println("");
//			
//		}
//		
//	}
//	
//}
// Second Method
//	static void square(int n) {
//		
//		for (int i = 0; i < n; i++) {
//			
//			String str = "* ";
//			
//			System.out.println(str.repeat(n));		
//			
//		}
//		
//	}
//	
//}

// Empty square example
//	static void square(int n) {
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j < n; j++) {
//				
//                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
//                	System.out.print("* ");
//                	
//                }
//                
//                else {
//                	System.out.print("  ");
//                	
//                }
//                
//			}
//			
//			System.out.println("");
//			
//		}
//		
//	}
//	
//}

// Half triangle example
//	static void triangle(int n) {
//		
//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//				
//			}
//			
//			System.out.println("");
//			
//		}
//		
//	}
//	
//}

// Full triangle example
	static void triangle(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");

			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");

			}

			System.out.println("");

		}

	}

}
