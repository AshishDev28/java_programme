package DSA;
import java.util.*;
public class linear_search {
    public static int linearsearch(int numbers[] ,int key){
        for(int i =0;i<numbers.length;i++){
            if (numbers[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]= {2,3,4,5,6,7,8,01,12,10};
        
        int key=10;
        int index = linearsearch(numbers, key);
        if (index==-1){
            System.out.println("not found");
        }
        else{

        System.out.print("key is at index :"+index);
    }

    }
    
}
