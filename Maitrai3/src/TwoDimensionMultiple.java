
public class TwoDimensionMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[][] a= {{3,4},{2,1}};
        int[][] b= {{1,5},{3,7}};
        int[][] mul=new int[2][3];
        int i,j;        
        for(i=0;i<a.length;i++)
        {
        	for(j=0;j<a.length;j++)
        	{
        		mul[i][j]=0;
        		for(int k=0;k<2;k++) {
        		mul[i][j]+=a[i][k]*b[k][j];
        	}
        
        		System.out.print(mul[i][j]+" ");
        }
        	
        	System.out.println(" ");
        }
	}
}


	

