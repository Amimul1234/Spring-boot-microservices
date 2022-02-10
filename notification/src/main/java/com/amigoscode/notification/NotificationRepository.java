package com.amigoscode.notification;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Amimul Ehsan
 * @Project amigosservices
 */

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
