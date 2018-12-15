package com.yt8492.nakimanebattle.mocks.battle;

import com.yt8492.nakimanebattle.mocks.battle.PokemonType;

import static com.yt8492.nakimanebattle.mocks.battle.PokemonType.*;

import java.util.HashMap;

// バトル中のプレイヤーを表すクラス
public class Player{
    private int hp;
    private PokemonType type;
    private static final double BASE_DAMAGE = 20;
    private static final double NO_EFFECT = 0.0;
    private static final double BAD_EFFECT = 0.5;
    private static final double ORDINARY = 1.0;
    private static final double EFFECTIVE = 2.0;
    private HashMap typeTable;

    public Player( final int hp_, final PokemonType type_ ){
        this.hp = hp_;
        this.type = type_;

        typeTable = new HashMap<PokemonType, Double>();
        //defendertype, effectiveness
        if(this.type == normal) {
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, BAD_EFFECT);
            typeTable.put(ghost, NO_EFFECT);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);

        }else if(this.type == fire){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, BAD_EFFECT);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, EFFECTIVE);
            typeTable.put(ice, EFFECTIVE);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, EFFECTIVE);
            typeTable.put(rock, BAD_EFFECT);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, BAD_EFFECT);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, EFFECTIVE);
            typeTable.put(fairy, ORDINARY);
        }else if(this.type == water){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, EFFECTIVE);
            typeTable.put(water, BAD_EFFECT);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, BAD_EFFECT);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, EFFECTIVE);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, EFFECTIVE);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, BAD_EFFECT);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, ORDINARY);
            typeTable.put(fairy, ORDINARY);
        }else if(this.type == electric){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, EFFECTIVE);
            typeTable.put(electric, BAD_EFFECT);
            typeTable.put(grass, BAD_EFFECT);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, NO_EFFECT);
            typeTable.put(flying, EFFECTIVE);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, BAD_EFFECT);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, ORDINARY);
            typeTable.put(fairy, ORDINARY);
        }else if(this.type == grass){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, EFFECTIVE);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, BAD_EFFECT);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, EFFECTIVE);
            typeTable.put(flying, BAD_EFFECT);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, BAD_EFFECT);
            typeTable.put(rock, EFFECTIVE);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, BAD_EFFECT);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }else if(this.type == ice){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, BAD_EFFECT);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, EFFECTIVE);
            typeTable.put(ice, BAD_EFFECT);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, EFFECTIVE);
            typeTable.put(flying, EFFECTIVE);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, EFFECTIVE);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }else if(this.type == martial){
            typeTable.put(normal, EFFECTIVE);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, EFFECTIVE);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, BAD_EFFECT);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, BAD_EFFECT);
            typeTable.put(esper, BAD_EFFECT);
            typeTable.put(insect, BAD_EFFECT);
            typeTable.put(rock, EFFECTIVE);
            typeTable.put(ghost, NO_EFFECT);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, EFFECTIVE);
            typeTable.put(steel, EFFECTIVE);
            typeTable.put(fairy, BAD_EFFECT);
        }else if(this.type == poison){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, EFFECTIVE);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, BAD_EFFECT);
            typeTable.put(ground, BAD_EFFECT);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, BAD_EFFECT);
            typeTable.put(ghost, BAD_EFFECT);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, NO_EFFECT);
            typeTable.put(fairy, EFFECTIVE);
        } else if(this.type == ground){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, EFFECTIVE);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, EFFECTIVE);
            typeTable.put(grass, BAD_EFFECT);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, EFFECTIVE);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, BAD_EFFECT);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, EFFECTIVE);
            typeTable.put(fairy, ORDINARY);
        }
        else if(this.type == flying){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, BAD_EFFECT);
            typeTable.put(grass, EFFECTIVE);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, EFFECTIVE);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, EFFECTIVE);
            typeTable.put(rock, BAD_EFFECT);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }
        else if(this.type == esper){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, EFFECTIVE);
            typeTable.put(poison, EFFECTIVE);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, BAD_EFFECT);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, NO_EFFECT);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }
        else if(this.type == insect){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, EFFECTIVE);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, BAD_EFFECT);
            typeTable.put(poison, BAD_EFFECT);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, BAD_EFFECT);
            typeTable.put(esper, EFFECTIVE);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, BAD_EFFECT);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil,EFFECTIVE);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, BAD_EFFECT);
        }
        else if(this.type == rock){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, EFFECTIVE);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, EFFECTIVE);
            typeTable.put(martial, BAD_EFFECT);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, BAD_EFFECT);
            typeTable.put(flying, EFFECTIVE);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, EFFECTIVE);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }
        else if(this.type == ghost){
            typeTable.put(normal, NO_EFFECT);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, EFFECTIVE);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, EFFECTIVE);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, BAD_EFFECT);
            typeTable.put(steel, ORDINARY);
            typeTable.put(fairy, ORDINARY);
        }
        else if(this.type == dragon){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, EFFECTIVE);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, NO_EFFECT);
        }
        else if(this.type == evil){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, ORDINARY);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, BAD_EFFECT);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, EFFECTIVE);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, EFFECTIVE);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, BAD_EFFECT);
            typeTable.put(steel, ORDINARY);
            typeTable.put(fairy, BAD_EFFECT);
        }
        else if(this.type == steel){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, BAD_EFFECT);
            typeTable.put(electric, BAD_EFFECT);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, EFFECTIVE);
            typeTable.put(martial, ORDINARY);
            typeTable.put(poison, ORDINARY);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, EFFECTIVE);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, ORDINARY);
            typeTable.put(evil, ORDINARY);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, EFFECTIVE);
        }
        else if(this.type == fairy){
            typeTable.put(normal, ORDINARY);
            typeTable.put(fire, BAD_EFFECT);
            typeTable.put(water, ORDINARY);
            typeTable.put(electric, ORDINARY);
            typeTable.put(grass, ORDINARY);
            typeTable.put(ice, ORDINARY);
            typeTable.put(martial, EFFECTIVE);
            typeTable.put(poison, BAD_EFFECT);
            typeTable.put(ground, ORDINARY);
            typeTable.put(flying, ORDINARY);
            typeTable.put(esper, ORDINARY);
            typeTable.put(insect, ORDINARY);
            typeTable.put(rock, ORDINARY);
            typeTable.put(ghost, ORDINARY);
            typeTable.put(dragon, EFFECTIVE);
            typeTable.put(evil, EFFECTIVE);
            typeTable.put(steel, BAD_EFFECT);
            typeTable.put(fairy, ORDINARY);
        }

    }

    public double getEffectiveness(PokemonType opponentType){
        return (double) typeTable.get(opponentType);
    }

    // 攻撃処理 相手にする攻撃のタイプを返す
    // このクラス外で実行された音声比較処理が返した
    // 声に最も似たポケモンのタイプを受け取って処理する
    public void Attack(final PokemonType attack_type ){
        // 処理:未実装
        this.type = attack_type;
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