package com.kuz.tmp.control;

import com.kuz.tmp.model.db.MessageDerbyDAO;
import com.kuz.tmp.model.db.MessageDAO;
import com.kuz.tmp.view.MainUI;
import org.apache.log4j.Logger;

/**
 *
 *
 * @author Kasun Amarasena
 */
public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //javax.swing.UIManager.setLookAndFeel();
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.fatal("Error running app-Main", ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });

    }

    /**
     * Instantiate model, view, controller
     */
    public static void runApp() {

        MainUI ui = new MainUI();
        MessageDAO model = new MessageDerbyDAO();
        MainController controller = new MainController(ui, model);
        
        ui.setListener(controller);

        ui.setVisible(true);

    }

}
