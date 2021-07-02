package Task1;
public class RemoveDup {
    String [] masterarraystring;
    int dups=0;
    RemoveDup(String [] masterarraystring){
        this.masterarraystring= masterarraystring;
    }
    void remDup(){
        for (int iterator=0;iterator<masterarraystring.length;iterator++){
            if (masterarraystring[iterator].equals("*")) continue;
            for (int iterator1=iterator+1;iterator1<masterarraystring.length;iterator1++){
                if (masterarraystring[iterator].equals(masterarraystring[iterator1])) {
                    masterarraystring[iterator1]="*";
                    dups++;
                }
            }
        }
        System.out.print("The output: ");
        for (int iterator=0;iterator<masterarraystring.length;iterator++){
            if (masterarraystring[iterator].equals("*")) continue;
            System.out.print(masterarraystring[iterator]+" ");
        }
        if (dups==0) System.out.println("\nNo duplicates\n");
        else System.out.println("\n");
    }
}
