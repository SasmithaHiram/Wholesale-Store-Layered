package repository.custom;

import dto.Customer;
import entity.CustomerEntity;
import repository.CRUDRepository;
import repository.SuperDao;

public interface CustomerDao extends CRUDRepository <CustomerEntity, String> {
}
