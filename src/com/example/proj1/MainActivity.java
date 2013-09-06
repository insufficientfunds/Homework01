package com.example.proj1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button button1, button2;
	TextView msg1, msg2, msg3;
	
	String [] msg = {"Android", "iOS", "Window"};
	int i = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		
		msg1 = (TextView) findViewById(R.id.message1);
		msg2 = (TextView) findViewById(R.id.message2);
		msg3 = (TextView) findViewById(R.id.message3);		
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				i = (i+1)%3;
				msg1.setText(msg[i]);
				i = (i+1)%3;
				msg2.setText(msg[i]);				
				i = (i+1)%3;
				msg1.setText(msg[i]);
				i = (i+1)%3;				
			}
		});

		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				msg1.setText("Android");
				msg2.setText("iOS");
				msg3.setText("Blackberry");				
			}
		});
		
		/*button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				msg1.setText("Android");
				msg2.setText("iOS");
				msg3.setText("Blackberry");				
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
