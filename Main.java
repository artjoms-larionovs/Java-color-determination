import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double x, y;

        boolean green;
        boolean blue;
        boolean red;
        boolean white;

        try {
            //The user enters the x and y coordinates
            System.out.print("x=");
            x = sc.nextDouble();
            System.out.print("y=");
            y = sc.nextDouble();
            // formulas that determine where the boundaries of color coordinates are and what they are
            blue = y>=7 && y<=x+5 && y<= 15-x;
            green = (x-5)*(x-5)+(y-8)*(y-8)<1;
            red = x>=3 && x<=7 && y>=3 && y<7;
            white = x>4 && x<6 && y>4 && y<6;
            //shows which color the user has landed on
            if (blue) {
                System.out.println("Blue!");
            }
            else if (green) {
                System.out.println("Green!");
            }
            else if (white) {
                System.out.println("White!");
            }
            else if (red) {
                System.out.println("Red!");
            }
            else {
                System.out.println("White!");
            }
        }
        //returns an error if the coordinates are not numbers
        catch (Exception  ex) {
            System.out.println("input-output error");
        }

        sc.close();
    }
}
