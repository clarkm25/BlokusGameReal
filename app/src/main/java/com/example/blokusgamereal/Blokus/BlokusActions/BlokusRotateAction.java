package com.example.blokusgamereal.Blokus.BlokusActions;

import com.example.blokusgamereal.Blokus.BlokusInfo.BlokusBlock;
import com.example.blokusgamereal.Blokus.GameFramework.actionMessage.GameAction;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;

public class BlokusRotateAction extends GameAction {

    private BlokusBlock[][] piece;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public BlokusRotateAction(GamePlayer player) {
        super(player);
    }
}
