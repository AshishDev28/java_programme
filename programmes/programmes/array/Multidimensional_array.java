package programmes.array;

public class Multidimensional_array {
    public static void main(String[] args){

        int [][] mynumber={{1,2,3,4},{5,6,7},{8,9,5}};
        // access element
        /* To access the elements of the myNumbers array, specify
         two indexes: one for the array, and one for the element inside that array.
         This example accesses the third element (2) in the second array (1) of myNumbers */

        System.out.println(mynumber[2][2]);

        //Change Element VAlue
        mynumber[1][2]=9;
        System.out.println(mynumber[1][2]);

        //Loop through multidimensional array
        for (int i=0;i<mynumber.length;i++){
            for(int j=0;j<mynumber[i].length;++j){
                System.out.println(mynumber[i][j]);
            }
        }
    }
    
}
