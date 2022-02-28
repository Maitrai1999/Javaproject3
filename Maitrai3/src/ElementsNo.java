import java.util.*;
public class ElementsNo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner s=new Scanner(System.in);
	        System.out.print("enter no.of elements:");
	        int a=s.nextInt();
	        System.out.println("enter your elements:");
	        int arr[]=new int[a];
	        for(int i=0;i<a;i++) {
	        	arr[i]=s.nextInt();
	        	        }
	        for(int i:arr)
	        	//for(int i=0;i<a;i++)
	        {
	        	System.out.println(i);
	        }
		} 

	}


