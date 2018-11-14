package nakimane;

import java.io.FileInputStream;
import java.io.IOException;

// 音声ファイルの類似度判定クラス
public class SoundComparer{

    // ポケモンの鳴き声18種のファイル全てをStreamとして初期化
    public SoundComparer(){
        // 用意した18種のファイルをpokemonCryingFilesに読み込み
        // 例外処理忘れないでね～
    }

    public String GetMostSimilarType( final FileInputStream inputVoice ){
        // 入力された音声をFileInputStreamとして受け取って
        // pokemonCryingFilesの中から最も似ているファイルを検索し、
        // そのポケモンのタイプ名をStringで返す: 仕様書のタイプ一覧見てね
        return "";
    }

    private FileInputStream[] pokemonCryingFiles;
}