package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private LinearLayout mViewLoading;
    private LinearLayout mViewNoInternet;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        mViewLoading = root.findViewById(R.id.in_loading);
        mViewNoInternet = root.findViewById(R.id.in_no_internet);

        return root;
    }

    public void showProgress(boolean show){
        if(show) {
            mViewLoading.setVisibility(View.VISIBLE);
            mViewNoInternet.setVisibility(View.GONE);
        } else {
            mViewLoading.setVisibility(View.GONE);
        }
    }

    public void showNoInternetConnection(){
        mViewLoading.setVisibility(View.GONE);
        mViewNoInternet.setVisibility(View.VISIBLE);
    }

}
