import java.util.Scanner;

class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int length = sc.nextInt();
        System.out.println("Enter the Width:");
        int width = sc.nextInt();
        Rectangle rec = new Rectangle(length, width);
        System.out.println("area:" + rec.calculateArea());
        sc.close();
    }
}
