import java.util.Arrays;

public class SearchBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method 
		int arr[]={10,20,30,40,50};  
        int num=50;  
        int result=Arrays.binarySearch(arr,num);  
        if(result<0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  
    }
 
	}


