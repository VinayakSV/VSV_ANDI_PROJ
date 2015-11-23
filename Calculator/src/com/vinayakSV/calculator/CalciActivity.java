package com.vinayakSV.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


	public class CalciActivity extends Activity implements OnClickListener{

		
		EditText number1,number2;
		Button add,sub,mul,div,clear;
		TextView res;
		int result;
		
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_calci);
	        
	        number1 = (EditText) findViewById(R.id.number1);
	        number2 = (EditText) findViewById(R.id.number2);
	        add = (Button) findViewById(R.id.add);
	        sub = (Button) findViewById(R.id.sub);
	        mul = (Button) findViewById(R.id.mul);
	        div = (Button) findViewById(R.id.div);
	        res = (TextView) findViewById(R.id.result);
	        
	        clear = (Button) findViewById(R.id.clear);
	        
	        add.setOnClickListener(CalciActivity.this);
	        sub.setOnClickListener(CalciActivity.this);
	        mul.setOnClickListener(CalciActivity.this);
	        div.setOnClickListener(CalciActivity.this);
	        clear.setOnClickListener(CalciActivity.this);
	        
	    }

	    @Override
		public void onClick(View v) {
			
			if(number1.getText().toString().length()==0 && number2.getText().toString().length()==0)
			{
				Toast.makeText(CalciActivity.this,"Enter the values",Toast.LENGTH_SHORT).show();
			}
			
			String s1 = number1.getText().toString();
			int num1 = Integer.parseInt(s1);
			
			String s2 = number2.getText().toString();
			int num2 = Integer.parseInt(s2);
			
			switch(v.getId())
			{
			case R.id.add:
				result = num1 + num2;
				
				res.setText(String.valueOf(result));
				break;
			case R.id.sub:
				result = num1 - num2;
				
				res.setText(String.valueOf(result));
				break;
			case R.id.mul:
				result = num1 * num2;
				
				res.setText(String.valueOf(result));
				break;
			case R.id.div:
				result = num1 / num2;
				
				res.setText(String.valueOf(result));
				break;
			case R.id.clear:
				
				number1.setText("");
				number2.setText("");
				break;
			default:
				break;
			}
			
		}
    
}
