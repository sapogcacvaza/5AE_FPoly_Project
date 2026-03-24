/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.barber.repository;

import java.util.List;
import poly.barber.entity.Employee;
import poly.barber.util.XQuery;

/**
 *
 * @author Admin
 */
public class EmployeeRepository implements ICommonRepository<Employee, Integer>{
    public String sqlOneByID= "select *from Employee where EmployeeID = ?";
        


    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Employee getOne(Integer id) {
         return XQuery.getSingleBean(Employee.class, sqlOneByID, id);
    }

    @Override
    public void add(Employee obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Employee obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
