/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package management;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static management.Sale.cus_id;

/**
 *
 * @author DellGhofrane
 */
public class Grn extends javax.swing.JPanel {

    public Grn() {
        initComponents();
        data_load();
        cart_total();
        discount();
        nettot();
    }
    
    public void data_load(){
  
  // load customer
  
      try {
          
          Statement s= Bd.mycon().createStatement();
          
          ResultSet rs = s.executeQuery("SELECT * FROM supplier");
          Vector v = new Vector();
          
          while (rs.next()) {              
              v.add(rs.getString("Supplier_name"));
              
              DefaultComboBoxModel com = new DefaultComboBoxModel(v);
              Gsn.setModel(com);
               
          }
           
      } catch (SQLException e) {
            System.out.println(e);
      }
     
     // load Product
  
      try {
          
          Statement s= Bd.mycon().createStatement();
          
          ResultSet rs = s.executeQuery("SELECT * FROM product");
          Vector v = new Vector();
          
          while (rs.next()) {              
              v.add(rs.getString("Product_name"));
              
              DefaultComboBoxModel com = new DefaultComboBoxModel(v);
              Gpn.setModel(com);
               
          }
           
      } catch (SQLException e) {
            System.out.println(e);
      }  
      
      // load last invoice number
      
      try {
          
        Statement s = Bd.mycon().createStatement();
          ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE Exid =1");
          
          if (rs.next()) {
              
              Grnid.setText(rs.getString("Val"));
              
          }
          
      } catch (Exception e) {
      }
     
      // pluss new invoice

  }
    
    public void cart_total(){
 
 int numofrow = Tgrn.getRowCount();
 
    double total = 0;
    
     for (int i = 0; i < numofrow; i++) {
         
         double value = Double.valueOf(Tgrn.getValueAt(i, 7).toString());
         total += value ;
     }
    Gst.setText(Double.toString(total));
    }
    
    public void discount(){
                       try{
            
        Double dts_per = Double.valueOf(per.getText());
        Double dts_price = 0.0;
        Double TotBill = Double.valueOf(Gst.getText());
        
        dts_price = TotBill * dts_per / 100 ;
        Gd.setText(String.valueOf(dts_price));
        
        }catch(Exception e){
            System.out.println(e);
        }  
      nettot();
    }
    
    public void nettot(){
        Double st = Double.valueOf(Gst.getText());
        Double di = Double.valueOf(Gd.getText());
        Double tot = st-di;
      
        Gnt.setText(String.valueOf(tot));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Grnid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Gsn = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Gpn = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Gbc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Gqty = new javax.swing.JTextField();
        Gdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Gslp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Gcp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BaddT = new javax.swing.JButton();
        Gsid = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tgrn = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Gst = new javax.swing.JLabel();
        Gd = new javax.swing.JLabel();
        Gnt = new javax.swing.JLabel();
        per = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Gtq = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Br = new javax.swing.JButton();
        Brall = new javax.swing.JButton();
        Bsave = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(238, 237, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(238, 237, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(238, 237, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 108, 150));
        jLabel1.setText("GRN №:");

        Grnid.setBackground(new java.awt.Color(238, 237, 255));
        Grnid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Grnid.setForeground(new java.awt.Color(151, 153, 155));
        Grnid.setText("1");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(151, 153, 155));
        jLabel2.setText("Supplier name:");

        Gsn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select " }));
        Gsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GsnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(151, 153, 155));
        jLabel3.setText("Product name:");

        Gpn.setEditable(true);
        Gpn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select " }));
        Gpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GpnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(151, 153, 155));
        jLabel4.setText("Bar code :");

        Gbc.setText("000000000000");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(151, 153, 155));
        jLabel5.setText("Qty:");

        Gqty.setText("00");

        Gdate.setText("yyyy-mm-dd");
        Gdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(151, 153, 155));
        jLabel6.setText("Exp date:");

        Gslp.setText("00.00");
        Gslp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GslpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(151, 153, 155));
        jLabel7.setText("Sell price:");

        Gcp.setText("00.00");
        Gcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GcpActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(151, 153, 155));
        jLabel8.setText("Cost price:");

        BaddT.setBackground(new java.awt.Color(182, 205, 232));
        BaddT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BaddT.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Management\\src\\icone\\icones\\add.png")); // NOI18N
        BaddT.setText("Add to Table");
        BaddT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddTActionPerformed(evt);
            }
        });

        Gsid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Gsid.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Grnid, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Gsn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gsid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Gpn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Gdate)
                    .addComponent(Gqty, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Gcp)
                    .addComponent(Gslp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(BaddT)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Grnid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Gsid)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(Gcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Gqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Gbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Gpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(Gdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(Gslp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addComponent(BaddT, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(74, 74, 74))
        );

        jPanel3.setBackground(new java.awt.Color(238, 237, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Tgrn.setAutoCreateRowSorter(true);
        Tgrn.setBackground(new java.awt.Color(238, 237, 255));
        Tgrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRNID", "Bar code", "Name", "Qty", "Cost price", "Exp date", "Sell price", "Total  price"
            }
        ));
        Tgrn.setGridColor(new java.awt.Color(0, 0, 0));
        Tgrn.setShowGrid(true);
        Tgrn.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(Tgrn);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(238, 237, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setBackground(new java.awt.Color(238, 237, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(151, 153, 155));
        jLabel9.setText("SUB TOTAL:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(151, 153, 155));
        jLabel10.setText("DISCOUNT ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(151, 153, 155));
        jLabel11.setText("NET TOTAL:");

        Gst.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Gst.setText("00.00");

        Gd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Gd.setText("00.00");

        Gnt.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Gnt.setText("00.00");
        Gnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GntKeyReleased(evt);
            }
        });

        per.setBackground(new java.awt.Color(238, 237, 255));
        per.setText("0");
        per.setBorder(null);
        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });
        per.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                perKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(237, 238, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(151, 153, 155));
        jLabel13.setText("%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Gst))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gnt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Gd, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(71, 71, 71))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Gst))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Gd)
                    .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Gnt))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Gtq.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Gtq.setText("00.00");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(151, 153, 155));
        jLabel12.setText("TOTAL QTY:");

        Br.setBackground(new java.awt.Color(182, 205, 232));
        Br.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Br.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Management\\src\\icone\\icones\\minus.png")); // NOI18N
        Br.setText("Remove");
        Br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrActionPerformed(evt);
            }
        });

        Brall.setBackground(new java.awt.Color(182, 205, 232));
        Brall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Brall.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Management\\src\\icone\\icones\\close (1).png")); // NOI18N
        Brall.setText(" Remove all ");
        Brall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrallActionPerformed(evt);
            }
        });

        Bsave.setBackground(new java.awt.Color(182, 205, 232));
        Bsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Bsave.setIcon(new javax.swing.ImageIcon("C:\\Users\\DellGhofrane\\OneDrive\\Documents\\NetBeansProjects\\Management\\src\\icone\\icones\\download.png")); // NOI18N
        Bsave.setText("Save");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Br, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Brall)
                .addGap(87, 87, 87)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gtq)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gtq)
                    .addComponent(jLabel12)
                    .addComponent(Brall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Br, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GpnActionPerformed
        
        String  name =Gpn.getSelectedItem().toString();
        try {
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Bar_code,Cost_price,Price,Qty FROM product  WHERE Product_Name ='"+name+"'  ");
            if (rs.next()) {
                 
               
                Gslp.setText(rs.getString("Price"));
                Gbc.setText(rs.getString("Bar_code"));
                Gcp.setText(rs.getString("Cost_price"));
                Gqty.setText(rs.getString("Qty"));
                
            }
        
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_GpnActionPerformed

    private void GdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GdateActionPerformed

    private void GslpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GslpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GslpActionPerformed

    private void GcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GcpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GcpActionPerformed

    private void BrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrActionPerformed
             try{
            DefaultTableModel dt = (DefaultTableModel) Tgrn.getModel();
            int rw = Tgrn.getSelectedRow();
            dt.removeRow(rw);
            
            cart_total();
            discount();
            nettot();
        }catch (Exception e){
            
        }

    }//GEN-LAST:event_BrActionPerformed

    private void BaddTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddTActionPerformed
        
        Double qty = Double.valueOf(Gqty.getText());
        Double prc = Double.valueOf(Gcp.getText());
        Double sum = qty*prc;
        
        DefaultTableModel dt = (DefaultTableModel) Tgrn.getModel();
        
        Vector v = new Vector();
        
        v.add(Grnid.getText()); // grn id
        v.add(Gbc.getText()); // barcode
        v.add(Gpn.getSelectedItem().toString()); // product name
        v.add(Gqty.getText()); // p qyt
        v.add(Gcp.getText()); // Cost price
        v.add(Gdate.getText()); // exp date 
        v.add(Gslp.getText()); // sell price 
        v.add(sum);//total price
        
        dt.addRow(v);
        cart_total();
        discount();
        nettot();
    }//GEN-LAST:event_BaddTActionPerformed

    private void BrallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrallActionPerformed
        DefaultTableModel dt = (DefaultTableModel) Tgrn.getModel();
        dt.setRowCount(0);
        cart_total();
        discount();
        nettot();
    }//GEN-LAST:event_BrallActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
        // discount here 
        
    }//GEN-LAST:event_perActionPerformed

    private void perKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_perKeyReleased
        discount();
    }//GEN-LAST:event_perKeyReleased

    private void GntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GntKeyReleased
       nettot();
    }//GEN-LAST:event_GntKeyReleased

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
  try{
           
            DefaultTableModel dt = (DefaultTableModel) Tgrn.getModel();
            int rc = dt.getRowCount();
            
            for (int i =0; i < rc ; i++){
                
                String grnid = dt.getValueAt(i, 0).toString();
                String bar_code = dt.getValueAt(i, 1).toString();
                String P_name = dt.getValueAt(i, 2).toString();
                String qty = dt.getValueAt(i, 3).toString();
                String cost_price = dt.getValueAt(i, 4).toString();
                String date =dt.getValueAt(i, 5).toString();
                String sell_price = dt.getValueAt(i, 6).toString();
                String tot_price = dt.getValueAt(i, 7).toString();
                String sub = Gst.getText();
                String dis = Gd.getText();
                String net = Gnt.getText();
                String sid = Gsid.getText();
                
                Statement s = Bd.mycon().createStatement();
                s.executeUpdate(" INSERT INTO grn ( Grn_no,sid ,Bar_code,Item_name, GQty, Cost_price, Exp_date,Sell_price , Sub_tot , Discount , Net_tot) VALUES ('"+grnid+"','"+sid+"','"+bar_code+"','"+P_name+"','"+qty+"','"+cost_price+"','"+date+"','"+sell_price+"','"+sub+"','"+dis+"','"+net+"')  ");
            
            }
            JOptionPane.showMessageDialog(null, "Data saved");
        }catch( HeadlessException | SQLException e ){
            System.out.println(e);
        }
        int i = Integer.valueOf(Grnid.getText());
      i++;
      Grnid.setText(String.valueOf(i));
    
    }//GEN-LAST:event_BsaveActionPerformed

    private void GsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GsnActionPerformed
        
        String  name =Gsn.getSelectedItem().toString();
        try {
            
            Statement s = Bd.mycon().createStatement();
            ResultSet rs = s.executeQuery("SELECT Sid FROM supplier  WHERE Supplier_name ='"+name+"'  ");
            if (rs.next()) {
                 
               
                Gsid.setText(rs.getString("Sid"));
                
            }
        
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_GsnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaddT;
    private javax.swing.JButton Br;
    private javax.swing.JButton Brall;
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField Gbc;
    private javax.swing.JTextField Gcp;
    private javax.swing.JLabel Gd;
    private javax.swing.JTextField Gdate;
    private javax.swing.JLabel Gnt;
    private javax.swing.JComboBox<String> Gpn;
    private javax.swing.JTextField Gqty;
    private javax.swing.JLabel Grnid;
    private javax.swing.JLabel Gsid;
    private javax.swing.JTextField Gslp;
    private javax.swing.JComboBox<String> Gsn;
    private javax.swing.JLabel Gst;
    private javax.swing.JLabel Gtq;
    private javax.swing.JTable Tgrn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField per;
    // End of variables declaration//GEN-END:variables
}
