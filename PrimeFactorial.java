package Q2;

import java.util.Scanner;

public class PrimeFactorial {
	public static  void factorial(int num){
		for(int i = 2; i <= 100; i++)
        {
            while(num % i == 0)
            {
                System.out.println(i+ " ");
                num = num/i;
            }
        }
        if(num > 100)
        {
            System.out.println("Invalid Number");
        }

    }


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter a Number");
        num = c.nextInt();
        factorial(num);

       
		
	}
}
