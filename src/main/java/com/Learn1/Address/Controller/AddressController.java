package com.Learn1.Address.Controller;

import com.Learn1.Address.Model.Address;
import com.Learn1.Address.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/address")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;
    @PostMapping("/saveAddress")
    public Address addAddress(@RequestBody Address address)
    {
        return addressRepository.save(address);
    }

    @GetMapping("/allAddress")
    public List<Address> getAllAddress()
    {
        return addressRepository.findAll();
    }

    @GetMapping("/health")
    public String health()
    {
        return "Hello";
    }

    @GetMapping("/getAddressByName/{name}")
    public Address getAllAddress(@PathVariable String name)
    {
        return addressRepository.findByName(name);
    }
}
