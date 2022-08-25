import java.util.*;
class factorial{
    public static int factorial(int number){
        if(number == 0)
        return 1;
        int partialanswer = factorial(number - 1);
        partialanswer = partialanswer*number;
       return partialanswer;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    factorial(number);
    int answer = factorial(number);
    System.out.println(answer);
    }
}