package Random1;

public class BinaryOperation_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,n=0,ov=0;
		char o='+';
		int i;
		int p=0;
		for(i=0;i<200;i++)
		{
			ov=(int)(Math.random()*2);
			m=(int)(Math.random()*101);
			n=(int)(Math.random()*101);
			if(ov==1)
			{
				o='+';
				if(m+n>100)
					continue;
			}
			else
			{
				o='-';
				if(m-n<0)
					continue;
			}
			p++;
			if(p>50)
				continue;
			if((p-1)%5==0)
				System.out.println();
			System.out.print(" "+(p-1)+":\t"+m+o+n+"=");
			sum(m,n,ov);
		}

	}
	
	public static void sum(int m,int n,int ov)
	{
		int x=0;
		if(ov==1)
			x=m+n;
		if(ov==0)
			x=m-n;
		System.out.print(x);
		System.out.print("  ");
	}
	
	
	

}
