package com.yt8492.nakimanebattle.mocks.battle;

import org.junit.Test;

import static org.junit.Assert.*;

public class BattleManagerTest {
    public static void Main(String args[]){
        BattleManager battleManager = new BattleManager("water","fire");
        battleManager.printCurrentStatus();
        battleManager.Update("fairy","normal");
        battleManager.printCurrentStatus();
    }

    @Test
    public void calcQuickless() {
    }

    @Test
    public void update() {
    }

    @Test
    public void printCurrentStatus() {
    }

    @Test
    public void isGameOver() {
    }
}