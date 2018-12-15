package com.yt8492.nakimanebattle.mocks.battle;

import com.yt8492.nakimanebattle.mocks.battle.PokemonType;

import static com.yt8492.nakimanebattle.mocks.battle.PokemonType.*;

import java.util.HashMap;

// バトル中のプレイヤーを表すクラス
public class Player{
    private int hp;
    private PokemonType type;
    private static final double BASE_DAMAGE = 20;
    private static final double NOT_AFFECTED = 0.0;
    private static final double NORMAL = 1.0;
    private static final double NOT_VERY_EFFECTIVE = 0.5;
    private static final double VERY_EFFECTIVE = 2.0;
    private HashMap typeTable;

    public Player( final int hp_, final PokemonType type_ ){
        this.hp = hp_;
        this.type = type_;

        typeTable = new HashMap<PokemonType, Double>();
        //defendertype, effectiveness
        if(this.type == normal) {
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NOT_VERY_EFFECTIVE);
            typeTable.put(ghost, NOT_AFFECTED);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);

        }else if(this.type == fire){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, NOT_VERY_EFFECTIVE);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, VERY_EFFECTIVE);
            typeTable.put(ice, VERY_EFFECTIVE);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, VERY_EFFECTIVE);
            typeTable.put(rock, NOT_VERY_EFFECTIVE);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NOT_VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }else if(this.type == water){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, VERY_EFFECTIVE);
            typeTable.put(water, NOT_VERY_EFFECTIVE);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NOT_VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, VERY_EFFECTIVE);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, VERY_EFFECTIVE);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NOT_VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NORMAL);
            typeTable.put(fairy, NORMAL);
        }else if(this.type == electric){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, VERY_EFFECTIVE);
            typeTable.put(electric, NOT_VERY_EFFECTIVE);
            typeTable.put(grass, NOT_VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NOT_AFFECTED);
            typeTable.put(flying, VERY_EFFECTIVE);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NOT_VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NORMAL);
            typeTable.put(fairy, NORMAL);
        }else if(this.type == grass){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, VERY_EFFECTIVE);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NOT_VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, VERY_EFFECTIVE);
            typeTable.put(flying, NOT_VERY_EFFECTIVE);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NOT_VERY_EFFECTIVE);
            typeTable.put(rock, VERY_EFFECTIVE);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NOT_VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }else if(this.type == ice){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, NOT_VERY_EFFECTIVE);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, VERY_EFFECTIVE);
            typeTable.put(ice, NOT_VERY_EFFECTIVE);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, VERY_EFFECTIVE);
            typeTable.put(flying, VERY_EFFECTIVE);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }else if(this.type == martial){
            typeTable.put(normal, VERY_EFFECTIVE);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, VERY_EFFECTIVE);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NOT_VERY_EFFECTIVE);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NOT_VERY_EFFECTIVE);
            typeTable.put(esper, NOT_VERY_EFFECTIVE);
            typeTable.put(insect, NOT_VERY_EFFECTIVE);
            typeTable.put(rock, VERY_EFFECTIVE);
            typeTable.put(ghost, NOT_AFFECTED);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, VERY_EFFECTIVE);
            typeTable.put(steel, VERY_EFFECTIVE);
            typeTable.put(fairy, NOT_VERY_EFFECTIVE);
        }else if(this.type == poison){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NOT_VERY_EFFECTIVE);
            typeTable.put(ground, NOT_VERY_EFFECTIVE);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NOT_VERY_EFFECTIVE);
            typeTable.put(ghost, NOT_VERY_EFFECTIVE);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_AFFECTED);
            typeTable.put(fairy, VERY_EFFECTIVE);
        } else if(this.type == ground){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, VERY_EFFECTIVE);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, VERY_EFFECTIVE);
            typeTable.put(grass, NOT_VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, VERY_EFFECTIVE);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NOT_VERY_EFFECTIVE);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }
        else if(this.type == flying){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NOT_VERY_EFFECTIVE);
            typeTable.put(grass, VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, VERY_EFFECTIVE);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, VERY_EFFECTIVE);
            typeTable.put(rock, NOT_VERY_EFFECTIVE);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }
        else if(this.type == esper){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, VERY_EFFECTIVE);
            typeTable.put(poison, VERY_EFFECTIVE);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NOT_VERY_EFFECTIVE);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NOT_AFFECTED);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }
        else if(this.type == insect){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, VERY_EFFECTIVE);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NOT_VERY_EFFECTIVE);
            typeTable.put(poison, NOT_VERY_EFFECTIVE);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NOT_VERY_EFFECTIVE);
            typeTable.put(esper, VERY_EFFECTIVE);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NOT_VERY_EFFECTIVE);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil,VERY_EFFECTIVE);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NOT_VERY_EFFECTIVE);
        }
        else if(this.type == rock){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, VERY_EFFECTIVE);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, VERY_EFFECTIVE);
            typeTable.put(martial, NOT_VERY_EFFECTIVE);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NOT_VERY_EFFECTIVE);
            typeTable.put(flying, VERY_EFFECTIVE);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, VERY_EFFECTIVE);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }
        else if(this.type == ghost){
            typeTable.put(normal, NOT_AFFECTED);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, VERY_EFFECTIVE);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, VERY_EFFECTIVE);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NOT_VERY_EFFECTIVE);
            typeTable.put(steel, NORMAL);
            typeTable.put(fairy, NORMAL);
        }
        else if(this.type == dragon){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, VERY_EFFECTIVE);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NOT_AFFECTED);
        }
        else if(this.type == evil){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NORMAL);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, NOT_VERY_EFFECTIVE);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, VERY_EFFECTIVE);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, VERY_EFFECTIVE);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NOT_VERY_EFFECTIVE);
            typeTable.put(steel, NORMAL);
            typeTable.put(fairy, NOT_VERY_EFFECTIVE);
        }
        else if(this.type == steel){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, NOT_VERY_EFFECTIVE);
            typeTable.put(electric, NOT_VERY_EFFECTIVE);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, VERY_EFFECTIVE);
            typeTable.put(martial, NORMAL);
            typeTable.put(poison, NORMAL);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, VERY_EFFECTIVE);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, NORMAL);
            typeTable.put(evil, NORMAL);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, VERY_EFFECTIVE);
        }
        else if(this.type == fairy){
            typeTable.put(normal, NORMAL);
            typeTable.put(fire, NOT_VERY_EFFECTIVE);
            typeTable.put(water, NORMAL);
            typeTable.put(electric, NORMAL);
            typeTable.put(grass, NORMAL);
            typeTable.put(ice, NORMAL);
            typeTable.put(martial, VERY_EFFECTIVE);
            typeTable.put(poison, NOT_VERY_EFFECTIVE);
            typeTable.put(ground, NORMAL);
            typeTable.put(flying, NORMAL);
            typeTable.put(esper, NORMAL);
            typeTable.put(insect, NORMAL);
            typeTable.put(rock, NORMAL);
            typeTable.put(ghost, NORMAL);
            typeTable.put(dragon, VERY_EFFECTIVE);
            typeTable.put(evil, VERY_EFFECTIVE);
            typeTable.put(steel, NOT_VERY_EFFECTIVE);
            typeTable.put(fairy, NORMAL);
        }

    }

    public double getEffectiveness(PokemonType opponentType){
        return (double) typeTable.get(opponentType);
    }

    // 攻撃処理 相手にする攻撃のタイプを返す
    // このクラス外で実行された音声比較処理が返した
    // 声に最も似たポケモンのタイプを受け取って処理する
    public PokemonType Attack( final PokemonType attack_type ){
        // 処理:未実装
        this.type = attack_type;
        return attack_type;
    }

    // ダメージを受ける処理
    // 相手のタイプを受け取って、タイプによって異なる量のhpを減らす
    public void TakeDamage( final PokemonType opponent_type ){
        hp = (int) ((double)hp - getEffectiveness(opponent_type) * BASE_DAMAGE);
    }

    public PokemonType Type(){
        return type;
    }

    public int HP(){
        if(hp<0) return 0;
        return hp;
    }

    // 戦闘不能(HP0)かどうか
    public boolean WasKnockedDown(){
        return ( hp <= 0 );
    }
}