package be.storm.spring_pokemon.pl.dtos;

import be.storm.spring_pokemon.dl.entities.Pokemon;
import be.storm.spring_pokemon.dl.enums.PokemonSex;
import be.storm.spring_pokemon.dl.enums.PokemonType;

import java.util.UUID;

public record PokemonDetailsDTO(
        UUID id,
        int dexNbr,
        String name,
        PokemonSex sex,
        PokemonType type
) {

    public static PokemonDetailsDTO fromPokemon(Pokemon pokemon) {
        return new PokemonDetailsDTO(
                pokemon.getId(),
                pokemon.getDexNbr(),
                pokemon.getName(),
                pokemon.getSex(),
                pokemon.getType()
        );
    }
}
