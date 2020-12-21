package com.epam.DIP;

import java.util.List;
import java.util.Optional;

public class SimpleCustomerDao implements CustomerDAO{
    @Override
    public Optional<Customer> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
