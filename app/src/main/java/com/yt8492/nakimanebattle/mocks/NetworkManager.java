// 他のデバイス上のアプリとの通信を司るクラス
// 1台の相手デバイスに対してこのクラスのインスタンス1つが対応する
public class NetworkManager{
    // 相手と通信確立
    public NetworkManager( final String opponentAddr ){
        // 処理:未実装
    }

    // 相手にメッセージ送信
    // 成功ならtrue, 失敗ならfalseを返す
    public boolean Send( final String message ){
        // 処理:未実装
        return true;
    }

    // 相手からメッセージ受信
    // 受け取ったメッセージを返す
    public String Receive(){
        // 処理:未実装
        return "";
    }

    // ここいる？ ソケットか何かでやるなら変えた方がいいね。
    // private String opponentAddr;
}