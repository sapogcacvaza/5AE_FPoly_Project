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
public class ServiceCategoryRepository {
     private String getOne = "SELECT ServiceCategoryID, ServiceCategoryName FROM ServiceCategory";
    private String sqlDetail = "SELECT ServiceCategoryID, ServiceCategoryName FROM ServiceCategory WHERE ServiceCategoryID = ?";
    
    public List<ServiceCategory>getAll(){
        return XQuery.getBeanList(ServiceCategory.class, getOne);
    }
    public ServiceCategory getOne(int id){
        return XQuery.getSingleBean(ServiceCategory.class, sqlDetail, id);
    }
}
