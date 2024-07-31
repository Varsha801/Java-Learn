// import java.util.Scanner;

// public class Prime {
//     public static void main(String[] args) {
//         int[] arr;
//         int max = 0, N, sum=0, K;

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the no. of elements");
//         N = scanner.nextInt();
//         arr = new int[N];
//         System.out.println("Enter the elements");
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         System.out.println("Enter K value");
//         K = scanner.nextInt();

//         // Initialize sum with the sum of the first K elements
//         for (int i = 0; i < K; i++) {
//             sum += arr[i];
//         }

//         // Iterate through the array to find the maximum sum of a subarray of size K
//         for (int j = K; j < N; j++) {
//             sum = sum - arr[j - K] + arr[j]; // Update sum by removing the first element and adding the next one
//             if (max < sum) {
//                 max = sum;
//             }
//         }

//         System.out.println(max);
//         scanner.close();
//     }
// }

import java.util.HashSet;

class Solution
{
     public static void main(String[] args)
    {
        // Your Code Here 
        int n = 6,k=3, result=0;
        String s= "abcdef";
        if(n%k==0){
             result= 0; 
        }
        HashSet<String> set = new HashSet<>();
        int ei = k;
        for(int i=0; i<=n-k; i+=k){
            String str = s.substring(i, ei);
            System.out.println(str);
            ei += k;
            result++;
            set.add(str);
        }

        System.out.println(result);
        
    }
}
