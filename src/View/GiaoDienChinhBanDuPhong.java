/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author FPT Shop
 */
public class GiaoDienChinhBanDuPhong extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienChinh
     */
    public GiaoDienChinhBanDuPhong() {
        initComponents();
        Status();
    }

    

    public void Status() {
        if (rdBanA1.getText().equals("Disable")) {
            btnBanA1.setEnabled(false);
        }
        if (rdBanA2.getText().equals("Disable")) {
            btnBanA2.setEnabled(false);
        }
        if (rdBanA3.getText().equals("Disable")) {
            btnBanA3.setEnabled(false);
        }
        if (rdBanA4.getText().equals("Disable")) {
            btnBanA4.setEnabled(false);
        }
        if (rdBanA5.getText().equals("Disable")) {
            btnBanA5.setEnabled(false);
        }
        if (rdBanA6.getText().equals("Disable")) {
            btnBanA6.setEnabled(false);
        }
        if (rdBanA7.getText().equals("Disable")) {
            btnBanA7.setEnabled(false);
        }
        if (rdBanA8.getText().equals("Disable")) {
            btnBanA8.setEnabled(false);
        }
        if (rdBanA9.getText().equals("Disable")) {
            btnBanA9.setEnabled(false);
        }
        if (rdBanA10.getText().equals("Disable")) {
            btnBanA10.setEnabled(false);
        }
        if (rdBanA11.getText().equals("Disable")) {
            btnBanA11.setEnabled(false);
        }
        if (rdBanA12.getText().equals("Disable")) {
            btnBanA12.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDanhSachBan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnBanA3 = new javax.swing.JButton();
        rdBanA5 = new javax.swing.JRadioButton();
        btnBanA1 = new javax.swing.JButton();
        rdBanA2 = new javax.swing.JRadioButton();
        btnBanA5 = new javax.swing.JButton();
        rdBanA1 = new javax.swing.JRadioButton();
        btnBanA2 = new javax.swing.JButton();
        rdBanA3 = new javax.swing.JRadioButton();
        btnBanA4 = new javax.swing.JButton();
        rdBanA4 = new javax.swing.JRadioButton();
        btnBanA6 = new javax.swing.JButton();
        rdBanA6 = new javax.swing.JRadioButton();
        btnBanA7 = new javax.swing.JButton();
        rdBanA7 = new javax.swing.JRadioButton();
        btnBanA8 = new javax.swing.JButton();
        rdBanA8 = new javax.swing.JRadioButton();
        btnBanA9 = new javax.swing.JButton();
        rdBanA9 = new javax.swing.JRadioButton();
        btnBanA10 = new javax.swing.JButton();
        rdBanA10 = new javax.swing.JRadioButton();
        btnBanA11 = new javax.swing.JButton();
        rdBanA11 = new javax.swing.JRadioButton();
        btnBanA12 = new javax.swing.JButton();
        rdBanA12 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("GIAO DIỆN CHÍNH");

        lblDanhSachBan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDanhSachBan.setText("Danh Sách bàn");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Users.png"))); // NOI18N
        jButton2.setText("Quản lý nhân viên");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add to basket.png"))); // NOI18N
        jButton3.setText("Quản lý Nguyên liệu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        jButton5.setText("Quản lý Bàn");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Money.png"))); // NOI18N
        jButton4.setText("Quản lý Khuyến mãi");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Price list.png"))); // NOI18N
        jButton6.setText("Quản lý Doanh thu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Payment.png"))); // NOI18N
        jButton7.setText("Quản lý Hóa đơn");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Refresh.png"))); // NOI18N
        jButton9.setText("Đồng bộ");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Gear.png"))); // NOI18N
        jButton8.setText("Cài đặt");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Bell.png"))); // NOI18N
        jButton11.setText("Thông báo");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Scroll list.png"))); // NOI18N
        jButton10.setText("Thông tin");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Text.png"))); // NOI18N
        jButton12.setText("Quản lý Menu");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton11, jButton12, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton9});

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBanA3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA3.setText("Bàn A3");
        btnBanA3.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 130));

        rdBanA5.setText("Disable");
        rdBanA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA5ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, -1));

        btnBanA1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA1.setText("Bàn A1 ");
        btnBanA1.setPreferredSize(new java.awt.Dimension(150, 150));
        btnBanA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanA1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBanA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 130));

        rdBanA2.setText("Disable");
        rdBanA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA2ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 150, -1));

        btnBanA5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA5.setText("Bàn A5");
        btnBanA5.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 130));

        rdBanA1.setText("Disable");
        rdBanA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA1ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        btnBanA2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA2.setText("Bàn A2");
        btnBanA2.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, 130));

        rdBanA3.setText("Disable");
        rdBanA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA3ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 150, -1));

        btnBanA4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA4.setText("Bàn A4");
        btnBanA4.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 130));

        rdBanA4.setText("Disable");
        rdBanA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA4ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 150, -1));

        btnBanA6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA6.setText("Bàn A6");
        btnBanA6.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 130));

        rdBanA6.setText("Disable");
        rdBanA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA6ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 150, -1));

        btnBanA7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA7.setText("Bàn A7");
        btnBanA7.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, -1, 130));

        rdBanA7.setText("Disable");
        rdBanA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA7ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 150, -1));

        btnBanA8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA8.setText("Bàn A8");
        btnBanA8.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 130));

        rdBanA8.setText("Disable");
        rdBanA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA8ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 150, -1));

        btnBanA9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA9.setText("Bàn A9");
        btnBanA9.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 130));

        rdBanA9.setText("Disable");
        rdBanA9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA9ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 150, -1));

        btnBanA10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA10.setText("Bàn A10");
        btnBanA10.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, 130));

        rdBanA10.setText("Disable");
        rdBanA10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA10ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 150, -1));

        btnBanA11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA11.setText("Bàn A11");
        btnBanA11.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, 130));

        rdBanA11.setText("Disable");
        rdBanA11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA11ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 150, -1));

        btnBanA12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBanA12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Table.png"))); // NOI18N
        btnBanA12.setText("Bàn A12");
        btnBanA12.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel3.add(btnBanA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, 130));

        rdBanA12.setText("Disable");
        rdBanA12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBanA12ActionPerformed(evt);
            }
        });
        jPanel3.add(rdBanA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDanhSachBan, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(lblDanhSachBan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void rdBanA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA1ActionPerformed
        if (rdBanA1.isSelected() == true) {
            rdBanA1.setText("Active");
            btnBanA1.setEnabled(true);
        } else {
            rdBanA1.setText("Disable");
            btnBanA1.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA1ActionPerformed

    private void rdBanA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA2ActionPerformed
        if (rdBanA2.isSelected() == true) {
            rdBanA2.setText("Active");
            btnBanA2.setEnabled(true);
        } else {
            rdBanA2.setText("Disable");
            btnBanA2.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA2ActionPerformed

    private void rdBanA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA3ActionPerformed
        if (rdBanA3.isSelected() == true) {
            rdBanA3.setText("Active");
            btnBanA3.setEnabled(true);
        } else {
            rdBanA3.setText("Disable");
            btnBanA3.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA3ActionPerformed

    private void rdBanA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA4ActionPerformed
        if (rdBanA4.isSelected() == true) {
            rdBanA4.setText("Active");
            btnBanA4.setEnabled(true);
        } else {
            rdBanA4.setText("Disable");
            btnBanA4.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA4ActionPerformed

    private void rdBanA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA5ActionPerformed
        if (rdBanA5.isSelected() == true) {
            rdBanA5.setText("Active");
            btnBanA5.setEnabled(true);
        } else {
            rdBanA5.setText("Disable");
            btnBanA5.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA5ActionPerformed

    private void rdBanA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA6ActionPerformed
        if (rdBanA6.isSelected() == true) {
            rdBanA6.setText("Active");
            btnBanA6.setEnabled(true);
        } else {
            rdBanA6.setText("Disable");
            btnBanA6.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA6ActionPerformed

    private void rdBanA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA7ActionPerformed
        if (rdBanA7.isSelected() == true) {
            rdBanA7.setText("Active");
            btnBanA7.setEnabled(true);
        } else {
            rdBanA7.setText("Disable");
            btnBanA7.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA7ActionPerformed

    private void rdBanA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA8ActionPerformed
        if (rdBanA8.isSelected() == true) {
            rdBanA8.setText("Active");
            btnBanA8.setEnabled(true);
        } else {
            rdBanA8.setText("Disable");
            btnBanA8.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA8ActionPerformed

    private void rdBanA9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA9ActionPerformed
        if (rdBanA9.isSelected() == true) {
            rdBanA9.setText("Active");
            btnBanA9.setEnabled(true);
        } else {
            rdBanA9.setText("Disable");
            btnBanA9.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA9ActionPerformed

    private void rdBanA10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA10ActionPerformed
        if (rdBanA10.isSelected() == true) {
            rdBanA10.setText("Active");
            btnBanA10.setEnabled(true);
        } else {
            rdBanA10.setText("Disable");
            btnBanA10.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA10ActionPerformed

    private void rdBanA11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA11ActionPerformed
        if (rdBanA11.isSelected() == true) {
            rdBanA11.setText("Active");
            btnBanA11.setEnabled(true);
        } else {
            rdBanA11.setText("Disable");
            btnBanA11.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA11ActionPerformed

    private void rdBanA12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBanA12ActionPerformed
        if (rdBanA12.isSelected() == true) {
            rdBanA12.setText("Active");
            btnBanA12.setEnabled(true);
        } else {
            rdBanA12.setText("Disable");
            btnBanA12.setEnabled(false);
        }
    }//GEN-LAST:event_rdBanA12ActionPerformed

    private void btnBanA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanA1ActionPerformed
        QuanLyBanHangBan a1 = new QuanLyBanHangBan();
        a1.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBanA1ActionPerformed

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
            java.util.logging.Logger.getLogger(GiaoDienChinhBanDuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinhBanDuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinhBanDuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChinhBanDuPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChinhBanDuPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanA1;
    private javax.swing.JButton btnBanA10;
    private javax.swing.JButton btnBanA11;
    private javax.swing.JButton btnBanA12;
    private javax.swing.JButton btnBanA2;
    private javax.swing.JButton btnBanA3;
    private javax.swing.JButton btnBanA4;
    private javax.swing.JButton btnBanA5;
    private javax.swing.JButton btnBanA6;
    private javax.swing.JButton btnBanA7;
    private javax.swing.JButton btnBanA8;
    private javax.swing.JButton btnBanA9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDanhSachBan;
    private javax.swing.JRadioButton rdBanA1;
    private javax.swing.JRadioButton rdBanA10;
    private javax.swing.JRadioButton rdBanA11;
    private javax.swing.JRadioButton rdBanA12;
    private javax.swing.JRadioButton rdBanA2;
    private javax.swing.JRadioButton rdBanA3;
    private javax.swing.JRadioButton rdBanA4;
    private javax.swing.JRadioButton rdBanA5;
    private javax.swing.JRadioButton rdBanA6;
    private javax.swing.JRadioButton rdBanA7;
    private javax.swing.JRadioButton rdBanA8;
    private javax.swing.JRadioButton rdBanA9;
    // End of variables declaration//GEN-END:variables
}