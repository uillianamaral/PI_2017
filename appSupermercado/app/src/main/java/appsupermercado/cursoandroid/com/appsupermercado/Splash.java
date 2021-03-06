package appsupermercado.cursoandroid.com.appsupermercado;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Splash extends Activity {

    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iniciaSplash();

        initApp();

    }

    private void initApp() {

    }

    private void showNotification(){


    }

    private void sendTextToNotification(String txt){


    }

    public void iniciaSplash (){


        new Thread(new Runnable() {

            @Override
            public void run() {

                counter ++;

                try{
                    while(counter == 1 || counter<= 3){

                        Thread.sleep(1000);

                        counter ++;

                        Log.e("Counter= ", Integer.toString(counter));
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

                if(counter == 4){

                    Intent it = new Intent(Splash.this, Home.class);
                    startActivity (it);

                    counter ++;

                    Log.e("Counter=", Integer.toString(counter));

                }

            }
        }).start();
    }
}
