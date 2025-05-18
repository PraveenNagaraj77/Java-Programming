package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]  arr = {38,27,43,3,9,82,10};

        System.out.print("Original Array : ");
        printArray(arr);

        mergeSort(arr,0,arr.length -1 );

        System.out.print("Sorted Array : ");
        printArray(arr);
    }



    //Recursive Merge Sort Function
    static void mergeSort(int[] arr, int left , int right){
        if(left<right){
            //find the middle point
            int mid = left + (right-left) / 2;

            //recursively sort the first and second halves

            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);



            merge(arr,left,mid,right);



        }
    }


    //merge the two sorted subarrays



    static void merge(int[] arr , int left , int mid,int right){
        //sizes of two subarrays to merge

        int n1 = mid- left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] =  arr[left+i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid+1 + j];
        }

        int i = 0 , j=0,k = left;

        while (i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k]= R[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }



    }


    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }




}
