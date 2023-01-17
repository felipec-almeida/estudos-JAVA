package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of Shapes: "); 
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("<----- Shape #" + i + " Data ----->");
			
			System.out.print("Rectangle or Circle? (r/c) ");
			String answer = sc.next();
			
			if(answer.charAt(0) == 'r' || answer.charAt(0) == 'R') {
				
				System.out.print("Color: (BLACK/WHITE) ");
				String i_color = sc.next();
				Color f_color = Color.valueOf(i_color);
				
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				//Adicionando na Lista os Valores.
				list.add(new Rectangle(f_color, width, height));
				
			} else if(answer.charAt(0) == 'c' || answer.charAt(0) == 'C') {
				
				System.out.print("Color: (Black/White) ");
				String i_color = sc.next();
				Color f_color = Color.valueOf(i_color);
				
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				//Adicionando na Lista os Valores.
				list.add(new Circle(f_color, radius));
				
			}
			
		}
		
		System.out.println("<----- SHAPE AREAS ----->");
		
		for(Shape s : list) {
			
			System.out.println(s);
			
		}
		
		sc.close();

	}

}
