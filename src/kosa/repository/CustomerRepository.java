package kosa.repository;

import kosa.customer.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerRepository {

    private static final Map<Long, Customer> store = new HashMap<>();
    private static long sequence = 0L;

    public Customer save(Customer customer){
        customer.setCustomerId(++sequence);
        store.put(customer.getCustomerId(), customer);
        return customer;
    }

    public Customer findById(Long id){
        return store.get(id);
    }

    public List<Customer> findAll(){
        return store.values().stream().collect(Collectors.toList());
    }

    public void update(Long customerId, Customer updateParam){
        Customer findCustomer = findById(customerId);

    }
}
