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
        smallerBoxImage = Bitmap.createScaledBitmap(boxImage, 550, 400, false);
    }

    @Override
    public void onDraw(Canvas c) {
        c.drawBitmap(smallerBoxImage, 75.0f, 50.0f, new Paint());

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        green.setStyle(Paint.Style.FILL);

        Path piecePath = new Path();
        //Green 1 piece (1st row 1th piece)
        c.drawRect(100, 70, 130, 100, green);

        //Green 3 piece (1st row 2th piece)
        c.drawRect(150, 70, 240, 100, green);

        //Green 5 piece (1st row 3th piece)
        piecePath.moveTo(260, 70);
        piecePath.lineTo(350,70);
        piecePath.lineTo(350,130);
        piecePath.lineTo(290, 130);
        piecePath.lineTo(290,100);
        piecePath.lineTo(260,100);
        piecePath.lineTo(260, 70);
        c.drawPath(piecePath, green);

        //Green 4 piece (1st row 4th piece)
        c.drawRect(370, 70, 430, 130, green);

        //Green 3 piece (1st row 5th piece)
        piecePath.reset();
        piecePath.moveTo(450, 70);
        piecePath.lineTo(510, 70);
        piecePath.lineTo(510, 130);
        piecePath.lineTo(480, 130);
        piecePath.lineTo(480, 100);
        piecePath.lineTo(450, 100);
        piecePath.lineTo(450, 70);
        c.drawPath(piecePath, green);

        //Green two piece (2nd row 1st piece)
        c.drawRect(100, 140, 160, 170, green);

        //Green four piece (2nd row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(180,140);
        piecePath.lineTo(240,140);
        piecePath.lineTo(240,170);
        piecePath.lineTo(270,170);
        piecePath.lineTo(270,200);
        piecePath.lineTo(210,200);
        piecePath.lineTo(210,170);
        piecePath.lineTo(180,170);
        piecePath.lineTo(180,140);
        c.drawPath(piecePath, green);

        //Green four piece (2nd row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(290,200);
        piecePath.lineTo(380,200);
        piecePath.lineTo(380,170);
        piecePath.lineTo(350,170);
        piecePath.lineTo(350,140);
        piecePath.lineTo(320,140);
        piecePath.lineTo(320,170);
        piecePath.lineTo(290,170);
        piecePath.lineTo(290,200);
        c.drawPath(piecePath, green);

        //Green five piece (2nd row 4th piece)
        piecePath.reset();
        piecePath.moveTo(400,140);
        piecePath.lineTo(460,140);
        piecePath.lineTo(460,170);
        piecePath.lineTo(520,170);
        piecePath.lineTo(520,200);
        piecePath.lineTo(430,200);
        piecePath.lineTo(430,170);
        piecePath.lineTo(400,170);
        piecePath.lineTo(400,140);
        c.drawPath(piecePath, green);

        //Green five piece (3rd row 1st piece)
        piecePath.reset();
        piecePath.moveTo(100,220);
        piecePath.lineTo(220,220);
        piecePath.lineTo(220,280);
        piecePath.lineTo(190,280);
        piecePath.lineTo(190,250);
        piecePath.lineTo(100,250);
        piecePath.lineTo(100,220);
        c.drawPath(piecePath, green);

        //Green five piece (3rd row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(240,250);
        piecePath.lineTo(270,250);
        piecePath.lineTo(270,220);
        piecePath.lineTo(300,220);
        piecePath.lineTo(300,250);
        piecePath.lineTo(360,250);
        piecePath.lineTo(360,280);
        piecePath.lineTo(240,280);
        piecePath.lineTo(240,280);
        c.drawPath(piecePath, green);

        //Green five piece (3rd row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(380,220);
        piecePath.lineTo(410,220);
        piecePath.lineTo(410,250);
        piecePath.lineTo(470,250);
        piecePath.lineTo(470,310);
        piecePath.lineTo(440,310);
        piecePath.lineTo(440,280);
        piecePath.lineTo(380,280);
        piecePath.lineTo(380,220);
        c.drawPath(piecePath, green);

        //Green five pieces (3rd row 4th piece)
        piecePath.reset();
        piecePath.moveTo(490,250);
        piecePath.lineTo(520,250);
        piecePath.lineTo(520,220);
        piecePath.lineTo(550,220);
        piecePath.lineTo(550,250);
        piecePath.lineTo(580,250);
        piecePath.lineTo(580,280);
        piecePath.lineTo(550,280);
        piecePath.lineTo(550,310);
        piecePath.lineTo(520,310);
        piecePath.lineTo(520,280);
        piecePath.lineTo(490,280);
        piecePath.lineTo(490,250);
        c.drawPath(piecePath, green);

        //Green five piece (4th row 1st piece)
        piecePath.reset();
        piecePath.moveTo(100,330);
        piecePath.lineTo(100,420);
        piecePath.lineTo(160,420);
        piecePath.lineTo(160,390);
        piecePath.lineTo(130,390);
        piecePath.lineTo(130,360);
        piecePath.lineTo(160,360);
        piecePath.lineTo(160,330);
        piecePath.lineTo(100,330);
        c.drawPath(piecePath, green);

        //Green five piece (4th row 2nd piece)
        piecePath.reset();
        piecePath.moveTo(180,360);
        piecePath.lineTo(240,360);
        piecePath.lineTo(240,330);
        piecePath.lineTo(270,330);
        piecePath.lineTo(270,420);
        piecePath.lineTo(240,420);
        piecePath.lineTo(240,390);
        piecePath.lineTo(180,390);
        piecePath.lineTo(180,360);
        c.drawPath(piecePath, green);

        //Green five piece (4th row 3rd piece)
        piecePath.reset();
        piecePath.moveTo(290,420);
        piecePath.lineTo(290,360);
        piecePath.lineTo(320,360);
        piecePath.lineTo(320,330);
        piecePath.lineTo(380,330);
        piecePath.lineTo(380,360);
        piecePath.lineTo(350,360);
        piecePath.lineTo(350,390);
        piecePath.lineTo(320,390);
        piecePath.lineTo(320,420);
        piecePath.lineTo(290,420);
        c.drawPath(piecePath, green);

        //Green five piece (4th row 4th piece)
        piecePath.reset();
        piecePath.moveTo(400,390);
        piecePath.lineTo(430,390);
        piecePath.lineTo(430,330);
        piecePath.lineTo(460,330);
        piecePath.lineTo(460,360);
        piecePath.lineTo(490,360);
        piecePath.lineTo(490,390);
        piecePath.lineTo(460,390);
        piecePath.lineTo(460,420);
        piecePath.lineTo(400,420);
        piecePath.lineTo(400,390);
        c.drawPath(piecePath, green);
    }
}