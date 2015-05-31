/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ub.prog2.DempereGuillermoGerman.vista.forms;

import edu.ub.prog2.DempereGuillermoGerman.controlador.CtrlVisor;
import edu.ub.prog2.DempereGuillermoGerman.model.Imatge;
import edu.ub.prog2.DempereGuillermoGerman.model.ImatgeBN;
import edu.ub.prog2.DempereGuillermoGerman.model.ImatgeSepia;
import edu.ub.prog2.utils.ImageList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Akira
 */
public class FormEditImage extends javax.swing.JFrame {

    private CtrlVisor ctrl;
    private Imatge image;
    private ImageList list;
    /**
     * If true, the image filter has been altered
     */
    private boolean dirtyImage = false;

    /**
     * Creates new form FrmAfegirImatge
     */
    public FormEditImage(Imatge image, ImageList list, CtrlVisor ctrl) {
	this.image = image;
	this.ctrl = ctrl;
	this.list = list;
	initComponents();

	// Set text field to title
	jTextImageTitle.setText(image.getTitle());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jImageFiltersGroup = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jTextImageTitle = new javax.swing.JTextField();
        jAccept = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jLabelFilter = new javax.swing.JLabel();
        jNormalFilter = new javax.swing.JRadioButton();
        jSepiaFilter = new javax.swing.JRadioButton();
        jBWFilter = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Imatge");
        setName("jAddImageFrame"); // NOI18N
        setResizable(false);

        jLabelTitle.setText("Titol de la Imatge:");

        jAccept.setText("Acceptar");
        jAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcceptActionPerformed(evt);
            }
        });

        jCancel.setText("Cancelar");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jLabelFilter.setText("Filtre:");

        jImageFiltersGroup.add(jNormalFilter);
        jNormalFilter.setSelected(true);
        jNormalFilter.setText("Sense canvi");

        jImageFiltersGroup.add(jSepiaFilter);
        jSepiaFilter.setText("Sèpia");

        jImageFiltersGroup.add(jBWFilter);
        jBWFilter.setText("Blanc i Negre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jAccept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle)
                            .addComponent(jLabelFilter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextImageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNormalFilter)
                            .addComponent(jBWFilter)
                            .addComponent(jSepiaFilter))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextImageTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilter)
                    .addComponent(jNormalFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBWFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSepiaFilter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCancel)
                    .addComponent(jAccept))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(270, 186));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
	this.dispose();
    }//GEN-LAST:event_jCancelActionPerformed

    private void jAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcceptActionPerformed
	if (jTextImageTitle.getText().length() > 0)
	    image.setTitle(jTextImageTitle.getText());

	if (jSepiaFilter.isSelected())
	    ctrl.transformImageFromList(image, list, Imatge.Type.SEPIA);
	else if (jBWFilter.isSelected())
	    ctrl.transformImageFromList(image, list, Imatge.Type.BLACKNWHITE);

	this.dispose();
    }//GEN-LAST:event_jAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAccept;
    private javax.swing.JRadioButton jBWFilter;
    private javax.swing.JButton jCancel;
    private javax.swing.ButtonGroup jImageFiltersGroup;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JRadioButton jNormalFilter;
    private javax.swing.JRadioButton jSepiaFilter;
    private javax.swing.JTextField jTextImageTitle;
    // End of variables declaration//GEN-END:variables
}
