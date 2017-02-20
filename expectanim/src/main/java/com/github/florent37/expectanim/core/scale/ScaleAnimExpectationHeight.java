package com.github.florent37.expectanim.core.scale;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by florentchampigny on 20/02/2017.
 */
public class ScaleAnimExpectationHeight extends ScaleAnimExpectation {

    private final int height;

    public ScaleAnimExpectationHeight(int height, @Nullable Integer gravityHorizontal, @Nullable Integer gravityVertical) {
        super(gravityHorizontal, gravityVertical);
        this.height = height;
    }

    @Override
    public Float getCalculatedValueScaleX(View viewToMove) {
        return null;
    }

    @Override
    public Float getCalculatedValueScaleY(View viewToMove) {
        final int viewToMoveHeight = viewToMove.getHeight();
        if(this.height == 0 || viewToMoveHeight == 0f){
            return 0f;
        }
        return 1f * this.height / viewToMoveHeight;
    }
}
