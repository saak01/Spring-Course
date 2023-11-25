package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CostumerService {
    List<Customer> listCostumers();
    Customer getById(UUID id);

    Customer saveNewCostumer(Customer customer);

}
