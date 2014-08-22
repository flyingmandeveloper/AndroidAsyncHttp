package com.loopj.android.http;

import android.app.Activity;
import android.os.Bundle;

public class testAA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		ExampleUsage.makeRequest();
	}

	
}
