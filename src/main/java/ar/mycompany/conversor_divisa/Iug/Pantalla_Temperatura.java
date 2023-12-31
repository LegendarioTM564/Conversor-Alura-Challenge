/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.mycompany.conversor_divisa.Iug;

import ar.mycompany.conversor_divisa.Logica.Temperaturas;
import java.awt.Color;

/**
 *
 * @author Juan Bravo
 */
public class Pantalla_Temperatura extends javax.swing.JFrame {
    int ejeX;
    int ejeY;

    /**
     * Creates new form Pantalla_Temperatura
     * 
     */
    public Pantalla_Temperatura() {
        initComponents();
        TxtTemperaturaFinal.setEditable(false);
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
        cmbTemp2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        TxtTemperatura = new javax.swing.JTextField();
        cmbTemp1 = new javax.swing.JComboBox<>();
        TxtTemperaturaFinal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnConvertir = new javax.swing.JPanel();
        textConvertir = new javax.swing.JLabel();
        panelCierre = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        btnAtras = new javax.swing.JPanel();
        txtAtras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(86, 105, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 360));

        cmbTemp2.setBackground(new java.awt.Color(86, 105, 129));
        cmbTemp2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cmbTemp2.setForeground(new java.awt.Color(0, 0, 0));
        cmbTemp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C", "°F", "K" }));
        cmbTemp2.setBorder(null);
        cmbTemp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTemp2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TEMPERATURA");

        TxtTemperatura.setBackground(new java.awt.Color(86, 105, 129));
        TxtTemperatura.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TxtTemperatura.setForeground(new java.awt.Color(255, 255, 255));
        TxtTemperatura.setText("Ingrese la Temperatura");
        TxtTemperatura.setBorder(null);
        TxtTemperatura.setPreferredSize(new java.awt.Dimension(105, 22));
        TxtTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtTemperaturaMousePressed(evt);
            }
        });
        TxtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperaturaActionPerformed(evt);
            }
        });
        TxtTemperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtTemperaturaKeyTyped(evt);
            }
        });

        cmbTemp1.setBackground(new java.awt.Color(86, 105, 129));
        cmbTemp1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cmbTemp1.setForeground(new java.awt.Color(0, 0, 0));
        cmbTemp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C", "°F", "K" }));
        cmbTemp1.setBorder(null);

        TxtTemperaturaFinal.setBackground(new java.awt.Color(86, 105, 129));
        TxtTemperaturaFinal.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        TxtTemperaturaFinal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTemperaturaFinal.setBorder(null);
        TxtTemperaturaFinal.setPreferredSize(new java.awt.Dimension(105, 22));
        TxtTemperaturaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperaturaFinalActionPerformed(evt);
            }
        });

        btnConvertir.setBackground(new java.awt.Color(137, 167, 177));
        btnConvertir.setForeground(new java.awt.Color(86, 105, 129));
        btnConvertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        javax.swing.GroupLayout btnConvertirLayout = new javax.swing.GroupLayout(btnConvertir);
        btnConvertir.setLayout(btnConvertirLayout);
        btnConvertirLayout.setHorizontalGroup(
            btnConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnConvertirLayout.setVerticalGroup(
            btnConvertirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConvertirLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(textConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        btnAtras.setBackground(new java.awt.Color(86, 105, 129));
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtAtras.setFont(new java.awt.Font("Cascadia Mono PL SemiBold", 0, 24)); // NOI18N
        txtAtras.setForeground(new java.awt.Color(204, 204, 204));
        txtAtras.setText(" ←");
        txtAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        javax.swing.GroupLayout btnAtrasLayout = new javax.swing.GroupLayout(btnAtras);
        btnAtras.setLayout(btnAtrasLayout);
        btnAtrasLayout.setHorizontalGroup(
            btnAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnAtrasLayout.setVerticalGroup(
            btnAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout panelCierreLayout = new javax.swing.GroupLayout(panelCierre);
        panelCierre.setLayout(panelCierreLayout);
        panelCierreLayout.setHorizontalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCierreLayout.createSequentialGroup()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(460, 460, 460)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCierreLayout.setVerticalGroup(
            panelCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(TxtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cmbTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(TxtTemperaturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cmbTemp2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTemp1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTemperaturaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTemp2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperaturaActionPerformed

    private void TxtTemperaturaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperaturaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperaturaFinalActionPerformed

    private void TxtTemperaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTemperaturaKeyTyped
        int key = evt.getKeyChar();
        
        boolean numeros = key >=48 && key<=57;
        
        if(!numeros){
            evt.consume();
         }
    }//GEN-LAST:event_TxtTemperaturaKeyTyped

    private void cmbTemp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTemp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTemp2ActionPerformed

    private void textConvertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseClicked
        double temperatura =Double.valueOf(TxtTemperatura.getText()) ;
        String temperaturaPrincipal = (String) cmbTemp1.getSelectedItem();
        String temperaturaConversion = (String) cmbTemp2.getSelectedItem();
        
        Temperaturas conversionTemp = new Temperaturas();
        conversionTemp.conversion(temperatura, temperaturaPrincipal, temperaturaConversion);
        String result = conversionTemp.getTempFinal();
         TxtTemperaturaFinal.setText(result);
    }//GEN-LAST:event_textConvertirMouseClicked

    private void textConvertirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseEntered
        btnConvertir.setBackground(new Color(203,218,213));
    }//GEN-LAST:event_textConvertirMouseEntered

    private void textConvertirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConvertirMouseExited
        btnConvertir.setBackground(new Color(137,167,177));
    }//GEN-LAST:event_textConvertirMouseExited

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

    private void panelCierreMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMouseDragged
        int xScreen = evt.getXOnScreen();
        int yScreen = evt.getYOnScreen();
        this.setLocation(xScreen - ejeX, yScreen - ejeY);
    }//GEN-LAST:event_panelCierreMouseDragged

    private void panelCierreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCierreMousePressed
        ejeX = evt.getX();
        ejeY = evt.getY();
    }//GEN-LAST:event_panelCierreMousePressed

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

    private void TxtTemperaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtTemperaturaMousePressed
        TxtTemperatura.setText("");
    }//GEN-LAST:event_TxtTemperaturaMousePressed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtTemperatura;
    private javax.swing.JTextField TxtTemperaturaFinal;
    private javax.swing.JPanel btnAtras;
    private javax.swing.JPanel btnConvertir;
    private javax.swing.JPanel btnExit;
    private javax.swing.JComboBox<String> cmbTemp1;
    private javax.swing.JComboBox<String> cmbTemp2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelCierre;
    private javax.swing.JLabel textConvertir;
    private javax.swing.JLabel txtAtras;
    private javax.swing.JLabel txtExit;
    // End of variables declaration//GEN-END:variables
}
