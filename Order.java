/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programdata;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement; 
import javax.swing.JOptionPane; 


/**
 *
 * @author User
 */
public class Order extends javax.swing.JFrame {
    Connection con =null;    
    Statement st = null; 

    /**
     * Creates new form Order
     */
    public Order() {
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
        Total = new javax.swing.JTextField();
        CoffeeBeans = new javax.swing.JComboBox<>();
        RoastLevel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        Nett = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        AddtoList = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Sub = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ClearOrder = new javax.swing.JButton();
        Checkout = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Receipt = new javax.swing.JTextArea();
        Calculate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        NextOrder = new javax.swing.JButton();
        UsernameOrder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Total.setEditable(false);
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 180, 40));

        CoffeeBeans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee", "American Geisha", "Brazil Primavera", "Cameron's", "Caribou", "Death Wish", "Devoción Toro", "Don Pablo", "Ethiopian Yirgacheffe", "Four Sigmatic", "Hawaiian Kona", "Jamaican Blue Mountain", "Kenyan AA", "Lavazza", "Monsooned Malabar", "San Fermin", "Stone Street", "Sumatran Mandheling", "Tanzanian Peaberry", "Toraja Sapan", "White Star" }));
        CoffeeBeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeBeansActionPerformed(evt);
            }
        });
        jPanel1.add(CoffeeBeans, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 30));

        RoastLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roast", "Light", "Light-Medium", "Medium", "Medium-Dark", "Dark" }));
        RoastLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoastLevelActionPerformed(evt);
            }
        });
        jPanel1.add(RoastLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 30));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 100, 20));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel3.setText("Roast level");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, 20));

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel4.setText("nett (gram)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 20));

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel5.setText("qty");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 100, 20));

        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 100, 30));

        Nett.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nett", "100", "250", "1000" }));
        Nett.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NettActionPerformed(evt);
            }
        });
        jPanel1.add(Nett, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 30));

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel6.setText("Price/unit");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, 20));

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel7.setText("Coffee Beans");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));

        Price.setEditable(false);
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel1.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 100, 30));

        Clear.setBackground(new java.awt.Color(255, 255, 255));
        Clear.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        Clear.setText("x");
        Clear.setMargin(new java.awt.Insets(2, 2, 2, 2));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 40, 30));

        AddtoList.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        AddtoList.setText("Add to List");
        AddtoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoListActionPerformed(evt);
            }
        });
        jPanel1.add(AddtoList, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 160, 30));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 10)); // NOI18N
        jLabel8.setText("*tax included");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 80, 20));

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel10.setText("Receipt");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 70, 20));

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel11.setText("subtotal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 100, 20));

        Sub.setEditable(false);
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });
        jPanel1.add(Sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 100, 30));

        jLabel12.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel12.setText("ORDER LIST");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 20));

        ClearOrder.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        ClearOrder.setText("x");
        ClearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearOrderActionPerformed(evt);
            }
        });
        jPanel1.add(ClearOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, 40));

        Checkout.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        Checkout.setText("Checkout");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });
        jPanel1.add(Checkout, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 120, 30));

        Receipt.setEditable(false);
        Receipt.setColumns(20);
        Receipt.setRows(5);
        jScrollPane3.setViewportView(Receipt);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 250, 320));

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        jPanel1.add(Calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coffee Beans", "Roast Level", "Nett (gram)", "Quantity", "Price", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTable.setSelectionBackground(new java.awt.Color(255, 255, 204));
        OrderTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        OrderTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        OrderTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(OrderTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 550, 140));

        NextOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NextOrder.setText("Reset");
        NextOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextOrderActionPerformed(evt);
            }
        });
        jPanel1.add(NextOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 90, 40));

        UsernameOrder.setEditable(false);
        UsernameOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameOrderActionPerformed(evt);
            }
        });
        jPanel1.add(UsernameOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Webp.net-resizeimage (3).jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 250));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Webp.net-resizeimage (5).jpg")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void CoffeeBeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeBeansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoffeeBeansActionPerformed

    private void RoastLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoastLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoastLevelActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void NettActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NettActionPerformed
        // TODO add your handling code here:
        if (Nett.getSelectedItem().equals("100"))
        {
            Price.setText("66000");
        }

        else if (Nett.getSelectedItem().equals("250"))
        {
            Price.setText("220000");
        }

        else if (Nett.getSelectedItem().equals("1000"))
        {
            Price.setText("770000");
        }

        else if (Nett.getSelectedItem().equals("Nett"))
        {
            Price.setText(null);
        }
    }//GEN-LAST:event_NettActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        CoffeeBeans.setSelectedItem("Coffee");
        RoastLevel.setSelectedItem("Roast");
        Nett.setSelectedItem("Nett");
        Quantity.setText(null);
        Sub.setText(null);
    }//GEN-LAST:event_ClearActionPerformed

    private void AddtoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoListActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) OrderTable.getModel();
        model.addRow(new Object[]{CoffeeBeans.getSelectedItem(),RoastLevel.getSelectedItem(),Nett.getSelectedItem(),Quantity.getText(),Sub.getText(),UsernameOrder.getText()
        });

        int sum = 0;

        for(int a=0; a<OrderTable.getRowCount(); a++)
        {
            sum = sum + Integer.parseInt(OrderTable.getValueAt(a, 4).toString());

        }

        Total.setText(Integer.toString(sum));

        CoffeeBeans.setSelectedItem("Coffee");
        RoastLevel.setSelectedItem("Roast");
        Nett.setSelectedItem("Nett");
        Quantity.setText(null);
        Sub.setText(null);

    }//GEN-LAST:event_AddtoListActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubActionPerformed

    private void ClearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearOrderActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) OrderTable.getModel();
        model.removeRow(OrderTable.getSelectedRow());

        int sum = 0;

        for(int a=0; a<OrderTable.getRowCount(); a++)
        {
            sum = sum + Integer.parseInt(OrderTable.getValueAt(a, 4).toString());

        }

        Total.setText(Integer.toString(sum));
    }//GEN-LAST:event_ClearOrderActionPerformed

    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        // TODO add your handling code here:
        Date obj = new Date();

        String date = obj.toString();

        Receipt.setText(Receipt.getText()+"---------------------------------------------------\n");
        Receipt.setText(Receipt.getText()+"                LaCasa | de | Café                 \n");
        Receipt.setText(Receipt.getText()+"---------------------------------------------------\n");
        Receipt.setText(Receipt.getText()+"\n"+date+"\n\n");
        

        int row1 = 0;
        int row2 = 0;

        for (int i=row1; i>=row2; i++)

        for (int j=0; j<OrderTable.getColumnCount(); j++)

        Receipt.append("\n-------------------------------------------------\n" +
            "\nCoffee Beans:\t" + OrderTable.getValueAt(j, 0) +
            "\nRoast Level:\t" + OrderTable.getValueAt(j, 1) +
            "\nNett (gram):\t" + OrderTable.getValueAt(j, 2) +
            "\nQuantity:\t" + OrderTable.getValueAt(j, 3) +
            "\nPrice:\t" + OrderTable.getValueAt(j, 4) 

        );

        Receipt.setText(Receipt.getText()+"---------------------------------------------------\t");
        Receipt.setText(Receipt.getText()+"\nTotal Price\t\n" + Total.getText() );
        Receipt.setText(Receipt.getText()+"---------------------------------------------------\t");
        Receipt.setText(Receipt.getText()+"                    Bella Ciao                     \t");

    }//GEN-LAST:event_CheckoutActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        // TODO add your handling code here:
        int one=Integer.parseInt(Quantity.getText());
        int two=Integer.parseInt(Price.getText());

        String answer=String.valueOf(one*two);
        Sub.setText(answer);
    }//GEN-LAST:event_CalculateActionPerformed

    private void NextOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextOrderActionPerformed
        // TODO add your handling code here:
        OrderTable.setModel(new DefaultTableModel(null, new String[]{"Coffee Beans","Roast Level","Nett (gram)","Quantity","Price"}));
        CoffeeBeans.setSelectedItem("Coffee");
        RoastLevel.setSelectedItem("Roast");
        Nett.setSelectedItem("Nett");
        Quantity.setText(null);
        Sub.setText(null);
        Total.setText(null);
        Receipt.setText(null);

    }//GEN-LAST:event_NextOrderActionPerformed

    private void UsernameOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameOrderActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_UsernameOrderActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtoList;
    private javax.swing.JButton Calculate;
    private javax.swing.JButton Checkout;
    private javax.swing.JButton Clear;
    private javax.swing.JButton ClearOrder;
    private javax.swing.JComboBox<String> CoffeeBeans;
    private javax.swing.JComboBox<String> Nett;
    private javax.swing.JButton NextOrder;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextArea Receipt;
    private javax.swing.JComboBox<String> RoastLevel;
    private javax.swing.JTextField Sub;
    private javax.swing.JTextField Total;
    public static javax.swing.JTextField UsernameOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
