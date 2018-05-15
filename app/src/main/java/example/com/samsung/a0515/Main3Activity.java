//package example.com.samsung.a0515;
//
//import android.graphics.Canvas;
//import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.Surface;
//import android.view.SurfaceHolder;
//import android.view.SurfaceView;
//
//public class Main3Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main3);
//    }
//
//    class LunarView extends SurfaceView implements SurfaceHolder.Callback {
//        public Handler mHandler;
//
//        @Override
//        public void surfaceCreated(SurfaceHolder holder) {
//            thread.setRunning(true);
//            thread.start();
//        }
//
//        @Override
//        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
//
//        }
//
//        @Override
//        public void surfaceDestroyed(SurfaceHolder holder) {
//            boolean retry = true;
//            thread.setRunning(false);
//            while(retry){
//                try{
//                    thread.join();
//                    retry = false;
//                } catch (InterruptedException e){
//
//                }
//            }
//        }
//    }
//
//    class LunarThread extends Thread {
//        @Override
//        public void run(){
//            while (mRun){
//                Canvas c = null;
//                try{
//                    c = mSurfaceHolder.lockCanvas(null);
//                    synchronized (mSurfaceHolder){
//                        doDraw(c);
//                    }
//                }
//            }
//        }
//    }
//
//}
