// replace all the file with the program

import java.util.*;

public class Divisible{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i = 0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i] + arr[j]) % k == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
