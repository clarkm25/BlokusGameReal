package com.example.blokusgamereal.Blokus;

import com.example.blokusgamereal.Blokus.BlokusInfo.BlokusGameState;
import com.example.blokusgamereal.Blokus.GameFramework.LocalGame;
import com.example.blokusgamereal.Blokus.GameFramework.actionMessage.GameAction;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;

public class BlokusLocalGame extends LocalGame {

    private BlokusGameState blokusState;
    private int[] color;

    public BlokusLocalGame() {

    }

    public BlokusLocalGame(BlokusGameState initState) {

    }

    public void start(GamePlayer[] players) {

    }

    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }
}
