import java.util.Scanner;

/**
 * primt_composite
 */
public class primt_composite {

    public static void PrimeComposite(int n){

        int abc = 0;

        if ( n == 0 || n == 1){
            abc = 1;

        } else {
            for (int i=2; i<=n/2; i++){

                if ( n%i == 0){
                    abc = 2;
                } 
            }
        }

        if ( abc == 1 ){
            System.out.println(n + " is not a Prime or Composite No.");
        } else if ( abc == 2 ){
            System.out.println(n + " is a Composite no.");
        } else {
            System.out.println(n + " is a Prime No.");
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        PrimeComposite(n);

    }
}