package com.example.blokusgamereal.Blokus.BlokusActions;

import com.example.blokusgamereal.Blokus.BlokusInfo.BlokusBlock;
import com.example.blokusgamereal.Blokus.GameFramework.actionMessage.GameAction;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;

public class BlokusMoveAction extends GameAction {
    private BlokusBlock[][] piece;
    private int row;
    private int col;

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public BlokusMoveAction(GamePlayer player) {
        super(player);
    }
}
