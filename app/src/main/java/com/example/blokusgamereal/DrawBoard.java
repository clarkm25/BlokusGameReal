package com.example.blokusgamereal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.Canvas;

public class DrawBoard extends SurfaceView {

    private Bitmap boardImage;
    private Bitmap biggerBoardImage;

    public DrawBoard(Context context) {
        super(context);
        initialize();
    }

    public DrawBoard(Context context, AttributeSet attrib) {
        super(context, attrib);
        initialize();
    }

    public void initialize() {
        setWillNotDraw(false);

        this.setBackgroundColor(Color.WHITE);

        boardImage = BitmapFactory.decodeResource(getResources(), R.drawable.blokusgrid);
        biggerBoardImage = Bitmap.createScaledBitmap(boardImage, 650, 650, false);
    }

    @Override
    public void onDraw(Canvas c) {
        c.drawBitmap(biggerBoardImage, 2.0f, 50.0f, new Paint());


    }
}