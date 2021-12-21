package day01_Variables;

public class C02 {

	public static void main(String[] args) {
		
		/*
	     Create method that finds repeated characters in a String
	     Bir String'de tekrarlanan karakterleri bulan method create ediniz  */
	 
	 
	String str="Java ogrenmek cok zevkli";
	String str1="";
	

	
	for (int i = 0; i< str.length(); i++) {
		
			for (int j =i+1; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j) && !str1.contains(str.substring(i, i+1)) ) {
                   str1+=str.charAt(i)+" ";
					
				}
			}
	}
		
		
		

	}

}
