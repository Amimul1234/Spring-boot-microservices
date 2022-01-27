package com.amigoscode.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Repository
public interface FraudCheckHistoryRepo extends JpaRepository<FraudCheckHistory, Integer> {
}
