package programmes.math;

public class math {
    public static void main(String[] args){
        // perform mathematical tasks on numbers.

        int x = 10;
        int y = 20;
        int z = -323;


        //Math.max(x,y)
        //used to find the highest value of x and y.

        System.out.println("maximum of x and y");
        System.out.println(Math.max(x,y));

        //Math.min(x,y)
        //used to find the lowest value of x and y.

        System.out.println("minimum of x and y");
        System.out.println(Math.min(x, y));

        //Math.sqrt(x)
        //returns the square root of x.

        System.out.println("for square root of x.");
        System.out.println(Math.sqrt(x));

        //Math.abs(x)
        // returns the absolute (positive) value of x.

        System.out.println("for positive value of a nigative value z");
        System.out.println(Math.abs(z));

        //Random Numbers
        //return a random number between 0.0 and 1.0
        System.out.println("a random no.");
        System.out.println(Math.random());
        
        // if you only want a random number between a and b use this case

        int randomNum = (int)(Math.random()*101);
        // 0 to 100
        System.out.println("A random number between 0 to 100");
        System.out.println(randomNum);
    } 
}
