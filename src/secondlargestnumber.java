
public class secondlargestnumber {
public static void main (String[] args) {
	int a = 50;
	int b = 66;
	int c = 20;
	int Largest, Smallest;
	if(a>b && a>c) {
		System.out.println("Largest" + a );
	}
		else if (b>a && b>c) {
			System.out.println("Largest" + b );
		}
		else
		{
			System.out.println("Largest" + c );	
			
	}
	if(a<b && a<c) {
		System.out.println("Smallest" + a );
	}else if (b<c && b<a) {
		System.out.println("Smallest" + b );
	
	}
	else
	{
		System.out.println("Smallest" + c );	
		
}

		
	}
}

