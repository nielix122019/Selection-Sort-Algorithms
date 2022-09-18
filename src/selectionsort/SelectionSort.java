/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

public class SelectionSort {

    
    public static void main(String[] args) {
        
        //Example we have new array with unsorted value
        // THis time im using a assign value not user input
        int arr[] = {43,30,20,21,22};
        //System.out.println("Sorting proccess");
        sort(arr);
        
        //That's all 
        //Thank you!!
        System.out.println("Finish proccess");
        print(arr);
    }
    
    //Let's create a function that will accept an array value first
    //Then we will create a parameter array
    public static void sort(int arr[])
    {
        //This time we will count the length of an array
        // the length is assign to variable n
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            // Now let's create a min_index to pass the value if the first index lesser than the second index
            int min_index = i;
            // The variable i will iterate the number each number have value
            for(int j = i + 1; j < n; j++)
            {
                //Using if statement to compare if the first index is greater we need to swap the index value
                if(arr[j] < arr[min_index])
                {
                    min_index = j;
                }
                
                
            }
            //This will be the process to transfer each value to new index
            //If the arr[min_index] has lower value 
            int tmp = arr[min_index];
            // arr[min_index] has no value that's why we need to assign new value from arr[j]
            arr[min_index] = arr[i];
            // arr[j] has no value now we need to assign new value from previous tmp variable
            arr[i] = tmp;
        }
    }
    
    // Now we need to print each value to make sure that the value has been successfully sorted
    public static void print(int arr[])
    {
        //This time we will count the length of an array
        // the length is assign to variable n
        int n = arr.length;
        for(int i = 0; i < n; ++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
