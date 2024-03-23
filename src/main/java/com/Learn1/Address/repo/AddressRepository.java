package com.Learn1.Address.repo;


import com.Learn1.Address.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {

    public Address findByName(String name);
}
