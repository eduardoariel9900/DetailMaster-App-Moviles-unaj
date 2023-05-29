package com.example.detailmaster;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VistaFragment extends Fragment {

    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vista, container, false);

        webView = (WebView) view.findViewById(R.id.wb_web);
        return view;
    }
    public void viewPage(String url){
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);

    }
}