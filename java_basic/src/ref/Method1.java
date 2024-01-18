package ref;

public class Method1 {
  public static void main(String[] args) {
    Student student = new Student();

    initStudent(student, "rice", 41, 100);

    printStudent(student);

  }

  static void initStudent(Student student, String name1, int age1, int grade1) {
    student.name = name1;
    student.age = age1;
    student.grade = grade1;
  }

  static void printStudent(Student student) {
    System.out.println("Student's name : " + student.name + " " + student.age + " " + student.grade);

  }

}
