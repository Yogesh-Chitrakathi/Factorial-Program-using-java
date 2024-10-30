import java.util.*;
class factorial{
    public static void main(String[] args){
        long num,fact=1;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any no...:");
        num=in.nextLong();

        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+ " of "+fact);
    }
}