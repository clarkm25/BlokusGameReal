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

public class PlayerThreeBox extends SurfaceView {

    private Bitmap boxImage;
    private Bitmap smallerBoxImage;

    public PlayerThreeBox(Context context) {
        super(context);
        initialize();
    }

    public PlayerThreeBox(Context context, AttributeSet attrib) {
        super(context, attrib);
        initialize();
    }

    public void initialize() {
        setWillNotDraw(false);

        this.setBackgroundColor(Color.WHITE);

        boxImage = BitmapFactory.decodeResource(getResources(), R.drawable.blokussquare);
        smallerBoxImage = Bitmap.createScaledBitmap(boxImage, 500, 400, false);
    }

    @Override
    public void onDraw(Canvas c) {
        c.drawBitmap(smallerBoxImage, 75.0f, 50.0f, new Paint());

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);

        Path piecePath = new Path();
        //Green 1 piece
        c.drawRect(100, 70, 130, 100, green);

        //Green 3 piece
        c.drawRect(150, 70, 240, 100, green);

        //Green 5 piece
        piecePath.moveTo(260, 70);
        piecePath.lineTo(350,70);
        piecePath.lineTo(350,130);
        piecePath.lineTo(290, 130);
        piecePath.lineTo(290,100);
        piecePath.lineTo(260,100);
        piecePath.lineTo(260, 70);
        c.drawPath(piecePath, green);

        //Green 4 piece
        c.drawRect(370, 70, 430, 130, green);

        //Green 3 piece
        piecePath.reset();
        piecePath.moveTo(450, 70);
        piecePath.lineTo(510, 70);
        piecePath.lineTo(510, 130);
        piecePath.lineTo(480, 130);
        piecePath.lineTo(480, 100);
        piecePath.lineTo(450, 100);
        piecePath.lineTo(450, 70);
        c.drawPath(piecePath, green);
    }
}