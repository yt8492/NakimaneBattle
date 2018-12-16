package com.yt8492.nakimanebattle.mocks.battle;

import java.util.HashMap;
import java.lang.Math;

import android.util.Log;
import com.yt8492.nakimanebattle.mocks.battle.Player;
import com.yt8492.nakimanebattle.mocks.battle.PokemonType;

// バトルシーンの管理クラス
// Android実装の対戦シーンのActivityでインスタンス化して使う
// ２人のプレイヤーの処理をこのクラス内で行なう
public class BattleManager{

    // private フィールド
    // Player1と2の実体
    private Player pl1;
    private Player pl2;
    private BattleStatusIndicator indicator;

    // コールバックのためのI/F
    public interface BattleStatusIndicator{
        // Androidアプリ画面のバトル経過を更新(どちらか体力が減ったときなど)
        void update( Player player );
    }

    public void setIndicator( BattleStatusIndicator indicator ) {
        this.indicator = indicator;
    }

    // 両プレイヤーの初期タイプを設定する
    public BattleManager( final String pl1Type, final String pl2Type ) {
        this.pl1 = new Player(130, PokemonType.StrToType(pl1Type));
        this.pl2 = new Player(130, PokemonType.StrToType(pl2Type));
    }

    // 1ターン経過させるのに必要な全ての処理を実行
    public void Update(String pl1PokemonType, String pl2PokemonType){
        // 乱数で素早さ判定
        double turn = Math.random();
        if( turn < 0.5 ){ // Player1が先制
            // Player1のターン
            pl1.Attack( PokemonType.StrToType( pl1PokemonType ) );
            pl2.TakeDamage( pl1.Type() );
            indicator.update( pl1 );
            // Player2のターン
            pl2.Attack( PokemonType.StrToType( pl2PokemonType ) );
            pl1.TakeDamage( pl2.Type() );
            indicator.update( pl2 );
        }else{ // Player2が先制
            // Player2のターン
            pl2.Attack( PokemonType.StrToType( pl2PokemonType ) );
            pl1.TakeDamage( pl2.Type() );
            indicator.update( pl2 );
            // Player1のターン
            pl1.Attack( PokemonType.StrToType( pl1PokemonType ) );
            pl2.TakeDamage( pl1.Type() );
            indicator.update( pl1 );
        }
    }

    // テスト出力
    public void PrintCurrentStatus(){
        Log.d("debug", "pl1 type: " + pl1.Type() + " HP" + pl1.HP());
        Log.d("debug", "pl2 type: " + pl2.Type() + " HP" + pl2.HP());
    }

    public boolean IsGameOver(){
        return this.pl1.WasKnockedDown() || this.pl2.WasKnockedDown();
    }

    public boolean Player1wins(){
        return pl2.WasKnockedDown();
    }
}