class pr {
    public static void main(String[] args) {

        student w = new student("12", "Sujal");

        System.out.println("Roll no.= " + w.roll_no);
        System.out.println("name= " + w.name);

    }
}

class student {
    String roll_no, name;

    public student(String roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

}