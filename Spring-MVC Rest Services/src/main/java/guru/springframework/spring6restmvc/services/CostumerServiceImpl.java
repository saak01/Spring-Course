package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class CostumerServiceImpl implements CostumerService {
    Map<UUID, Customer> customerMap;

    public CostumerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer customer1 = Customer.builder().
                id(UUID.randomUUID())
                .customerName("Joao Costa")
                .version(1)
                .lastModifiedDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        Customer customer2 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Lucas Costa")
                .version(1)
                .lastModifiedDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        Customer customer3 = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Bruno")
                .version(1)
                .lastModifiedDate(LocalDateTime.now())
                .createDate(LocalDateTime.now())
                .build();

        customerMap.put(customer1.getId(), customer1);
        customerMap.put(customer2.getId(), customer2);
        customerMap.put(customer3.getId(), customer3);

    }

    @Override
    public List<Customer> listCostumers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getById(UUID id) {
        return customerMap.get(id);
    }

    @Override
    public Customer saveNewCostumer(Customer customer) {

        Customer savedCustomer = Customer.builder()
                .id(UUID.randomUUID())
                .customerName(customer.getCustomerName())
                .createDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .version(1)
                .build();

       customerMap.put(customer.getId(),savedCustomer);


        return savedCustomer;
    }


}
