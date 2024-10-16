public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.ime = "Pera";
        student.prezime = "Peric";
        student.godine = 20;
        student.brIndexa = 3213213;

        Student student1 = new Student("Marko", "Markovic", 321321, 21);

        Student student2 = new Student("John", "Smith", 21212);

        Student nizStudenata[] = {student, student1, student2};

        Student.varargs(nizStudenata);
    }
}