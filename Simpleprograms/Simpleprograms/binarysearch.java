package com.mycompany.javalabcode;
import java.util.*;
public class binarysearch {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int mid;
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements into the array :");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("Sorted Array :");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the element you want to search :");
        int key = sc.nextInt();
        int flag = 0;
        int low = 0;
        int pos = 0;
        int high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ar[mid] == key) {
                flag = 1;
                pos = mid + 1;
                break;
            }
            else if (ar[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element found at position " + pos);
        } else {
            System.out.println("Element not found..");
        }
    }
}