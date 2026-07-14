import java .util.*;
public class array4 {
    public static int Slargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int Slargest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                Slargest=largest;
                largest=numbers[i];
            } else if (Slargest<numbers[i]&&numbers[i]>largest) {
                Slargest=numbers[i];
            }
        }
        return Slargest;
    }
    public static void main(String args[]){
        int numbers[]={2,3,5,7,9};
        int result=Slargest(numbers);
        System.out.println(result);
    }
}
