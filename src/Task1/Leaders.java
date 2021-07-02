package Task1;
public class Leaders {
    Integer [] masterarray;
    Leaders(Integer [] masterarray){
        System.out.println("came constructor");
        this.masterarray=masterarray;
    }
    void findLeaders(){
        System.out.println("came method");
        int outputs=0;
        for (int iterator=0;iterator<masterarray.length;iterator++){
            int count=0;
            for (int iterator1=iterator+1;iterator1<masterarray.length;iterator1++){
                if(masterarray[iterator1]<masterarray[iterator]) count++;
            }
            if (iterator==masterarray.length-1){
                if (outputs==0) System.out.println("No leaders are present\n");
                else System.out.println("\n");
            }
            else if (count==masterarray.length-iterator-1){
                if (outputs==0) {
                    System.out.print("The leaders are: "+masterarray[iterator]);
                    outputs++;
                }
                else System.out.print(", "+masterarray[iterator]);
            }
        }
    }
}
