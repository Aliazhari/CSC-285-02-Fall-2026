
/**
 * Demonstrates the university course management classes.
 *
 * <p>This application creates Course and OnlineCourse objects
 * and displays their descriptions and instructor information.</p>
 *
 * @author Ali Azhari
 * @version 1.0
 * @since 1.0
 * @see Course
 * @see OnlineCourse
 * @see Instructor
 */
public class UniversityDemo {

    /**
     * Runs the university course demonstration.
     *
     * <p>The method demonstrates polymorphism by storing an
     * OnlineCourse object in a Course reference.</p>
     *
     * @param args command-line arguments; not used
     * {@link Course }
     */
    public static void main(String[] args) {

        Course regularCourse = new Course(
            "CSC-120",
            "Introduction to Computer Science",
            "Ali Azhari",
            "ali@example.edu"
        );

        Course onlineCourse = new OnlineCourse(
            "CSC-285",
            "Advanced Java Programming",
            "Jane Smith",
            "jane@example.edu",
            "Canvas",
            "https://example.edu/online-class"
        );

        System.out.println(regularCourse);
        System.out.println();

        System.out.println(onlineCourse);
        System.out.println();

        System.out.println(
            "Online platform: "
            + ((OnlineCourse) onlineCourse).getPlatform()
        );
    }
}
