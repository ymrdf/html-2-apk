package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.webkit.WebView;
public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		WebView webView=(WebView) findViewById(R.id.mainwebView);
		
		webView.loadUrl("file:///android_asset/www/index.html");
		webView.getSettings().setJavaScriptEnabled(true);
		
		//webView.loadDataWithBaseURL(null,"file:///andr