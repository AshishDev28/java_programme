package programmes.switch_case;

public class Switch_case {
    public static void main(String[] args){

        /* The switch expression is evaluated once.
        The value of the expression is compared with the values of each case.
        If there is a match, the associated block of code is executed. */

        int month = 9;
        
    switch (month)
    {
    case 1:System.out.println("Jaunuary");
            break;
    case 2:System.out.println("February");
            break;
    case 3:System.out.println("March");
            break;
    case 4:System.out.println("April");
            break;
    case 5:System.out.println("May");
            break;
    case 6:System.out.println("June");
            break;
    case 7:System.out.println("July");
            break;
    case 8:System.out.println("August");
            break;
    case 9:System.out.println("September");
            break;
    case 10:System.out.println("October");
        break;
    case 11:System.out.println("November");
            break;
    case 12:System.out.println("December");
            break;
    default:System.out.println("Invalid Option");
        break;

    }
    
}
}
