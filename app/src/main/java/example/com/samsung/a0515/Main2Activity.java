package example.com.samsung.a0515;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity {
    private static final int PROGRESS = 0x1;
    private ProgressBar mProgress;
    private int mProgressStatus = 0;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mProgress = (ProgressBar) findViewById(R.id.progress_bar);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                new CounterTask().execute(0);
            }
        });


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while(mProgressStatus < 100){
//                    try{
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    mProgressStatus = i++;
//
//                    mProgress.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            mProgress.setProgress(mProgressStatus);
//                        }
//                    });
//                }
//            }
//        }).start();
    }


    class CounterTask extends AsyncTask<Integer, Integer, Integer>{
        protected void onPreExecute(){
        }

        @Override
        protected Integer doInBackground(Integer... value) {
            while (mProgressStatus < 100) {
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mProgressStatus++;
                publishProgress(mProgressStatus);
            }
            return mProgressStatus;
        }

        protected void onProgressUpdate(Integer... value){
            mProgress.setProgress(mProgressStatus);
        }

        protected void onPostExecute(Integer result){
            mProgress.setProgress(mProgressStatus);
        }
    }

}
