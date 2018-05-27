package com.reactfragments;

import com.facebook.react.ReactActivity;
import com.reactfragments.fragmentlist.ItemFragment;
import com.reactfragments.fragmentlist.dummy.DummyContent;

public class MainActivity extends ReactActivity implements ItemFragment.OnListFragmentInteractionListener {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "reactFragments";
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
