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

        Paint yellow = new Paint();
        yellow.setColor(Color.YELLOW);
        yellow.setStyle(Paint.Style.FILL);

        //Yellow - Four block piece (Bottom Left Corner) - First Piece
        Path piecePath = new Path();
        piecePath.reset();
        piecePath.moveTo(648, 690);
        piecePath.lineTo(648, 628);
        piecePath.lineTo(555, 628);
        piecePath.lineTo(555, 658);
        piecePath.lineTo(618, 658);
        piecePath.lineTo(618, 690);
        piecePath.lineTo(648, 690);
        c.drawPath(piecePath, yellow);
        piecePath.reset();

        //Yellow - Five block piece (Upper Left from first piece)
        piecePath.reset();
        piecePath.moveTo(551, 626);
        piecePath.lineTo(551, 472);
        piecePath.lineTo(523, 472);
        piecePath.lineTo(523, 626);
        piecePath.lineTo(551, 626);
        c.drawPath(piecePath, yellow);

        //Yellow - Four block piece (Left from first piece)
        piecePath.reset();
        piecePath.moveTo(520, 658);
        piecePath.lineTo(396, 658);
        piecePath.lineTo(396, 628);
        piecePath.lineTo(520, 628);
        piecePath.lineTo(520, 658);
        c.drawPath(piecePath, yellow);

        Paint red = new Paint();
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);

        //Red - Four block piece
        piecePath.reset();
        piecePath.moveTo(171, 89);
        piecePath.lineTo(265, 89);
        piecePath.lineTo(265, 150);
        piecePath.lineTo(233, 150);
        piecePath.lineTo(233, 119);
        piecePath.lineTo(171, 119);
        piecePath.lineTo(171, 89);
        c.drawPath(piecePath, red);
        piecePath.reset();

        //Red - Five block piece
        piecePath.reset();
        piecePath.moveTo(10, 58);
        piecePath.lineTo(170, 58);
        piecePath.lineTo(170, 88);
        piecePath.lineTo(10, 88);
        piecePath.lineTo(10, 58);
        c.drawPath(piecePath, red);

        //Red - Four block piece
        piecePath.reset();
        piecePath.moveTo(266, 152);
        piecePath.lineTo(296, 152);
        piecePath.lineTo(296, 279);
        piecePath.lineTo(266, 279);
        piecePath.lineTo(266, 152);
        c.drawPath(piecePath, red);

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);

        //Green - 5 block piece
        c.drawRect(618, 58, 648, 215, green);

        //Green - 4 block piece
        c.drawRect(586, 217, 616, 342, green);

        //Green - 4 block piece
        piecePath.reset();
        piecePath.moveTo(584, 344);
        piecePath.lineTo(490, 344);
        piecePath.lineTo(490, 374);
        piecePath.lineTo(554, 374);
        piecePath.lineTo(554, 404);
        piecePath.lineTo(584, 404);
        piecePath.lineTo(584, 344);
        c.drawPath(piecePath, green);

        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        //Blue - 4 block pieces
        c.drawRect(10, 565, 42, 692, blue);

        //Blue - 5 block pieces
        c.drawRect(43, 535, 205, 564, blue);
    }
}