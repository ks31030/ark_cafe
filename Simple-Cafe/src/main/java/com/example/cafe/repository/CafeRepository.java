package com.example.cafe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cafe.model.Cafe;

public interface CafeRepository extends JpaRepository<Cafe, Long>{
	int countByLocation(String location);
	boolean existsByName(String name);
	List<Cafe> findByNameContaining(String keyword);
}
