package be.storm.spring_pokemon.dl.enums;

public enum PokemonType {
    NORMAL,
    FIGHTING,
    FLYING,
    POISON,
    GROUND,
    ROCK,
    BUG,
    GHOST,
    STEEL,
    FIRE,
    WATER,
    GRASS,
    ELECTRIC,
    PSYCHIC,
    ICE,
    DRAGON,
    DARK,
    FAIRY,
    UNKNOWN,
    SHADOW; // for any special types introduced in games

    @Override
    public String toString() {
        // Capitalizes the enum name for better readability
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}

