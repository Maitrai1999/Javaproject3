import java.util.Arrays;
import java.util.Scanner;

public class ArrNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numArr[] = { 1,2,35 }; 
		int numArr1[] = { 1,2,35}; 
		        
		        Arrays.sort(numArr); 
		        System.out.println("Input array:" + Arrays.toString(numArr));
		 
		         int key = 35; 
		//	int key=sc.nextInt();

		        
		         System.out.println("Key " + key + " found at index = " + Arrays.binarySearch(numArr, key));
		System.out.println("Check Equality-->"+Arrays.equals(numArr,numArr1));
		System.out.println("Comparing---->"+Arrays.compare(numArr,numArr1));

	}

}


