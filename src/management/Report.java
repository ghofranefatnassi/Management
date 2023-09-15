
package management;

import java.util.HashMap;


public class Report extends javax.swing.JPanel {

  
    public Report() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bar_inid = new javax.swing.JTextField();
        Bview = new javax.swing.JButton();
        Bview1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(238, 237, 255));

        jPanel2.setBackground(new java.awt.Color(238, 237, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(238, 237, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 108, 150));
        jLabel1.setText("INVOICE №:");

        bar_inid.setText("0");
        bar_inid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bar_inidActionPerformed(evt);
            }
        });

        Bview.setBackground(new java.awt.Color(182, 205, 232));
        Bview.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bview.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Management\\src\\icone\\icones\\search (2).png")); // NOI18N
        Bview.setText("View");
        Bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BviewActionPerformed(evt);
            }
        });

        Bview1.setBackground(new java.awt.Color(85, 108, 150));
        Bview1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Bview1.setForeground(new java.awt.Color(255, 255, 255));
        Bview1.setText("View All");
        Bview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bview1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bar_inid, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bview, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bview1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bar_inid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bview, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Bview1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bar_inidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bar_inidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bar_inidActionPerformed

    private void BviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BviewActionPerformed
        // view here :
        try{
         HashMap para = new HashMap();
        
        para.put("invo_para", bar_inid.getText());
        
        ReportView r =new ReportView("src\\Reports\\reportsearch.jasper", para);
        r.setVisible(true);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_BviewActionPerformed

    private void Bview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bview1ActionPerformed
        // View all here :
        
        
        try{
            
           ReportView r = new ReportView("src\\Reports\\inidreport.jasper");
            r.setVisible(true);
            
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_Bview1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bview;
    private javax.swing.JButton Bview1;
    private javax.swing.JTextField bar_inid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
