import java.util.*;
//both O(n)
public class power_of_a_number {
    public static int power(int number,int pow){
        if(pow == 0) return 1;
        int partialans = power(number,pow-1);
        partialans = number*partialans;
        return partialans;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pow = sc.nextInt();
        power(number,pow);
        int answer =  power(number,pow);
        System.out.println(answer);

    } 
    
}
