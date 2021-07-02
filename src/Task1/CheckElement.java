package Task1;
public class CheckElement {
    String [] masterarray;
    CheckElement(String [] masterarray){
        this.masterarray= masterarray;
    }
    void checkFor(String element){
        for (int iterator=0;iterator<masterarray.length;iterator++){
            if (masterarray[iterator].equals(element)){
                System.out.println("The element is present in the array\n");
                break;
            }
            else if (iterator==masterarray.length-1) System.out.println("The element is not present in the array\n");
        }
    }
}
