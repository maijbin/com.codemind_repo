package Practice;

public class Loops {

	public static void main(String[] args) {
		
				int num=30;
				float marks=25;
				// Odd and even number program
				
				/*if(num%2==0)
				{
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("Number is odd");
				}*/
				
				if(num>=0)
				{
					System.out.println("Number is Positive");
				}
				if(num<0)
				{
					System.out.println("Number is Negative");
				}
				if(num%2==1)
				{
					System.out.println("Number is odd");
				}
				else
				{
					System.out.println("Number is even");
				}
				System.out.println("********************************");

				if(marks>=35 && marks<=50)
				{
					System.out.println("Canditate is Pass and eligible for Arts");
				}
				else if(marks>=50 && marks<=60)
				{
					System.out.println("Canditate is eligible for Commerce");
				}
				else if(marks>=60 && marks<=99)
				{
					System.out.println("Canditate is eligible for Science");
				}
				else
				{
					System.out.println("Canditate is fail");
				}
				System.out.println("*****************");
				
				int account_balance=10000;
				int atm_pin=7866;
				int widraw_amount=2000;
				int notes_available=500;
				if(atm_pin==7866)
				{
					if(account_balance>widraw_amount) {
					if(notes_available==500)
					{
						account_balance=account_balance-widraw_amount;
						System.out.println(account_balance);
					}
						System.out.println("You can widraw amount");
					}
				}
				
				else
				{
					System.out.println("insufficient balance");
				}
			}

}

	