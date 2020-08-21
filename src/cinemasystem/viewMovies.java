/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemasystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class viewMovies extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public viewMovies() throws SQLException, ClassNotFoundException {
        initComponents();
        tableUpdate();
        idTF.setEditable(false);
        titleTF.setEditable(false);
        genreTF.setEditable(false);
        ratingTF.setEditable(false);
        durationTF.setEditable(false);
        dateTF.setEditable(false);
        timeTF.setEditable(false);
        hallTF.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        genreTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ratingTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        durationTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        timeTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        hallTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Movies");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Movie Shows");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 50, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 338, 10));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "showID", "Movie Title", "Genre", "Rating", "Duration", "Date", "Show Time", "Hall Category"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 1110, 210));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("showID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        getContentPane().add(idTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 88, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Movie Title :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 436, -1, -1));

        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });
        getContentPane().add(titleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 434, 284, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genre :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 436, -1, -1));
        getContentPane().add(genreTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 434, 247, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rating :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 436, -1, -1));
        getContentPane().add(ratingTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 434, 81, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Duration :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 501, -1, -1));

        durationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTFActionPerformed(evt);
            }
        });
        getContentPane().add(durationTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 499, 140, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 501, -1, -1));
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 499, 284, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Show Time :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 501, -1, -1));
        getContentPane().add(timeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 499, 136, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hall Category :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, 501, -1, -1));

        hallTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallTFActionPerformed(evt);
            }
        });
        getContentPane().add(hallTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(1036, 499, 133, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Click on the movie to book ticket.");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 112, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 385, -1, -1));

        bookButton.setBackground(new java.awt.Color(0, 255, 0));
        bookButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(bookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 100, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 132, 240, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 290, -1));

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinemasystem/movies.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void hallTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hallTFActionPerformed

    private void durationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTFActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        if(!idTF.getText().isEmpty()) {
        movie m = new movie(Integer.parseInt(idTF.getText()),titleTF.getText(),genreTF.getText(),ratingTF.getText(),durationTF.getText(),dateTF.getText(),timeTF.getText(),hallTF.getText());
        new customerDetails(m).setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        int index = table.getSelectedRow();
        titleTF.setText(model.getValueAt(index, 1).toString());
        genreTF.setText(model.getValueAt(index, 2).toString());
        ratingTF.setText(model.getValueAt(index, 3).toString());
        durationTF.setText(model.getValueAt(index, 4).toString());
        dateTF.setText(model.getValueAt(index, 5).toString());
        timeTF.setText(model.getValueAt(index, 6).toString());
        hallTF.setText(model.getValueAt(index, 7).toString());
        idTF.setText(model.getValueAt(index, 0).toString());
        
    }//GEN-LAST:event_tableMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    public void tableUpdate() throws SQLException, ClassNotFoundException
    {
 
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Movies.accdb");
            pst = con.prepareStatement("select * from movies");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            DefaultTableModel dft = (DefaultTableModel)table.getModel();
            dft.setRowCount(0);
            while(rs.next())
            {
                Object[] array = new Object[8];
                
                    array[0] = rs.getString("showID");
                    array[1] = rs.getString("title");
                    array[2] = rs.getString("genre");                   
                    array[3] = rs.getString("rating");
                    Object[] duration = rs.getString("duration").split(" ");
                    array[4] = duration[0] + " hours " + duration[1] + " mins";
                    Object[] date = rs.getString("datee").split(" ");
                    array[5] = date[0];
                    array[6] = rs.getString("time");
                    array[7] = rs.getString("hall");
               
                dft.addRow(array);
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewMovies.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new viewMovies().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(viewMovies.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(viewMovies.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton bookButton;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField durationTF;
    private javax.swing.JTextField genreTF;
    private javax.swing.JTextField hallTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField ratingTF;
    private javax.swing.JTable table;
    private javax.swing.JTextField timeTF;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables
}