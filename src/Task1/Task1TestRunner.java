package Task1;
import java.util.Scanner;
public class Task1TestRunner {
    static Scanner getin= new Scanner(System.in);
    static String [] getStringArray(int extend){
        String [] masterarray;
        System.out.print("\nEnter the size of the array: ");
        int size= getin.nextInt();
        getin.nextLine();
        if (size>0){
            masterarray= new String[size+extend];
            System.out.print("Enter the elements: ");
            for (int iterator=0;iterator<size;iterator++){
                masterarray[iterator]=getin.next();
            }
        }
        else return getStringArray(extend);
        return masterarray;
    }
    static Integer [] getArray(){
        Integer [] masterarray;
        System.out.print("\nEnter the size of the array: ");
        int size= getin.nextInt();
        if (size>0){
            masterarray= new Integer[size];
            System.out.print("Enter the elements: ");
            for (int iterator=0;iterator<size;iterator++){
                masterarray[iterator]=getin.nextInt();
            }
        }
        else return getArray();
        return masterarray;
    }
    public static void main(String [] abc){
        inputloop: while(true){
            System.out.println("Task 1 - Arrays");
            System.out.println("---------------");
            System.out.println("1. Find the index\n2. Sum of the array\n3. Remove an element\n4. Insert an element\n5. Test for an element");
            System.out.println("6. Max and Min element\n7. Common elements\n8. Remove duplicates\n9. Number of even and odd");
            System.out.println("10. Average except largest and smallest\n11. Sum to target\n12. Reverse array\n13. Separate even and odd numbers");
            System.out.println("14. Sort\n15. Print the leaders\n16. Exit");
            System.out.print("Enter the question number:");
            int option=getin.nextInt();
//            if (option==16){
//                System.out.println("The End");
//                break;
//            }
            switch(option){
                case 1:
                    System.out.println("Find Index");
                    Integer [] masterarray=getArray();
                    System.out.print("Enter the element you need to search:");
                    int key= getin.nextInt();
                    new FindIndex(masterarray).searchFor(key,0);
                    break ;
                case 2:
                    System.out.println("Sum of elements");
                    masterarray=getArray();
                    new SumArray(masterarray).addAll();
                    break;
                case 3:
                    System.out.println("Remove an element");
                    masterarray=getArray();
                    System.out.print("Enter the element to remove: ");
                    int element= getin.nextInt();
                    new RemoveElement(masterarray).remove(element);
                    break;
                case 4:
                    System.out.println("Insert an element");
                    String []masterarraystring=getStringArray(1);
                    masterarraystring[masterarraystring.length-1]="0";
                    System.out.print("Enter the element to insert: ");
                    String value=getin.next();
                    System.out.print("Enter the index to add the element: ");
                    int index= getin.nextInt();
                    new InsertElement(masterarraystring).addElement(value, index);
                    break;
                case 5:
                    System.out.println("Test for an element");
                    masterarraystring=getStringArray(0);
                    System.out.print("Enter the element to check: ");
                    value=getin.next();
                    new CheckElement(masterarraystring).checkFor(value);
                    break;
                case 6:
                    System.out.println("Max and Min element");
                    masterarray=getArray();
                    new MaxMin(masterarray).findMaxMin();
                    break;
                case 7:
                    System.out.println("Compare arrays");
                    typearray :while (true){
                        System.out.print("1. Array of Strings\n2. Array of Numbers\n3. Exit\nEnter the option: ");
                        int arraytype=getin.nextInt();
                        switch(arraytype){
                            case 2:
                                Integer[]firstarray= getArray();
                                Integer[]secondarray= getArray();
                                new CompareArray<Integer>(firstarray,secondarray);
                                break;
                            case 1:
                                String[] first=getStringArray(0);
                                String[] second= getStringArray(0);
                                new CompareArray<String>(first,second);
                                break;
                            case 3:
                                break typearray;
                            default:
                                System.out.println("Invalid input\n");
                        }
                    }
                    break;
                case 8:
                    System.out.println("Remove Duplicates");
                    masterarraystring= getStringArray(0);
                    new RemoveDup(masterarraystring).remDup();
                    break;
                case 9:
                    System.out.println("Number of even and odd");
                    masterarray=getArray();
                    new EvenOdd(masterarray);
                    break;
                case 10:
                    System.out.println("Average except largest and smallest number");
                    masterarray=getArray();
                    new Average(masterarray).averageExcept();
                    break;
                case 11:
                    System.out.println("Sum of two numbers to get the target");
                    masterarray= getArray();
                    System.out.print("Enter the target value: ");
                    int target= getin.nextInt();
                    new SumToTarget(masterarray).addToTarget(target);
                    break;
                case 12:
                    System.out.println("Reverse the integer array");
                    masterarray= getArray();
                    new Reverse(masterarray).reverseArray();
                    break;
                case 13:
                    System.out.println("Separate even and odd numbers");
                    masterarray=getArray();
                    new SeparateOddEven(masterarray).separateNumbers();
                    break;
                case 14:
                    System.out.println("Sort the numeric array");
                    masterarray= getArray();
                    new SortArray(masterarray).sortArray();
                    break;
                case 15:
                    System.out.println("Print the leaders");
                    masterarray=getArray();
                    new Leaders(masterarray).findLeaders();
                    break;
                case 16:
                    System.out.println("The End");
                    break inputloop;
                default:
                    System.out.println("Invalid input Please enter again\n");
            }
        }
    }
}
