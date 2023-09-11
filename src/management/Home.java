/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package management;

public class Home extends javax.swing.JFrame {
    
    JpanelLoader jpload = new JpanelLoader ();


    public Home() {
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGhome = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        TBsales = new javax.swing.JToggleButton();
        TBcustomers = new javax.swing.JToggleButton();
        TBinvoice = new javax.swing.JToggleButton();
        TBsupplier = new javax.swing.JToggleButton();
        TBproduct = new javax.swing.JToggleButton();
        TBpruchase = new javax.swing.JToggleButton();
        TBbill = new javax.swing.JToggleButton();
        TBreturns = new javax.swing.JToggleButton();
        TBaccount = new javax.swing.JToggleButton();
        TBemployee = new javax.swing.JToggleButton();
        TBreports = new javax.swing.JToggleButton();
        panel_load = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(182, 205, 232));

        TBsales.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBsales);
        TBsales.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBsales.setForeground(new java.awt.Color(255, 255, 255));
        TBsales.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\panier.png")); // NOI18N
        TBsales.setText("Sales            ");
        TBsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsalesActionPerformed(evt);
            }
        });

        TBcustomers.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBcustomers);
        TBcustomers.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBcustomers.setForeground(new java.awt.Color(255, 255, 255));
        TBcustomers.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\client.png")); // NOI18N
        TBcustomers.setText("Customers ");
        TBcustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBcustomersActionPerformed(evt);
            }
        });

        TBinvoice.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBinvoice);
        TBinvoice.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBinvoice.setForeground(new java.awt.Color(255, 255, 255));
        TBinvoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\noter.png")); // NOI18N
        TBinvoice.setText("Invoice      ");
        TBinvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBinvoiceActionPerformed(evt);
            }
        });

        TBsupplier.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBsupplier);
        TBsupplier.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBsupplier.setForeground(new java.awt.Color(255, 255, 255));
        TBsupplier.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\fournisseur.png")); // NOI18N
        TBsupplier.setText("Supplier    ");
        TBsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsupplierActionPerformed(evt);
            }
        });

        TBproduct.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBproduct);
        TBproduct.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBproduct.setForeground(new java.awt.Color(255, 255, 255));
        TBproduct.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\produit.png")); // NOI18N
        TBproduct.setText("Product    ");
        TBproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBproductActionPerformed(evt);
            }
        });

        TBpruchase.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBpruchase);
        TBpruchase.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBpruchase.setForeground(new java.awt.Color(255, 255, 255));
        TBpruchase.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\habitudes-dachat.png")); // NOI18N
        TBpruchase.setText("Purchase  ");
        TBpruchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBpruchaseActionPerformed(evt);
            }
        });

        TBbill.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBbill);
        TBbill.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBbill.setForeground(new java.awt.Color(255, 255, 255));
        TBbill.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\facture-dachat.png")); // NOI18N
        TBbill.setText("Bill         ");
        TBbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBbillActionPerformed(evt);
            }
        });

        TBreturns.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBreturns);
        TBreturns.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBreturns.setForeground(new java.awt.Color(255, 255, 255));
        TBreturns.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\boite-de-retour.png")); // NOI18N
        TBreturns.setText("Return's");
        TBreturns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBreturnsActionPerformed(evt);
            }
        });

        TBaccount.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBaccount);
        TBaccount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBaccount.setForeground(new java.awt.Color(255, 255, 255));
        TBaccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\banque.png")); // NOI18N
        TBaccount.setText("Account   ");
        TBaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBaccountActionPerformed(evt);
            }
        });

        TBemployee.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBemployee);
        TBemployee.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBemployee.setForeground(new java.awt.Color(255, 255, 255));
        TBemployee.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\employe.png")); // NOI18N
        TBemployee.setText("Employee");
        TBemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBemployeeActionPerformed(evt);
            }
        });

        TBreports.setBackground(new java.awt.Color(85, 108, 150));
        BGhome.add(TBreports);
        TBreports.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        TBreports.setForeground(new java.awt.Color(255, 255, 255));
        TBreports.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\signaler.png")); // NOI18N
        TBreports.setText("Reports  ");
        TBreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBreportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TBreturns, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBbill, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBpruchase, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBsales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TBcustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TBinvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TBsupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TBaccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TBemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TBreports, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TBaccount, TBbill, TBcustomers, TBemployee, TBinvoice, TBproduct, TBpruchase, TBreports, TBreturns, TBsales, TBsupplier});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(TBsales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBcustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBinvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBpruchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBbill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBreturns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TBreports, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TBaccount, TBbill, TBcustomers, TBemployee, TBinvoice, TBproduct, TBpruchase, TBreports, TBreturns, TBsales, TBsupplier});

        panel_load.setBackground(new java.awt.Color(238, 237, 255));

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(85, 108, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsalesActionPerformed
        // Sale load:
                Sale sal = new Sale ();
        
        jpload.jPanelLoader(panel_load, sal);
    }//GEN-LAST:event_TBsalesActionPerformed

    private void TBcustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBcustomersActionPerformed
        // Customer load
        Customer cus = new Customer ();
        
        jpload.jPanelLoader(panel_load, cus);
        
        
        
        
    }//GEN-LAST:event_TBcustomersActionPerformed

    
    private void TBinvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBinvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBinvoiceActionPerformed

    
    
    private void TBsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsupplierActionPerformed
        // supplier load
                Supplier sp = new Supplier ();
        jpload.jPanelLoader(panel_load, sp);

    }//GEN-LAST:event_TBsupplierActionPerformed

    
    
    private void TBproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBproductActionPerformed
        // produit load
       Product pro = new Product();
       jpload.jPanelLoader(panel_load, pro);
    }//GEN-LAST:event_TBproductActionPerformed

    
    
    private void TBpruchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBpruchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBpruchaseActionPerformed

    private void TBbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBbillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBbillActionPerformed

    private void TBreturnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBreturnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBreturnsActionPerformed

    private void TBaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBaccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBaccountActionPerformed

    
    private void TBemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBemployeeActionPerformed
        // employee load
        Employee emp = new Employee();
        jpload.jPanelLoader(panel_load, emp);
    }//GEN-LAST:event_TBemployeeActionPerformed

    
    private void TBreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBreportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBreportsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGhome;
    private javax.swing.JToggleButton TBaccount;
    private javax.swing.JToggleButton TBbill;
    private javax.swing.JToggleButton TBcustomers;
    private javax.swing.JToggleButton TBemployee;
    private javax.swing.JToggleButton TBinvoice;
    private javax.swing.JToggleButton TBproduct;
    private javax.swing.JToggleButton TBpruchase;
    private javax.swing.JToggleButton TBreports;
    private javax.swing.JToggleButton TBreturns;
    private javax.swing.JToggleButton TBsales;
    private javax.swing.JToggleButton TBsupplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panel_load;
    // End of variables declaration//GEN-END:variables
}
