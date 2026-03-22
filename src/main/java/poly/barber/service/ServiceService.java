package poly.barber.service;

import java.util.List;
import poly.barber.entity.Service;
import poly.barber.repository.Impl.ServiceRepositoryImpl;

public class ServiceService {

    ServiceRepositoryImpl repo = new ServiceRepositoryImpl();

    public List<Service> getAll() {
        return repo.getAll();
    }

    public Service getOne(int serviceID) {
        return repo.getOne(serviceID);
    }
}
