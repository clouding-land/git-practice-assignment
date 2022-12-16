import java.io.*;
 
class unique {
    static void printDistinct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
            if (i == j)
            System.out.print( arr[i] + " ");
        }
    }

    public static void main (String[] args) 

    {
        int arr[] = {3,4,4,3,5,6,1,1,2,3,8,9,33};
        int n = arr.length;
        printDistinct(arr, n);
    }
}