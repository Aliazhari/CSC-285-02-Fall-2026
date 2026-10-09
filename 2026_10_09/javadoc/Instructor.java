
/**
 * Represents an instructor who teaches a university course.
 *
 * <p>An instructor has a name and an email address.
 * Instructor objects can be owned by Course objects.</p>
 *
 * @author Ali Azhari
 * @version 1.0
 * @since 1.0
 * 
 */
public class Instructor {

    /** The full name of the instructor. */
    private String name;

    /** The email address of the instructor. */
    private String email;

    /**
     * Constructs an instructor with the specified name and email.
     *
     * @param name the instructor's full name
     * @param email the instructor's email address
     * @throws IllegalArgumentException if name or email is null
     *         or blank
     */
    public Instructor(String name, String email) {
        if (name == null || name.isBlank()
                || email == null || email.isBlank()) {
            throw new IllegalArgumentException(
                "Name and email must not be blank."
            );
        }

        this.name = name;
        this.email = email;
    }

    /**
     * Returns the instructor's full name.
     *
     * @return the instructor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the instructor's email address.
     *
     * @return the instructor's email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a readable description of the instructor.
     *
     * @return the instructor's name and email address
     */
    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}