package com.newAPI.myown.repository;
import com.newAPI.myown.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
