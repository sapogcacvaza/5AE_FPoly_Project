package poly.barber.view.dialog;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import poly.barber.controller.Impl.AppointmentController;
import poly.barber.entity.Appointment;
import poly.barber.service.AppointmentDetailService;
import poly.barber.service.AppointmentService;
import poly.barber.service.BarberService;
import poly.barber.service.ServiceService;

public class AppointmentJDialog extends javax.swing.JDialog implements AppointmentController {

    DefaultTableModel modelCalendar = new DefaultTableModel();

    DefaultComboBoxModel<String> comboWeek = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> comboBarber = new DefaultComboBoxModel<>();

    AppointmentService serAppointment = new AppointmentService();
    AppointmentDetailService serAppointmentDetail = new AppointmentDetailService();
    ServiceService serService = new ServiceService();
    BarberService serBarber = new BarberService();

    public AppointmentJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        open();

        tblCalendar.setRowHeight(130);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupStatus = new javax.swing.ButtonGroup();
        Tabbs = new javax.swing.JTabbedPane();
        panelCalendar = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        cboWeek = new javax.swing.JComboBox<>();
        btnAddAppoint = new javax.swing.JButton();
        rdoPending = new javax.swing.JRadioButton();
        rdoCanceled = new javax.swing.JRadioButton();
        rdoCheckIned = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalendar = new javax.swing.JTable();
        cboBarber = new javax.swing.JComboBox<>();
        btnCancelFilter = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        panelCrud = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LỊCH");

        txtFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFindActionPerformed(evt);
            }
        });

        cboWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboWeekActionPerformed(evt);
            }
        });

        btnAddAppoint.setText("Thêm lịch");

        btnGroupStatus.add(rdoPending);
        rdoPending.setText("Chưa đến");
        rdoPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPendingActionPerformed(evt);
            }
        });

        btnGroupStatus.add(rdoCanceled);
        rdoCanceled.setText("Đã hủy");
        rdoCanceled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCanceledActionPerformed(evt);
            }
        });

        btnGroupStatus.add(rdoCheckIned);
        rdoCheckIned.setText("Đã đến");
        rdoCheckIned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCheckInedActionPerformed(evt);
            }
        });

        btnGroupStatus.add(rdoAll);
        rdoAll.setText("Tất cả");
        rdoAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAllActionPerformed(evt);
            }
        });

        tblCalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCalendar);

        cboBarber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboBarber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarberActionPerformed(evt);
            }
        });

        btnCancelFilter.setText("bỏ lọc");
        btnCancelFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelFilterActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCalendarLayout = new javax.swing.GroupLayout(panelCalendar);
        panelCalendar.setLayout(panelCalendarLayout);
        panelCalendarLayout.setHorizontalGroup(
            panelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(panelCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addGap(58, 58, 58)
                .addComponent(cboBarber, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(btnAddAppoint, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(panelCalendarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(rdoAll, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoPending, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoCheckIned, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rdoCanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelFilter)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCalendarLayout.setVerticalGroup(
            panelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalendarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAppoint)
                    .addComponent(cboBarber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCalendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoPending)
                    .addComponent(rdoCanceled)
                    .addComponent(rdoCheckIned)
                    .addComponent(btnCancelFilter)
                    .addComponent(rdoAll))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabbs.addTab("LỊCH", panelCalendar);

        jButton2.setText("CHỌN KHÁCH HÀNG");

        jLabel1.setText("TÊN KHÁCH HÀNG:");

        jButton3.setText("CHỌN NGÀY");

        jLabel2.setText("NGÀY:");

        jButton4.setText("LOẠI DỊCH VỤ 1");

        jButton5.setText("LOẠI DỊCH VỤ 2");

        jButton6.setText("LOẠI DỊCH VỤ 3");

        jButton7.setText("LOẠI DỊCH VỤ 4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TÊN DỊCH VỤ", "GIÁ DỊCH VỤ", "THỜI GIAN", "LOẠI DỊCH VỤ"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout panelCrudLayout = new javax.swing.GroupLayout(panelCrud);
        panelCrud.setLayout(panelCrudLayout);
        panelCrudLayout.setHorizontalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(606, Short.MAX_VALUE))
        );
        panelCrudLayout.setVerticalGroup(
            panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        Tabbs.addTab("BIỂU MẪU", panelCrud);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabbs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabbs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoPendingActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_rdoPendingActionPerformed

    private void cboWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboWeekActionPerformed
        int index = cboWeek.getSelectedIndex();

        setCalendarHeaderTables(serAppointment.getCalendarHeaderTables(index));

        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_cboWeekActionPerformed

    private void btnCancelFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelFilterActionPerformed
        rdoAll.setSelected(true);
        cboBarber.setSelectedIndex(0);
        txtFind.setText("");
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_btnCancelFilterActionPerformed

    private void rdoAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAllActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_rdoAllActionPerformed

    private void rdoCheckInedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCheckInedActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_rdoCheckInedActionPerformed

    private void cboBarberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarberActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_cboBarberActionPerformed

    private void rdoCanceledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCanceledActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_rdoCanceledActionPerformed

    private void txtFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFindActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        fillToTable(serAppointment.getAll());
    }//GEN-LAST:event_btnFindActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AppointmentJDialog dialog = new AppointmentJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public void open() {
        this.setLocationRelativeTo(null);

        comboWeek = (DefaultComboBoxModel<String>) cboWeek.getModel();

        comboBarber = (DefaultComboBoxModel<String>) cboBarber.getModel();

        fillToComboWeek();

        fillToComboBarber();

        cboWeek.setSelectedIndex(1);

        this.setCalendarHeaderTables(serAppointment.getCalendarHeaderTables(1));

        fillToTable(serAppointment.getAll());
    }

    public void setCalendarHeaderTables(List<String> lst) {
        String[] columns = lst.toArray(new String[0]);

        modelCalendar = (DefaultTableModel) tblCalendar.getModel();

        modelCalendar.setColumnIdentifiers(columns);
    }

    @Override
    public void setForm(Appointment entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Appointment getForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fillToTable(List<Appointment> lst) {
        int week = cboWeek.getSelectedIndex();
        int status;
        if (rdoPending.isSelected()) {
            status = 1; // Chưa đến
        } else if (rdoCheckIned.isSelected()) {
            status = 2; // Đã đến
        } else if (rdoCanceled.isSelected()) {
            status = 3; // Đã hủy
        } else {
            status = 0; // Tất cả
        }

        // ... (giữ nguyên đoạn check radio button status) ...
        // SỬA TẠI ĐÂY: Kiểm tra null cho JComboBox
        Object selectedBarber = cboBarber.getSelectedItem();
        String barber = (selectedBarber != null) ? selectedBarber.toString().trim() : "";

        // Nếu bạn có mục "Tất cả" hoặc mục trống ở đầu, hãy xử lý thêm:
        if (barber.equals(" ") || barber.isEmpty()) {
            barber = "";
        }

        String customer = txtFind.getText().trim();

        // Gọi Service
        List<Object[]> data = serAppointment.getUniversalCalendar(week, status, barber, customer);

        modelCalendar.setRowCount(0);
        for (Object[] rows : data) {
            modelCalendar.addRow(rows);
        }
    }

//    public void fillToCalendar() {
//        modelCalendar.setRowCount(0);
//
//        List<Object[]> data = serAppointment.getWeekCalendar();
//
//        int index = cboWeek.getSelectedIndex();
//
//        if (index == 0) {
//            data = serAppointment.getLastWeekCalendar();
//        } else if (index == 1) {
//            data = serAppointment.getWeekCalendar();
//        } else {
//            data = serAppointment.getNextWeekCalendar();
//        }
//
//        // 3. Đổ dữ liệu vào bảng
//        for (Object[] row : data) {
//            modelCalendar.addRow(row);
//        }
//    }
    public void fillToComboWeek() {
        comboWeek.removeAllElements();

        String[] items = {"lịch tuần trước", "lịch tuần này", "lịch tuần sau"};

        for (String i : items) {
            comboWeek.addElement(i);
        }

    }

    public void fillToComboBarber() {
        comboBarber.removeAllElements();

        List<String> items = serBarber.fillToComboBarberName(serBarber.getAll());

        for (String item : items) {
            comboBarber.addElement(item);
        }
    }

    @Override
    public void edit() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEditable(boolean editable) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void checkAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void uncheckAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCheckedItems() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveFirst() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void movePrevious() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveLast() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveTo(int rowIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabbs;
    private javax.swing.JButton btnAddAppoint;
    private javax.swing.JButton btnCancelFilter;
    private javax.swing.JButton btnFind;
    private javax.swing.ButtonGroup btnGroupStatus;
    private javax.swing.JComboBox<String> cboBarber;
    private javax.swing.JComboBox<String> cboWeek;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelCalendar;
    private javax.swing.JPanel panelCrud;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoCanceled;
    private javax.swing.JRadioButton rdoCheckIned;
    private javax.swing.JRadioButton rdoPending;
    private javax.swing.JTable tblCalendar;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
