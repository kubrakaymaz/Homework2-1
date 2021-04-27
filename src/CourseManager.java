public class CourseManager {
    public void AddCourse(Course course){
        System.out.println(course.CourseName +"Kurs eklendi");
    }
    public void DeleteCourseFromList(Course course){
        System.out.println(course.CourseName +"Kurs listeden çıkarıldı");
    }
    public void RegisterToCourse(Course course){
        System.out.println(course.CourseName+ "Kursuna kayıt işlemi gerçekleştirildi." );
    }
}
