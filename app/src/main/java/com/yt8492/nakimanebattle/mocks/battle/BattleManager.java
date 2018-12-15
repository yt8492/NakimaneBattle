package com.yt8492.nakimanebattle.mocks.battle;

// バトルシーンの管理クラス(大元)
// Android実装の対戦シーンのActivityでインスタンス化して使う
public class BattleManager{
    public BattleManager( final String selfType, final String opponentType ){
        this.self = new Player( 150 , PokemonType.StrToType(selfType) );
        this.opponent = new Player( 150, PokemonType.StrToType(opponentType) );
        // 処理:未実装
    }

    // 1ターン経過させるのに必要な全ての処理を実行
    public void Update( final String opponentMessage ){
        // テスト出力
        System.out.println( "self     : " + self.Type() + " HP" + self.HP() );
        System.out.println( "opponent : " + opponent.Type() + " HP" + opponent.HP() );

        // 処理:未実装
    }

    // 自分と相手のプレイヤーオブジェクト
    private Player self;
    private Player opponent;
}