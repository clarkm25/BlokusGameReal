package com.example.blokusgamereal.Blokus.BlokusPlayer;

import com.example.blokusgamereal.Blokus.BlokusActions.BlokusMoveAction;
import com.example.blokusgamereal.Blokus.BlokusActions.BlokusPlaceAction;
import com.example.blokusgamereal.Blokus.GameFramework.infoMessage.GameInfo;
import com.example.blokusgamereal.Blokus.GameFramework.infoMessage.NotYourTurnInfo;
import com.example.blokusgamereal.Blokus.GameFramework.players.GameComputerPlayer;
import java.util.logging.Logger;

public class BlokusDumbAi extends GameComputerPlayer {

    public BlokusDumbAi(String name) {
        super(name);
    }

    @Override
    protected void receiveInfo(GameInfo info) {
        if (info instanceof NotYourTurnInfo) return;
        //Logger.log("BlokusDumbAi","My turn!");

        sleep(1);

        //Logger.log("BlokusDumbAi", "Sending move");
        //game.sendAction(new BlokusMoveAction(this, ROW, COL));
        game.sendAction(new BlokusPlaceAction(this));
    }
}
