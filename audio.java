
package jmf_test1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.Time;

/**
 * @author naveen.k
 */

public class AudioPlayerTest extends javax.swing.JFrame {

    Player audioPlayer = null;
    String audioPath = "";

    /** Creates new form AudioPlayerTest */
    public AudioPlayerTest() {
        initComponents();
        audioPath = "D:\\sample.mp3";
        initAudioPlayer(audioPath);       
    }

    private void initAudioPlayer(String pathname) {
        try {
            URL url = new File(pathname).toURL();
            audioPlayer = Manager.createRealizedPlayer(url);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (NoPlayerException ex) {
            ex.printStackTrace();
        } catch (CannotRealizeException ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // 
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        PlayButton = new javax.swing.JButton();
        PauseButton = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PlayButton.setText("Play");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        PauseButton.setText("Pause");
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButtonActionPerformed(evt);
            }
        });

        StopButton.setText("Stop");
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
               .addComponent(PlayButton)
                .addGap(27, 27, 27)
                .addComponent(PauseButton)
                .addGap(18, 18, 18)
                .addComponent(StopButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayButton)
                    .addComponent(PauseButton)
                    .addComponent(StopButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// 

    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        audioPlayer.start();
    }

    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        audioPlayer.stop();
    }

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        audioPlayer.stop();
        audioPlayer.setMediaTime(new Time(0.0));
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioPlayerTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton PauseButton;
    private javax.swing.JButton PlayButton;
    private javax.swing.JButton StopButton;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration
}

