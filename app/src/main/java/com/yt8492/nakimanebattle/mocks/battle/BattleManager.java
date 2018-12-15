package com.yt8492.nakimanebattle.mocks.battle;

import java.util.HashMap;
import java.lang.Math;
import com.yt8492.nakimanebattle.mocks.battle.Player;
import com.yt8492.nakimanebattle.mocks.battle.PokemonType;

// バトルシーンの管理クラス(大元)
// Android実装の対戦シーンのActivityでインスタンス化して使う
// ２つのプレイヤーの処理を１つの端末で作るので、インスタンスを２つ作る

public class BattleManager{

    public BattleManager( final String selfType, final String opponentType ) {
        this.self = new Player(150, PokemonType.StrToType(selfType));
        this.opponent = new Player(150, PokemonType.StrToType(opponentType));
    }

    public double calcQuickless(){
        // ここから帰ってきた情報を元にアプリ側で早い順番に実装する
        return Math.random();
    }

    // 1ターン経過させるのに必要な全ての処理を実行
    public void Update(String selfPokemonType, String opponentPokemonType){
        this.self.TakeDamage(PokemonType.StrToType(opponentPokemonType));
        this.opponent.TakeDamage(PokemonType.StrToType(selfPokemonType));
    }

    public void printCurrentStatus(){
        // テスト出力
        System.out.println( "your type: " + self.Type() + " HP" + self.HP() );
        System.out.println( "opponent type: " + opponent.Type() + " HP" + opponent.HP() );
    }

    public Boolean isGameOver(){
        return this.self.WasKnockedDown() || this.opponent.WasKnockedDown();
    }

    // 自分と相手のプレイヤーオブジェクト
    private Player self;
    private Player opponent;
}