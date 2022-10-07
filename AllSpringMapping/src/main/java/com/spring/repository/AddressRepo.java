package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Address;

public interface AddressRepo extends JpaRepository<Address,Integer>{

}
