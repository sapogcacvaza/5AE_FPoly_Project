package poly.barber.repository.Impl;

import java.util.List;
import poly.barber.entity.Service;
import poly.barber.repository.ICommonRepository;
import poly.barber.util.XQuery;

public class ServiceRepositoryImpl implements ICommonRepository<Service, Integer> {

    String getAll = "select * from Service";

    String getOne = "select * from Service where ServiceID = ?";

    @Override
    public List<Service> getAll() {
        return XQuery.getBeanList(Service.class, getAll);
    }

    @Override
    public Service getOne(Integer id) {
        return XQuery.getSingleBean(Service.class, getOne, id);
    }

    @Override
    public void add(Service obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Service obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
