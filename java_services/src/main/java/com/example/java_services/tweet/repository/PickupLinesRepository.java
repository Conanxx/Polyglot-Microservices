package com.example.java_services.tweet.repository;

import com.example.java_services.tweet.domain.PickupLines;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PickupLinesRepository extends CrudRepository<PickupLines, Long> {
    Optional<PickupLines> findById(final Long id);
}

