import java.util.Scanner;
class Day_calculation {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter a number for want to know about dayname : ");
        int day = i.nextInt();


            switch(day)
            {
            case 1:
                System.out.println("SATURDAY");    // "SATURDAY";
                break;
            case 2:
                System.out.println("SUNDAY");            // "SUNDAY";
                break;
            case 3:
                System.out.println("MONDAY");  // "MONDAY";
                break;
            case 4:
                System.out.println("TUESDAY");                              //"TUESDAY";
                break;
            case 5:
                System.out.println("WEDNESDAY");                                     //"WEDNESDAY";
                break;
            case 6:
                System.out.println("THRUSDAY");                                               //"THRUSDAY";
                break;
            case 7:
                System.out.println("FRIIDDAY");                                      //"FRIIDDAY";
                break;
            case 8:
                System.out.println("HOLIDAY");                                     // "HOLIDAY";
                break;
            default:
                System.out.println(" not in any range");                                                               // " not in any range";
        }

        System.out.println("day" + " " + "dayname");
    }
}
