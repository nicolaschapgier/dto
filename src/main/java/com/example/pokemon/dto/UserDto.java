package com.example.pokemon.dto;

import com.example.pokemon.entity.Pokemon;

import java.util.List;

public class UserDto {
    private String name;
    private List<Pokemon> pokemons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
