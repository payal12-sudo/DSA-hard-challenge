import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[7];
        int i,j,data=12;
        int n=7;

//printing array
        System.out.println("Enter your elements:");
        for(i=0;i<n;i++)
        arr[i]=in.nextInt();

        System.out.println(Arrays.toString(arr));


    //searching 
    for(j=0;j<n;j++){
        if(arr[j]==data)
            break;
    }
        if(j==n)
            System.out.println("not found: "+data);
        else System.out.println("Found:"+data);
    

   
    }
}
