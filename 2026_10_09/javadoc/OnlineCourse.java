
/**
 * Represents a university course delivered online.
 *
 * <p>An OnlineCourse is a specialized type of Course.
 * It inherits the course code, title, and instructor from Course
 * and adds an online learning platform and meeting URL.</p>
 *
 * @author Ali Azhari
 * @version 1.0
 * @since 1.0
 * @see Course
 */
public class OnlineCourse extends Course {

    /** The name of the online learning platform. */
    private String platform;

    /** The URL used to access the online class meeting. */
    private String meetingUrl;

    /**
     * Constructs an online course with the specified details.
     *
     * @param courseCode the unique course code
     * @param title the course title
     * @param instructorName the instructor's name
     * @param instructorEmail the instructor's email address
     * @param platform the online learning platform
     * @param meetingUrl the URL of the online class meeting
     * @throws IllegalArgumentException if the platform or meeting
     *         URL is null or blank, or if superclass validation fails
     */
    public OnlineCourse(String courseCode, String title,
                        String instructorName,
                        String instructorEmail,
                        String platform,
                        String meetingUrl) {

        super(courseCode, title, instructorName, instructorEmail);

        if (platform == null || platform.isBlank()
                || meetingUrl == null || meetingUrl.isBlank()) {
            throw new IllegalArgumentException(
                "Platform and meeting URL must not be blank."
            );
        }

        this.platform = platform;
        this.meetingUrl = meetingUrl;
    }

    /**
     * Returns the online learning platform.
     *
     * @return the platform name
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Returns the online meeting URL.
     *
     * @return the meeting URL
     */
    public String getMeetingUrl() {
        return meetingUrl;
    }

    /**
     * Returns a description of the online course.
     *
     * <p>This method overrides the getDescription() method
     * inherited from Course.</p>
     *
     * @return the course description, platform, and meeting URL
     */
    @Override
    public String getDescription() {
        return super.getDescription()
            + " | Online platform: " + platform
            + " | Meeting URL: " + meetingUrl;
    }
}
