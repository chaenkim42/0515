package example.com.samsung.a0515;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

//import static example.com.samsung.a0515.LanderAnimator.shouldContinue;


public class LunarLander extends Activity {
    private LunarView mLunarView;
    public static boolean shouldContinue = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunar_layout);
        mLunarView = (LunarView) findViewById(R.id.lunar);

        // Write here code to start LanderAnimator.
        new LanderAnimator(mLunarView).execute(0);

    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    public void onClick(View view) {
        // Implement this callback method.
        // If the lander is moving, it should stop.
        // If the lander is not moving, it starts to go.
        shouldContinue = !shouldContinue;
        Log.d("shouldContinue", shouldContinue + " ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}
