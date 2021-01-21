import java.util.Scanner;

public class MaximoDivisorComum{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, divisor;

        System.out.print("Primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("segundo valor: ");
        num2 = input.nextInt();

        if(num1 > num2)
            divisor = num1;
        else
            divisor = num2;

        while(num1 % divisor != 0 || num2 % divisor != 0){
            divisor--;
        }

        System.out.printf("m.d.c(%d,%d) = %d\n",num1,num2,divisor);
    }
}