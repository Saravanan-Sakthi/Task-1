package Task1;
import java.util.Objects;
public class CompareArray <T>{
    T[]first;
    T[]second;
    CompareArray(T[] first,T[]second){
        this.first= first;
        this.second=second;
        compareArrays(0);
    }
    int outputs=0;
    String output="";
    void compareArrays(int iterator1){
        if (iterator1<first.length){
            for (int iterator=0;iterator<second.length && !Objects.isNull(first[iterator1]);iterator++){
                if(first[iterator1].equals(second[iterator])){
                    remDup(first[iterator1],iterator1);
                    if (outputs==0){
                        System.out.print("The common elements are: "+first[iterator1]);
                        outputs++;
                    }
                    else System.out.print(", "+first[iterator1]);
                    break;
                }
            }
            compareArrays(iterator1+1);
        }
        else {
            if (outputs!=0)System.out.println(output);
            else System.out.println("No common elements\n");
        }
    }
    void remDup(T element, int index){
        for (int iterator=index+1;iterator<first.length;iterator++){
            if (first[iterator].equals(element)) first[iterator]=null;
        }
    }
}
