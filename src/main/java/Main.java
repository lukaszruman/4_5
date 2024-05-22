import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private String name;
    private String surname;
    private String birthdate;

    public Student(String name, String surname, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }
}
class Service {
    private List<Student> students;
    public Service() {
        this.students = new ArrayList();
        // You can add some dummy data here if needed
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
}



class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Service s = new Service();
    boolean programDziala = true;
    while (programDziala) {
      System.out.println("Wybierz opcję:");
      System.out.println("1. Wyświetl zapisane dane studentów");
      System.out.println("2. Dodaj nowego studenta");
      System.out.println("0. Wyjdź z programu");
      int wybor = scanner.nextInt();
      //try {
        switch (wybor) {
          case 1:
            System.out.println("Zapisane dane studentów:");
            for (Student student : s.getStudents()) {
              System.out.println("Imię: " + student.getName() + ", Nazwisko: " + student.getSurname() + ", Data urodzenia: " + student.getBirthdate());
            }
            break;
          case 2:
            System.out.println("Podaj imię nowego studenta:");
            String imie = scanner.next();
            System.out.println("Podaj nazwisko nowego studenta:");
            String nazwisko = scanner.next();
            System.out.println("Podaj datę urodzenia (dd/mm/yyyy):");
            String dataUrodzenia = scanner.next();
            s.addStudent(new Student(imie, nazwisko, dataUrodzenia));
            System.out.println("Nowy student został dodany.");
            break;
          case 0:
            System.out.println("Program zostanie zamknięty.");
            programDziala = false;
            break;
          default:
            System.out.println("Niepoprawny wybór. Wybierz ponownie.");
        }}
      } //catch (IOException e) {
        //System.out.println("Wystąpił błąd podczas operacji na pliku.");
      //}
    }
    //scanner.close();
  //}
//}