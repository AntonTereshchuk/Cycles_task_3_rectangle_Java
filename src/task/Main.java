package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int height;
		int width;
		
		System.out.println("Enter rectangle height: ");
		height = sc.nextInt();
		
		System.out.println("Enter rectangle width: ");
		width = sc.nextInt();
		
		System.out.println();
		
		for (int i = height; i > 0; i--) {
			
			for (int j = width; j > 0; j--) {
				
				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
		
			}
			
			System.out.println();
			
		}
		
	}

}
