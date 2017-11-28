package jmf_test1;
import java.io.File;
import javax.media.Manager;
import javax.media.Player;
/**
 * @author naveen.k
 */
public class Main {
    static Player audioPlayer = null;
    public static void main(String[] args) {
        try {
            Manager.createRealizedPlayer(new File("D:\\Sample.mp3").toURL()).start();
        } catch (Exception ex) { ex.printStackTrace();  }
    }
}
