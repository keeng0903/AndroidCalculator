package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnpercent,
            btnsqrt, btnx2, btn1x, btnce, btnc, btndel, btndiv, btnmul,
            btnsub, btnplus, btnpm, btndots, btnequal;
   private String  operation;

    int a = 0, b, result;
    private EditText mEdtInput;
    private ListView mTvResult;
    ArrayList<String> arrayResult;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtInput = (EditText)findViewById(R.id.edt_txt);
        mTvResult = (ListView)findViewById(R.id.tv_result);
        btn0 =(Button)findViewById(R.id.btn_0);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_2);
        btn4 = (Button)findViewById(R.id.btn_2);
        btn5 = (Button)findViewById(R.id.btn_2);
        btn6 = (Button)findViewById(R.id.btn_2);
        btn7 = (Button)findViewById(R.id.btn_2);
        btn8 = (Button)findViewById(R.id.btn_2);
        btn9 = (Button)findViewById(R.id.btn_2);
        btnpercent = (Button)findViewById(R.id.btn_percent);
        btnsqrt = (Button)findViewById(R.id.btn_sqrt);
        btnx2 = (Button)findViewById(R.id.btn_x2);
        btn1x = (Button)findViewById(R.id.btn_1x);
        btnce = (Button)findViewById(R.id.btn_ce);
        btnc = (Button)findViewById(R.id.btn_c);
        btndel = (Button)findViewById(R.id.btn_del);
        btndiv = (Button)findViewById(R.id.btn_div);
        btnmul = (Button)findViewById(R.id.btn_mul);
        btnsub = (Button)findViewById(R.id.btn_sub);
        btnplus = (Button)findViewById(R.id.btn_plus);
        btnpm = (Button)findViewById(R.id.btn_pm);
        btndots = (Button)findViewById(R.id.btn_dots);
        btnequal = (Button)findViewById(R.id.btn_equal);

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
        btnpercent.setOnClickListener(this);
        btnsqrt.setOnClickListener(this);
        btnx2.setOnClickListener(this);
        btn1x.setOnClickListener(this);
        btnce.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnpm.setOnClickListener(this);
        btndots.setOnClickListener(this);
        btnequal.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                mEdtInput.append("1");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_2:
                mEdtInput.append("2");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_3:
                mEdtInput.append("3");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_4:
                mEdtInput.append("4");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_5:
                mEdtInput.append("5");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_6:
                mEdtInput.append("6");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_7:
                mEdtInput.append("7");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_8:
                mEdtInput.append("8");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_9:
                mEdtInput.append("9");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_0:
                mEdtInput.append("0");
                a = Integer.parseInt(mEdtInput.getText().toString());
                break;

            case R.id.btn_percent:
                operation = "%";
                a = Integer.parseInt(mEdtInput.getText().toString());
                result = a/100;
                //mEdtInput.setText("" + result);
                arrayResult.add(0,result + "");
                arrayAdapter.notifyDataSetChanged();
                break;

            case R.id.btn_sqrt:
                operation = "√";
                break;

            case R.id.btn_x2:
                operation = "X^2";
                a = Integer.parseInt(mEdtInput.getText().toString());
                result = a * a;
                //mEdtInput.setText("" + result);
                arrayResult.add(0,result + "");
                arrayAdapter.notifyDataSetChanged();
                break;

            case R.id.btn_1x:
                operation = "1/X";
                a = Integer.parseInt(mEdtInput.getText().toString());
                result = 1/a;
                //mEdtInput.setText("" + result);
                arrayResult.add(0,result + "");
                arrayAdapter.notifyDataSetChanged();
                break;

            case R.id.btn_ce:
                String str = mEdtInput.getText().toString();

                if(mEdtInput.length()>0){
                    str = str.substring(0, str.length() - 1);
                    mEdtInput.setText(str);
                }
                else{
                    break;
                }

            case R.id.btn_c:
                String st = mEdtInput.getText().toString();
                if(mEdtInput.length()>0){
                    mEdtInput.setText(null);
                    break;
                }
                else{
                    break;
                }

            case R.id.btn_del:
                arrayResult.clear();
                arrayAdapter.notifyDataSetChanged();
                mEdtInput.setText(null);
                break;

            case R.id.btn_div:
                operation = "/";
                a = Integer.parseInt(mEdtInput.getText().toString());
                mEdtInput.setText("");
                break;


            case R.id.btn_mul:
                operation = "X";
                a = Integer.parseInt(mEdtInput.getText().toString());
                mEdtInput.setText("");
                break;

            case R.id.btn_sub:
                operation = "-";
                a = Integer.parseInt(mEdtInput.getText().toString());
                mEdtInput.setText("");
                break;

            case R.id.btn_plus:
                operation = "+";
                a = Integer.parseInt(mEdtInput.getText().toString());
                mEdtInput.setText("");
                break;

            case R.id.btn_pm:

                break;

            case R.id.btn_dots:

                break;

            case R.id.btn_equal:
                if(operation.equals("+")) {
                    b = Integer.parseInt(mEdtInput.getText().toString());
                    result = a + b;

                    //mEdtInput.setText("" + result);
                    operation = "=";

                    arrayResult.add(0,result + "");
                    arrayAdapter.notifyDataSetChanged();

                }
                else if(operation.equals("-")) {
                    b = Integer.parseInt(mEdtInput.getText().toString());
                    result = a - b;

                    //mEdtInput.setText("" + result);
                    operation = "=";

                    arrayResult.add(0,result + "");
                    arrayAdapter.notifyDataSetChanged();
                }
                else if(operation.equals("X")) {
                    b = Integer.parseInt(mEdtInput.getText().toString());
                    result = a * b;

                    //mEdtInput.setText("" + result);
                    operation = "=";

                    arrayResult.add(0,result + "");
                    arrayAdapter.notifyDataSetChanged();
                }
                else if(operation.equals("/")) {
                    b = Integer.parseInt(mEdtInput.getText().toString());
                    result = a / b;

                    //mEdtInput.setText("" + result);
                    operation = "=";

                    arrayResult.add(0,result + "");
                    arrayAdapter.notifyDataSetChanged();
                }

                break;
        }
    }

}
