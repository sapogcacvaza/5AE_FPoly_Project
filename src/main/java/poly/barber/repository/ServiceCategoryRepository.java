/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.barber.repository;

import java.util.List;
import poly.barber.entity.ServiceCategory;
import poly.barber.util.XQuery;

/**
 *
 * @author DELL
 */
public class ServiceCategoryRepository implements ICommonRepository<ServiceCategory, Integer>{
     private String getOne = "SELECT ServiceCategoryID, ServiceCategoryName FROM ServiceCategory";
    private String sqlDetail = "SELECT ServiceCategoryID, ServiceCategoryName FROM ServiceCategory WHERE ServiceCategoryID = ?";
    
    public List<ServiceCategory>getAll(){
        return XQuery.getBeanList(ServiceCategory.class, getOne);
    }

    @Override
    public ServiceCategory getOne(Integer id) {
        return XQuery.getSingleBean(ServiceCategory.class, sqlDetail, id);
    }

    @Override
    public void add(ServiceCategory obj) {
        String sql = "INSERT INTO ServiceCategory (ServiceCategoryName) VALUES (?)";
    XQuery.update(sql, obj.getServiceCategoryName());
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(ServiceCategory obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
