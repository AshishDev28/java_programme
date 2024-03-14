package array;

public class array {
    public static void main(String[] args){
        String[] name = {"Ashish","Dhoni","Virat","Akhil","Jhon"};
        
        // Access the specific Element of array 
        // By giving the index number of that element 
        System.out.println(name[2]);

        // Change an element in Array
        
        name[3]= "Hardik";
        System.out.println(name[3]);

        //Array length
        System.out.println(name.length);

        // Loop Through an Array
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        //For Each loop
        for(String i:name){
            System.out.println(i);
        }
        


    }
    
}
