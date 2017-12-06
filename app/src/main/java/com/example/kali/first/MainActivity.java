package com.example.kali.first;

import android.os.Bundle;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.towel.math.Expression;


import org.w3c.dom.Text;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String message = "";




    public void key0(View view){
        Button  Key_0  = (Button) findViewById(R.id.Key_0);
        String Key0 = Key_0.getText().toString();
        int neKey0 =  Integer.parseInt(Key0);

        StoreExpression(Key0);
    }

    public void key1(View view){
        Button  Key_1  = (Button) findViewById(R.id.Key_1);
        String Key1 = Key_1.getText().toString();
        StoreExpression(Key1);
    }
    public void key2(View view){
        Button  Key_2  = (Button) findViewById(R.id.Key_2);
        String Key2 = Key_2.getText().toString();
        StoreExpression(Key2);

    }
    public void key3(View view){
        Button  Key_3  = (Button) findViewById(R.id.Key_3);
        String Key3 = Key_3.getText().toString();
        StoreExpression(Key3);
    }
    public void key4(View view){
        Button  Key_4  = (Button) findViewById(R.id.Key_4);
        String Key4 = Key_4.getText().toString();
        StoreExpression(Key4);
    }
    public void key5(View view){
        Button  Key_5  = (Button) findViewById(R.id.Key_5);
        String Key5 = Key_5.getText().toString();
        StoreExpression(Key5);
    }
    public void key6(View view){
        Button  Key_6  = (Button) findViewById(R.id.Key_6);
        String Key6 = Key_6.getText().toString();
        StoreExpression(Key6);
    }
    public void key7(View view){
        Button  Key_7  = (Button) findViewById(R.id.Key_7);
        String Key7 = Key_7.getText().toString();
        StoreExpression(Key7);
    }
    public void key8(View view){
        Button  Key_8  = (Button) findViewById(R.id.Key_8);
        String Key8 = Key_8.getText().toString();
        StoreExpression(Key8);
    }
    public void key9(View view){
        Button  Key_9  = (Button) findViewById(R.id.Key_9);
        String Key9 = Key_9.getText().toString();
        StoreExpression(Key9);
    }
    public void multiply(View view){
        Button  Mul  = (Button) findViewById(R.id.Multiply);
        String Mul0 = Mul.getText().toString();
        StoreExpression(Mul0);

    }
    public void addition(View view){
        Button  Add  = (Button) findViewById(R.id.Addition);
        String Add0 = Add.getText().toString();
        StoreExpression(Add0);

    }
    public void substraction(View view){
        Button  Sub  = (Button) findViewById(R.id.Substraction);
        String Sub0 = Sub.getText().toString();
        StoreExpression(Sub0);

    }
    public void division(View view){
        Button  Div = (Button) findViewById(R.id.Division);
        String Div0 = Div.getText().toString();
        StoreExpression(Div0);
    }

    public void StoreExpression(String exp){
        message = message + exp;
        DisplayAnswer(message);

    }

    public void CalculateKey(View view){
        Expression exp = new Expression(message);
        Double result = exp.resolve();
        DisplayExpression(result);


        message = "";

    }
    public void DisplayExpression(Double ans){
        TextView expression = (TextView) findViewById(R.id.expression);
        expression.setText(" "+ans);
    }
    public void DisplayAnswer(String number){
        TextView answer = (TextView) findViewById(R.id.answer);
        answer.setText(number);
    }
}
