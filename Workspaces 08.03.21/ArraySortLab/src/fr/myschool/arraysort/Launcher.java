//package fr.myschool.arraysort;
//
//import java.util.Arrays;
//
//public class Launcher {
//
//	public static void main(String[] args) {
//		
//		int a[] = { 60, 80, 20, 30, 40 };
//		int smallSub;
//		int temp;
//		
//		System.out.println(Arrays.toString(a));
//		
//		// Bubble Sort
//		for (int i = 0; i <= a.length - 1; i++) {
//			
//			for (int j = 0; j <= a.length - 2; j++) {
//				
//				if (a[j] > a[j + 1]) {
//					temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
//					
//				}
//				
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(a));
//		
//		// Selection Sort
//		for (int i = 0; i <= a.length - 1; i++) {
//
//			int smallSub = i;
//
//			for (int j = i + 1; j <= a.length - 1; j++) {
//
//				if (a[j] < a[smallSub]) {
//
//					smallSub = j;
//
//				}
//
//			}
//
//			int temp = a[i];
//			a[i] = a[smallSub];
//			a[smallSub] = temp;
//
//		}
//		
//		System.out.println(Arrays.toString(a));
//		
//		// Insertion Sort
//		for (int i = 1; i < a.length - 1; i++) {
//			
//			int j = i;
//			
//			while ((j >= 1) && (a[j]) < a[j - 1]) {
//				
//				temp = a[j];
//				a[j] = a[j - 1];
//				a[j - 1] = temp;
//				j = j - 1;
//				
//			}
//			
//		}
//		
//		System.out.println(Arrays.toString(a));
//		
//	}
//
//}