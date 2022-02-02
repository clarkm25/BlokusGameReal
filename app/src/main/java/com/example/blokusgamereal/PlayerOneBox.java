package com.example.blokusgamereal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.Canvas;

public class PlayerOneBox extends SurfaceView {

    private Bitmap boxImage;
    private Bitmap smallerBoxImage;

    public PlayerOneBox(Context context) {
        super(context);
        initialize();
    }

    public PlayerOneBox(Context context, AttributeSet attrib) {
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
    }
}