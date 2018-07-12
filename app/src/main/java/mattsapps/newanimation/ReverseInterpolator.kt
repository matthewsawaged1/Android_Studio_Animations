package mattsapps.newanimation

import android.view.animation.Interpolator

/**
 * Created by msawa on 4/4/2018.
 */
class ReverseInterpolator :Interpolator {
    override fun getInterpolation(p0: Float): Float {
        return Math.abs(p0 -1f)
    }

}