
/*
 * Array Operations Toolkit
 * Author: Shahnawaz Sheikh
 * Features: 8 array operations including sorting, searching, and statistics
 * Last Updated: 01-jan-2026
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsToolkit {
//      ===Display welcome message Method==  

    public static void display() {
        System.out.println("=".repeat(50));
        System.out.println("      WELCOME TO ARRAY OPERATION TOOLKIT");
        System.out.println("=".repeat(50));

    }
//      ===Main Menu Method===

    public static void main_menu() {
        System.out.println("MAIN MENU:");
        System.out.println("1. Create new array");
        System.out.println("2. Display array");
        System.out.println("3. Calculate and Average");
        System.out.println("4. Find Maximum and Minimum");
        System.out.println("5. Search for a number");
        System.out.println("6. Sort array");
        System.out.println("7. Reverse array");
        System.out.println("8. Count Even and Odd");
        System.out.println("0. Exit");

    }

    //      ===Get Array By User Method==
    public static int[] get_array_user(Scanner Sc) {
        System.out.print("Enter size of array: ");
        // Scanner Sc=new Scanner(System.in);
        int size = Sc.nextInt();
        while (size <= 0) {
            System.out.print("size must be positive Enter again: ");
            size = Sc.nextInt();
        }
        System.out.println("Enter " + size + " numbers");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Num" + (i + 1) + ": ");
            arr[i] = Sc.nextInt();

        }
        return arr;

    }

    //      ===BASIC OPERATION METHOD===
    // Sum Method
    public static int calculate_sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Average Method
    public static float calculate_avg(int arr[]) {
        float average = (float) (calculate_sum(arr)) / arr.length;
        return average;
    }

    // Maximum Method
    public static int get_Maximum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Minimum Method
    public static int get_Minimum(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //      ===Linear Search method===
    public static int Linear_search(int key, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return -1;
    }

    //      ===Checking Array Sorted==+
    // Increasing Order Method
    public static boolean issorted_increasing(int arr[]) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // If increasing
                sorted = false; // NOT sorted a
            }
        }
        return sorted;
    }

    // Decreasing Order Method
    public static boolean issorted_decreasing(int arr[]) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) { // if decreasing
                sorted = false; // NOT sorted 
            }
        }
        return sorted;
    }

    //      ===Bubble Sort Algorithm===
    public static void bubble_sort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("sorted array: " + Arrays.toString(arr));
        System.out.println("");

    }

    //      ===Reverse Array Method===
    public static void reverse(int arr[]) {
        int n = arr.length;//size of array
        for (int i = 0; i < n / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;

        }
    }

    //      ===Count_Even_Odd Method===
    public static void Count_Even_Odd(int arr[]) {
        int num_odd = 0;
        int num_even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                num_even++;
            } else {
                num_odd++;
            }

        }
        System.out.println("Number of odd: " + num_odd);
        System.out.println("Number of even: " + num_even);

    }

    /**
     * Main program entry point Runs the interactive array operations toolkit
     */
    public static void main(String[] args) {
        display();
        int arr[] = null;
        Scanner Sc = new Scanner(System.in);
        boolean exit_program = false;
        while (!exit_program) {
            main_menu();
            System.out.print("Enter your choice: ");
            int choice = Sc.nextInt();
            switch (choice) {
                case 0: {
                    //Exit
                    exit_program = true;
                    System.out.println("Thank you! for using Array Operations Toolkit");
                    System.out.println("Have a Good Day!");
                    break;
                }
                case 1: {
                    //Get_Array_by_user
                    arr = get_array_user(Sc);
                    System.out.println("Array created scessfully");
                    break;
                }
                case 2: {
                    //display current array
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");
                    } else {
                        System.out.println("Array size :" + arr.length);
                        System.out.println("Current array :" + Arrays.toString(arr));
                    }
                    break;
                }
                case 3: {
                    // calculate sum and average
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");
                    } else {
                        System.out.println("Sum: " + calculate_sum(arr));
                        System.out.println("Average: " + calculate_avg(arr));

                    }
                    break;
                }
                case 4: {
                    // Find Maximum and Minimum
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");

                    } else {
                        System.out.println("Maximum: " + get_Maximum(arr));
                        System.out.println("Minimum: " + get_Minimum(arr));

                    }
                    break;
                }
                case 5: {
                    // Search for a number
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");
                    } else {
                        System.out.print("Enter number to search: ");
                        int key = Sc.nextInt(); //
                        int found_index = Linear_search(key, arr);
                        if (found_index < 0) {
                            System.out.println("Number " + key + " Not found!");
                        } else {
                            System.out.println("Found " + key + " at position " + found_index);
                        }

                    }
                    break;
                }
                case 6: {
                    // sort array
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");

                    } else {

                        boolean a = issorted_increasing(arr);
                        boolean b = issorted_decreasing(arr);
                        if (a) {
                            System.out.println("Already sorted in incresing order!");
                        } else if (b) {
                            System.out.println("Already sorted in decreasing order!");
                        } else {
                            System.out.println("Original array: " + Arrays.toString(arr));
                            bubble_sort(arr);
                        }
                    }
                    break;
                }
                case 7: {
                    // reverse array
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");
                    } else {
                        reverse(arr);
                        System.out.print("Reverse array: " + Arrays.toString(arr));
                        System.out.println("");

                    }
                    break;
                }
                case 8: {
                    // Count Even Odd
                    if (arr == null) {
                        System.out.println("Please create an array first (option 1)!");
                    } else {
                        Count_Even_Odd(arr);
                    }
                    break;
                }
                default: {
                    System.out.println("Please choose between 0-8!");
                }

            }
        }

    }
}

