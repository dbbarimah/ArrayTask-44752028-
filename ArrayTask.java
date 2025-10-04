import java.util.Scanner;
import java.util.Arrays;
public class ArrayTask{
    public static void main(String[] args) {
        int[] num = {2,5,8,3,4,10,15,20,1,11};
        System.out.println(Arrays.toString(num));
        Scanner input = new Scanner(System.in);

        //Task 1 - Identifying index of a given value
        System.out.println("Search for an element in the array: ");
        int search = input.nextInt();

        for (int i = 0; i < num.length; i++){
            if (num[i] == search){
                System.out.println("The index of " + num[i] + " is " + i);
            }
        }


        //Task 2 - Swapping two values in an array
        System.out.println("Enter the first number you want to swap: ");
        int swap1 = input.nextInt();
        System.out.println("Enter the second number you want to swap: ");
        int swap2 = input.nextInt();

        int swap1Index = -1;
        int swap2Index = -2;

        for (int i = 0; i < num.length; i++){
            if (num[i] == swap1){
                swap1Index = i;
            }
            if (num[i] == swap2){
                swap2Index = i;
            } 
        }    

        if(swap1Index != -1 && swap2Index != -2){
            int storeValue = num[swap1Index];
            num[swap1Index] = num[swap2Index];
            num[swap2Index] = storeValue;
            System.out.println("After swapping, your new array is: " + Arrays.toString(num));
            } else {
            System.out.println("One or both of the values you entered is invalid");
            }


        //Task 3 - Sorting an array in ascending and descending order
        Arrays.sort(num);
        System.out.println("The array in ascending order is: " + Arrays.toString(num));

        int[] descendingNum = new int[num.length];
        for (int i = 0; i < num.length; i++){
            descendingNum[i] = num[num.length - 1 -i];
        }
        System.out.println("The array in descending order is: " + Arrays.toString(descendingNum));


        //Task 4 - Linear Search
        System.out.println("Search for an element in the array: ");
        int linearSearch = input.nextInt();

        for (int i = 0; i < num.length; i++){
            if (num[i] == linearSearch){
                System.out.println("The index of " + num[i] + " is " + i);
            }
        }

        //Task 5 - Binary Search
        System.out.println("Search for an element in the array: ");
        int binarySearch = input.nextInt();

        int binaryIndex = Arrays.binarySearch(num,binarySearch);

        if (binaryIndex >= 0){
            System.out.println(binarySearch + " can be found at index " + binaryIndex);
        } else {
            System.out.println(binarySearch + " cannot be found in the array.");
        }
    }
}
