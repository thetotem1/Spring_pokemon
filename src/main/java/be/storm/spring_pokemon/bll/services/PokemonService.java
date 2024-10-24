package be.storm.spring_pokemon.bll.services;

import be.storm.spring_pokemon.dl.entities.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> findAll();
}
