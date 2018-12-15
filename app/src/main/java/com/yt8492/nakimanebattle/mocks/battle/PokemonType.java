package com.yt8492.nakimanebattle.mocks.battle;

// 名前の通り, ポケモン/技のタイプの列挙
public enum PokemonType{
    normal("normal"),
    water("water"),
    fire("fire"),
    electric("electric"),
    grass("grass"),
    ice("ice"),
    martial("martial"),
    poison("poison"),
    ground("ground"),
    flying("flying"),
    esper("esper"),
    insect("insect"),
    rock("rock"),
    ghost("ghost"),
    dragon("dragon"),
    evil("evil"),
    steel("steel"),
    fairy("fairy");

    private final String typename;

    private PokemonType(final String typename_){
        this.typename = typename_;
    }

    // 受け取った文字列からタイプを判定して返す
    // ->このクラス外の音声比較処理から返された文字列を主に受け取ることになる
    public static PokemonType StrToType( final String typename ){
        switch( typename ){
            case "normal":
                return PokemonType.normal;
            case "water":
                return PokemonType.water;
            case "fire":
                return PokemonType.fire;
            case "electric":
                return PokemonType.electric;
            case "grass":
                return PokemonType.grass;
            case "ice":
                return PokemonType.ice;
            case "martial":
                return PokemonType.martial;
            case "poison":
                return PokemonType.poison;
            case "ground":
                return PokemonType.ground;
            case "flying":
                return PokemonType.flying;
            case "esper":
                return PokemonType.esper;
            case "insect":
                return PokemonType.insect;
            case "rock":
                return PokemonType.rock;
            case "ghost":
                return PokemonType.ghost;
            case "dragon":
                return PokemonType.dragon;
            case "evil":
                return PokemonType.evil;
            case "steel":
                return PokemonType.steel;
            case "fairy":
                return PokemonType.fairy;
            default:
                return PokemonType.normal;
                // ここnormal返さないでなんかしたほうがいいな
        }
    }
}