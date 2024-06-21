package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entities.PaperEntity;

@Repository
public interface PaperRepository extends JpaRepository<PaperEntity, Integer>
{

}
