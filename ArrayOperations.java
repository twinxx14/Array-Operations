import java.util.*;

class ArrayOperations {
    Scanner scan = new Scanner(System.in);
    int[] myArray;
    int size;

    public ArrayOperations(int[] myArray, int size) {
        this.size = size;
        this.myArray = myArray;
    }

    // POPULATE
    public void populate() {
        System.out.println("Enter " + myArray.length + " integers:");
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = scan.nextInt(); 
        }
    }

    // DISPLAY
    public void print() {
        System.out.println("Array Contents: ");
        for(int i = 0; i < myArray.length; i++) {
            System.out.print(" " + myArray[i]);
        }
        System.out.println("");
    }

    // MINIMUM VALUE
    public void minValue() {
        System.out.println("Minimum Value: ");
        int min = myArray[0];
        for(int i = 0; i < myArray.length; i++)
            if(min >= myArray[i]) {
                min = myArray[i];
            }
        System.out.println(min);
    }

    // MAXIMUM VALUE
    public void maxValue() {
        System.out.println("Maximum Value: ");
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++)
            if(max <= myArray[i]) {
                max = myArray[i];
            }
        System.out.println(max);
    }

    // SORT
    public void sort() {
        int temp;
        for(int a = 0; a < myArray.length; a++)
            for(int b = 0; b < myArray.length - 1; b++)
                if(myArray[b] > myArray[b+1]) {
                    temp = myArray[b];
                    myArray[b] = myArray[b+1];
                    myArray[b+1] = temp;
                }
    }

    // INSERT START
    public void insertStart() {
        System.out.println("Enter the integer to insert at the start: ");
        int element = scan.nextInt();
        for (int i = myArray.length - 1; i > 0; i--) {
            myArray[i] = myArray[i - 1];
        }
        // Insert the element at the start
        myArray[0] = element;
    }

    // INSERT SPECIFIED INDEX
    public void insertSpecificiedIndex() {
       System.out.println("Enter the index: ");
       int index = scan.nextInt();
       System.out.println("Enter the integer to insert at index " + index);
       int element = scan.nextInt();
   
       int length = myArray.length;
   
       // Check if the specified index is valid
       if (index < 0 || index > length) {
           System.out.println("Invalid index. Index must be between 0 and " + length);
           return; // Exit the method
       }
   
       // Resize the array to accommodate the new element
       int[] newArray = new int[length + 1];
   
       // Copy elements from the original array to the new array up to the specified index
       for (int i = 0; i < index; i++) {
           newArray[i] = myArray[i];
       }
   
       // Insert the new number at the specified index
       newArray[index] = element;
   
       // Copy the remaining elements from the original array to the new array
       for (int i = index; i < length; i++) {
           newArray[i + 1] = myArray[i];
       }
   
       // Update the original array with the new contents
       for (int i = 0; i < myArray.length; i++) {
           myArray[i] = newArray[i];
       }
}

    // INSERT END
    public void insertEnd() {
       System.out.println("Enter the integer to insert at the end: ");
       int element = scan.nextInt();
   
       int end = myArray.length; // Corrected calculation
   
       if (end >= myArray.length) {
           // Resize the array to accommodate the new element
           int[] newArray = new int[myArray.length + 1];
   
           // Copy elements from the original array to the new array
           for (int i = 0; i < myArray.length; i++) {
               newArray[i] = myArray[i];
           }
   
           // Insert the new element at the end
           newArray[end] = element;
   
           // Update the original array reference
           myArray = newArray;
       } else {
           myArray[end] = element; // Insert at the end
    }

    // Printing the array (for debugging purposes)
    System.out.print("Updated Array: ");
    for (int i = 0; i <= end; i++) {
        System.out.print(myArray[i] + " ");
    }
    System.out.println();
}

    // DELETE
   public void delete() {
       System.out.println("Enter the index of the element to delete: ");
       int index = scan.nextInt();
   
       if (index >= 0 && index < myArray.length) {
           for (int i = index; i < myArray.length - 1; i++) {
               myArray[i] = myArray[i + 1];
           }
           // After shifting elements, set the last element to 0
           myArray[myArray.length - 1] = 0;
       } else {
           System.out.println("Invalid index");
       }
   }    
        
    // SEARCH
    public void search() {
        boolean found = false;

        System.out.println("Enter integer to search: ");
        int num = scan.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                System.out.println("Integer " + num + " found at index " + i);
                found = true;
                break; // Exit the loop once found
            }
        }

        if (!found) {
            System.out.println("Integer not found");
        }
    }
}
