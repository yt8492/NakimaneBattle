package com.yt8492.nakimanebattle.mocks.sound;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

// 音声ファイルの類似度判定クラス
public class SoundComparer{

    // ポケモンの鳴き声18種のファイル全てをStreamとして初期化
    public SoundComparer(){
        // 用意した18種のファイルをpokemonCryingFilesに読み込み
    }

    public String GetMostSimilarType( final FileInputStream inputVoice ){
        // 入力された音声をFileInputStreamとして受け取って
        // pokemonCryingFilesの中から最も似ているファイルを検索し、
        // そのポケモンのタイプ名をStringで返す: 仕様書のタイプ一覧見てね
        return "";
    }

    private List<FileInputStream> pokemonCryingFiles;

    // 一つのファイルをpokemonCryingFilesに読み込み
//    private loadFile( String filename ){
//        try{
//            pokemonCryingFiles.add( new FileInputStream( filename ) );
//        }
//        catch(IOException err){
//            err.printStackTrace();
//        }
//    }
}