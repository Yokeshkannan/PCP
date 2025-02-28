
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter the Size of the array :");
        int n = scanner.nextInt();
       
        int[] arr = new int[n];
       
        System.out.print("Enter the elements of the array :");
        for(int i=0;i<n;i++)
        arr[i] = scanner.nextInt();
       
        System.out.print("The odd number are listed :");
        for(int i=0;i<n;i++){
            if(arr[i]/2!=0){
                System.out.print(arr[i]+" ");
            }
        }
       
        System.out.print("The Even number are listed :");
        for(int i=0;i<n;i++){
            if(arr[i]/2==0){
                System.out.print(arr[i]+" ");
            }
        }
        scanner.close();
    }
}
what is the topic of this code
