package com.publabs.skycam;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class PrefsActivity extends PreferenceActivity {
<<<<<<< HEAD
//<<<<<<< HEAD
//	//pushed... new workspace plus outer folder removed..
//=======
//>>>>>>> 055abaaa8e8e00e795e852a2352646f67df9b86c
=======
>>>>>>> b6938a79a632e370ebfe64c9484f88882a2c5b56

@Override
protected void onCreate(final Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
}

public static class MyPreferenceFragment extends PreferenceFragment
{
    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
}