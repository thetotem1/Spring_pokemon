package be.storm.spring_pokemon.il.initializers;

import be.storm.spring_pokemon.dal.repositories.PokemonRepository;
import be.storm.spring_pokemon.dl.entities.Pokemon;
import be.storm.spring_pokemon.dl.enums.PokemonSex;
import be.storm.spring_pokemon.dl.enums.PokemonType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PokemonData implements CommandLineRunner {

    private final PokemonRepository pokemonRepository;

//    public PokemonData(PokemonRepository pokemonRepository) {
//        this.pokemonRepository = pokemonRepository;
//    }

    @Override
    public void run(String... args) throws Exception {
        if (pokemonRepository.count() == 0) {
            List<Pokemon> pokemons = List.of(
                    new Pokemon(UUID.randomUUID(), 1, "Bulbasaur", PokemonSex.FEMALE, PokemonType.GRASS),
                    new Pokemon(UUID.randomUUID(), 2, "Charmander", PokemonSex.MALE, PokemonType.FIRE),
                    new Pokemon(UUID.randomUUID(), 3, "Squirtle", PokemonSex.MALE, PokemonType.WATER),
                    new Pokemon(UUID.randomUUID(), 4, "Pidgey", PokemonSex.FEMALE, PokemonType.FLYING),
                    new Pokemon(UUID.randomUUID(), 5, "Rattata", PokemonSex.FEMALE, PokemonType.NORMAL),
                    new Pokemon(UUID.randomUUID(), 6, "Zubat", PokemonSex.MALE, PokemonType.POISON),
                    new Pokemon(UUID.randomUUID(), 7, "Sandshrew", PokemonSex.FEMALE, PokemonType.GROUND),
                    new Pokemon(UUID.randomUUID(), 8, "Onix", PokemonSex.UNKNOWN, PokemonType.ROCK),
                    new Pokemon(UUID.randomUUID(), 9, "Jigglypuff", PokemonSex.FEMALE, PokemonType.FAIRY),
                    new Pokemon(UUID.randomUUID(), 10, "Machop", PokemonSex.MALE, PokemonType.FIGHTING),
                    new Pokemon(UUID.randomUUID(), 11, "Abra", PokemonSex.MALE, PokemonType.PSYCHIC),
                    new Pokemon(UUID.randomUUID(), 12, "Magnemite", PokemonSex.UNKNOWN, PokemonType.STEEL),
                    new Pokemon(UUID.randomUUID(), 13, "Psyduck", PokemonSex.FEMALE, PokemonType.WATER),
                    new Pokemon(UUID.randomUUID(), 14, "Dratini", PokemonSex.FEMALE, PokemonType.DRAGON),
                    new Pokemon(UUID.randomUUID(), 15, "Misdreavus", PokemonSex.UNKNOWN, PokemonType.GHOST),
                    new Pokemon(UUID.randomUUID(), 16, "Gengar", PokemonSex.UNKNOWN, PokemonType.GHOST),
                    new Pokemon(UUID.randomUUID(), 17, "Snorlax", PokemonSex.MALE, PokemonType.NORMAL),
                    new Pokemon(UUID.randomUUID(), 18, "Sneasel", PokemonSex.MALE, PokemonType.DARK),
                    new Pokemon(UUID.randomUUID(), 19, "Shroomish", PokemonSex.FEMALE, PokemonType.GRASS),
                    new Pokemon(UUID.randomUUID(), 20, "Chinchou", PokemonSex.FEMALE, PokemonType.ELECTRIC)
                    );
            this.pokemonRepository.saveAll(pokemons);
        }
    }
}

