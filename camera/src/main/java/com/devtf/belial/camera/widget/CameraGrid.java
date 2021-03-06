package com.devtf.belial.camera.widget;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CameraGrid extends View {

    private Paint mPaint;

    public CameraGrid(Context context) {
        this(context, null);
    }

    public CameraGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.WHITE);
        mPaint.setAlpha(120);
        mPaint.setStrokeWidth(1f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = this.getWidth();
        int height = this.getHeight();

        if (showGrid) {
            canvas.drawLine(width / 3, 0, width / 3, height, mPaint);
            canvas.drawLine(width * 2 / 3, 0, width * 2 / 3, height, mPaint);
            canvas.drawLine(0, height / 3, width, height / 3, mPaint);
            canvas.drawLine(0, height * 2 / 3, width, height * 2 / 3, mPaint);
        }
    }

    private boolean showGrid = true;

    public boolean isShowGrid() {
        return showGrid;
    }

    public void setShowGrid(boolean showGrid) {
        this.showGrid = showGrid;
        invalidate();
    }

}
