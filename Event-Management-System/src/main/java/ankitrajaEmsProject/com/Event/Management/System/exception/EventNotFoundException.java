package ankitrajaEmsProject.com.Event.Management.System.exception;

// Define the custom exception class extending RuntimeException
public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException(String message) {
        super(message); // Pass the message to the parent (RuntimeException)
    }
}
