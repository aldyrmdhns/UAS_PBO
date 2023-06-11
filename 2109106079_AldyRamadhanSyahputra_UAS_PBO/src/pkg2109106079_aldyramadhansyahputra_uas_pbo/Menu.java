/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg2109106079_aldyramadhansyahputra_uas_pbo;

import java.sql.*;
import java.util.Vector;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Acer
 */
public class Menu extends javax.swing.JFrame {
    static String username = "root";
    static String password = "";
    static String connector = "jdbc:mysql://localhost:3306/dbbaju";
    static String comClass = "com.mysql.jdbc.Driver";
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBaju = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textNamaPakaian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioTops = new javax.swing.JRadioButton();
        radioTrouser = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        checkS = new javax.swing.JCheckBox();
        checkM = new javax.swing.JCheckBox();
        checkL = new javax.swing.JCheckBox();
        checkXL = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        textHarga = new javax.swing.JTextField();
        textSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("E D W I N");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 5));

        tableBaju.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Pakaian", "Jenis Pakaian", "Kategori Pakaian", "Ukuran Pakaian", "Harga Pakaian"
            }
        ));
        tableBaju.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBajuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBaju);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255), 5));

        btnLogOut.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnLogOut.setText("LOG OUT");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnTambah.setText("TAMBAH DATA");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnUbah.setText("UBAH DATA");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnHapus.setText("HAPUS DATA");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnCari.setText("CARI DATA");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Kategori Pakaian");

        textNamaPakaian.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Jenis Pakaian");

        radioTops.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        radioTops.setText("TOPS");
        radioTops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTopsActionPerformed(evt);
            }
        });

        radioTrouser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        radioTrouser.setText("TROUSER");
        radioTrouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTrouserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Nama Pakaian");

        comboKategori.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        comboKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboKategori.setToolTipText("");
        comboKategori.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Ukuran Pakaian");

        checkS.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkS.setText("S");
        checkS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSActionPerformed(evt);
            }
        });

        checkM.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkM.setText("M");
        checkM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMActionPerformed(evt);
            }
        });

        checkL.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkL.setText("L");
        checkL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLActionPerformed(evt);
            }
        });

        checkXL.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        checkXL.setText("XL");
        checkXL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkXLActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Harga Pakaian");

        textHarga.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        textSearch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Searchbar");

        textID.setEditable(false);
        textID.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel4))
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textNamaPakaian, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radioTops)
                                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(radioTrouser))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkM)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkXL))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkS)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkL)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(textNamaPakaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(radioTops)
                                    .addComponent(checkS)
                                    .addComponent(checkL))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioTrouser)
                                    .addComponent(checkM)
                                    .addComponent(checkXL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(textHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTrouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTrouserActionPerformed
        // TODO add your handling code here:
        comboKategori.setEnabled(true);
        comboKategori.removeAllItems();
        comboKategori.addItem("Short");
        comboKategori.addItem("Jeans");
        comboKategori.addItem("Pants");
    }//GEN-LAST:event_radioTrouserActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        String jenis = "", kategori = "", ukuran;
        
        if(radioTops.isSelected()){
            jenis = "TOPS";
        } else if (radioTrouser.isSelected()) {
            jenis = "TROUSER";
        }
        
        Object selectItem = comboKategori.getSelectedItem();
        kategori = selectItem.toString();
        
        ukuran = getCheckBox(checkS, checkM, checkL, checkXL);
        System.out.println(ukuran);
        try{
            Class.forName(comClass);
            conn = DriverManager.getConnection(connector, username, password);
            pst = conn.prepareStatement("update tbpakaian set namaPakaian =?, jenisPakaian=?, kategoriPakaian=?, ukuranPakaian=?, hargaPakaian=? where id =?");
            pst.setString(1, textNamaPakaian.getText());
            pst.setString(2, jenis);
            pst.setString(3, kategori);
            pst.setString(4, ukuran);
            pst.setString(5, textHarga.getText());
             pst.setString(6, textID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Berhasil Mengubah Data");
            updateTable();
        } catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            id = Integer.parseInt(textID.getText());
            deleteItem = JOptionPane.showConfirmDialog(null,"Yakin Untuk Menghapus? ", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_NO_OPTION){
                Class.forName(comClass);
                conn = DriverManager.getConnection(connector, username, password);
                pst = conn.prepareStatement("delete from tbpakaian where id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Berhasil Menghapus Data");
                updateTable();
                textNamaPakaian.setText("");
                textHarga.setText("");
                textSearch.setText("");
                comboKategori.setSelectedItem(null);
                radioTops.setSelected(false);
                radioTrouser.setSelected(false);
                checkS.setSelected(false);
                checkM.setSelected(false);
                checkL.setSelected(false);
                checkXL.setSelected(false);
            }
        } catch (ClassNotFoundException ex){
                java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex){
                java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        Login form1 = new Login();
        form1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void checkSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSActionPerformed

    private void checkMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMActionPerformed

    private void checkLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkLActionPerformed

    private void checkXLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkXLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkXLActionPerformed

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        textNamaPakaian.setText("");
        textHarga.setText("");
        textSearch.setText("");
        comboKategori.setSelectedItem(null);
        radioTops.setSelected(false);
        radioTrouser.setSelected(false);
        checkS.setSelected(false);
        checkM.setSelected(false);
        checkL.setSelected(false);
        checkXL.setSelected(false);
        updateTable();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:\
        String jenis = "", kategori = "", ukuran;
        
        if(radioTops.isSelected()){
            jenis = "TOPS";
        } else if (radioTrouser.isSelected()) {
            jenis = "TROUSER";
        }
        
        Object selectItem = comboKategori.getSelectedItem();
        kategori = selectItem.toString();
        
        ukuran = getCheckBox(checkS, checkM, checkL, checkXL);
        System.out.println(ukuran);
        try{
            Class.forName(comClass);
            conn = DriverManager.getConnection(connector, username, password);
            pst = conn.prepareStatement("insert into tbpakaian(namaPakaian, jenisPakaian, kategoriPakaian, ukuranPakaian, hargaPakaian) values (?, ?, ?, ?, ?)");
            pst.setString(1, textNamaPakaian.getText());
            pst.setString(2, jenis);
            pst.setString(3, kategori);
            pst.setString(4, ukuran);
            pst.setString(5, textHarga.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Data");
            updateTable();
        } catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void radioTopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTopsActionPerformed
        // TODO add your handling code here:
        comboKategori.setEnabled(true);
        comboKategori.removeAllItems();
        comboKategori.addItem("Shirt");
        comboKategori.addItem("Jacket");
        comboKategori.addItem("Sweater");
    }//GEN-LAST:event_radioTopsActionPerformed

    private void textIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIDActionPerformed

    private void tableBajuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBajuMouseClicked
        // TODO add your handling code here:
        DefaultTableModel recordTb = (DefaultTableModel)tableBaju.getModel();
        int selectedRows = tableBaju.getSelectedRow();
        
        textID.setText(recordTb.getValueAt(selectedRows, 0).toString());
        textNamaPakaian.setText(recordTb.getValueAt(selectedRows, 1).toString());
        
    }//GEN-LAST:event_tableBajuMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(comClass);
            conn = DriverManager.getConnection(connector, username, password);
            pst = conn.prepareStatement("select * from tbpakaian where namaPakaian = ?");
            pst.setString(1, textSearch.getText());
            rs = pst.executeQuery();
            
            ResultSetMetaData data = rs.getMetaData();
            
            q = data.getColumnCount();
            
            DefaultTableModel recordTb = (DefaultTableModel)tableBaju.getModel();
            recordTb.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i = 1; i <= q; i++ ){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("namaPakaian"));
                    columnData.add(rs.getString("jenisPakaian"));
                    columnData.add(rs.getString("kategoriPakaian"));
                    columnData.add(rs.getString("ukuranPakaian"));
                    columnData.add(rs.getInt("hargaPakaian"));
                }
                recordTb.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //================================================== FUNGSI ==================================================//
    
    public void updateTable(){
        try{
            Class.forName(comClass);
            conn = DriverManager.getConnection(connector, username, password);
            pst = conn.prepareStatement("select * from tbpakaian");
            
            rs = pst.executeQuery();
            ResultSetMetaData data = rs.getMetaData();
            
            q = data.getColumnCount();
            
            DefaultTableModel recordTb = (DefaultTableModel)tableBaju.getModel();
            recordTb.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(i = 1; i <= q; i++ ){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("namaPakaian"));
                    columnData.add(rs.getString("jenisPakaian"));
                    columnData.add(rs.getString("kategoriPakaian"));
                    columnData.add(rs.getString("ukuranPakaian"));
                    columnData.add(rs.getInt("hargaPakaian"));
                }
                recordTb.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public String getCheckBox(JCheckBox... checkBoxes ){
        StringBuilder selectedItem = new StringBuilder();
        
        for (JCheckBox checks : checkBoxes){
            if(checks.isSelected()){
                selectedItem.append(checks.getText()).append("|");
            }
        }
        return selectedItem.toString();
    }
    
    //================================================== FUNGSI CRUD ==================================================//
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JCheckBox checkL;
    private javax.swing.JCheckBox checkM;
    private javax.swing.JCheckBox checkS;
    private javax.swing.JCheckBox checkXL;
    private javax.swing.JComboBox<String> comboKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioTops;
    private javax.swing.JRadioButton radioTrouser;
    private javax.swing.JTable tableBaju;
    private javax.swing.JTextField textHarga;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNamaPakaian;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}