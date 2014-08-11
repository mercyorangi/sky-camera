package com.publabs.skycam;

import java.util.Locale;

import com.publabs.skycam.LinksTabProcessingPhotos.MyLinksFragment;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Guide extends ActionBarActivity implements ActionBar.TabListener {
//<<<<<<< HEAD
//	//pushed... new workspace plus outer folder removed..
//=======
//>>>>>>> 055abaaa8e8e00e795e852a2352646f67df9b86c

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;
	

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_how_to);

		// Set up the action bar.
		final ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});

		// For each of the sections in the app, add a tab to the action bar.
		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.
			actionBar.addTab(actionBar.newTab()
					.setText(mSectionsPagerAdapter.getPageTitle(i))
					.setTabListener(this));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.how_to, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			startActivity(new Intent(this, PrefsActivity.class));
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.

		MyLinksFragment links_fragment = new MyLinksFragment();
		if (tab.getPosition() == 1) { // this is the tab for Links for Acquiring and Processing Aerial Photos
			MyPublicVariables.header_photo_acquisition_mission = "";
			MyPublicVariables.photo_acquisition_mission = "";
			MyPublicVariables.header_app_settings_detailed = "";
			MyPublicVariables.app_settings_detailed = "";
			
			getFragmentManager().beginTransaction().replace(R.id.frag_container, links_fragment).commit();
			
//			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//			transaction.replace(R.id.frag_container, links_fragment);
//			transaction.addToBackStack(null);
//			transaction.commit();
			
			
		} else {
			//getFragmentManager().beginTransaction().remove(links_fragment);
			mViewPager.setCurrentItem(tab.getPosition());

		}		
		
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		
		// When the given tab is reselected, switch to the corresponding page in
		// the ViewPager.

		MyLinksFragment links_fragment = new MyLinksFragment();
		if (tab.getPosition() == 1) { // this is the tab for Links for Acquiring and Processing Aerial Photos
			MyPublicVariables.header_photo_acquisition_mission = "";
			MyPublicVariables.photo_acquisition_mission = "";
			MyPublicVariables.header_app_settings_detailed = "";
			MyPublicVariables.app_settings_detailed = "";
			
			getFragmentManager().beginTransaction().replace(R.id.frag_container, links_fragment).commit();
			
//			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//			transaction.replace(R.id.frag_container, links_fragment);
//			transaction.addToBackStack(null);
//			transaction.commit();
			
			
		} else {
			//getFragmentManager().beginTransaction().remove(links_fragment);
			mViewPager.setCurrentItem(tab.getPosition());

		}	
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
//			return PlaceholderFragment.newInstance(position + 1);
			return PlaceholderFragment.newInstance(position);
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
//				return getString(R.string.tab_1_title).toUpperCase(l);
				return getString(R.string.tab_1_title);
			case 1:
//				return getString(R.string.tab_2_title).toUpperCase(l);
				return getString(R.string.tab_2_title);
			case 2:
//				return getString(R.string.tab_3_title).toUpperCase(l);
				return getString(R.string.tab_3_title);
			}
			return null;
		}
	}
	
}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_HEADER = "section_header";
		private static final String ARG_SECTION_DETAILS = "section_details";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putString(ARG_SECTION_HEADER,  MyPublicVariables.headers_guide_page_data[sectionNumber]);
			args.putString(ARG_SECTION_DETAILS,  MyPublicVariables.details_guide_page_data[sectionNumber]);
			fragment.setArguments(args);
			
			
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			
			
			View rootView = inflater.inflate(R.layout.fragment_how_to,container, false);
			
			TextView textView_details = (TextView) rootView.findViewById(R.id.tvTabDetails);			
			textView_details.setText(getArguments().getString(ARG_SECTION_DETAILS));
			
			TextView textView_header = (TextView) rootView.findViewById(R.id.tvTabHeader);			
			textView_header.setText(getArguments().getString(ARG_SECTION_HEADER));
			
			return rootView;
		}
	}

