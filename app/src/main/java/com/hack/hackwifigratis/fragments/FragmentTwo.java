package com.hack.hackwifigratis.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hack.hackwifigratis.R;

/**
 * Created by Anu on 22/04/17.
 */



public class FragmentTwo extends Fragment {
    WebView wv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle args) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        wv = (WebView) view.findViewById(R.id.info22);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://paduanmembuat.blogspot.com/");

        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        return view;
    }
}