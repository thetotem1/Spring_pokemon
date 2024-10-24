package be.storm.spring_pokemon.dl.entities;


import be.storm.spring_pokemon.dl.enums.PokemonSex;
import be.storm.spring_pokemon.dl.enums.PokemonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Pokemon extends BaseEntity {

    @Column(nullable = false, unique = true)
    int dexNbr;

    @Column(nullable = false, unique = true)
    String name;

    //String description; //TODO
    //double height;
    //double weight;
    //Talent talent;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false) //todo enlever
    PokemonSex sex;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    PokemonType type;

    public Pokemon(UUID id, int dexNbr, String name, PokemonSex sex, PokemonType type) {
        super(id);
        this.dexNbr = dexNbr;
        this.name = name;
        this.sex = sex;
        this.type = type;
    }
}
