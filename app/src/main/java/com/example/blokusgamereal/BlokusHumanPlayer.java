package com.example.blokusgamereal;

import android.view.MotionEvent;
import android.view.View;

import java.util.logging.Logger;

public class BlokusHumanPlayer implements View.OnTouchListener, View.OnClickListener {

    private DrawBoard drawBoard;

    private int layoutId;

    public BlokusHumanPlayer(String initName, int initLayoutId) {
        //super(initName);
        this.layoutId = initLayoutId;
    }

    /**
    @Override
    public void recieveInfo(GameInfo info) {

    }
     */

    /**
    public void setAsGui(GameMainActivity activity) {
        activity.setContentView(layoutId);

        drawBoard = (DrawBoard)myActivity.findViewById(R.id.drawBoard);
        Logger.log("set logger", "OnTouch");
        drawBoard.setOnTouchListener(this);
    }
     */

    /**
    @Override
    public View getTopView() {
        return myActivity.findViewById(R.id.top_gui_layout);
    }
     */

    protected void initOnceReady() {
        
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
