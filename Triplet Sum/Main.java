import java.util.Scanner;

public class Main {

  static int tripletSum(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == target)
            count++;
        }

      }
    }

    return count;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
   

    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

     int target = sc.nextInt();
    
    System.out.print("Array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
    System.out.println("Triplet Sum is: "+tripletSum(arr, target));

  }
}