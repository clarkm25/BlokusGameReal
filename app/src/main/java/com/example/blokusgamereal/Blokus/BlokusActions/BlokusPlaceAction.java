package com.example.blokusgamereal.Blokus.BlokusActions;

import com.example.blokusgamereal.Blokus.GameFramework.actionMessage.GameAction;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;

public class BlokusPlaceAction extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public BlokusPlaceAction(GamePlayer player) {
        super(player);
    }
}
