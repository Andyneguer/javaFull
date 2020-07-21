/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import taller1_colsubsidio.Descuento;

/**
 *
 * @author usuario
 */
public class Ejercicio1 extends javax.swing.JInternalFrame {
    
    Descuento des;
    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
        initComponents();
        des = new Descuento();
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
        txtValorCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTotalAPagar = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("Supermercado");

        jLabel2.setText("Valor de la compra");

        jButton1.setText("Calcular descuento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTotalAPagar.setText("Total a Pagar: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTotalAPagar)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(53, 53, 53)
                .addComponent(lblTotalAPagar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.lblTotalAPagar.setText("Total a Pagar: ");
            double valorCompra = 0;
            valorCompra = Double.parseDouble(this.txtValorCompra.getText());
            if(valorCompra<=0){
                JOptionPane.showMessageDialog(this, "No puede haber valores negativos ni 0");
                this.txtValorCompra.setText("");
            }else if (valorCompra > 0 && valorCompra <=1000) {
                this.lblTotalAPagar.setText("Total a Pagar: "+ des.calcularDescuento(valorCompra, 4));
                this.txtValorCompra.setText("");
            }else{
                this.lblTotalAPagar.setText("Total a Pagar: "+ des.calcularDescuento(valorCompra, 10));
                this.txtValorCompra.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ingresa un valor correcto, por favor.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
