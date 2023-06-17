package com.logistic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logistic.Load;

import java.util.List;

@Repository
public interface LoadRepository extends JpaRepository<Load, String> {
    List<Load> findByShipperId(String shipperId);
}