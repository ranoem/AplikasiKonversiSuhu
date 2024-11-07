import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class KonversiSuhuFrame extends javax.swing.JFrame {
    private KonversiSuhuHelper helper;
    

    public KonversiSuhuFrame() {
        initComponents();
        setLocationRelativeTo(null);
        helper = new KonversiSuhuHelper();
        txtSuhu.getDocument().addDocumentListener(new DocumentListener() {
                public void insertUpdate(DocumentEvent e) { updateResult(); }
                public void removeUpdate(DocumentEvent e) { updateResult(); }
                public void changedUpdate(DocumentEvent e) { updateResult(); }
            });

            cmbKiri.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { updateResult(); }
            });

            cmbKanan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { updateResult(); }
            });

            radioKiriKeKanan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { updateResult(); }
            });

            radioKananKeKiri.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { updateResult(); }
            });
    
    }
    
    private void updateResult() {
        if (!radioKiriKeKanan.isSelected() && !radioKananKeKiri.isSelected()) {
            lblHasil.setText("Pilih arah konversi terlebih dahulu.");
            return;
        }

        String input = txtSuhu.getText().trim();

        if (input.isEmpty() || !KonversiSuhuHelper.isNumeric(input)) {
            lblHasil.setText("Input tidak valid!");
            return;
        }

        double value = Double.parseDouble(input);
        String fromScale = (String) cmbKiri.getSelectedItem();
        String toScale = (String) cmbKanan.getSelectedItem();

        if (radioKananKeKiri.isSelected()) {
            String temp = fromScale;
            fromScale = toScale;
            toScale = temp;
        }

        double result = KonversiSuhuHelper.convertTemperature(value, fromScale, toScale);
        lblHasil.setText(String.format("%.2f %s", result, toScale));
    }

    /*
    private void convertTemperature() {
        String input = txtSuhu.getText().trim(); 

        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Input tidak boleh kosong. Silakan masukkan nilai suhu.", "Input Tidak Valid", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        if (!KonversiSuhuHelper.isNumeric(input)) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid.", "Input Tidak Valid", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        double value = Double.parseDouble(input);
        String fromScale = (String) cmbKanan.getSelectedItem();
        String toScale = (String) cmbKiri.getSelectedItem();

        if (radioKiriKeKanan.isSelected()) {
            String temp = fromScale;
            fromScale = toScale;
            toScale = temp;
        }

        double result = KonversiSuhuHelper.convertTemperature(value, fromScale, toScale);
        JOptionPane.showMessageDialog(this, "Hasil: " + result + " " + toScale, "Hasil Konversi", JOptionPane.INFORMATION_MESSAGE);
    
    }*/
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        cmbKiri = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        btnKeluar = new javax.swing.JButton();
        btnKonversi = new javax.swing.JButton();
        cmbKanan = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        radioKiriKeKanan = new javax.swing.JRadioButton();
        radioKananKeKiri = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Konversi Suhu");

        jPanel1.setBackground(new java.awt.Color(182, 201, 155));

        jLabel1.setFont(new java.awt.Font("Roboto Lt", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aplikasi Konversi Suhu");

        txtSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuhuKeyTyped(evt);
            }
        });

        cmbKiri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        jPanel2.setBackground(new java.awt.Color(182, 201, 155));
        jPanel2.setLayout(new java.awt.BorderLayout());

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btnKeluar, java.awt.BorderLayout.CENTER);

        btnKonversi.setText("Konversi");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        jPanel2.add(btnKonversi, java.awt.BorderLayout.PAGE_START);

        cmbKanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Fahrenheit", "Reamur", "Kelvin" }));

        jPanel3.setBackground(new java.awt.Color(182, 201, 155));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        radioKiriKeKanan.setBackground(new java.awt.Color(182, 201, 155));
        buttonGroup1.add(radioKiriKeKanan);
        radioKiriKeKanan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioKiriKeKanan.setForeground(new java.awt.Color(255, 255, 255));
        radioKiriKeKanan.setText("Kiri ke Kanan");
        jPanel3.add(radioKiriKeKanan);

        radioKananKeKiri.setBackground(new java.awt.Color(182, 201, 155));
        buttonGroup1.add(radioKananKeKiri);
        radioKananKeKiri.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radioKananKeKiri.setForeground(new java.awt.Color(255, 255, 255));
        radioKananKeKiri.setText("Kanan ke Kiri");
        jPanel3.add(radioKananKeKiri);

        jPanel4.setBackground(new java.awt.Color(182, 201, 155));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Roboto Lt", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hasil:");

        lblHasil.setFont(new java.awt.Font("Roboto Lt", 1, 10)); // NOI18N
        lblHasil.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSuhu)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbKanan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        updateResult(); 
        
        String result = lblHasil.getText(); 
        
        if (result.equals("Pilih arah konversi terlebih dahulu.") || result.equals("Input tidak valid!")) {
            JOptionPane.showMessageDialog(null, result, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, result, "Hasil Konversi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtSuhuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuhuKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c) && c != '.' && c != ',' && c != evt.VK_BACK_SPACE) {
            evt.consume(); 
            
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka atau titik desimal.", "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtSuhuKeyTyped

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
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbKanan;
    private javax.swing.JComboBox<String> cmbKiri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JRadioButton radioKananKeKiri;
    private javax.swing.JRadioButton radioKiriKeKanan;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}
