package be.storm.spring_pokemon.bll.services.impls;

import be.storm.spring_pokemon.bll.services.PokemonService;
import be.storm.spring_pokemon.dal.repositories.PokemonRepository;
import be.storm.spring_pokemon.dl.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PokemonserviceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon findById(UUID id) {
        Pokemon pokemon = pokemonRepository.findById(id).orElseThrow();
        return pokemon;
    }
}
