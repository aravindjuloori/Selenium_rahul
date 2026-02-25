package basics;

import java.util.Arrays;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		boolean mycard=true;
		int mynum=5;
		String name="Aravind";
		double d=12.5;
		char ch='A';
		
		System.out.println(mynum+" The value stored in myNum variable");
		System.out.println(name);
		
		//Declaring an array
		int arr[]=new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));
		
		int arr2[]= {1,2,3,4,5};
		
		//for loop
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//for each loop enhanced for loop
		for(int value:arr2) {
			System.out.println(value);
		}
		
		//String array
		String name1[]= {"Aravind","Bhavani","Maanvitha","Mokshith"};
		
		for(int i=0;i<name1.length;i++) {
			System.out.println(name1[i]);
		}
		for(String value1:name1) {
			System.out.println(value1);
		}
	
		

	}

}
