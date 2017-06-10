package lab7;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Llenar extends Thread{
    JProgressBar pb;

    public Llenar(JProgressBar pb) {
        this.pb = pb;
    }
    
    @Override
    public void run(){
        int i = 0;
        while (i < pb.getMaximum()){
            pb.setValue(i);
            i++;
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Llenar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        JOptionPane.showMessageDialog(null, "Evaluación Terminada");
    }
    
}
