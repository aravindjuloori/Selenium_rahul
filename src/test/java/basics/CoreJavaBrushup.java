package basics;

public class CoreJavaBrushup {

	public static void main(String[] args) {

		int myNum = 5;
		String website = "RahulShetty academy";
		char ch = 'A';
		double d = 4.15;
//		float f=1.55f;
		boolean status = true;

		System.out.println("Integer value is :" + myNum);
		System.out.println("Rahul shetty website is :" + website);
		System.out.println("Char value is: " + ch);
		System.out.println("Double value is : " + d);

		// Arrays -- It is used to store multiple values in single variable

		int arr[] = new int[5];

		arr[0] = 101;
		arr[1] = 102;
		arr[2] = 103;
		arr[3] = 104;
		arr[4] = 105;

		System.out.println("Values in the array list are :" + arr[0]);

		int arr2[] = { 1, 3, 4, 5, 6 };

		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		String name[] = { "Aravind", "Bhavani", "Maanvitha", "Mokshith" };
		// classic for loop
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		System.out.println("***************Printing using for each loop***************");
		// Enhanced for each loop

		for (String s : name) {
			System.out.println(s);
		}
	}

}
