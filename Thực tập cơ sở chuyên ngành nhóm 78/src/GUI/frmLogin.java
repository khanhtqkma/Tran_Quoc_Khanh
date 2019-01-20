package GUI;

import DAO.LuuMatKhauDAO;
import DAO.NhanVienDAO;
import OBJ.Login;
import OBJ.LuuMatKhau;
import OBJ.NhanVien;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        KeyListener();

        txtTaikhoanMsg.setText("");
        txtTaikhoanMsg.setVisible(false);
        txtMatkhauMsg.setText("");
        txtMatkhauMsg.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTaikhoan = new javax.swing.JLabel();
        lbMatkhau = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        txtMatkhau = new javax.swing.JPasswordField();
        cbRemember = new javax.swing.JCheckBox();
        txtForgotPass = new javax.swing.JLabel();
        txtTaikhoanMsg = new javax.swing.JLabel();
        txtMatkhauMsg = new javax.swing.JLabel();
        btDangnhap = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 2));
        jPanel1.setForeground(new java.awt.Color(51, 204, 0));

        lbTaikhoan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-info-icon.png"))); // NOI18N
        lbTaikhoan.setText("Mã Nhân Viên:");

        lbMatkhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbMatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Apps-preferences-desktop-user-password-icon (1).png"))); // NOI18N
        lbMatkhau.setText("Mật Khẩu:");

        txtTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaikhoanMouseClicked(evt);
            }
        });

        txtMatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatkhauMouseClicked(evt);
            }
        });

        cbRemember.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRemember.setText("Nhớ mật khẩu?");
        cbRemember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRememberMouseClicked(evt);
            }
        });

        txtForgotPass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtForgotPass.setText("Forgot password?");
        txtForgotPass.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        txtForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtForgotPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtForgotPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtForgotPassMouseExited(evt);
            }
        });

        txtTaikhoanMsg.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        txtTaikhoanMsg.setForeground(new java.awt.Color(204, 0, 0));
        txtTaikhoanMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross-shield-icon.png"))); // NOI18N
        txtTaikhoanMsg.setText("Bạn chưa nhập tài khoản");

        txtMatkhauMsg.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        txtMatkhauMsg.setForeground(new java.awt.Color(204, 0, 0));
        txtMatkhauMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cross-shield-icon.png"))); // NOI18N
        txtMatkhauMsg.setText("Bạn chưa nhập mật khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbMatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatkhauMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTaikhoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTaikhoanMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbRemember)
                .addGap(94, 94, 94)
                .addComponent(txtForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTaikhoan)
                    .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(txtTaikhoanMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatkhauMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRemember)
                    .addComponent(txtForgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btDangnhap.setBackground(new java.awt.Color(102, 255, 102));
        btDangnhap.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btDangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login-icon.png"))); // NOI18N
        btDangnhap.setText("Đăng Nhập");
        btDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangnhapActionPerformed(evt);
            }
        });

        btThoat.setBackground(new java.awt.Color(102, 255, 102));
        btThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home-icon.png"))); // NOI18N
        btThoat.setText("Thoát");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Letter-L-icon (1).png"))); // NOI18N
        jLabel1.setText("OGIN!!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 5));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(btDangnhap)
                .addGap(29, 29, 29)
                .addComponent(btThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDangnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThoat))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void KeyListener() {
        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Bắt sự kiện khi ấn 1 phím nào đó
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    int choice = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn thoát?", "Thoát", JOptionPane.OK_CANCEL_OPTION);
                    if (choice == JOptionPane.OK_OPTION) {
                        dispose();
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    DangNhap();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    public void DangNhap() {
        NhanVienDAO nvDAO = new NhanVienDAO();
        NhanVien nvOBJ = new NhanVien();

        Login lgOBJ = new Login();
        lgOBJ.setTaiKhoan(txtTaikhoan.getText());
        lgOBJ.setMatKhau(txtMatkhau.getText());
        nvOBJ = nvDAO.Find(txtTaikhoan.getText());
        String nhomnv = nvOBJ.getNhomNhanVien();

        if (txtTaikhoan.getText().equalsIgnoreCase("") || txtMatkhau.getText().equalsIgnoreCase("")) {
            if (txtTaikhoan.getText().equalsIgnoreCase("")) {
                txtTaikhoanMsg.setVisible(true);
                txtTaikhoanMsg.setText("Bạn chưa nhập tài khoản");
            }
            if (txtMatkhau.getText().equalsIgnoreCase("")) {
                txtMatkhauMsg.setVisible(true);
                txtMatkhauMsg.setText("Bạn chưa nhập mật khẩu");
            }
        } else {
            if (nvDAO.Login(txtTaikhoan.getText(), txtMatkhau.getText())) {
                if (!nhomnv.equalsIgnoreCase("admin")) {
                    frmMain main = new frmMain(false, nvOBJ.getTenNhanVien(), nvOBJ.getMaNhanVien());
                    main.setVisible(true);
                    this.dispose();
                } else if (nhomnv.equalsIgnoreCase("admin")) {
                    frmMain main = new frmMain(true, nvOBJ.getTenNhanVien(), nvOBJ.getMaNhanVien());
                    main.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Đăng Nhập Thất Bại!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Đăng Nhập Thất Bại!");
            }
        }
    }

    private void btDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangnhapActionPerformed
        DangNhap();
        LuuMatKhau luuOBJ = new LuuMatKhau();
        LuuMatKhauDAO luuDAO = new LuuMatKhauDAO();
        if (cbRemember.isSelected()) {
            if (!luuDAO.checkExist(txtTaikhoan.getText())) {
                luuOBJ.setTaiKhoan(txtTaikhoan.getText());
                luuOBJ.setMatKhau(txtMatkhau.getText());
                luuDAO.insertData(luuOBJ);
            }

        }
    }//GEN-LAST:event_btDangnhapActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        // TODO add your handling code here:
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn thoát không?", "Thoát", 2);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_btThoatActionPerformed

    private void txtTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaikhoanMouseClicked
        // TODO add your handling code here:
        txtTaikhoanMsg.setText("");
        txtTaikhoanMsg.setVisible(false);
    }//GEN-LAST:event_txtTaikhoanMouseClicked

    private void txtMatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatkhauMouseClicked
        // TODO add your handling code here:
        txtMatkhauMsg.setVisible(false);
        txtMatkhauMsg.setText("");
        LuuMatKhauDAO luuDAO = new LuuMatKhauDAO();
        LuuMatKhau luuOBJ = new LuuMatKhau();
        if (luuDAO.checkExist(txtTaikhoan.getText())) {
            luuOBJ = luuDAO.Find(txtTaikhoan.getText());
            txtMatkhau.setText(luuOBJ.getMatKhau());
        }
    }//GEN-LAST:event_txtMatkhauMouseClicked

    private void txtForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtForgotPassMouseClicked
        // TODO add your handling code here:
        frmQuenMK quenmk = new frmQuenMK();
        quenmk.setVisible(true);
    }//GEN-LAST:event_txtForgotPassMouseClicked

    private void txtForgotPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtForgotPassMouseEntered
        // TODO add your handling code here:
        txtForgotPass.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txtForgotPass.setForeground(Color.red);

    }//GEN-LAST:event_txtForgotPassMouseEntered

    private void txtForgotPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtForgotPassMouseExited
        // TODO add your handling code here:
        txtForgotPass.setForeground(Color.black);
    }//GEN-LAST:event_txtForgotPassMouseExited

    private void cbRememberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRememberMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRememberMouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangnhap;
    private javax.swing.JButton btThoat;
    private javax.swing.JCheckBox cbRemember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbMatkhau;
    private javax.swing.JLabel lbTaikhoan;
    private javax.swing.JLabel txtForgotPass;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JLabel txtMatkhauMsg;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JLabel txtTaikhoanMsg;
    // End of variables declaration//GEN-END:variables
}
