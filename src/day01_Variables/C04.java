package day01_Variables;

public class C04 {

	public static void main(String[] args) {
	

	//bir tamsayilar Arrayi icerisindeki en buyuk sayiyi bulan bir method olusturunuz.
	//method elde ettigi sonucu return etsin
		
	int[] arr= {1,4,6,3,90,76,5,43,12,4,5,67,0,9};
	int [] arr1= {5,7,8,900,65,43,123,456};
	
	
	
	
	System.out.println(getEnBuyukSayi(arr1));
	System.out.println(getEnBuyukSayi(arr));
	
	
	
	
	}

	private static int getEnBuyukSayi(int[]arr) {
		int es=Integer.MIN_VALUE;
		 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>es) {
				es=arr[i];
			}
		
		}
		return es;
		
		
	}

}
