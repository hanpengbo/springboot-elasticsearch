package com.jx.es.elasticsearch.domain.Customer;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by hpb on 2018-03-08.
 */
public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
