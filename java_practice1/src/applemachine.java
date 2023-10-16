//사과의 개수를 입력하면 바구니가 몇개 필요한지 구하는 프로그램 ( 한 바구니에는 10개의 사과가 들어간다)
import java.util.Scanner;

public class applemachine {

	public static void main(String[] args) {
		int sizeofbasket = 10 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 개수를 입력하시오 : ");
		int numofapples = sc.nextInt();
		System.out.printf("사과의 개수 : "+ numofapples+"개%n");
		int numofbasket;
		
		if(numofapples > sizeofbasket) {
			numofbasket =  numofapples / sizeofbasket;
			System.out.printf("필요한 바구니의 개수는 "+numofbasket +"개");
		}
		else if (0 < numofapples && numofapples < sizeofbasket) {
			numofbasket = 1;
			System.out.print("필요한 바구니의 개수는 1개");
		}	
		else {
			System.out.print("바구니가 필요없습니다");
		}
			
		sc.close();
	}
}
