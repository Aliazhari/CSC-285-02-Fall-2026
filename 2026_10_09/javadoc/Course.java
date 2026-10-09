
/**
 * Represents a university course.
 *
 * <p>Each course has a course code, a title, and an instructor.
 * The course creates and owns its Instructor object, demonstrating
 * a composition relationship.</p>
 *
 * <p>This class is also the superclass of OnlineCourse.</p>
 *
 * @author Ali Azhari
 * @version 1.0
 * @since 1.0
 * @see Instructor
 * @see OnlineCourse
 */
public class Course {

    /** The unique code identifying the course. */
    private String courseCode;

    /** The title of the course. */
    private String title;

    /** The instructor owned by this course. */
    private final Instructor instructor;

    /**
     * Constructs a course with the specified details.
     *
     * <p>A new Instructor object is created as part of constructing
     * the course.</p>
     *
     * @param courseCode the unique course code
     * @param title the course title
     * @param instructorName the instructor's name
     * @param instructorEmail the instructor's email address
     * @throws IllegalArgumentException if any argument is null
     *         or blank
     * {@link getTitle()}
     * {Call {@code toString() } to print the object Course 
     */
    public Course(String courseCode, String title,
                  String instructorName,
                  String instructorEmail) {

        if (courseCode == null || courseCode.isBlank()
                || title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                "Course code and title must not be blank."
            );
        }

        this.courseCode = courseCode;
        this.title = title;

        this.instructor = new Instructor(
            instructorName, instructorEmail
        );
    }

    /**
     * Returns the course code.
     *
     * @return the course code
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Returns the course title.
     *
     * @return the course title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the instructor assigned to this course.
     *
     * @return the instructor owned by this course
     */
    public Instructor getInstructor() {
        return instructor;
    }

    /**
     * Returns a description of the course.
     *
     * <p>Subclasses can override this method to provide
     * more specialized descriptions.</p>
     *
     * @return a description containing the course code and title
     */
    public String getDescription() {
        return courseCode + ": " + title;
    }

    /**
     * Returns a readable summary of the course and instructor.
     *
     * @return the course description and instructor details
     */
    @Override
    public String toString() {
        return getDescription()
            + "\nInstructor: " + instructor;
    }
}
