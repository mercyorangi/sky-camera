package com.publabs.skycam;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class LinksTabProcessingPhotos extends PreferenceActivity {
	//pushed... new workspace plus outer folder removed..

@Override
protected void onCreate(final Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new MyLinksFragment()).commit();
}

public static class MyLinksFragment extends PreferenceFragment
{
    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.links);
    }
}
}