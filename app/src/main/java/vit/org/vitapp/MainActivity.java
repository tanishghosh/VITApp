package vit.org.vitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         requestWindowFeature(Window.FEATURE_NO_TITLE);
         this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        first = (WebView) findViewById(R.id.site);
       WebSettings webSettings = first.getSettings();
        webSettings.setJavaScriptEnabled(true);
        first.loadUrl("http://www.google.com");
        first.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {

        if(first.canGoBack())
        {
            first.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}