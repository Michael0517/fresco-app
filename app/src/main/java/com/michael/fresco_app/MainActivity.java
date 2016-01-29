package com.michael.fresco_app;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends Activity {
    SimpleDraweeView mSimpleDraweeView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);
        mSimpleDraweeView = (SimpleDraweeView)findViewById(R.id.draw);
        Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/fresco-logo.png");
        mSimpleDraweeView.setImageURI(uri);
    }
}
