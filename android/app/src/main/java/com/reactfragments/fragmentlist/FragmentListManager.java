package com.reactfragments.fragmentlist;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class FragmentListManager extends SimpleViewManager<FrameLayout> {
    public static final String REACT_CLASS = "FragmentList";
    ReactApplicationContext context = null;

    public FragmentListManager(ReactApplicationContext reactContext) {
        context = reactContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public FrameLayout createViewInstance(ThemedReactContext context) {
        FrameLayout view = new FrameLayout(context);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            view.setId(View.generateViewId());
        }
        NativeModuleWrapper nativeModuleWrapper = new NativeModuleWrapper(this.context);

        FragmentManager fragmentManager = nativeModuleWrapper.getCurrent().getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        ItemFragment fragment = new ItemFragment();

        fragmentTransaction.replace(view.getId(), fragment);

        fragmentTransaction.commit();

        return view;
    }
}
