import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.next();


        switch (shape) {
            case "rectangle":
                double aRectangle = scanner.nextInt();
                double bRectangle = scanner.nextInt();
                System.out.println(aRectangle * bRectangle);
                break;
            case "circle":
                double radius = scanner.nextInt();
                System.out.println(radius * radius * 3.14);
                break;
            case "triangle":
                double aTriangle = scanner.nextInt();
                double bTriangle = scanner.nextInt();
                double cTriangle = scanner.nextInt();
                double p = (aTriangle + bTriangle + cTriangle) / 2;
                double area = Math.sqrt(p * (p - aTriangle) * (p - bTriangle) * (p - cTriangle));
                System.out.println(area);
                break;

        }


    }
}