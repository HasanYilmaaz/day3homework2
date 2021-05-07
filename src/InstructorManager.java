public class InstructorManager extends UserManager{
    public void createCourse(Instructor instructor){
        System.out.println("Kurs oluşturuldu. Oluşturulan kurs adı: "+ instructor.getMyCourses());
    }
    public void removeCourse(Instructor instructor){
        System.out.println("Kurs kaldırıldı.");
    }



}
