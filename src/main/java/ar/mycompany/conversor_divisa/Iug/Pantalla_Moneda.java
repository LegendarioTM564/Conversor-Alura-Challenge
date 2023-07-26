/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.mycompany.conversor_divisa.Iug;

import ar.mycompany.conversor_divisa.Logica.Api;
import java.awt.Color;

/**
 *
 * @author Juan Bravo
 */
public class Pantalla_Moneda extends javax.swing.JFrame {
    int ejeX;
    int ejeY;

    /**
     * Creates new form Pantalla_Moneda
     */
    public Pantalla_Moneda() {
        initComponents();
        txtTotalMoneda.setEditable(false);
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
        jLabel2 = new javax.swing.JLabel();
        TxtMoneda = new javax.swing.JTextField();
        cmbMoneda2 = new javax.swing.JComboBox<>();
        txtTotalMoneda = new javax.swing.JTextField();
        cmbMoneda1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        panelCierre = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        btnAtras = new javax.swing.JPanel();
        txtAtras = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JPanel();
        textConvertir = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 360));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 380));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(86, 105, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 360));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DIVISA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        TxtMoneda.setBackground(new java.awt.Color(86, 105, 129));
        TxtMoneda.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TxtMoneda.setForeground(new java.awt.Color(204, 204, 204));
        TxtMoneda.setText("Ingrese el Monto");
        TxtMoneda.setBorder(null);
        TxtMoneda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtMonedaMousePressed(evt);
            }
        });
        TxtMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMonedaActionPerformed(evt);
            }
        });
        TxtMoneda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtMonedaKeyTyped(evt);
            }
        });
        jPanel1.add(TxtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 120, 200, 40));

        cmbMoneda2.setBackground(new java.awt.Color(86, 105, 129));
        cmbMoneda2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cmbMoneda2.setForeground(new java.awt.Color(0, 0, 0));
        cmbMoneda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "JPY", "KRW", "ARS" }));
        cmbMoneda2.setBorder(null);
        cmbMoneda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMoneda2ActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMoneda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 120, 40));

        txtTotalMoneda.setBackground(new java.awt.Color(86, 105, 129));
        txtTotalMoneda.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        txtTotalMoneda.setForeground(new java.awt.Color(204, 204, 204));
        txtTotalMoneda.setBorder(null);
        txtTotalMoneda.setPreferredSize(new java.awt.Dimension(105, 22));
        txtTotalMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMonedaActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotalMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 200, 200, 40));

        cmbMoneda1.setBackground(new java.awt.Color(86, 105, 129));
        cmbMoneda1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cmbMoneda1.setForeground(new java.awt.Color(0, 0, 0));
        cmbMoneda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "JPY", "KRW", "ARS" }));
        cmbMoneda1.setBorder(null);
        jPanel1.add(cmbMoneda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 120, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 210, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 210, 20));

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
        panelCierre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setBackground(new java.awt.Color(86, 105, 129));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnExit.add(txtExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelCierre.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 50));

        btnAtras.setBackground(new java.awt.Color(86, 105, 129));
        btnAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAtras.setFont(new java.awt.Font("Cascadia Mono PL SemiBold", 0, 24)); // NOI18N
        txtAtras.setForeground(new java.awt.Color(204, 204, 204));
        txtAtras.setText(" ←");
        txtAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtAtrasMouseExited(evt);
            }
        });
        btnAtras.add(txtAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        panelCierre.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jPanel1.add(panelCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        btnConvertir.setBackground(new java.awt.Color(137, 167, 177));
        btnConvertir.setForeground(new java.awt.Color(86, 105, 129));
        btnConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvertir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textConvertir.setBackground(new java.awt.Color(137, 167, 177));
        textConvertir.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        textConvertir.setForeground(new java.awt.Color(0, 0, 0));
        textConvertir.setText("           CONVERTIR");
        textConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textConvertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textConvertirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textConvertirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textConvertirMouseExited(evt);
            }
        });
        btnConvertir.add(textConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 150, 50));

        jPanel1.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 150, 60));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMonedaActionPerformed
        

    }//GEN-LAST:event_txtTotalMonedaActionPerformed

    private void TxtMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMonedaActionPerformed

    private void TxtMonedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMonedaKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key<=57;
        
        if(!numeros){
            evt.consume();
         }
        
    }//GEN-LAST:event_TxtMonedaKeyTyped

    private void cmbMoneda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMoneda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMoneda2ActionPerformed

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(new Color(203,218,213));
        txtExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(new Color(86,105,129));
        txtExit.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txtExitMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered

    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited

    }//GEN-LAST:event_btnExitMouseExited

    private void txtAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAtrasMouseClicked
        Pantalla_Inicio pantallaInicio = new Pantalla_Inicio();
        pantallaInicio.setVisible(true);
        pantallaInicio.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_txtAtrasMouseClicked

    private void txtAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAtrasMouseEntered
        btnAtras.setBackground(new Color(203,218,213));
        txtAtras.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtAtrasMouseEntered

    private void txtAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAtrasMouseExited
        btnAtras.setBackground(new Color(86,105,129));
        txtAtras.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_txtAtrasMouseExited

    private void panelCierreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMouseDragged
        int xScreen = evt.getXOnScreen();
        int yScreen = evt.getYOnScreen();
        this.setLocation(xScreen - ejeX, yScreen - ejeY);
    }//GEN-LAST:event_panelCierreMouseDragged

    private void panelCierreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMousePressed
        ejeX = evt.getX();
        ejeY = evt.getY();
    }//GEN-LAST:event_panelCierreMousePressed

    private void textConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseClicked
        double monto =Double.valueOf(TxtMoneda.getText()) ;
        String monedaPrincipal = (String) cmbMoneda2.getSelectedItem();
        String monedaConversion = (String) cmbMoneda1.getSelectedItem();
        
         Api getApi = new Api();
         getApi.getApi(monedaPrincipal,monedaConversion,monto);
         double result = getApi.getResult();
         String resultString = String.valueOf(result);
         txtTotalMoneda.setText(resultString);
    }//GEN-LAST:event_textConvertirMouseClicked

    private void textConvertirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseEntered
        btnConvertir.setBackground(new Color(203,218,213));
    }//GEN-LAST:event_textConvertirMouseEntered

    private void textConvertirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseExited
        btnConvertir.setBackground(new Color(137,167,177));
    }//GEN-LAST:event_textConvertirMouseExited

    private void TxtMonedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtMonedaMousePressed
        TxtMoneda.setText("");
    }//GEN-LAST:event_TxtMonedaMousePressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtMoneda;
    private javax.swing.JPanel btnAtras;
    private javax.swing.JPanel btnConvertir;
    private javax.swing.JPanel btnExit;
    private javax.swing.JComboBox<String> cmbMoneda1;
    private javax.swing.JComboBox<String> cmbMoneda2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panelCierre;
    private javax.swing.JLabel textConvertir;
    private javax.swing.JLabel txtAtras;
    private javax.swing.JLabel txtExit;
    private javax.swing.JTextField txtTotalMoneda;
    // End of variables declaration//GEN-END:variables
}
