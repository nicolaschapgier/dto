package com.example.pokemon.repository;

import com.example.pokemon.entity.Dresseurs;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DresseursRepository extends JpaRepository<Dresseurs,Long> {

}
