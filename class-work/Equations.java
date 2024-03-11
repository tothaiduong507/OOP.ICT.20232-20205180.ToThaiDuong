import java.util.Scanner;

public class Equations {
    public static void main(String[] args) {
        System.out.println("Which type of equation do you want to solve? ");
        System.out.println("1. First degree equation (linear equation) with one variable");
        System.out.println("2. System of first-degree equations (linear system) with two variables");
        System.out.println("3. Second-degree equation with one variable");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a11, a12, a21, a22, b1, b2, c;

        switch(n){
            case 1:
                System.out.print("Enter a, b: ");
                a11 = scanner.nextInt();
                b1 = scanner.nextInt();
                if(a11 == 0) {
                    if(b1 != 0){
                        System.out.println("The equation has no solutions.");
                    } else {
                        System.out.println("The equation has infinite solutions.");
                    }
                } else {
                    System.out.println("The solution is: " + (double) (-b1/a11));
                }
                break;
            case 2:
                System.out.print("Enter a11, a12, b1, a21, a22, b2: ");
                a11 = scanner.nextInt();
                a12 = scanner.nextInt();
                b1 = scanner.nextInt();
                a21 = scanner.nextInt();
                a22 = scanner.nextInt();
                b2 = scanner.nextInt();

                int D = a11*a22 - a12*a21;
                int Dx = b1*a22 - b2*a12;
                int Dy = a11*b2 - a21*b1;

                System.out.println("x is: " + (double) Dx/D);
                System.out.println("y is: " + (double) Dy/D);

                break;
            case 3:
                System.out.print("Enter a, b and c: ");
                a11 = scanner.nextInt();
                b1 = scanner.nextInt();
                c = scanner.nextInt();

                if(a11 == 0){
                    if(b1 == 0) {
                        if(c != 0){
                            System.out.println("The equation has no solutions.");
                        } else {
                            System.out.println("The equation has infinite solutions.");
                        }
                    } else {
                        System.out.println("The solution is: " + (double) (-c/b1));
                    }
                } else{
                    double delta = b1*b1 - 4*a11*c;
                    if(delta < 0){
                        System.out.println("The equation has no solution. ");
                    } else if(delta == 0) {
                        System.out.println("The equation has double root of " + (double) -b1 / 2 / a11);
                    } else{
                        System.out.println("The equation has 2 separate solutions: ");
                        System.out.println("x1 = " + (-b1 + Math.sqrt(delta)/2/a11));
                        System.out.println("x2 = " + (-b1 - Math.sqrt(delta)/2/a11));
                    }
                    break;
                }

            default:
        }

    }
}
