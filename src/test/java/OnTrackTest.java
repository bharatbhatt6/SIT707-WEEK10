import org.junit.Test;
import static org.junit.Assert.*;

public class OnTrackTest {

    @Test
    public void testSubmitTask() {
        Ontrack onTrack = new Ontrack();
        String taskId = "task123";
        String studentId = "student456";
        String filePath = "path/to/taskfile.txt";
        String comments = "This is my task submission.";

        boolean isSubmitted = onTrack.submitTask(taskId, studentId, filePath, comments);

        assertTrue("Task should be successfully submitted.", isSubmitted);
    }
}
