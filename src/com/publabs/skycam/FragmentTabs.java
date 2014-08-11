package com.publabs.skycam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentTabs extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_HEADER = "section_header";
	private static final String ARG_SECTION_DETAILS = "section_details";

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static FragmentTabs newInstance(int sectionNumber) {
		FragmentTabs fragment = new FragmentTabs();
		Bundle args = new Bundle();
		args.putString(ARG_SECTION_HEADER,  MyPublicVariables.headers_guide_page_data[sectionNumber]);
		args.putString(ARG_SECTION_DETAILS,  MyPublicVariables.details_guide_page_data[sectionNumber]);
		fragment.setArguments(args);
		
		
		return fragment;
	}
	
	public static android.app.Fragment MyNewInstance(int sectionNumber) {
		android.app.Fragment fragment = new android.app.Fragment();
		Bundle args = new Bundle();
		args.putString(ARG_SECTION_HEADER,  MyPublicVariables.headers_guide_page_data[sectionNumber]);
		args.putString(ARG_SECTION_DETAILS,  MyPublicVariables.details_guide_page_data[sectionNumber]);
		fragment.setArguments(args);
		
		
		return fragment;
	}

	public FragmentTabs() {
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
