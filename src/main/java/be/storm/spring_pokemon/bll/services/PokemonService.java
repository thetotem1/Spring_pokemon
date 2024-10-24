package be.storm.spring_pokemon.bll.services;

import be.storm.spring_pokemon.dl.entities.Pokemon;

import java.util.List;
import java.util.UUID;

public interface PokemonService {

    List<Pokemon> findAll();
    Pokemon findById(UUID id);
}
