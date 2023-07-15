import java.util.Scanner;
public class Main {
    static int[] Insertion_Sort(int[] arr){
        for (int start = 1; start < arr.length; start++){
            int val = arr[start];
            int j = start - 1;
            while (val < arr[j]){
                arr[j + 1] = arr[j];
                j--;
                if (j == -1)
                    break;
            }
            arr[j + 1] = val;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int arr = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[arr];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        int[] arrayOne = Insertion_Sort(array);
        for (int start = 0; start < arrayOne.length; start++){
            System.out.print(" " + array[start]);
        }
    }
}