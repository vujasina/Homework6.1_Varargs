public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.ime = "Pera";
        student.prezime = "Peric";
        student.godine = 20;
        student.brIndexa = 3213213;

        Student student1 = new Student("Marko", "Markovic", 321321, 21);

        Student student2 = new Student("John", "Smith", 21212);

        String ispis0 = student.ispisObjekta();
        String ispis1 = student1.ispisObjekta();
        String ispis2 = student2.ispisObjekta();

        String ispis[] = {ispis0, ispis1, ispis2};

        Student.varargs(ispis);
    }
}