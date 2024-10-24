package be.storm.spring_pokemon.pl.dtos;

import be.storm.spring_pokemon.dl.entities.Pokemon;
import be.storm.spring_pokemon.dl.enums.PokemonSex;
import be.storm.spring_pokemon.dl.enums.PokemonType;

public record PokemonDTO(
        int dexNbr,
        String name,
        PokemonSex sex,
        PokemonType type
) {

    public static PokemonDTO fromPokemon(Pokemon p) {
        return new PokemonDTO(
                p.getDexNbr(),
                p.getName(),
                p.getSex(),
                p.getType()
        );
    }
}
