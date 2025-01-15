import java.util.*;
public class DecimalToBinary {
    public static String convertor_1(int input,String output){
        if(input==0)
            return output;
        else{
            output=output+input%2;
            return convertor_1(input/2, output);
        }
    }
    public static int convertor_2(int input){
        if(input==0)
            return 0;
        else
            return (input%2 + 10*convertor_2(input/2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Decimal Number: ");
        int input=sc.nextInt();
        String output="";
        StringBuffer result=new StringBuffer(convertor_1(input, output));
        System.out.println("Self Approach: "+result.reverse());
        System.out.println("Helped Approach: "+convertor_2(input));
        sc.close();
    }   
}
