import java.util.*;;
public class Odd_Even_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check that odd or even: ");
        int number=sc.nextInt();
        if(number%2==0)
            System.out.println("It is an Even number.");
        else
            System.out.println("It is an Odd number.");
        sc.close();
    }
}
