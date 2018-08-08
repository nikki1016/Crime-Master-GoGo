import java.sql.*;
import javax.swing.JOptionPane;

public class frmAddFlightDetail extends javax.swing.JFrame {

    /**
     * Creates new form frmAddFlightDetail
     */
    public frmAddFlightDetail() {
       initComponents();
       txtflightCode.setEditable(false);
       jButton3.setVisible(false);
       jButton4.setVisible(false);
       txtsrc.setVisible(false);
       txtdes.setVisible(false);
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
         stmt=con.createStatement();
         rs=stmt.executeQuery(sql);
         int code=2310;
         while(rs.next())
         {
             code=rs.getInt(1);
            // System.out.println("Airline Code "+code);
             code++;
            // System.out.println("Airline Code "+code);

         }
         txtflightCode.setText(""+code);
         con.close();
         rs.close();
         stmt.close();
     }
     catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
     }
    }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fcode = new javax.swing.JLabel();
        txtflightCode = new javax.swing.JTextField();
        fname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        source = new javax.swing.JLabel();
        Dest = new javax.swing.JLabel();
        tec = new javax.swing.JLabel();
        txtTECo = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tbc = new javax.swing.JLabel();
        txtTotBusi = new javax.swing.JTextField();
        cls = new javax.swing.JLabel();
        optDom = new javax.swing.JRadioButton();
        optInter = new javax.swing.JRadioButton();
        Ddate = new javax.swing.JLabel();
        dtime = new javax.swing.JLabel();
        txtDepTime = new javax.swing.JTextField();
        txtDeptDate = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        price = new javax.swing.JLabel();
        txtPrice1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        price1 = new javax.swing.JLabel();
        txtPrice2 = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        txtsrc = new javax.swing.JTextField();
        btnNew1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        search = new javax.swing.JMenu();
        food = new javax.swing.JMenu();
        about = new javax.swing.JMenu();
        flyers = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        admin = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Detail");
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1470, 770));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        fcode.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        fcode.setForeground(new java.awt.Color(255, 255, 0));
        fcode.setText("Flight Code :");
        getContentPane().add(fcode);
        fcode.setBounds(70, 60, 150, 30);

        txtflightCode.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtflightCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtflightCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtflightCode);
        txtflightCode.setBounds(340, 60, 220, 27);

        fname.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 0));
        fname.setText("Flight Name :");
        getContentPane().add(fname);
        fname.setBounds(70, 110, 129, 30);

        txtFname.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        getContentPane().add(txtFname);
        txtFname.setBounds(340, 110, 221, 27);

        source.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        source.setForeground(new java.awt.Color(255, 255, 0));
        source.setText("Source :");
        getContentPane().add(source);
        source.setBounds(70, 170, 90, 30);

        Dest.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        Dest.setForeground(new java.awt.Color(255, 255, 0));
        Dest.setText("Destination :");
        getContentPane().add(Dest);
        Dest.setBounds(690, 170, 130, 30);

        tec.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        tec.setForeground(new java.awt.Color(255, 255, 0));
        tec.setText("Total Economy Capacity :");
        getContentPane().add(tec);
        tec.setBounds(70, 300, 244, 21);

        txtTECo.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtTECo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTECoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTECo);
        txtTECo.setBounds(340, 300, 130, 27);

        btnNew.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 24)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 255));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew);
        btnNew.setBounds(230, 590, 140, 50);

        btnSave.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(450, 590, 130, 50);

        btnClear.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 51, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(670, 590, 120, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(-10, 550, 1110, 20);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Details");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1470, 40);

        tbc.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        tbc.setForeground(new java.awt.Color(255, 255, 0));
        tbc.setText("Total Business Capacity :");
        getContentPane().add(tbc);
        tbc.setBounds(70, 360, 239, 30);

        txtTotBusi.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtTotBusi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotBusiActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotBusi);
        txtTotBusi.setBounds(340, 360, 130, 27);

        cls.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        cls.setForeground(new java.awt.Color(255, 255, 0));
        cls.setText("Class :");
        getContentPane().add(cls);
        cls.setBounds(70, 230, 130, 30);

        optDom.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(optDom);
        optDom.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        optDom.setText("Domestic");
        getContentPane().add(optDom);
        optDom.setBounds(340, 240, 113, 20);

        buttonGroup1.add(optInter);
        optInter.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        optInter.setText("International");
        getContentPane().add(optInter);
        optInter.setBounds(480, 240, 153, 20);

        Ddate.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        Ddate.setForeground(new java.awt.Color(255, 255, 0));
        Ddate.setText("Daparture Date :");
        getContentPane().add(Ddate);
        Ddate.setBounds(70, 420, 180, 30);

        dtime.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        dtime.setForeground(new java.awt.Color(255, 255, 0));
        dtime.setText("Departure Time :");
        getContentPane().add(dtime);
        dtime.setBounds(70, 480, 163, 30);

        txtDepTime.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        getContentPane().add(txtDepTime);
        txtDepTime.setBounds(340, 480, 130, 27);

        txtDeptDate.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtDeptDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtDeptDate);
        txtDeptDate.setBounds(340, 420, 130, 27);

        jComboBox2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(860, 170, 190, 30);

        price.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 0));
        price.setText("Price :");
        getContentPane().add(price);
        price.setBounds(690, 300, 80, 30);

        txtPrice1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        txtPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrice1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrice1);
        txtPrice1.setBounds(850, 300, 117, 27);

        jButton4.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1120, 170, 80, 30);

        jComboBox1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(340, 170, 190, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("(YYYY-MM-DD)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 430, 220, 17);

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("(HH:MM:SS)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 490, 160, 17);

        jButton1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 170, 80, 30);

        price1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        price1.setForeground(new java.awt.Color(255, 255, 0));
        price1.setText("Price :");
        getContentPane().add(price1);
        price1.setBounds(690, 350, 80, 30);

        txtPrice2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        getContentPane().add(txtPrice2);
        txtPrice2.setBounds(850, 360, 117, 27);

        txtdes.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        getContentPane().add(txtdes);
        txtdes.setBounds(860, 170, 220, 30);

        txtsrc.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        txtsrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsrcActionPerformed(evt);
            }
        });
        getContentPane().add(txtsrc);
        txtsrc.setBounds(340, 170, 220, 30);

        btnNew1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 2, 24)); // NOI18N
        btnNew1.setForeground(new java.awt.Color(0, 0, 255));
        btnNew1.setText("Back");
        btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNew1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew1);
        btnNew1.setBounds(840, 590, 140, 50);

        jButton2.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1080, 170, 80, 30);

        jButton3.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(600, 170, 73, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/china-airlines.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 20, 1580, 800);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(20.0F);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(301, 51));

        home.setText("HOME");
        home.setAlignmentX(205.0F);
        home.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        home.setIconTextGap(30);
        home.setMaximumSize(new java.awt.Dimension(205, 32767));
        home.setPreferredSize(new java.awt.Dimension(205, 21));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        search.setText("SEARCH");
        search.setAlignmentX(205.0F);
        search.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        search.setIconTextGap(30);
        search.setPreferredSize(new java.awt.Dimension(205, 21));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        jMenuBar1.add(search);

        food.setText("FOOD MENU");
        food.setAlignmentX(415.0F);
        food.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        food.setIconTextGap(30);
        food.setMaximumSize(new java.awt.Dimension(255, 32767));
        food.setPreferredSize(new java.awt.Dimension(255, 21));
        food.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodMouseClicked(evt);
            }
        });
        jMenuBar1.add(food);

        about.setText("ABOUT");
        about.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        about.setIconTextGap(30);
        about.setPreferredSize(new java.awt.Dimension(205, 21));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        flyers.setText("FREQUENT FLYERS");
        flyers.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        flyers.setIconTextGap(30);
        flyers.setMaximumSize(new java.awt.Dimension(255, 32767));
        flyers.setPreferredSize(new java.awt.Dimension(255, 21));
        flyers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flyersMouseClicked(evt);
            }
        });
        jMenuBar1.add(flyers);

        jMenu5.setText("EXIT");
        jMenu5.setAlignmentX(280.0F);
        jMenu5.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jMenu5.setIconTextGap(30);
        jMenu5.setMaximumSize(new java.awt.Dimension(0, 0));
        jMenuBar1.add(jMenu5);

        admin.setText("ADMIN");
        admin.setAlignmentX(0.0F);
        admin.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        admin.setIconTextGap(30);
        admin.setMaximumSize(new java.awt.Dimension(175, 32767));
        admin.setPreferredSize(new java.awt.Dimension(175, 21));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        jMenuBar1.add(admin);

        exit.setText("EXIT");
        exit.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        exit.setMaximumSize(new java.awt.Dimension(175, 32767));
        exit.setPreferredSize(new java.awt.Dimension(175, 21));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
Statement stmt=null;
ResultSet rs =null;
String sql ="select * From FlightDetails";
public void setf(String f) {
    txtflightCode.setText(f);
}
public void clear(){
    txtDepTime.setText("");
    txtDeptDate.setText("");
    txtFname.setText("");
    txtPrice1.setText("");
    txtPrice2.setText("");
    txtsrc.setText("");
    txtTECo.setText("");
    txtTotBusi.setText("");
    txtdes.setText("");
    txtflightCode.setText("");

}
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
    txtflightCode.setEditable(false);
        try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
         stmt=con.createStatement();
         rs=stmt.executeQuery(sql);
         int code=2310;
         while(rs.next())
         {
             code=rs.getInt(1);
             System.out.println("Airline Code "+code);
             code++;
             System.out.println("Airline Code "+code);

         }
         txtflightCode.setText(""+code);
         con.close();
         rs.close();
         stmt.close();
     }
     catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
     }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
         stmt=con.createStatement();
         rs=stmt.executeQuery("select * from FlightDEtails");
         String cls="";
         while(rs.next())
         {
                System.out.println(rs.getString(1)+" : "+rs.getString(2));

         }
             int code=Integer.parseInt(txtflightCode.getText());
             String name=txtFname.getText();
             if(optDom.isSelected()){ cls="Domestic";}
             if(optDom.isSelected()){ cls="International";}
             //String src=txtSource.getText();
             String src=(String) jComboBox1.getSelectedItem();
             
             String dst=(String) jComboBox2.getSelectedItem();
            int Te=Integer.parseInt(txtTECo.getText());
            int Tb=Integer.parseInt(txtTotBusi.getText());
            double prceco =Double.parseDouble(txtPrice1.getText());
            double prcbui =Double.parseDouble(txtPrice2.getText());
            String dt=txtDeptDate.getText();
            String dTime=txtDepTime.getText();

 String strSQL="INSERT INTO FlightDetails VALUES ('"+(code)+"','"+(name)+"','"+(cls)+"','"+(src)+"','"+(dst)+"','"+(Te)+"','"+(Tb)+"','"+(dt)+"','"+(dTime)+"','"+(prceco)+"','"+(prcbui)+"')";
             int rowEffected=stmt.executeUpdate(strSQL);
           System.out.println("rows Effected :"+rowEffected);
           System.out.println(strSQL);
           JOptionPane.showMessageDialog(this, "Now " +(code) +" is also ready to fly..", "Flight added successfully!!",JOptionPane.INFORMATION_MESSAGE);
           clear();
}  catch(Exception e)
     {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    }//GEN-LAST:event_btnSaveActionPerformed

    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtDeptDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptDateActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtDeptDateActionPerformed

    private void txtflightCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtflightCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtflightCodeActionPerformed

    private void txtPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrice1ActionPerformed

    private void txtTotBusiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotBusiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotBusiActionPerformed

    private void txtTECoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTECoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTECoActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        login_home1 add = new login_home1();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        searchflights1 add = new searchflights1();
        add.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:*/
    }//GEN-LAST:event_searchMouseClicked

    private void foodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodMouseClicked
        foodmenu add = new foodmenu();
        add.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_foodMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        about add = new about();
        add.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void flyersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flyersMouseClicked
        login_customer add = new login_customer();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_flyersMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        login_admin add = new login_admin();
        add.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_adminMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNew1ActionPerformed
        login_admin add= new login_admin();
        add.setVisible(true);
        add.back();
        this.setVisible(false);
    }//GEN-LAST:event_btnNew1ActionPerformed

    private void txtsrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsrcActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");

            String SQL1="Select * from cities ";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL1);
            while(rs.next()) {
                
                
                String src=rs.getString(1);
                String des=rs.getString(2);
                jComboBox1.addItem(src);
                jComboBox2.addItem(des);
            }
            
            //con.close();

        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtsrc.setVisible(true);
        jComboBox1.setVisible(false);
        jButton1.setVisible(false);
        jButton3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
        Statement stmt1=null;
        ResultSet rs1=null;
        stmt=con.createStatement();
         rs=stmt.executeQuery("select * from cities"); //getting next passngr no
         
         while(rs.next())
         {
                //System.out.println(rs.getString(1)+" : "+rs.getString(2));

         }
             
            String src=txtsrc.getText();
            
            
            
 //System.out.println("INSERT INTO Passenger VALUES ('"+(pno)+"','"+(fcode)+"','"+(name)+"','"+(sex)+"','"+(dob)+"','" +(adrss)+"','"+(nation)+"','"+(eid)+"','"+(pprtno)+"','"+(seatno)+"')");
 //String strSQL="INSERT INTO Passenger VALUES ('"+(pno)+"','"+(fcode)+"','"+(name)+"','"+(sex)+"','"+(dob)+"','" +(adrss)+"','"+(nation)+"','"+(eid)+"','"+(pprtno)+"','"+(seatno)+"','"+(SubCate)+"','"+(cls)+"')";
 String strSQL1="INSERT INTO cities VALUES ('"+(src)+"','"+(src)+"')";
 //int rowEffected=stmt.executeUpdate(strSQL);
 int rowEffected1=stmt.executeUpdate(strSQL1);
        }
            catch(Exception e)
    {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    } 
        txtsrc.setVisible(false);
        jComboBox1.setVisible(true);
        jButton1.setVisible(true);
        jButton3.setVisible(false);
        jComboBox1.addItem(txtsrc.getText());
        jComboBox2.addItem(txtsrc.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines","root","root");
        Statement stmt1=null;
        ResultSet rs1=null;
        stmt=con.createStatement();
         rs=stmt.executeQuery("select * from cities"); //getting next passngr no
         
         while(rs.next())
         {
                //System.out.println(rs.getString(1)+" : "+rs.getString(2));

         }
             
            String src=txtdes.getText();
            
            
            
 //System.out.println("INSERT INTO Passenger VALUES ('"+(pno)+"','"+(fcode)+"','"+(name)+"','"+(sex)+"','"+(dob)+"','" +(adrss)+"','"+(nation)+"','"+(eid)+"','"+(pprtno)+"','"+(seatno)+"')");
 //String strSQL="INSERT INTO Passenger VALUES ('"+(pno)+"','"+(fcode)+"','"+(name)+"','"+(sex)+"','"+(dob)+"','" +(adrss)+"','"+(nation)+"','"+(eid)+"','"+(pprtno)+"','"+(seatno)+"','"+(SubCate)+"','"+(cls)+"')";
 String strSQL1="INSERT INTO cities VALUES ('"+(src)+"','"+(src)+"')";
 //int rowEffected=stmt.executeUpdate(strSQL);
 int rowEffected1=stmt.executeUpdate(strSQL1);
        }
            catch(Exception e)
    {
JOptionPane.showMessageDialog(this, e.getMessage());
e.printStackTrace();
    } 
        txtdes.setVisible(false);
        jComboBox2.setVisible(true);
        jButton2.setVisible(true);
        jButton4.setVisible(false);
        jComboBox1.addItem(txtdes.getText());
        jComboBox2.addItem(txtdes.getText());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtdes.setVisible(true);
        jComboBox2.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAddFlightDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddFlightDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddFlightDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddFlightDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddFlightDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ddate;
    private javax.swing.JLabel Dest;
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNew1;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cls;
    private javax.swing.JLabel dtime;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel fcode;
    private javax.swing.JMenu flyers;
    private javax.swing.JLabel fname;
    private javax.swing.JMenu food;
    private javax.swing.JMenu home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton optDom;
    private javax.swing.JRadioButton optInter;
    private javax.swing.JLabel price;
    private javax.swing.JLabel price1;
    private javax.swing.JMenu search;
    private javax.swing.JLabel source;
    private javax.swing.JLabel tbc;
    private javax.swing.JLabel tec;
    private javax.swing.JTextField txtDepTime;
    private javax.swing.JTextField txtDeptDate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtPrice1;
    private javax.swing.JTextField txtPrice2;
    private javax.swing.JTextField txtTECo;
    private javax.swing.JTextField txtTotBusi;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtflightCode;
    private javax.swing.JTextField txtsrc;
    // End of variables declaration//GEN-END:variables
}
