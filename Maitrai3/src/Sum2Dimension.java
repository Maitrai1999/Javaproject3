
public class Sum2Dimension {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{15,25,35},{45,55,65}};
        int[][] b= {{12,22,32},{55,25,85}};
        int[][] sum=new int[2][3];
        int rows,columns;
        
        for(rows=0;rows<a.length;rows++)
        {
        	for(columns=0;columns<a[0].length;columns++)
        	{
        		sum[rows][columns]=a[rows][columns]+b[rows][columns];
        	}
        }
        	System.out.println("sum of those two arrays are:" );
        	for(rows=0;rows<a.length;rows++)
        	{
        	for(columns=0;columns<a[0].length;columns++) 
        	{
        	/*System.out.format("%d \t",sum[rows][columns]); */
        		System.out.print(sum[rows][columns]+" ");
        }
        	
        	System.out.println(" ");
        }
	}

}


