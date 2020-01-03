package java;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		;
		Scanner oo=new Scanner(System.in);
		System.out.println("entr the number from one to seven ");
		number=oo.nextInt();
		switch(number) {
		case 1:
			System.out.println( " its monday ");
			break;
		case 2:
			System.out.println("its tuesday ");
			break;
		case 3:
			System.out.println("its wednesday ");
			break;
		case 4:
			System.out.println("its thursday ");
			break;
		case 5:
			System.out.println("its friday" );
			break;
		case 6:
			System.out.println("its saturday");
			break;
		case 7:
			System.out.println("its sunday");
			break;
		case 8:
			System.out.println("its noday");
		default:
			System.out.println("there are only seven days in a week ");
			break;
			
		                }
}
}