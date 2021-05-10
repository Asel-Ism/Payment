package payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;  
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class Piecepre extends javax.swing.JFrame {


    public Piecepre() {
        initComponents();
    }

    menunav mn = new menunav();
    Connection conn = null;
    CallableStatement stored_pro = null;
    Statement statement = null;
    ResultSet rs = null;
    
    private void UpdateJTable(){
        try{
            conn = ConnectMsSql.ConnectDB();
            String sql = "SELECT id, employeeid, numberofproducts, norm, priceperunit, priceperover, leadtime, totalamount FROM [dbo].[Payment] where typeofwork=3;";
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);
            this.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        templid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tnumprod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tpriceun = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tleadt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tsum = new javax.swing.JTextField();
        jBtnDelete = new javax.swing.JButton();
        jBtnUpdate = new javax.swing.JButton();
        jBtnInsert = new javax.swing.JButton();
        bcalc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tnorm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tpriceov = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "employeeid", "numberofproducts", "norm", "priceperunit", "priceperover", "leadtime", "totalamount"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(12);
        }

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setText("Сдельно премиальная оплата");

        jLabel2.setText("id");

        jLabel3.setText("id сотрудника");

        templid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                templidActionPerformed(evt);
            }
        });

        jLabel4.setText("кол-во продукта");

        tnumprod.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tnumprodCaretUpdate(evt);
            }
        });

        jLabel5.setText("цена за единицу");

        tpriceun.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tpriceunCaretUpdate(evt);
            }
        });

        jLabel6.setText("Дни выполнения");

        tleadt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tleadtActionPerformed(evt);
            }
        });

        jLabel7.setText("Сумма");

        jBtnDelete.setText("Удалить");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnUpdate.setText("Редактировать");
        jBtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpdateActionPerformed(evt);
            }
        });

        jBtnInsert.setText("Вставить");
        jBtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertActionPerformed(evt);
            }
        });

        bcalc.setText("Рассчитать сумму");
        bcalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcalcActionPerformed(evt);
            }
        });

        jLabel8.setText("норма");

        jLabel9.setText("цена сверх нормы");

        jMenu3.setText("Навигация");

        jMenu1.setText("Отчеты");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Аккордная");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Сдельная");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Сдельно премиальная");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Вся оплата");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu3.add(jMenu1);

        jMenuItem4.setText("Сотрудники");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnDelete)
                        .addGap(37, 37, 37)
                        .addComponent(jBtnUpdate)
                        .addGap(44, 44, 44)
                        .addComponent(jBtnInsert)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(templid, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(tnumprod)
                                            .addComponent(tnorm)
                                            .addComponent(tpriceun)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tleadt)
                                            .addComponent(tsum)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tpriceov, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bcalc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(378, 378, 378))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDelete)
                    .addComponent(jBtnUpdate)
                    .addComponent(jBtnInsert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(templid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tnumprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tnorm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tpriceun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tpriceov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tleadt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bcalc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        try{
            conn= ConnectMsSql.ConnectDB();
            int row = jTable1.getSelectedRow();
            String id = (jTable1.getModel().getValueAt(row,0).toString());
            String query = "select id, employeeid, numberofproducts, norm, priceperunit, priceperover, leadtime, totalamount from Payment where id='"+id+"'";
            PreparedStatement pst=conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                tid.setText(rs.getString("id"));
                templid.setText(rs.getString("employeeid"));
                tnumprod.setText(rs.getString("numberofproducts"));
                tnorm.setText(rs.getString("norm"));
                tpriceun.setText(rs.getString("priceperunit"));
                tpriceov.setText(rs.getString("priceperover"));
                tleadt.setText(rs.getString("leadtime"));
                tsum.setText(rs.getString("totalamount"));
            }
            pst.close();
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        String id, employeeid, numberofproducts, norm, priceperunit, priceperover, leadtime, totalamount;
        id=tid.getText();
        employeeid=templid.getText().replaceAll("\\s", "");
        numberofproducts=tnumprod.getText().replaceAll("\\s", "");
        norm=tnorm.getText().replaceAll("\\s", "");
        priceperunit=tpriceun.getText().replaceAll("\\s", "");    
        priceperover=tpriceov.getText().replaceAll("\\s", "");     
        leadtime=tleadt.getText().replaceAll("\\s", "");
        totalamount=tsum.getText().replaceAll("\\s", "");
        tid.setText(id);
        templid.setText(employeeid);
        tnumprod.setText(numberofproducts);
        tnorm.setText(norm);
        tpriceun.setText(priceperunit);
        tpriceov.setText(priceperover);
        tleadt.setText(leadtime);
        tsum.setText(totalamount);
    }//GEN-LAST:event_jTable1MousePressed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        try{
            conn = ConnectMsSql.ConnectDB();
            stored_pro = conn.prepareCall("{call DeletePaymentPiecePre (?)}");
            stored_pro.setString(1, this.tid.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        UpdateJTable();
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpdateActionPerformed
        try{
            conn = ConnectMsSql.ConnectDB();
            stored_pro = conn.prepareCall("{call UpdatePaymentPiecePre (?,?,?,?,?,?,?,?)}");
            stored_pro.setString(1, this.tid.getText());
            stored_pro.setString(2, this.templid.getText());
            stored_pro.setString(3, this.tnumprod.getText());
            stored_pro.setString(4, this.tnorm.getText());
            stored_pro.setString(5, this.tpriceun.getText());
            stored_pro.setString(6, this.tpriceov.getText());
            stored_pro.setString(7, this.tleadt.getText());
            stored_pro.setString(8, this.tsum.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "Updated");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        UpdateJTable();
    }//GEN-LAST:event_jBtnUpdateActionPerformed

    private void jBtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertActionPerformed
        try{
            conn = ConnectMsSql.ConnectDB();
            stored_pro = conn.prepareCall("{call InsertPaymentPiecePre (?,?,?,?,?,?,?,?)}");
            stored_pro.setString(1, this.templid.getText());
            stored_pro.setInt(2, 3);
            stored_pro.setString(3, this.tnumprod.getText());
            stored_pro.setString(4, this.tnorm.getText());
            stored_pro.setString(5, this.tpriceun.getText());
            stored_pro.setString(6, this.tpriceov.getText());
            stored_pro.setString(7, this.tleadt.getText());
            stored_pro.setString(8, this.tsum.getText());
            stored_pro.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        UpdateJTable();
    }//GEN-LAST:event_jBtnInsertActionPerformed

    private void templidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_templidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_templidActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UpdateJTable();
    }//GEN-LAST:event_formWindowOpened

    private void calcpre(){
        double num, price, res = 0, nor, prov, ost, sumov=0;
        num = Float.parseFloat(tnumprod.getText());
        price = Float.parseFloat(tpriceun.getText());
        nor = Float.parseFloat(tnorm.getText());
        prov = Float.parseFloat(tpriceov.getText());
        ost = num - nor;
        if(ost>0){
        sumov = ost * prov;
        res = sumov + (nor * price); }
        else if(ost<=0){
        res = (num * price); }
        tsum.setText(String.valueOf(res));
    }
    
    private void bcalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcalcActionPerformed
        calcpre();
    }//GEN-LAST:event_bcalcActionPerformed

    private void tpriceunCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tpriceunCaretUpdate
       
    }//GEN-LAST:event_tpriceunCaretUpdate

    private void tnumprodCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tnumprodCaretUpdate
        
    }//GEN-LAST:event_tnumprodCaretUpdate

    private void tleadtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tleadtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tleadtActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mn.showMeAllReportAcc();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        mn.showMeAllReportPi();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        mn.showMeAllReportPipre();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Employees employees = new Employees();
        employees.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        mn.showMeAllReportAll();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piecepre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcalc;
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnInsert;
    private javax.swing.JButton jBtnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField templid;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tleadt;
    private javax.swing.JTextField tnorm;
    private javax.swing.JTextField tnumprod;
    private javax.swing.JTextField tpriceov;
    private javax.swing.JTextField tpriceun;
    private javax.swing.JTextField tsum;
    // End of variables declaration//GEN-END:variables
}
