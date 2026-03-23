/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.barber.repository;

import java.util.List;
import poly.barber.entity.Service;
import poly.barber.util.XQuery;
/**
 *
 * @author DELL
 */
public class ServiceRepository implements ICommonRepository<Service, Integer>{
    private String hienThi = "select ServiceID, ServiceName, Price, Duration, ServiceCategoryID\n" +
"from Service";
    private String sqlDetail = "SELECT * FROM Service WHERE ServiceCategoryID = ?";
    private String insertSql = "INSERT INTO Service (ServiceName, Price, Duration, ServiceCategoryID) VALUES (?, ?, ?, ?)";
    private String updateSql = "UPDATE Service SET ServiceName = ?, Price = ?, Duration = ?, ServiceCategoryID = ? WHERE ServiceID = ?";
    public List<Service>getAll(){
        return XQuery.getBeanList(Service.class, hienThi);
    }

    @Override
    public Service getOne(Integer id) {
        return XQuery.getSingleBean(Service.class, sqlDetail, id);
    }

    @Override
    public void add(Service obj) {
        XQuery.update(insertSql, 
                obj.getServiceName(), 
                obj.getPrice(), 
                obj.getDuration(), 
                obj.getServiceCategoryID());
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Service obj) {
        XQuery.update(updateSql, 
            obj.getServiceName(), 
            obj.getPrice(), 
            obj.getDuration(), 
            obj.getServiceCategoryID(), 
            obj.getServiceID()); // ID is the last '?' for WHERE clause
    }
    public List<Service> getByType(int categoryId) {
    String sql = "SELECT ServiceID, ServiceName, Price, Duration, ServiceCategoryID " +
                 "FROM Service WHERE ServiceCategoryID = ?";
    return XQuery.getBeanList(Service.class, sql, categoryId);
}
}

