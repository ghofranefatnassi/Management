/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package management;

/**
 *
 * @author DellGhofrane
 */
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JPanel {

    /**
     * Creates new form Customers
     */
    public Customer() {
        initComponents();
        tb_load();
    }
    
    public void tb_load(){
    try{
        DefaultTableModel dt = (DefaultTableModel) Ctable.getModel();
        dt.setRowCount(0);
        Statement s = Bd.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT * FROM customer ");
        while (rs.next()){
            Vector v = new Vector ();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            
            dt.addRow(v);
        }
        
    
    } catch(Exception e){
    System.out.println(e);
     }
    }


    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Cname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Ctpn = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Bsave = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ctable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Csid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Cst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 237, 255));
        setPreferredSize(new java.awt.Dimension(763, 0));

        jPanel1.setBackground(new java.awt.Color(238, 237, 255));

        jPanel2.setBackground(new java.awt.Color(238, 237, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Cname.setBackground(new java.awt.Color(238, 237, 255));
        Cname.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Cname.setForeground(new java.awt.Color(151, 153, 155));
        Cname.setText("Name:");
        Cname.setToolTipText("");
        Cname.setBorder(null);
        Cname.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Cname.setDragEnabled(true);
        Cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        Ctpn.setBackground(new java.awt.Color(238, 237, 255));
        Ctpn.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Ctpn.setForeground(new java.awt.Color(151, 153, 155));
        Ctpn.setText("T.P Number:");
        Ctpn.setToolTipText("");
        Ctpn.setBorder(null);
        Ctpn.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Ctpn.setDragEnabled(true);
        Ctpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtpnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Bsave.setBackground(new java.awt.Color(182, 205, 232));
        Bsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\floppy-disk (1).png")); // NOI18N
        Bsave.setText("Save");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        Bsearch.setBackground(new java.awt.Color(182, 205, 232));
        Bsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\search (1).png")); // NOI18N
        Bsearch.setText("Search");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        Bupdate.setBackground(new java.awt.Color(182, 205, 232));
        Bupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\update (1).png")); // NOI18N
        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        Bdelete.setBackground(new java.awt.Color(182, 205, 232));
        Bdelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bdelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\delete-folder (1).png")); // NOI18N
        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bdelete))
                    .addComponent(Ctpn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ctpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsave)
                    .addComponent(Bsearch)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Cname.getAccessibleContext().setAccessibleName("");

        Ctable.setBackground(new java.awt.Color(238, 237, 255));
        Ctable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ctable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Customer name", "T.P Number"
            }
        ));
        Ctable.setGridColor(new java.awt.Color(0, 0, 0));
        Ctable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Ctable.setShowHorizontalLines(true);
        Ctable.setSurrendersFocusOnKeystroke(true);
        Ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ctable);

        jPanel3.setBackground(new java.awt.Color(238, 237, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Customer information:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(85, 108, 150))); // NOI18N

        Csid.setBackground(new java.awt.Color(238, 237, 255));
        Csid.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Csid.setForeground(new java.awt.Color(151, 153, 155));
        Csid.setText("Search ID:");
        Csid.setToolTipText("");
        Csid.setBorder(null);
        Csid.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Csid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsidActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Csid, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(Csid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Cst.setBackground(new java.awt.Color(238, 237, 255));
        Cst.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        Cst.setForeground(new java.awt.Color(151, 153, 155));
        Cst.setBorder(null);
        Cst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CstActionPerformed(evt);
            }
        });
        Cst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CstKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Manegment\\src\\icone\\icones\\table (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cst, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 82, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // Delete customer is here :
        String id = Csid.getText();
        try {
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" DELETE FROM customer WHERE Cid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data deleted"));
            
        }catch (Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BdeleteActionPerformed

    private void CtpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtpnActionPerformed

    private void CnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameActionPerformed

    
    
    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // Bsave here:
        String name = Cname.getText();
        String tp = Ctpn.getText();
         try{
             Statement s = Bd.mycon().createStatement();
             s.executeUpdate(" INSERT INTO Customer (Customer_name,Tp_Number) VALUES ('"+name+"','"+tp+"')");
             JOptionPane.showMessageDialog(null,("Data saved"));
         }catch(SQLException e ){
             System.out.println(e);
         }
         tb_load();
    }//GEN-LAST:event_BsaveActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // search id for customer:
        String search = Csid.getText();
        try{
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE Cid = '"+search+"' ");
            
            if (rs.next()){
                Cname.setText(rs.getString("Customer_name"));
                Ctpn.setText(rs.getString("Tp_Number"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BsearchActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // Update customer is here:
        String name = Cname.getText();
        String tp = Ctpn.getText();
        String id = Csid.getText();
        
        try {
            
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE customer SET Customer_name = '"+name+"' , Tp_Number = '"+tp+"' WHERE Cid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BupdateActionPerformed

    private void CtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CtableMouseClicked
        // table here mouse clk :
        int r = Ctable.getSelectedRow();
         String id = Ctable.getValueAt(r,0).toString();
         String name = Ctable.getValueAt(r,1).toString();
         String tp = Ctable.getValueAt(r,2).toString();
         
         Csid.setText(id);
         Cname.setText(name);
         Ctpn.setText(tp);
        
    }//GEN-LAST:event_CtableMouseClicked

    private void CstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CstActionPerformed

    private void CstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CstKeyReleased
        // search table:
        String name = Cst.getText();
        try {
            DefaultTableModel dt = (DefaultTableModel) Ctable.getModel(); 
            dt.setRowCount(0);
            Statement s= Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE Customer_name LIKE '%"+name+"%' ");
            while(rs.next()){
                Vector v = new Vector ();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                
                dt.addRow(v);
            }
            
            
        }catch (Exception e){
            tb_load();
        }
        
    }//GEN-LAST:event_CstKeyReleased

    private void CsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CsidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Cname;
    private javax.swing.JTextField Csid;
    private javax.swing.JTextField Cst;
    private javax.swing.JTable Ctable;
    private javax.swing.JTextField Ctpn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
