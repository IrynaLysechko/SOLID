package com.epam.DIP;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
