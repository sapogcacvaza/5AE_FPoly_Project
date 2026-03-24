/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.barber.repository;

import java.util.List;
import poly.barber.entity.Customer;
import poly.barber.util.XQuery;

/**
 *
 * @author Admin
 */
public class CustomerRepository implements ICommonRepository<Customer, Integer> {

    public String sqlGetOneById = "select * from Customer where CustomerID = ?";

    @Override
    public List<Customer> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer getOne(Integer id) {
        return XQuery.getSingleBean(Customer.class, sqlGetOneById, id);
    }

    @Override
    public void add(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
