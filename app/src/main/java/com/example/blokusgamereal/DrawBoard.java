package com.example.blokusgamereal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.Canvas;

public class DrawBoard extends SurfaceView {

    //Instance variables
    private int ROWS_AND_COLS = 20;
    private int GRIDBOX_SIZE = 30;
    private int PLAYERBOX_HEIGHT = 500;
    private int PLAYERBOX_LENGTH = 550;
    private int BOARD_START_HEIGHT = 50;
    private int BOARD_START_WIDTH = 700;
    private int LEFT_BOXES = 50;
    private int RIGHT_BOXES = 1350;
    private int TOP_BOXES = 50;
    private int BOTTOM_BOXES = 500;
    private int PBOX_HEIGHT = 400;
    private int PBOX_WIDTH = 600;

    Paint gridPaint = new Paint();
    Paint yellow = new Paint();
    Paint red = new Paint();
    Paint green = new Paint();
    Paint blue = new Paint();

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
    }

    @Override
    public void onDraw(Canvas c) {
        //Initialize paints
        gridPaint.setColor(Color.BLACK);
        gridPaint.setStyle(Paint.Style.STROKE);
        yellow.setColor(Color.YELLOW);
        yellow.setStyle(Paint.Style.FILL);
        red.setColor(Color.RED);
        red.setStyle(Paint.Style.FILL);
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.FILL);

        //Draws the grid used for game
        for(int i = 0; i < ROWS_AND_COLS; i++) {
            for (int j = 0; j < ROWS_AND_COLS; j++) {
                c.drawRect((GRIDBOX_SIZE * j) + BOARD_START_WIDTH, (GRIDBOX_SIZE * i) + BOARD_START_HEIGHT,
                        ((GRIDBOX_SIZE * j) + GRIDBOX_SIZE) + BOARD_START_WIDTH,
                        ((GRIDBOX_SIZE * i) + GRIDBOX_SIZE) + BOARD_START_HEIGHT, gridPaint);
            }
        }

        //Top left box
        c.drawRect(LEFT_BOXES, TOP_BOXES, LEFT_BOXES + PBOX_WIDTH, TOP_BOXES + PBOX_HEIGHT, gridPaint);
        //Bottom left box
        c.drawRect(LEFT_BOXES, BOTTOM_BOXES, LEFT_BOXES + PBOX_WIDTH, BOTTOM_BOXES + PBOX_HEIGHT, gridPaint);
        //Top right box
        c.drawRect(RIGHT_BOXES, TOP_BOXES, RIGHT_BOXES + PBOX_WIDTH, TOP_BOXES + PBOX_HEIGHT, gridPaint);
        //Bottom right box
        c.drawRect(RIGHT_BOXES, BOTTOM_BOXES, RIGHT_BOXES + PBOX_WIDTH, BOTTOM_BOXES + PBOX_HEIGHT, gridPaint);

        //Yellow - Four block piece (Bottom Left Corner) - First Piece
        Path piecePath = new Path();
        piecePath.reset();
        piecePath.moveTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 18));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 20), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 18));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 20), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 20));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 19), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 20));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 19), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 19));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 19));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 18));
        c.drawPath(piecePath, yellow);

        //Yellow - Five block piece (Upper Left from first piece)
        c.drawRect(BOARD_START_WIDTH + (GRIDBOX_SIZE * 16), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 13),
                BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 18), yellow);

        //Yellow - Four block piece (Left from first piece)
        c.drawRect(BOARD_START_WIDTH + (GRIDBOX_SIZE * 12), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 18),
                BOARD_START_WIDTH + (GRIDBOX_SIZE * 16), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 19), yellow);


        //Red - Four block piece
        piecePath.reset();
        piecePath.moveTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 5), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 1));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 8), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 1));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 8), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 3));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 7), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 3));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 7), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 2));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 5), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 2));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 5), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 1));
        c.drawPath(piecePath, red);
        piecePath.reset();

        //Red - Five block piece
        c.drawRect(BOARD_START_WIDTH, BOARD_START_HEIGHT, BOARD_START_WIDTH + (GRIDBOX_SIZE * 5),
                BOARD_START_HEIGHT + GRIDBOX_SIZE, red);

        //Red - Four block piece
        c.drawRect(BOARD_START_WIDTH + (GRIDBOX_SIZE * 8), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 3),
                BOARD_START_WIDTH + (GRIDBOX_SIZE * 9),
                BOARD_START_HEIGHT + (GRIDBOX_SIZE * 3) + (GRIDBOX_SIZE * 4), red);


        //Green - 5 block piece
        c.drawRect(BOARD_START_WIDTH + (GRIDBOX_SIZE * 19), BOARD_START_HEIGHT,
                BOARD_START_WIDTH + (GRIDBOX_SIZE * 20),
                BOARD_START_HEIGHT + (GRIDBOX_SIZE * 5), green);

        //Green - 4 block piece
        c.drawRect(BOARD_START_WIDTH + (GRIDBOX_SIZE * 18), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 5),
                BOARD_START_WIDTH + (GRIDBOX_SIZE * 19),
                BOARD_START_HEIGHT + (GRIDBOX_SIZE * 5) + (GRIDBOX_SIZE * 4), green);

        //Green - 4 block piece
        piecePath.reset();
        piecePath.moveTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 15), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 9));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 18), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 9));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 18), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 11));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 11));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 17), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 10));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 15), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 10));
        piecePath.lineTo(BOARD_START_WIDTH + (GRIDBOX_SIZE * 15), BOARD_START_HEIGHT + (GRIDBOX_SIZE * 9));
        c.drawPath(piecePath, green);


        //Blue - 4 block pieces
        c.drawRect(BOARD_START_WIDTH, BOARD_START_HEIGHT + (GRIDBOX_SIZE * 16),
                BOARD_START_WIDTH + GRIDBOX_SIZE,
                BOARD_START_HEIGHT + (GRIDBOX_SIZE * 16) + (GRIDBOX_SIZE * 4), blue);

        //Blue - 5 block pieces
        c.drawRect(BOARD_START_WIDTH + GRIDBOX_SIZE, BOARD_START_HEIGHT + (GRIDBOX_SIZE * 15),
                BOARD_START_WIDTH + GRIDBOX_SIZE + (GRIDBOX_SIZE * 4),
                BOARD_START_HEIGHT + (GRIDBOX_SIZE * 16), blue);


        /**
         * PLAYER ONE BOX -- RED
         */
        //Red 1 piece (1st row 1st piece)
        c.drawRect(30 + LEFT_BOXES, 30 + TOP_BOXES, 60 + LEFT_BOXES, 60 + TOP_BOXES, red);

        //Red 3 piece (1st row 2nd piece)
        c.drawRect(80 + LEFT_BOXES, 30 + TOP_BOXES, 170 + LEFT_BOXES, 60 + TOP_BOXES, red);

        //Red 5 piece (1st row 3nd piece)
        piecePath.reset();
        piecePath.moveTo(190 + LEFT_BOXES,30 + TOP_BOXES);
        piecePath.lineTo(280 + LEFT_BOXES,30 + TOP_BOXES);
        piecePath.lineTo(280 + LEFT_BOXES,90 + TOP_BOXES);
        piecePath.lineTo(220 + LEFT_BOXES,90 + TOP_BOXES);
        piecePath.lineTo(220 + LEFT_BOXES,60 + TOP_BOXES);
        piecePath.lineTo(190 + LEFT_BOXES,60 + TOP_BOXES);
        piecePath.lineTo(190 + LEFT_BOXES,30 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red 4 piece (1st row 4rd piece)
        c.drawRect(300 + LEFT_BOXES, 30 + TOP_BOXES, 360 + LEFT_BOXES, 90 + TOP_BOXES, red);

        //Red 3 piece (1st row 5th piece)
        piecePath.reset();
        piecePath.moveTo(450 + LEFT_BOXES,70 + TOP_BOXES);
        piecePath.lineTo(510 + LEFT_BOXES,70 + TOP_BOXES);
        piecePath.lineTo(510 + LEFT_BOXES,130 + TOP_BOXES);
        piecePath.lineTo(480 + LEFT_BOXES,130 + TOP_BOXES);
        piecePath.lineTo(480 + LEFT_BOXES,100 + TOP_BOXES);
        piecePath.lineTo(450 + LEFT_BOXES,100 + TOP_BOXES);
        piecePath.lineTo(450 + LEFT_BOXES,70 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red two piece (2nd row 1st piece)
        c.drawRect(100 + LEFT_BOXES,140 + TOP_BOXES,160 + LEFT_BOXES,170 + TOP_BOXES, red);

        //Red four piece (2nd row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(180 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(210 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(210 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(180 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(180 + LEFT_BOXES,140 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red four piece (2nd row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(290 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(350 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(350 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(290 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(290 + LEFT_BOXES,200 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (2nd row 4th piece)
        piecePath.reset();
        piecePath.moveTo(400 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,140 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(430 + LEFT_BOXES,200 + TOP_BOXES);
        piecePath.lineTo(430 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(400 + LEFT_BOXES,170 + TOP_BOXES);
        piecePath.lineTo(400 + LEFT_BOXES,140 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (3rd row 1st piece)
        piecePath.reset();
        piecePath.moveTo(100 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(220 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(220 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(190 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(190 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(100 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(100 + LEFT_BOXES,220 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (3rd row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(240 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(300 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(300 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(360 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(360 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,280 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (3rd row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(380 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(410 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(410 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(470 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(470 + LEFT_BOXES,310 + TOP_BOXES);
        piecePath.lineTo(440 + LEFT_BOXES,310 + TOP_BOXES);
        piecePath.lineTo(440 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,220 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five pieces (3rd row 4th piece)
        piecePath.reset();
        piecePath.moveTo(490 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(550 + LEFT_BOXES,220 + TOP_BOXES);
        piecePath.lineTo(550 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(580 + LEFT_BOXES,250 + TOP_BOXES);
        piecePath.lineTo(580 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(550 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(550 + LEFT_BOXES,310 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,310 + TOP_BOXES);
        piecePath.lineTo(520 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(490 + LEFT_BOXES,280 + TOP_BOXES);
        piecePath.lineTo(490 + LEFT_BOXES,250 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (4th row 1st piece)
        piecePath.reset();
        piecePath.moveTo(100 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(100 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(160 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(160 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(130 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(130 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(160 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(160 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(100 + LEFT_BOXES,330 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (4th row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(180 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(270 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(240 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(180 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(180 + LEFT_BOXES,360 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (4th row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(290 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(290 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(380 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(350 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(350 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(320 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(290 + LEFT_BOXES,420 + TOP_BOXES);
        c.drawPath(piecePath, red);

        //Red five piece (4th row 4th piece)
        piecePath.reset();
        piecePath.moveTo(400 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(430 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(430 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,330 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(490 + LEFT_BOXES,360 + TOP_BOXES);
        piecePath.lineTo(490 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,390 + TOP_BOXES);
        piecePath.lineTo(460 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(400 + LEFT_BOXES,420 + TOP_BOXES);
        piecePath.lineTo(400 + LEFT_BOXES,390 + TOP_BOXES);
        c.drawPath(piecePath, red);
    }
}