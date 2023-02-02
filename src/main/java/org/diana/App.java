package org.diana;

import java.util.Formatter;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
        Formatter formatter = new Formatter();
        System.out.println( "Hello World!" );
        System.out.println(formatter.format("%d",-11));
        System.out.println(String.format("psst%s","sss"));
        int N = 10;

        // Print first 10 term
      //  for (int i = 0; i < N; i++)
        //    System.out.print(fib(i) + " ");
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        int n = arr.length;

        reverse(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        code code = new code();
        //code.SayHello();
    }

    public static int fib(int n){
        int f[] = new int[n+2];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
         f[i] = f[i-1] + f[i-2];
        return  f[n];
    }
    // consecutive k elements
    static void reverse(int arr[], int n, int k)
    {
        for (int i=0; i<n; i+=k) {

                int left =i ;
                int right = Math.min(i+k-1,n-1);
                int temp;

            while (left < right)
            {
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;
            }
        }


    }
}
