package com.example.textpassword;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.example.textpassword.PassValitationPopwindow.OnInputNumberCodeCallback;

public class MainActivity extends FragmentActivity {
	
//	TextPassPopWindow mPop;
	private PassValitationPopwindow mPopup;

	private  NewFragment newFragment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		findViewById(R.id.main).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
//				mPop = new TextPassPopWindow(MainActivity.this, itemsOnClick);
//				  //显示窗口  
//				mPop.showAtLocation(MainActivity.this.findViewById(R.id.main),
//						Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 0); //设置layout在PopupWindow中显示的位置  
				
				new PassValitationPopwindow(MainActivity.this,1,findViewById(R.id.main),new OnInputNumberCodeCallback() {
					
					@Override
					public void onSuccess() {
						
					}
				});
			
			}
		});
		
		if (newFragment == null)
		{
			newFragment = new NewFragment();
		}
		getSupportFragmentManager().beginTransaction()
		.replace(R.id.menu_fragment, newFragment).commit(); // 将左菜单默认VIEW替换为左菜单Fragment
		
		
	}


}
