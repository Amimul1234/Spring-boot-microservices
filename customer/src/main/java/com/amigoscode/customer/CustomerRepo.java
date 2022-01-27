package com.amigoscode.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
