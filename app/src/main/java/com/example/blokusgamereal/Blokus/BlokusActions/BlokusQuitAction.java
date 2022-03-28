package com.example.blokusgamereal.Blokus.BlokusActions;

import com.example.blokusgamereal.Blokus.GameFramework.actionMessage.GameAction;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;

public class BlokusQuitAction extends GameAction {
    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public BlokusQuitAction(GamePlayer player) {
        super(player);
    }
}
