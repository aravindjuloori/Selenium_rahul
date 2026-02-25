package basics;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		
		int arr2[]= {1,2,4,5,6,7,8,9,10,122};
		
		//print values which are multiples of 2
		//check the array has multipe of 2
		for(int i=0;i<arr2.length;i++) {
			
			if(arr2[i]%2 == 0) {
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i]+" This is not the multiple of 2");
			}
		}
	}

}
