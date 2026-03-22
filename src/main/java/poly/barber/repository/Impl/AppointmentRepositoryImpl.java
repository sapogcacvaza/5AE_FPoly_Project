package poly.barber.repository.Impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import poly.barber.entity.Appointment;
import poly.barber.entity.AppointmentDetail;
import poly.barber.repository.ICommonRepository;
import poly.barber.util.XJdbc;
import poly.barber.util.XQuery;

public class AppointmentRepositoryImpl implements ICommonRepository<Appointment, Integer> {

    String getAll = "select * from Appointment";
    String getUniversalCalendar = "{CALL getUniversalCalendar(?, ?, ?, ?)}";
//    String getWeekCalendar = "{CALL getWeekCalendar}";
//    String getLastWeekCalendar = "{CALL getLastWeekCalendar}";
//    String getNextWeekCalendar = "{CALL getNextWeekCalendar}";

    @Override
    public List<Appointment> getAll() {
        return XQuery.getBeanList(Appointment.class, getAll);
    }

//    public List<Object[]> getWeekCalendar() {
//        List<Object[]> list = new ArrayList<>();
//        // Cú pháp gọi Store Procedure trong SQL Server
//
//        try (java.sql.Connection con = poly.barber.util.XJdbc.openConnection(); java.sql.CallableStatement cs = con.prepareCall(getWeekCalendar)) {
//
//            java.sql.ResultSet rs = cs.executeQuery();
//            while (rs.next()) {
//                // Procedure trả về 8 cột: Time, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//                Object[] row = new Object[8];
//                row[0] = rs.getString("Time");
//                row[1] = rs.getString("Monday");
//                row[2] = rs.getString("Tuesday");
//                row[3] = rs.getString("Wednesday");
//                row[4] = rs.getString("Thursday");
//                row[5] = rs.getString("Friday");
//                row[6] = rs.getString("Saturday");
//                row[7] = rs.getString("Sunday");
//
//                // Xử lý để không hiện chữ "null" trên bảng JTable
//                for (int i = 1; i < 8; i++) {
//                    if (row[i] == null) {
//                        row[i] = "";
//                    }
//                }
//
//                list.add(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    public List<Object[]> getLastWeekCalendar() {
//        List<Object[]> list = new ArrayList<>();
//        // Cú pháp gọi Store Procedure trong SQL Server
//
//        try (java.sql.Connection con = poly.barber.util.XJdbc.openConnection(); java.sql.CallableStatement cs = con.prepareCall(getLastWeekCalendar)) {
//
//            java.sql.ResultSet rs = cs.executeQuery();
//            while (rs.next()) {
//                // Procedure trả về 8 cột: Time, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//                Object[] row = new Object[8];
//                row[0] = rs.getString("Time");
//                row[1] = rs.getString("Monday");
//                row[2] = rs.getString("Tuesday");
//                row[3] = rs.getString("Wednesday");
//                row[4] = rs.getString("Thursday");
//                row[5] = rs.getString("Friday");
//                row[6] = rs.getString("Saturday");
//                row[7] = rs.getString("Sunday");
//
//                // Xử lý để không hiện chữ "null" trên bảng JTable
//                for (int i = 1; i < 8; i++) {
//                    if (row[i] == null) {
//                        row[i] = "";
//                    }
//                }
//
//                list.add(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    public List<Object[]> getNextWeekCalendar() {
//        List<Object[]> list = new ArrayList<>();
//        // Cú pháp gọi Store Procedure trong SQL Server
//
//        try (java.sql.Connection con = poly.barber.util.XJdbc.openConnection(); java.sql.CallableStatement cs = con.prepareCall(getNextWeekCalendar)) {
//
//            java.sql.ResultSet rs = cs.executeQuery();
//            while (rs.next()) {
//                // Procedure trả về 8 cột: Time, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//                Object[] row = new Object[8];
//                row[0] = rs.getString("Time");
//                row[1] = rs.getString("Monday");
//                row[2] = rs.getString("Tuesday");
//                row[3] = rs.getString("Wednesday");
//                row[4] = rs.getString("Thursday");
//                row[5] = rs.getString("Friday");
//                row[6] = rs.getString("Saturday");
//                row[7] = rs.getString("Sunday");
//
//                // Xử lý để không hiện chữ "null" trên bảng JTable
//                for (int i = 1; i < 8; i++) {
//                    if (row[i] == null) {
//                        row[i] = "";
//                    }
//                }
//
//                list.add(row);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
    public List<Object[]> getUniversalCalendar(int weekIndex, int status, String barber, String customer) {
        List<Object[]> list = new ArrayList<>();
        // Tên Procedure mới có 4 tham số

        try (java.sql.Connection con = poly.barber.util.XJdbc.openConnection(); java.sql.CallableStatement cs = con.prepareCall(getUniversalCalendar)) {

            // Truyền các tham số vào Procedure
            cs.setInt(1, weekIndex);
            cs.setInt(2, status);
            cs.setString(3, barber);
            cs.setString(4, customer);

            try (java.sql.ResultSet rs = cs.executeQuery()) {
                while (rs.next()) {
                    Object[] row = new Object[8];
                    row[0] = rs.getString("Time");
                    row[1] = rs.getString("Monday");
                    row[2] = rs.getString("Tuesday");
                    row[3] = rs.getString("Wednesday");
                    row[4] = rs.getString("Thursday");
                    row[5] = rs.getString("Friday");
                    row[6] = rs.getString("Saturday");
                    row[7] = rs.getString("Sunday");

                    // Xử lý null để JTable hiển thị sạch sẽ
                    for (int i = 1; i < 8; i++) {
                        if (row[i] == null) {
                            row[i] = "";
                        }
                    }
                    list.add(row);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Appointment getOne(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(Appointment obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Appointment obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
