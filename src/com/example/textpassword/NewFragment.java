package com.example.textpassword;

import com.example.textpassword.PassValitationPopwindow.OnInputNumberCodeCallback;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class NewFragment extends Fragment{
	
	private PassValitationPopwindow mPopup;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = View.inflate(getActivity(), R.layout.fragment_new, null);
		
		final Button mButton = (Button) view.findViewById(R.id.button);
		mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				mPopup = new PassValitationPopwindow(getActivity(),0,mButton,new OnInputNumberCodeCallback() {

					@Override
					public void onSuccess() {
						
					}});
			}
		});
		return view;
	}

}
