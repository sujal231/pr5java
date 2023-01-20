import java.util.Scanner;

class pr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length= ");
        int length = sc.nextInt();
        System.out.print("Enter Width= ");
        int width = sc.nextInt();
        area a = new area(length, width);

        System.out.println("Rectangle= " + a.rectangle());

    }
}

class area {
    int length, width;

    public area(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int rectangle() {
        return length * width;
    }

}
