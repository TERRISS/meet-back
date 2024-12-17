package org.timosha.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.timosha.model.EventEntity;

import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, Long> {
    // Метод для получения мероприятия по ID
    Optional<EventEntity> findEventById(Long id);

    // Метод для удаления мероприятия по ID
    void deleteEventById(Long id);
}