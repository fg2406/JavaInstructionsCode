package day01_Variables;

public class C06 {

	public static void main(String[] args) {
	
		
	/*icerisinde parametre olarak gonderilen "sifrenin" icersinde sayi ve harf 
		
	olup olmadigini kontrol eden bir method olusturunuz
	 
	 	orn:
	 	Sifre:Asdf1234
	 	Sonuc:true
	 	
	 	Sifre:12345
	 	Sonuc:false
	 
	    Sifre:Asdfegh
	     Sonuc:false   */
		
		
		String sifre="Asdf1234";
		
	
		 System.out.println("Sonuc :"+dogrula(sifre));
		
		
		 }
	 	                                   
	private static boolean dogrula(String sifre) {
		
		
		boolean harfVarmi=false;
		boolean rakamVarmi=false;
		
		for (int i = 0; i < sifre.length(); i++) {
			
		    if (sifre.charAt(i)>='0'&& sifre.charAt(i)<='9') {
				  rakamVarmi=true;
		    
			
		    } else if(sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z') {
				  harfVarmi=true;
			
		    }else if(sifre.charAt(i)>='a'&& sifre.charAt(i)<='z') {
				  harfVarmi=true;
				
				}
		}
		   boolean sonuc=harfVarmi && rakamVarmi;
		  
		
		
		
		return sonuc;	
	}
      
}
