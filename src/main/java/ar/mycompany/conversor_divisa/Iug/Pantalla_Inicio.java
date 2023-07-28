/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.mycompany.conversor_divisa.Iug;

import java.awt.Color;

/**
 *
 * @author Juan Bravo
 */
public class Pantalla_Inicio extends javax.swing.JFrame {

    int ejeX;
    int ejeY;
    
    /**
     * Creates new form Pantalla_Inicio
     */
    public Pantalla_Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCierre = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnTemperatura = new javax.swing.JPanel();
        txtTemperatura = new javax.swing.JLabel();
        btnDivisa = new javax.swing.JPanel();
        txtDivisa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(86, 105, 129));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 105, 129));
        jPanel1.setForeground(new java.awt.Color(86, 105, 129));

        panelCierre.setBackground(new java.awt.Color(86, 105, 129));
        panelCierre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelCierreMouseDragged(evt);
            }
        });
        panelCierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCierreMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(86, 105, 129));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        txtExit.setBackground(new java.awt.Color(137, 167, 177));
        txtExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        txtExit.setForeground(new java.awt.Color(204, 204, 204));
        txtExit.setText("     X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelCierreLayout = new javax.swing.GroupLayout(panelCierre);
        panelCierre.setLayout(panelCierreLayout);
        panelCierreLayout.setHorizontalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCierreLayout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCierreLayout.setVerticalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONVERSOR");

        btnTemperatura.setBackground(new java.awt.Color(137, 167, 177));
        btnTemperatura.setForeground(new java.awt.Color(86, 105, 129));
        btnTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTemperatura.setPreferredSize(new java.awt.Dimension(150, 55));

        txtTemperatura.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(0, 0, 0));
        txtTemperatura.setText("       TEMPERATURA");
        txtTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTemperaturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTemperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTemperaturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnTemperaturaLayout = new javax.swing.GroupLayout(btnTemperatura);
        btnTemperatura.setLayout(btnTemperaturaLayout);
        btnTemperaturaLayout.setHorizontalGroup(
            btnTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTemperaturaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnTemperaturaLayout.setVerticalGroup(
            btnTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnTemperaturaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnDivisa.setBackground(new java.awt.Color(137, 167, 177));
        btnDivisa.setForeground(new java.awt.Color(86, 105, 129));
        btnDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDivisa.setPreferredSize(new java.awt.Dimension(150, 50));

        txtDivisa.setBackground(new java.awt.Color(137, 167, 177));
        txtDivisa.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtDivisa.setForeground(new java.awt.Color(0, 0, 0));
        txtDivisa.setText("                 DIVISA");
        txtDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDivisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDivisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDivisaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDivisaLayout = new javax.swing.GroupLayout(btnDivisa);
        btnDivisa.setLayout(btnDivisaLayout);
        btnDivisaLayout.setHorizontalGroup(
            btnDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnDivisaLayout.setVerticalGroup(
            btnDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDivisaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelCierreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMousePressed
        ejeX = evt.getX();
        ejeY = evt.getY();
    }//GEN-LAST:event_panelCierreMousePressed

    private void panelCierreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMouseDragged
        int xScreen = evt.getXOnScreen();
        int yScreen = evt.getYOnScreen();
        this.setLocation(xScreen - ejeX, yScreen - ejeY);
    }//GEN-LAST:event_panelCierreMouseDragged

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
         btnExit.setBackground(new Color(203,218,213));
         txtExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtDivisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDivisaMouseEntered
        btnDivisa.setBackground(new Color(203,218,213));
    }//GEN-LAST:event_txtDivisaMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       
    }//GEN-LAST:event_btnExitMouseExited

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(new Color(86,105,129));
        txtExit.setForeground(new Color(204,204,204));
        
    }//GEN-LAST:event_txtExitMouseExited

    private void txtTemperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTemperaturaMouseEntered
        btnTemperatura.setBackground(new Color(203,218,213));
         
    }//GEN-LAST:event_txtTemperaturaMouseEntered

    private void txtTemperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTemperaturaMouseExited
        btnTemperatura.setBackground(new Color(137,167,177));
        
        
    }//GEN-LAST:event_txtTemperaturaMouseExited

    private void txtDivisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDivisaMouseExited
        btnDivisa.setBackground(new Color(137,167,177));
    }//GEN-LAST:event_txtDivisaMouseExited

    private void txtTemperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTemperaturaMouseClicked
        Pantalla_Temperatura pantallaTemperatura = new Pantalla_Temperatura();
        pantallaTemperatura.setVisible(true);
        pantallaTemperatura.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_txtTemperaturaMouseClicked

    private void txtDivisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDivisaMouseClicked
        Pantalla_Moneda pantallaMoneda = new Pantalla_Moneda();
        pantallaMoneda.setVisible(true);
        pantallaMoneda.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_txtDivisaMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDivisa;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelCierre;
    private javax.swing.JLabel txtDivisa;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
