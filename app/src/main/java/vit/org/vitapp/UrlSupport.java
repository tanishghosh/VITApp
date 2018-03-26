package vit.org.vitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class UrlSupport extends AppCompatActivity{

    WebView first;
    URL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         requestWindowFeature(Window.FEATURE_NO_TITLE);
         this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.support);
        first = (WebView) findViewById(R.id.site);
        WebSettings webSettings = first.getSettings();

        webSettings.setJavaScriptEnabled(true);
        if(url.urlfirst()!=null) {
            Toast.makeText(this, "NOT Empty", Toast.LENGTH_LONG).show();
            /*String urlnew = url.urlfirst();
            first.loadUrl(urlnew);
            first.setWebViewClient(new WebViewClient());*/
        }
        else {
            Toast.makeText(this, "Empty", Toast.LENGTH_LONG).show();
        }
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