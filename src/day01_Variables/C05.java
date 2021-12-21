package day01_Variables;

public class C05 {

	public static void main(String[] args) {
	
		//Parametre olarak gonderilen Array icerisindeki tam sayilarin 
		//büyükten kücüge dogru sirali olup olmadigini "boolean"tipinde
		//return eden bir method olusturun
		
		int []sayilar= {100,90,80,60};
		
		
		
		System.out.println("sirali mi :"+getSiraliMi(sayilar));
		
		
		
		
		

	}

	private static boolean getSiraliMi(int []sayilar) {
		
		boolean siraliMi=true;
		for (int i = 0; i < sayilar.length-1; i++) {
			if (sayilar[i]<sayilar[i+1]) {
				siraliMi=false;
				break;
			}
		}
		return siraliMi;
		
	}

}
