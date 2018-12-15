package com.yt8492.nakimanebattle.mocks.battle;

// バトル中のプレイヤーを表すクラス
public class Player{

    private int hp;
    private PokemonType type;

    public Player( final int hp_, final PokemonType type_ ){
        this.hp = hp_;
        this.type = type_;
    }
    // 攻撃処理 相手にする攻撃のタイプを返す

    // このクラス外で実行された音声比較処理が返した
    // 声に最も似たポケモンのタイプを受け取って処理する
    public PokemonType Attack(final PokemonType attack_type ){
        // 処理:未実装
        this.type = attack_type;
        return attack_type;
    }
    // ダメージを受ける処理

    // 相手のタイプを受け取って、タイプによって異なる量のhpを減らす
    public void TakeDamage( final PokemonType opponent_type ){
        // 処理:未実装
    }

    public PokemonType Type(){
        return type;
    }

    public int HP(){
        return hp;
    }
    // 戦闘不能(HP0)かどうか

    public boolean WasKnockedDown(){
        return ( hp <= 0 );
    }
}