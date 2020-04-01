package com.example.test2;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;
    private Button btnNumbercham;
    private Button btnNumbercong;
    private Button btnNumbertru;
    private Button btnNumbernhan;
    private Button btnNumberchia;
    private Button btnNumberbang;
    private Button btnNumberCE;
    private Button btnNumberC;
    private Button btnNumberBS;
    private Button btnNumbercongtru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();
        setEventClickView();
    }

    public void initWidget(){

        edtNumber = (EditText) findViewById(R.id.tv_input);
        tvResult = (TextView) findViewById(R.id.tv_ketqua);

        btnNumber1 = (Button)findViewById(R.id.btn1);
        btnNumber2 = (Button)findViewById(R.id.btn2);
        btnNumber3 = (Button)findViewById(R.id.btn3);
        btnNumber4 = (Button)findViewById(R.id.btn4);
        btnNumber5 = (Button)findViewById(R.id.btn5);
        btnNumber6 = (Button)findViewById(R.id.btn6);
        btnNumber7 = (Button)findViewById(R.id.btn7);
        btnNumber8 = (Button)findViewById(R.id.btn8);
        btnNumber9 = (Button)findViewById(R.id.btn9);
        btnNumber0 = (Button)findViewById(R.id.btn0);

        btnNumberBS = (Button)findViewById(R.id.btnBS);
        btnNumberCE = (Button)findViewById(R.id.btnCE);
        btnNumberC = (Button)findViewById(R.id.btnC);
        btnNumberbang = (Button)findViewById(R.id.btnbang);

        btnNumbercong = (Button)findViewById(R.id.btncong);
        btnNumbertru = (Button)findViewById(R.id.btntru);
        btnNumbernhan = (Button)findViewById(R.id.btnnhan);
        btnNumberchia = (Button)findViewById(R.id.btnchia);

        btnNumbercham = (Button)findViewById(R.id.btncham);
        btnNumbercongtru = (Button)findViewById(R.id.btncongtru);


    }
    public void setEventClickView(){
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);
        btnNumberBS.setOnClickListener(this);
        btnNumberC.setOnClickListener(this);
        btnNumberCE.setOnClickListener(this);
        btnNumberbang.setOnClickListener(this);
        btnNumbercong.setOnClickListener(this);
        btnNumbercongtru.setOnClickListener(this);
        btnNumbertru.setOnClickListener(this);
        btnNumbernhan.setOnClickListener(this);
        btnNumberchia.setOnClickListener(this);
        btnNumbercham.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                edtNumber.setText("0");
                break;
            case R.id.btn1:
                edtNumber.append("1");
                break;
            case R.id.btn2:
                edtNumber.append("2");
                break;
            case R.id.btn3:
                edtNumber.append("3");
                break;
            case R.id.btn4:
                edtNumber.append("4");
                break;
            case R.id.btn5:
                edtNumber.append("5");
                break;
            case R.id.btn6:
                edtNumber.append("6");
                break;
            case R.id.btn7:
                edtNumber.append("7");
                break;
            case R.id.btn8:
                edtNumber.append("8");
                break;
            case R.id.btn9:
                edtNumber.append("9");
                break;
            case R.id.btnC:
//                edtNumber.append();
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edtNumber, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
               break;
            case R.id.btnCE:
                break;
            case R.id.btnBS:
                break;
            case R.id.btncong:
                edtNumber.append("+");
                break;
            case R.id.btntru:
                edtNumber.append("-");
                break;
            case R.id.btnnhan:
                edtNumber.append("x");
                break;
            case R.id.btnchia:
                edtNumber.append("/");
                break;
            case R.id.btnbang:
                break;
            case R.id.btncongtru:
                break;
            case R.id.btncham:
                edtNumber.append(".");
                break;
        }
    }
//    public  String deleteNumber(String number){
//        String lenght = number.length();
//        String tem = number.substring(0,lenght-1);
//        return tem;
//    }

}
