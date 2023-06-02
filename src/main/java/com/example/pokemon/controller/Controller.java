package com.example.pokemon.controller;

import com.example.pokemon.dto.PokemonDto;
import com.example.pokemon.entity.Dresseurs;
import com.example.pokemon.entity.Pokemon;
import com.example.pokemon.repository.DresseursRepository;
import com.example.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    DresseursRepository dresseursRepository;

    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/dresseurPokemonsList")
    public ResponseEntity<?> getRoles() {
        Dresseurs dresseurs = dresseursRepository.findById(1L).get();
        List<Pokemon> pokemons = dresseurs.getPokemons();
        List<PokemonDto> pokemonsDto = new ArrayList<PokemonDto>();
        int i = 0;
        for (Pokemon pokemon : pokemons) {
            PokemonDto pokemonDto = new PokemonDto();
            pokemonDto.setName(pokemon.getName());
            pokemonDto.setAttribut(pokemon.getAttribut());
            pokemonsDto.add(i, pokemonDto);
            i++;
        }
        return new ResponseEntity<>(pokemonsDto, HttpStatus.OK);
    }


    @GetMapping("/pokemon")
    public ResponseEntity<?> getPokemon() {
        Pokemon pokemon = pokemonRepository.findByName();
        PokemonDto pokemonDto = new PokemonDto();
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setAttribut(pokemon.getAttribut());

        return new ResponseEntity<>(pokemonDto, HttpStatus.OK);
    }


}
