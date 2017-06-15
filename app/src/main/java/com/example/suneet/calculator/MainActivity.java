package com.example.suneet.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText text;
    private double v1;
    private double v2;
    private char oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button zero=(Button) findViewById(R.id.button0);
        Button one=(Button) findViewById(R.id.button1);
        Button two=(Button) findViewById(R.id.button2);
        Button three=(Button) findViewById(R.id.button3);
        Button four=(Button) findViewById(R.id.button4);
        Button five=(Button) findViewById(R.id.button5);
        Button six=(Button) findViewById(R.id.button6);
        Button seven=(Button) findViewById(R.id.button7);
        Button eight=(Button) findViewById(R.id.button8);
        Button nine=(Button) findViewById(R.id.button9);
        Button sub=(Button) findViewById(R.id.buttonSubtract);
        Button add=(Button) findViewById(R.id.buttonAdd);
        Button mul=(Button) findViewById(R.id.buttonMultiply);
        Button div=(Button) findViewById(R.id.buttonDivide);
        Button clear=(Button)findViewById(R.id.buttonClear);
        Button dot=(Button) findViewById(R.id.buttonDecimal);
        Button eql=(Button)findViewById(R.id.buttonEqls);
        final TextView textView=(TextView)findViewById(R.id.textView);
        zero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"0");
            }

        });
        one.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"5");
            }
        });


        six.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(textView.getText()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==(null))
                {
                    textView.setText("");
                }
                else
                {
                    v1=Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    oper='+';
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    v1=Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    oper='-';
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null)
                {
                    textView.setText("");
                }
                else
                {
                    v1=Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                    oper='*';
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView==null)
                {
                    textView.setText("");

                }
                else
                {
                    oper='/';
                    v1=Double.parseDouble(textView.getText().toString());
                    textView.setText("");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
                    textView.setText(textView.getText()+".");
                }
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Double.parseDouble(textView.getText().toString());
                if(oper=='+'){
                    textView.setText(v1+v2+"");

                }
                if(oper=='-')
                {
                    textView.setText(v1-v2+"");
                }
                if(oper=='/')
                {
                    if(v2==0)
                    {
                        textView.setText(" ∞ ");
                    }
                    else
                    {
                        textView.setText(v1/v2+"");
                    }
                }
                if(oper=='*')
                {
                    textView.setText(v1*v2+"");
                }

            }

        });






    }
}
