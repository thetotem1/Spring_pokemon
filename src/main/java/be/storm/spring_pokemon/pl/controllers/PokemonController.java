package be.storm.spring_pokemon.pl.controllers;

import be.storm.spring_pokemon.bll.services.PokemonService;
import be.storm.spring_pokemon.pl.dtos.PokemonDTO;
import be.storm.spring_pokemon.pl.dtos.PokemonDetailsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService; // the controller calls the service, who calls the repo, wich calls the db

    @GetMapping
    public String getPokemon(Model model) {
        List<PokemonDTO> pokemons = pokemonService.findAll().stream()
                .map(PokemonDTO::fromPokemon)
                .toList();
        model.addAttribute("pokemons", pokemons);
        return "pokemon/all";
    }

    @GetMapping("{id")
    public String getOne(@PathVariable UUID id, Model model) {

        try{
            PokemonDetailsDTO dto = PokemonDetailsDTO.fromPokemon(pokemonService.findById(id));
            return "pokemon/details";
        } catch (Exception e) {}
    }
}
