public class Main {
    public static void main(String[] args) {
        System.out.println("This is my first maven project");
        Student student = new Student("George", "Mihai");
        student.setAge(44);
        System.out.println(student.getAge());

        Student student1 = Student.builder()
                .age(22)
                .build();
    }
}
