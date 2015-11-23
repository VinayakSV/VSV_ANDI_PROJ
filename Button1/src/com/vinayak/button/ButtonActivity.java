package com.vinayak.button;

import android.os.Bundle;
import android.app.Activity;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonActivity extends Activity implements OnClickListener {
	
	EditText InputMessage;
	Button DisplayMessage,displayRed,displayBlue;
	TextView Message;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        
        InputMessage = (EditText) findViewById(R.id.inputMessage);
        DisplayMessage = (Button) findViewById(R.id.Display);
        Message = (TextView) findViewById(R.id.message);
        
        displayRed = (Button) findViewById(R.id.buttoncolordispaly);
        displayBlue = (Button) findViewById(R.id.buttoncolordisplayblue);
        
        
        
        displayRed.setOnClickListener(ButtonActivity.this);
        displayBlue.setOnClickListener(ButtonActivity.this);
        
    }

    public void DisplayMessage(View v) {
		String InputMsg = InputMessage.getText().toString();
		InputMessage.setText("");
		Message.setText(InputMsg);

	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) 
		{
		case R.id.buttoncolordispaly:
			Log.d("[DEBUG]","Red button was clicked");
			
			break;
			
		case R.id.buttoncolordisplayblue : 
			Log.d("[DEBUG]","Blue Button was clicked");

		default:
			break;
		}	
		
	}

}
