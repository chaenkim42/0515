//package example.com.samsung.a0515;
//
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.provider.Telephony;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class MainActivity extends AppCompatActivity {
//
//    Thread w;
//    boolean running = true;
//    ImageView mImageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        mImageView = findViewById(R.id.imageView);
//    }
//
//    public void onClick(View v){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    final Bitmap bitmap = downloadUrl("http://example.com/image.png");
//                    mImageView.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            mImageView.setImageBitmap(bitmap);
//                        }
//                    });
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }
//
////    @Override
////    public void onStart(){
////        super.onStart();
////        running = true;
//////        w.start();
////
//////                for(int i=0; i< 20 && running; i++){
//////                    try{
//////                        Thread.sleep(1000);
//////                    } catch (InterruptedException e) {
//////                        e.printStackTrace();
//////                    }
//////                    Log.v("Threaddd", "time="+ i);
//////                }
////    }
////
////
////    @Override
////    public void onStop(){
////        super.onStop();
////        running = false;
////    }
//
//
//    private Bitmap downloadUrl(String strUrl) throws IOException{
//        Bitmap bitmap = null;
//        InputStream iStream = null;
//        try{
//            URL url = new URL(strUrl);
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            urlConnection.connect();
//            iStream = urlConnection.getInputStream();
//            bitmap = BitmapFactory.decodeStream(iStream);
//        } catch (Exception e){
//            Log.d("Exception while downloading url", e.toString());
//        } finally {
//            iStream.close();
//        }
//        return bitmap;
//    }
//}
