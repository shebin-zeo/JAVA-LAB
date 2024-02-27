import java.util.Scanner;  
class Sum 
{  
    public static void main(String args[])  
    {  
        int x, y, sum;  
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers");
        x = sc.nextInt();  
        y = sc.nextInt(); 
        sum = sum(x, y);  
        System.out.println("The sum of numbers " + x + " and " + y + " is: " +sum );  
    }   
    public static int sum(int a, int b)  
    {  
        int sum = a + b;  
        return sum;  
    }  
}  