package com.app.myappcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btnmultiple,btn7,btn8,btn9,btnadd,btn4,btn5;
    Button btn6,btnsubtract,btn1,btn2,btn3,btnclear,btn0;
    Button btnequal,btndivide;
    EditText edittext;
    String displayNum ="";
    String op;
    float num1 , num2, res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1  = findViewById(R.id.btnOne);
        btn2  = findViewById(R.id.btnTwo);
        btn3  = findViewById(R.id.btnThree);
        btn4  = findViewById(R.id.btnFour);
        btn5  = findViewById(R.id.btnFive);
        btn6  = findViewById(R.id.btnSix);
        btn7  = findViewById(R.id.btnSeven);
        btn8  = findViewById(R.id.btnEight);
        btn9  = findViewById(R.id.btnNine);
        btn0  = findViewById(R.id.btnZero);
        btnclear  = findViewById(R.id.btnClear);
        btnequal  = findViewById(R.id.btnEqual);
        btnadd = findViewById(R.id.btnAdd);
        btnsubtract = findViewById(R.id.btnSubtract);
        btndivide = findViewById(R.id.btnDivide);
        btnmultiple = findViewById(R.id.btnMultiply);

        edittext = findViewById(R.id.btnText);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);

        btnequal.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnclear.setOnClickListener(this);
        btnsubtract.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmultiple.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnOne:
                displayNum += 1;
                edittext.setText(displayNum);
                break;

            case R.id.btnTwo:
                displayNum += 2;
                edittext.setText(displayNum);
                break;

            case R.id.btnThree:
                displayNum += 3;
                edittext.setText(displayNum);
                break;

            case R.id.btnFour:
                displayNum += 4;
                edittext.setText(displayNum);
                break;

            case R.id.btnFive:
                displayNum += 5;
                edittext.setText(displayNum);
                break;

            case R.id.btnSix:
                displayNum += 6;
                edittext.setText(displayNum);
                break;

            case R.id.btnSeven:
                displayNum += 7;
                edittext.setText(displayNum);
                break;


            case R.id.btnEight:
                displayNum += 8;
                edittext.setText(displayNum);
                break;


            case R.id.btnNine:
                displayNum += 9;
                edittext.setText(displayNum);
                break;

            case R.id.btnZero:
                displayNum += 0;
                edittext.setText(displayNum);
                break;


            case R.id.btnAdd:
                num1 = Float.parseFloat(displayNum);
                displayNum="";
                op="+";
                break;

            case R.id.btnSubtract:
                num1 = Float.parseFloat(displayNum);
                displayNum="";
                op="-";
                break;

            case R.id.btnDivide:
                num1 = Float.parseFloat(displayNum);
                displayNum="";
                op="/";
                break;


            case R.id.btnMultiply:
                num1 = Float.parseFloat(displayNum);
                displayNum="";
                op="*";
                break;




            case R.id.btnEqual:
                num2 = Float.parseFloat(displayNum);
                res =getResult(op,num1,num2);
                edittext.setText(String.valueOf(res));
                break;


            case R.id.btnClear:
                displayNum = "";
                edittext.setText(displayNum);
                break;


        }
    }


    private float getResult(String op,float n1, float n2)
    {
        switch (op)
        {
            case "+":
                return n1+n2;

            case "-":
                return n1-n2;

            case "*":
                return n1*n2;

            case "/":
                return n1/n2;

            default:
                return  0;
        }
    }
}
