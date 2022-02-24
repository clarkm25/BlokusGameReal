package com.example.blokusgamereal;

public class BlokusGameState {
    private int[] playerScore;
    private int[] playerTurn;
    private boolean legalMove;
    private boolean gameOn;

    //Default Constructor
    public BlokusGameState() {

    }

    //Deep Copy Constructor
    public BlokusGameState(int PLACEHOLDER) {

    }

    public boolean quitGame(boolean initGameOn) {
        gameOn = initGameOn;
        if (gameOn = false) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean placePiece() {
        if (legalMove == true) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String gameStateInfo;

        gameStateInfo = "" + gameOn + "%n";

        gameStateInfo += "" + legalMove + "%n";

        for (int i = 0; i < playerScore.length; i++) {
            gameStateInfo += "Player " + playerScore[i] + "%n";
        }

        for (int i = 0; i < playerTurn.length; i++) {
            gameStateInfo += "Player " + playerTurn[i] + "'s turn. %n";
        }

        return gameStateInfo;
    }
}
