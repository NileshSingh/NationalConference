package com.iitb.aakash.nationalconference;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;

public class Arrangement extends Activity {
	
	WebView arrangement;
	TextView txtHome, txtAbout, txtSchedule, txtSpeakers, txtArrangements,
	txtContact;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arrangement);
		
		arrangement=(WebView)findViewById(R.id.web_arrangement);
		arrangement.loadUrl("file:///android_asset/arrangement.html");	
		txtHome = (TextView) findViewById(R.id.txtHome);
		txtAbout = (TextView) findViewById(R.id.txtAbout);
		txtSchedule = (TextView) findViewById(R.id.txtSchedule);
		txtSpeakers = (TextView) findViewById(R.id.txtSpeaker);
		txtArrangements = (TextView) findViewById(R.id.txtArrangement);
		txtContact = (TextView) findViewById(R.id.txtContact);

		txtAbout.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setAlpha((float) 0.2);
				Intent infoactivity = new Intent(Arrangement.this, About.class);
				startActivity(infoactivity);
				finish();
			}
		});

		txtSchedule.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setAlpha((float) 0.2);
				Intent infoactivity = new Intent(Arrangement.this, Schedule.class);
				startActivity(infoactivity);
				finish();
			}
		});

		txtSpeakers.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setAlpha((float) 0.2);
				Intent infoactivity = new Intent(Arrangement.this, Speakers.class);
				startActivity(infoactivity);
				finish();
			}
		});

		txtHome.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setAlpha((float) 0.2);
				Intent infoactivity = new Intent(Arrangement.this, Home.class);
				startActivity(infoactivity);
				finish();
			}
		});

		txtContact.setOnClickListener(new OnClickListener() {

			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				v.setAlpha((float) 0.2);
				Intent infoactivity = new Intent(Arrangement.this, ContactUs.class);
				startActivity(infoactivity);
				finish();
			}
		});

	
		
	}

	

}
