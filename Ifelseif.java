import java.util.Scanner ;
class Ifelseif 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter first number :") ;
		int num1 = sc.nextInt() ;

		
		if (num1 > 0)
		{
			System.out.println("Positive number") ;
		}
		else if (num1 < 0)
		{
			System.out.println("Negative number") ;
		}
		else
		{
			System.out.println("It is 0") ;
		}
	}

}