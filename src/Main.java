public class Main {

    public static void main(String[] args) {
    Instructor instructor = new Instructor("Engin", "Demiroğ","MCT, PMP, ITIL");
    instructor.setInfo("300den fazla kuruma danışmanlık yaptım.");
    instructor.setEmail("engindemirog@email.com");
    instructor.setUsername("EnginDemirog");
    instructor.setPassword("engin123.");
    instructor.setUsernameId(123123);
    instructor.setMyCourses("C# nitelikli yazılım geliştirmeci");

    Student student =new Student("Hasan","Yılmaz");
    student.setUsername("Hashust");
    student.setEmail("hasanyilmaz@gmail.com");
    student.setPassword("hasan123.");
    student.setInfo("Odtü Siyaset Bilimi ve Kamu Yönetimi 3.sınıf öğrencisiyim.");
    student.setUsernameId(123122);
    student.setMyCourses(instructor.getMyCourses());

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.login(instructor);
    instructorManager.createCourse(instructor);
    instructorManager.getMyCourses(instructor);
        System.out.println("-------------------------");
    instructorManager.updateInfo(instructor);
        System.out.println("-------------------------------------");
    StudentManager studentManager = new StudentManager();
    studentManager.login(student);
    studentManager.joinCourse(student);
        System.out.println(student.getUsername()+" olarak katıldığınız kurslar: "+  student.getMyCourses());






    }
}
