package com.example.hci;



import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class UserScheduleActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_schedule);
		TestFragment fragment = new TestFragment();
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.add(R.id.test_fragment11, fragment).commit();
		
		
	
	}
	 
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
	}

}
