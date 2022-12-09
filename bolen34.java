import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int num, T = 0, aver = 0, sayac = 0;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayı girin: ");
		num = inp.nextInt();
	
		for(int i = 0; i <= num; i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i + " ");
				T = T + i;
				sayac = sayac + 1;
			}
		}
		aver = T/sayac;
		System.out.println("Sayıların ortalaması: "+aver);
		}	
	}		
