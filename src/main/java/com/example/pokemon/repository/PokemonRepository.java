package com.example.pokemon.repository;

import com.example.pokemon.entity.Pokemon;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Pokemon findByName();
}
