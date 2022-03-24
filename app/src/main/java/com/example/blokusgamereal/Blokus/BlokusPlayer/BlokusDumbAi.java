package com.example.blokusgamereal.Blokus.BlokusPlayer;

import java.util.logging.Logger;

public class BlokusDumbAi {

    public BlokusDumbAi(String name) {
        //super(name);
    }

    /**
    @Override
    public void recieveInfo(GameInfo info) {
        if (info instanceof NotYourTurnInfo) return;
        Logger.log("BlokusDumbAi","My turn!");

        sleep(1);

        Logger.log("BlokusDumbAi", "Sending move");
        game.sendAction(new BlokusMoveAction(this, ROW, COL));
        game.sendAction(new BlokusPlaceAction(this));
    }
    */

}
