import java.util.*;
public class patternhash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) {
            for(int j=0; j<n; j++) {
                for(int i=0; i<n; i++) {
                    if(i==n/2 || i==(n/2)-1) {
                        System.out.print("#");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else {
            for(int j=0; j<n; j++) {
                for(int i=0; i<n; i++) {
                    if(i==n/2) {
                        System.out.print("#");
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

//Print the pattern for different test cases
//N=4                                  N=5
//*##*                                **#**                                                                 
//*##*                                **#**                                                                 
//*##*                                **#**                                                                 
//*##*                                **#**                                                                 
//                                    **#**
