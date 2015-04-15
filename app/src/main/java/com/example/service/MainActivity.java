package com.example.service;

import com.example.service.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	// Start the  service
	public void startNewService(View view) {
		
		startService(new Intent(this, MyService.class));
	}

	// Stop the  service
	public void stopNewService(View view) {
		
		stopService(new Intent(this, MyService.class));
	}

}
