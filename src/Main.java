public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.CourseNumber=1;
        course1.CourseName="Java&React";
        course1.CoursePurpose="Developing website with Java&React";

        Course course2=new Course(2,"C# - Angular","Developing website with C#");

        Course[] courses={course1,course2};
        for(Course course:courses){
            System.out.println(course.CourseNumber+ ":" +course.CourseName);
        }
        System.out.println("Number of the courses: " +courses.length);

        UserProfile user1=new UserProfile();
        user1.UserName="Kubra Kaymaz";
        user1.UserEmail="kbkaymaz123@gmail.com";

        UserProfile user2=new UserProfile();
        user2.UserName="Engin Demiroğ";
        user2.UserEmail="engindemirog@gmail.com";

        UserProfile[] users={user1,user2};
        for (UserProfile userProfile:users){
            System.out.println("Here are the users: " +user1.UserName+ "," +user2.UserName);
        }
        System.out.println("Number of users: " +users.length);


        CourseManager courseManager=new CourseManager();
        courseManager.AddCourse(course1);
        courseManager.RegisterToCourse(course1);
        courseManager.DeleteCourseFromList(course2);





    }
}
