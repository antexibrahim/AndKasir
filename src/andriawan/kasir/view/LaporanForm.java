/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andriawan.kasir.view;

import andriawan.kasir.controller.BarangController;
import andriawan.kasir.controller.LaporanController;
import andriawan.kasir.model.Barang;
import andriawan.kasir.model.TabelLaporan;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import utilities.Formater;

/**
 *
 * @author andriawan
 */
public class LaporanForm extends javax.swing.JFrame {

    /**
     * Creates new form LaporanForm
     */
    public LaporanForm() {
        initComponents();
        
        // SET ICON RESOURCE
        ImageIcon iconBtnCariLaporan = new ImageIcon(
                new ImageIcon("resources/search.png").getImage().
        getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        btnLihatLaporan.setIcon(iconBtnCariLaporan);
        
        // SET ICON RESOURCE
        ImageIcon iconCetakPdf = new ImageIcon(
                new ImageIcon("resources/print.png").getImage().
        getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
        btnCetakPdf.setIcon(iconCetakPdf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLaporan = new javax.swing.JPanel();
        btnCetakPdf = new javax.swing.JButton();
        labelHeaderLaporan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelLaporan = new javax.swing.JTable();
        btnLihatLaporan = new javax.swing.JButton();
        txtTanggalLaporan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotalPendapatan = new javax.swing.JLabel();
        txtBarangMasuk = new javax.swing.JLabel();
        txtBarangKeluar = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTglRange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laporan");
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        btnCetakPdf.setBackground(new java.awt.Color(0, 102, 255));
        btnCetakPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnCetakPdf.setText("Cetak PDF");
        btnCetakPdf.setBorderPainted(false);
        btnCetakPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakPdfActionPerformed(evt);
            }
        });

        labelHeaderLaporan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHeaderLaporan.setText("Pilih Tanggal Laporan");

        tabelLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelLaporan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelLaporan);

        btnLihatLaporan.setBackground(new java.awt.Color(0, 102, 255));
        btnLihatLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnLihatLaporan.setText("Lihat Laporan");
        btnLihatLaporan.setBorderPainted(false);
        btnLihatLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLihatLaporanActionPerformed(evt);
            }
        });

        txtTanggalLaporan.setText("Laporan Tanggal");

        jLabel3.setText("Barang Masuk  :");

        jLabel4.setText("Barang Keluar  :");

        jLabel5.setText("Total Pendapatan");

        txtTotalPendapatan.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtTotalPendapatan.setText("Total Pendapatan");

        txtBarangMasuk.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtBarangMasuk.setText("Barang Masuk");

        txtBarangKeluar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txtBarangKeluar.setText("Barang Keluar");

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    new java.awt.Color(51, 51, 51),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dateChooserCombo1.setLocale(new java.util.Locale("in", "", ""));

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(255, 255, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(51, 51, 51),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(51, 51, 51),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                new java.awt.Color(51, 51, 51),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserCombo2.setCalendarBackground(new java.awt.Color(0, 102, 255));
dateChooserCombo2.setLocale(new java.util.Locale("in", "", ""));

jLabel1.setText("Dari Tanggal");

jLabel2.setText("Hingga");

txtTglRange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

javax.swing.GroupLayout panelLaporanLayout = new javax.swing.GroupLayout(panelLaporan);
panelLaporan.setLayout(panelLaporanLayout);
panelLaporanLayout.setHorizontalGroup(
    panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(panelLaporanLayout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHeaderLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtTanggalLaporan)
            .addComponent(jLabel5)
            .addComponent(jLabel3)
            .addComponent(jLabel4)
            .addGroup(panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtTotalPendapatan, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelLaporanLayout.createSequentialGroup()
                .addComponent(btnLihatLaporan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCetakPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
            .addComponent(jLabel2)
            .addComponent(txtBarangMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(txtTglRange))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelLaporanLayout.setVerticalGroup(
        panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelLaporanLayout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addComponent(labelHeaderLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel2)
            .addGap(4, 4, 4)
            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(panelLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnLihatLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnCetakPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(txtTanggalLaporan)
            .addGap(18, 18, 18)
            .addComponent(txtTglRange)
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addGap(18, 18, 18)
            .addComponent(txtTotalPendapatan)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addGap(18, 18, 18)
            .addComponent(txtBarangMasuk)
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addGap(18, 18, 18)
            .addComponent(txtBarangKeluar)
            .addContainerGap(171, Short.MAX_VALUE))
        .addGroup(panelLaporanLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 1163, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 746, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakPdfActionPerformed
        btnLihatLaporanActionPerformed(null);
        try {
            LaporanController.printReportToPDF(txtTglRange.getText(), tabelLaporan, 
                    txtTglRange.getText(),
                    txtTotalPendapatan.getText(),
                    txtBarangMasuk.getText(),
                    txtBarangKeluar.getText());
        } catch (IOException ex) {
            Logger.getLogger(LaporanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCetakPdfActionPerformed

    private void btnLihatLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLihatLaporanActionPerformed
        
        LaporanController lc = LaporanController.getInstanceLaporanController();        
        BarangController bc = BarangController.getInstance();
        
        try {
            Barang br = bc.getJumlahBarangMasuk(Formater.setStringReadySql(
                    dateChooserCombo1.getSelectedDate().getTimeInMillis()),
                    Formater.setStringReadySql(
                            dateChooserCombo2.getSelectedDate().getTimeInMillis()));
            
            txtBarangMasuk.setText(String.valueOf(
                    br.getJumlahBarangMasuk()));
            
        } catch (SQLException ex) {
            Logger.getLogger(LaporanForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        TabelLaporan tl = new TabelLaporan(
                lc.getReport(Formater.setStringReadySql(
                        dateChooserCombo1.getSelectedDate().getTimeInMillis()),
                        Formater.setStringReadySql(
                                dateChooserCombo2.getSelectedDate().getTimeInMillis())));
        
        tabelLaporan.setModel(tl);
        jScrollPane1.setViewportView(tabelLaporan);
        
        int jumlah = 0;
        int totalHarga = 0;
        
        for (int i = 0; i < tabelLaporan.getRowCount(); i++) {
            jumlah = jumlah + new Integer(
                    tabelLaporan.getValueAt(i, 6).toString());
            totalHarga = totalHarga + (
                    Formater.setRupiahToInteger(
                    tabelLaporan.getValueAt(i, 5).toString()) *
                    new Integer(
                    tabelLaporan.getValueAt(i, 6).toString()));
        }
        
        txtTglRange.setText(
                Formater.setNiceIndonesianDateShort(
                        dateChooserCombo1.getSelectedDate().getTimeInMillis()) + " - " +
                Formater.setNiceIndonesianDateShort(
                        dateChooserCombo2.getSelectedDate().getTimeInMillis()));
        txtTotalPendapatan.setText(Formater.setRupiahFormat(totalHarga));
        txtBarangKeluar.setText(String.valueOf(jumlah));
        
    }//GEN-LAST:event_btnLihatLaporanActionPerformed

    //CUSTOM CODE


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetakPdf;
    private javax.swing.JButton btnLihatLaporan;
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHeaderLaporan;
    private javax.swing.JPanel panelLaporan;
    private javax.swing.JTable tabelLaporan;
    private javax.swing.JLabel txtBarangKeluar;
    private javax.swing.JLabel txtBarangMasuk;
    private javax.swing.JLabel txtTanggalLaporan;
    private javax.swing.JLabel txtTglRange;
    private javax.swing.JLabel txtTotalPendapatan;
    // End of variables declaration//GEN-END:variables
}
