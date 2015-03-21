package com.aroundme;

import android.os.Bundle;
import android.app.Activity;

/**
 * The Main Activity.
 */
public class MainActivity extends Activity {


	/**
	 * Substitute you own sender ID here. This is the project number you got
	 * from the API Console, as described in "Getting Started."
	 */
	
	//This is the project ID related to 'AroundMe'.
	String SENDER_ID = "1047488186224";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//You must initialize the EndpointApiCreator in order to use it.
		EndpointApiCreator.initialize(null);
	}

}
