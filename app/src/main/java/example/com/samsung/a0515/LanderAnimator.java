package example.com.samsung.a0515;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import static example.com.samsung.a0515.LunarLander.shouldContinue;

//import static example.com.samsung.a0515.LunarLander.shouldContinue;


public class LanderAnimator extends AsyncTask<Integer, Integer, Integer> {
    private LunarView lunarView;

    // Define constructor..
    public LanderAnimator(LunarView lunarV){
        this.lunarView = lunarV;
    }

    protected void onPreExecute(){
    }

    protected Integer doInBackground(Integer... integers) {

        int x = lunarView.getLanderX();
        int y = lunarView.getLanderY();
//        int totalX = lunarView.getmCanvasWidth();
//        int totalY = lunarView.getmCanvasHeight();
        int totalX = 800;
        int totalY = 1960;

        Log.d("total x", totalX + " ");
        Log.d("total y", totalY + " ");

        while(x < totalX && y < totalY) {
            if(shouldContinue) {
                try {
                    x += totalX/100;
                    y += totalY/100;
                    Log.d("x and y ", x + " , " + y);
                    publishProgress(x, y);
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        final int x = values[0];
        final int y = values[1];
        // Put code to update the lander position with values.
        lunarView.setLanderPos(x, y);
        lunarView.invalidate();

    }

}
