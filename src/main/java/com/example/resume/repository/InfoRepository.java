package com.example.resume.repository;

import com.example.resume.model.dto.InfoDto;
import com.example.resume.model.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {

    Info findByName(String name);
}
