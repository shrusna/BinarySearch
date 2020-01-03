/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author syahrulhusna
 */
public class BinarySearch {
    public static void main(String[] args) {
    System.out.println("Welcome to Binary Search");
    System.out.println("Input The Size of the Array");
    int x = 5;
    int [] array = new int [x]; // x is the size of the Array
    
    array[0] = 1;
    array[1] = 2;
    array[2] = 5;
    array[3] = 6;
    array[4] = 8;
    System.out.println("Enter the Value that you want to search !");
    int number = 6; // number is the value to be searched
    int low = 0;
    int mid = 0;
    int high = x-1;
    
    while (low <= high)
    {
        mid = (low + high)/2;
        
        if(array[mid] == number){
            System.out.println("The value that you are looking for");
            System.out.println("is found at index "+ mid );
            break;}
        else if(array[mid] > number){
            high = mid - 1;
            }
        else if (array[mid] < number){
            low = mid + 1;
            }
    }
        if (low > high){
            System.out.println("The value that you are looking for is not found");
        }
    }
}
