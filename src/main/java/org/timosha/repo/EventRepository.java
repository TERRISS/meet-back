package org.timosha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.timosha.model.EventEntity;
import org.timosha.model.User;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {
    boolean getEventById(int id);
    boolean createEvent(String username);
    boolean existsByEmail(String email);
}