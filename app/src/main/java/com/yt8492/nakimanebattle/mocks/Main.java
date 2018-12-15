package com.yt8492.nakimanebattle.mocks;

import com.yt8492.nakimanebattle.mocks.battle.BattleManager;

public class Main {
    public static void Main(String args[]){
        BattleManager battleManager = new BattleManager("water","fire");
        battleManager.printCurrentStatus();
        battleManager.Update("fairy","normal");
        battleManager.printCurrentStatus();
    }
}
