import java.util.*;
public class fabonacchi {
    //space  O(n), time O(2power n)
    public static int fabo(int number){
        if(number == 1) return 1;
        if(number == 2) return 1;
        int partialans1 = fabo(number-1);
        int partialans2 = fabo(number-2);
       return  partialans1 + partialans2;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fabo(number);
        int answer = fabo(number);
        System.out.println(answer);

    }
    
}
