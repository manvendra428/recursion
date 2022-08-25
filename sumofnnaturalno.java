import java.util.*;
 class sumofnnaturalno {
    public static int sum(int number){
        if(number==0)
        return 0;
        int partialanswer = sum(number-1);

        partialanswer = number+partialanswer;
return partialanswer;
        
    }
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        sum(number);
        int answer = sum(number);
        System.out.println(answer);
        

    }
}
