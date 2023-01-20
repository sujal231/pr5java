import java.util.Scanner;

class pr {

    public static void main(String[] args) {
        String id, name;
        String roll_no, Standard;
        String surname, address, birth_date;
        String total_marks, percntage;12
        String maths_marks, science_marks;

        Scanner sc = new Scanner(System.in);

        System.out.print("Id= ");
        id = sc.nextLine();
        System.out.print("Name= ");
        name = sc.nextLine();
        System.out.print("roll_no= ");
        roll_no = sc.nextLine();
        System.out.print("Standard= ");
        Standard = sc.nextLine();
        System.out.print("surname= ");
        surname = sc.nextLine();
        System.out.print("address= ");
        address = sc.nextLine();
        System.out.print("birth_date= ");
        birth_date = sc.nextLine();
        System.out.print("total_marks= ");
        total_marks = sc.nextLine();
        System.out.print("percntage= ");
        percntage = sc.nextLine();
        System.out.print("maths_marks= ");
        maths_marks = sc.nextLine();
        System.out.print("science_marks= ");
        science_marks = sc.nextLine();

        Std s = new Std(id, name, roll_no, Standard, surname, address, birth_date, total_marks, percntage, maths_marks,
                science_marks);

        System.out.println("Id= " + s.id);
        System.out.println("Name= " + s.name);
        System.out.println("roll_no= " + s.roll_no);
        System.out.println("Standard= " + s.Standard);
        System.out.println("surname= " + s.surname);
        System.out.println("address= " + s.address);
        System.out.println("birth_date= " + s.birth_date);
        System.out.println("total_marks= " + s.total_marks);
        System.out.println("percntage= " + s.percntage);
        System.out.println("maths_marks= " + s.maths_marks);
        System.out.println("science_marks= " + s.science_marks);

    }
}

class Std {

    public String id, name;
    public String roll_no, Standard;
    public String surname, address, birth_date;
    public String total_marks, percntage;
    public String maths_marks, science_marks;

    Std(String i, String n, String r, String s, String sur, String a, String b, String t, String p, String m,
            String sci) {
        id = i;
        name = n;
        roll_no = r;
        Standard = s;
        surname = sur;
        address = a;
        birth_date = b;
        total_marks = t;
        percntage = p;
        maths_marks = m;
        science_marks = sci;

    }

}