
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("test");
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestLoop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
