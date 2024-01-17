package class1;

public class ClassStart2 {
  public static void main(String[] args) {

    Student student1; //변수 선언
    student1 = new Student(); //실제 메모리에 만든다
    student1.name = "rice";
    student1.age = 41;
    student1.grade = 100;
    
    Student student2;
    student2 = new Student();
    student2.name = "saka";
    student2.age = 7;
    student2.grade = 90;

    Student[] students = new Student[]{student1, student2};
    for (Student student : students) {
      System.out.println(student +"  " + student.name);
    }



  }
}
