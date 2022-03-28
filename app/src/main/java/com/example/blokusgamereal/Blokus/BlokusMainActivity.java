package com.example.blokusgamereal.Blokus;

import com.example.blokusgamereal.Blokus.BlokusPlayer.BlokusDumbAi;
import com.example.blokusgamereal.Blokus.BlokusPlayer.BlokusHumanPlayer;
import com.example.blokusgamereal.Blokus.GameFramework.GameMainActivity;
import com.example.blokusgamereal.Blokus.GameFramework.LocalGame;
import com.example.blokusgamereal.Blokus.GameFramework.gameConfiguration.GameConfig;
import com.example.blokusgamereal.Blokus.GameFramework.gameConfiguration.GamePlayerType;
import com.example.blokusgamereal.Blokus.GameFramework.infoMessage.GameState;
import com.example.blokusgamereal.Blokus.GameFramework.players.GamePlayer;
import com.example.blokusgamereal.R;

import java.util.ArrayList;

public class BlokusMainActivity extends GameMainActivity {
    @Override
    public GameConfig createDefaultConfig() {

        // Define the allowed player types
        ArrayList<GamePlayerType> playerTypes = new ArrayList<GamePlayerType>();

        //Blokus GUI
        playerTypes.add(new GamePlayerType("Local Blokus Human Player") {
            public GamePlayer createPlayer(String name) {
                return new BlokusHumanPlayer(name, R.layout.activity_main);
            }
        });

        //Dumb Computer Player
        playerTypes.add(new GamePlayerType("Dumb Computer Player #1") {
            public GamePlayer createPlayer(String name) {
                return new BlokusDumbAi(name);
            }
        });

        //Dumb Computer Player #2 (Will be changed to Smart Computer Player later)
        playerTypes.add(new GamePlayerType("Dumb Computer Player #2") {
            public GamePlayer createPlayer(String name) {
                return new BlokusDumbAi(name);
            }
        });

        //Dumb Computer Player #3 (Will be changed to Smart Computer Player later)
        playerTypes.add(new GamePlayerType("Dumb Computer Player #3") {
            public GamePlayer createPlayer(String name) {
                return new BlokusDumbAi(name);
            }
        });


        return null;
    }

    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }
}
