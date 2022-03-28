package com.example.blokusgamereal.Blokus.BlokusPlayer;

import android.view.MotionEvent;
import android.view.View;
import com.example.blokusgamereal.Blokus.BlokusViews.DrawBoard;
import com.example.blokusgamereal.Blokus.GameFramework.GameMainActivity;
import com.example.blokusgamereal.Blokus.GameFramework.infoMessage.GameInfo;
import com.example.blokusgamereal.Blokus.GameFramework.players.GameHumanPlayer;
import com.example.blokusgamereal.Blokus.GameFramework.utilities.Logger;
import com.example.blokusgamereal.R;

public class BlokusHumanPlayer extends GameHumanPlayer implements View.OnTouchListener, View.OnClickListener {

    private DrawBoard drawBoard;
    private int layoutId;

    public BlokusHumanPlayer(String name, int initLayoutId) {
        super(name);
        this.layoutId = initLayoutId;
    }

    protected void initOnceReady() {
        
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public View getTopView() {
        return myActivity.findViewById(R.id.top_gui_layout);
    }

    @Override
    public void receiveInfo(GameInfo info) {

    }

    @Override
    public void setAsGui(GameMainActivity activity) {
        activity.setContentView(layoutId);

        drawBoard = (DrawBoard)myActivity.findViewById(R.id.drawBoard);
        Logger.log("set logger", "OnTouch");
        drawBoard.setOnTouchListener(this);
    }
}
