/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;
import java.util.Scanner;

/**
 *
 * @author syahrulhusna
 */
public class BinarySearch {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Binary Search");
    System.out.println("Input The Size of the Array");
    int x = input.nextInt();
    int [] array = new int [x]; // x is the size of the Array
    
    System.out.println("Input the Value of the Array");
    int i = 0;
    while (i<x){
     array[i] = input.nextInt(); // i is the value of the Array
     i++;
    }
    System.out.println("Enter the Value that you want to search!");
    int number = input.nextInt(); // number is the value to be searched
    int low = 0;
    int mid = 0;
    int high = x-1;
    
    while (low <= high)
    {
        mid = (low + high)/2;
        
        if(array[mid] == number){
            System.out.println("The value that you are looking for");
            System.out.println("is found at index"+ mid );
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
