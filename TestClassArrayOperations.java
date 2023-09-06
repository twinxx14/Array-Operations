import java.util.*;

public class TestClassArrayOperations {
   public static void main(String[] args) {
   
   Scanner scan = new Scanner(System.in);
   final int MAXSIZE = 10;
   int[] myArray = new int[MAXSIZE];
   
   ArrayOperations arrOp = new ArrayOperations(myArray, MAXSIZE);
   
   while (true) {
      System.out.println("");
      System.out.println("----- ARRAY OPERATIONS MENU -----");
      System.out.println("1. Populate");
      System.out.println("2. Print");
      System.out.println("3. Find Minimum Value");
      System.out.println("4. Find Maximum Value");
      System.out.println("5. Sort Elements");
      System.out.println("6. Insert Elements");
      System.out.println("7. Delete Elements");
      System.out.println("8. Search for an Element - Predefined");
      System.out.println("________________________________");
      System.out.println("");
      System.out.println("  Please input your selection: ");
      System.out.println("________________________________");
      int num = scan.nextInt();
      
      switch(num) {
         case 1:
            arrOp.populate();
            arrOp.print();
            break;
         case 2:
            arrOp.print();
            break;
         case 3: 
            arrOp.minValue();            
            break;
         case 4: 
            arrOp.maxValue();
            break;
         case 5: 
            arrOp.sort();
            arrOp.print();
            break;
         case 6:
            System.out.println("1 - Start, 2 - Specifed Index, 3 - End");
            int a = scan.nextInt();
            
            switch(a) {
               case 1:
                  arrOp.insertStart();
                  arrOp.print();
                  break;
               case 2:
                  arrOp.insertSpecificiedIndex();
                  arrOp.print();
                  break;
               case 3:
                  arrOp.insertEnd();
                  arrOp.print();
                  break;
               default:
                  System.out.println("Invalid choice!");
            }
            break;
         case 7:
            arrOp.delete();
            arrOp.delete();
            break;
         case 8:
            arrOp.search();
            break;
         case 9:
            System.out.println("--------- End of Program -------- ");
            scan.close();
            System.exit(0);
            break;
         default: 
            System.out.println("Invalid choice!");
          

         
      }
   }
   
   }
}