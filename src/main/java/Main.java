public class Main {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertTocentimeters(5, 8) + "cm");
        System.out.println("70in = " + convertTocentimeters(70) + "cm");
    }
    public static double convertTocentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertTocentimeters(int feet, int inches){
        return convertTocentimeters((feet * 12) + inches);
    }




    public static boolean isLeapYear(int Year){
        return Year >= 1 && Year <= 9999 && (Year % 400 == 0 && Year % 100 != 0 || Year % 4 == 0);

    }
    public static int getDaysInMonth(int Month, int Year){
        if ((Month < 1 || Month > 12) || (Year < 1 || Year > 9999)){
            return -1;
        }
        switch (Month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                return isLeapYear(Year) ? 29: 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;
        }

    }
}
