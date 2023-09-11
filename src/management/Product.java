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

public class Product extends javax.swing.JPanel {

    /**
     * Creates new form Customers
     */
    public Product() {
        initComponents();
        tb_load();
    }
    
    public void tb_load(){
    try{
        DefaultTableModel dt = (DefaultTableModel) Ptable.getModel();
        dt.setRowCount(0);
        Statement s = Bd.mycon().createStatement();
        ResultSet rs = s.executeQuery(" SELECT * FROM product ");
        while (rs.next()){
            Vector v = new Vector ();
            v.add(rs.getString(1));
            v.add(rs.getString(2));
            v.add(rs.getString(3));
            v.add(rs.getString(4));
            v.add(rs.getString(5));
            v.add(rs.getString(6));
            v.add(rs.getString(7));
            
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
        Pname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Bsave = new javax.swing.JButton();
        Bsearch = new javax.swing.JButton();
        Bupdate = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Pcb = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Pprice = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Pcategory = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Psup = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Pqty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ptable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Psid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Pst = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 237, 255));
        setPreferredSize(new java.awt.Dimension(763, 0));

        jPanel1.setBackground(new java.awt.Color(238, 237, 255));

        jPanel2.setBackground(new java.awt.Color(238, 237, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Pname.setBackground(new java.awt.Color(238, 237, 255));
        Pname.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pname.setForeground(new java.awt.Color(151, 153, 155));
        Pname.setText("Product name:");
        Pname.setToolTipText("");
        Pname.setBorder(null);
        Pname.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pname.setDragEnabled(true);
        Pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnameActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

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
        Bsearch.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/DellGhofrane/OneDrive/Documents/NetBeansProjects/Manegment/src/icone/icones/search%20(1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        Bsearch.setText("Search");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        Bupdate.setBackground(new java.awt.Color(182, 205, 232));
        Bupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bupdate.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/DellGhofrane/OneDrive/Documents/NetBeansProjects/Manegment/src/icone/icones/update%20(1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        Bupdate.setText("Update");
        Bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BupdateActionPerformed(evt);
            }
        });

        Bdelete.setBackground(new java.awt.Color(182, 205, 232));
        Bdelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bdelete.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/DellGhofrane/OneDrive/Documents/NetBeansProjects/Manegment/src/icone/icones/delete-folder%20(1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        Pcb.setBackground(new java.awt.Color(238, 237, 255));
        Pcb.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pcb.setForeground(new java.awt.Color(151, 153, 155));
        Pcb.setText("Bar code");
        Pcb.setToolTipText("");
        Pcb.setBorder(null);
        Pcb.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pcb.setDragEnabled(true);
        Pcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcbActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        Pprice.setBackground(new java.awt.Color(238, 237, 255));
        Pprice.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pprice.setForeground(new java.awt.Color(151, 153, 155));
        Pprice.setText("Price");
        Pprice.setToolTipText("");
        Pprice.setBorder(null);
        Pprice.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pprice.setDragEnabled(true);
        Pprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PpriceActionPerformed(evt);
            }
        });

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        Pcategory.setBackground(new java.awt.Color(238, 237, 255));
        Pcategory.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pcategory.setForeground(new java.awt.Color(151, 153, 155));
        Pcategory.setText("Qty:");
        Pcategory.setToolTipText("");
        Pcategory.setBorder(null);
        Pcategory.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pcategory.setDragEnabled(true);
        Pcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcategoryActionPerformed(evt);
            }
        });

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        Psup.setBackground(new java.awt.Color(238, 237, 255));
        Psup.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Psup.setForeground(new java.awt.Color(151, 153, 155));
        Psup.setText("Supplier ID:");
        Psup.setToolTipText("");
        Psup.setBorder(null);
        Psup.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Psup.setDragEnabled(true);
        Psup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsupActionPerformed(evt);
            }
        });

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        Pqty.setBackground(new java.awt.Color(238, 237, 255));
        Pqty.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pqty.setForeground(new java.awt.Color(151, 153, 155));
        Pqty.setText("Category:");
        Pqty.setToolTipText("");
        Pqty.setBorder(null);
        Pqty.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pqty.setDragEnabled(true);
        Pqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PqtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pqty, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Psup, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pprice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pcb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(Bsave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bsearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bupdate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Bdelete))
                        .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator6)
                        .addComponent(jSeparator7)
                        .addComponent(jSeparator8)
                        .addComponent(jSeparator9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Psup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsave)
                    .addComponent(Bsearch)
                    .addComponent(Bupdate)
                    .addComponent(Bdelete))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Pname.getAccessibleContext().setAccessibleName("");

        Ptable.setBackground(new java.awt.Color(238, 237, 255));
        Ptable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Product name", "Bar code", "Price", "Qty", "Category", "Supplier ID"
            }
        ));
        Ptable.setGridColor(new java.awt.Color(0, 0, 0));
        Ptable.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Ptable.setShowHorizontalLines(true);
        Ptable.setSurrendersFocusOnKeystroke(true);
        Ptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ptable);

        jPanel3.setBackground(new java.awt.Color(238, 237, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Product:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 3, 16), new java.awt.Color(85, 108, 150))); // NOI18N

        Psid.setBackground(new java.awt.Color(238, 237, 255));
        Psid.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Psid.setForeground(new java.awt.Color(151, 153, 155));
        Psid.setText("Search ID:");
        Psid.setToolTipText("");
        Psid.setBorder(null);
        Psid.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Psid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsidActionPerformed(evt);
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
                    .addComponent(Psid, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Psid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Pst.setBackground(new java.awt.Color(238, 237, 255));
        Pst.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        Pst.setForeground(new java.awt.Color(151, 153, 155));
        Pst.setToolTipText("");
        Pst.setBorder(null);
        Pst.setDisabledTextColor(new java.awt.Color(151, 153, 155));
        Pst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PstActionPerformed(evt);
            }
        });
        Pst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PstKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("file:/C:/Users/DellGhofrane/OneDrive/Documents/NetBeansProjects/Manegment/src/icone/icones/table%20(1).png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pst, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Pst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PstKeyReleased
        // search in table here :
        String name = Pst.getText();
        try{
            DefaultTableModel dt = (DefaultTableModel) Ptable.getModel();
            Statement s = Bd.mycon().createStatement();
            dt.setRowCount(0);
            ResultSet rs = s.executeQuery(" SELECT * FROM product WHERE Product_name LIKE '%"+name+"%'  ");
            while (rs.next()){
                Vector v = new Vector ();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                v.add(rs.getString(7));
                dt.addRow(v);
            }
        }catch (Exception e){
            tb_load();
        }
    }//GEN-LAST:event_PstKeyReleased

    private void PstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PstActionPerformed

    private void PsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsidActionPerformed

    private void PtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PtableMouseClicked
        // table here mouse clk :
        int r = Ptable.getSelectedRow();
        String id = Ptable.getValueAt(r,0).toString();
        String name = Ptable.getValueAt(r,1).toString();
        String barcode = Ptable.getValueAt(r,2).toString();
        String price = Ptable.getValueAt(r,3).toString();
        String category = Ptable.getValueAt(r,4).toString();
        String qty = Ptable.getValueAt(r,5).toString();
        String sid = Ptable.getValueAt(r,6).toString();

        Psid.setText(id);
        Pname.setText(name);
        Pcb.setText(barcode);
        Pprice.setText(price);
        Pcategory.setText(category);
        Pqty.setText(qty);
        Psup.setText(sid);

    }//GEN-LAST:event_PtableMouseClicked

    private void PqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PqtyActionPerformed

    private void PsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsupActionPerformed

    private void PcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PcategoryActionPerformed

    private void PpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PpriceActionPerformed

    private void PcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PcbActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        // Delete customer is here :
        String id = Psid.getText();
        try {
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" DELETE FROM product WHERE Pid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data deleted"));

        }catch (Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BupdateActionPerformed
        // Update customer is here:
        String name = Pname.getText();
        String bcode = Pcb.getText();
        String price = Pprice.getText();
        String category = Pcategory.getText();
        String qty = Pqty.getText();
        String sid = Psup.getText();
        String id = Psid.getText();

        try {

            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" UPDATE product SET Product_name = '"+name+"' , Bar_code = '"+bcode+"', Price = '"+price+"',Category = '"+category+"', Qty = '"+qty+"', SID = '"+sid+"' WHERE Pid = '"+id+"' ");
            JOptionPane.showMessageDialog(null,("Data updated"));
        }catch(Exception e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BupdateActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        // search id for customer:
        String search = Psid.getText();
        try{
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery(" SELECT * FROM product WHERE Pid = '"+search+"' ");

            if (rs.next()){
                Pname.setText(rs.getString("Product_name"));
                Pcb.setText(rs.getString("Bar_code"));
                Pprice.setText(rs.getString("Price"));
                Pcategory.setText(rs.getString("Category"));
                Pqty.setText(rs.getString("Qty"));
                Psup.setText(rs.getString("SID"));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BsearchActionPerformed

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        // Bsave here:
        String name = Pname.getText();
        String bcode = Pcb.getText();
        String price = Pprice.getText();
        String category = Pcategory.getText();
        String qty = Pqty.getText();
        String sid = Psup.getText();

        try{
            Statement s = Bd.mycon().createStatement();
            s.executeUpdate(" INSERT INTO product (Product_name,Bar_code,Price,Category,Qty,SID) VALUES ('"+name+"','"+bcode+"','"+price+"','"+category+"','"+qty+"','"+sid+"')");
            JOptionPane.showMessageDialog(null,("Data saved"));
        }catch(SQLException e ){
            System.out.println(e);
        }
        tb_load();
    }//GEN-LAST:event_BsaveActionPerformed

    private void PnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnameActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bsave;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton Bupdate;
    private javax.swing.JTextField Pcategory;
    private javax.swing.JTextField Pcb;
    private javax.swing.JTextField Pname;
    private javax.swing.JTextField Pprice;
    private javax.swing.JTextField Pqty;
    private javax.swing.JTextField Psid;
    private javax.swing.JTextField Pst;
    private javax.swing.JTextField Psup;
    private javax.swing.JTable Ptable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
