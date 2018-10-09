package com.example.admin.daoductung_hcnht;

import  android.support.v7.app.AppCompatActivity;
import  android.os.Bundle;
import  android.content.Intent;
import  android.view.View;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;

/**
 *  Created  by  TVL  on  12/29/2015.
 */
public  class  ChunhatActivity  extends  AppCompatActivity  {
    EditText  chieurong;
    EditText  chieudai;

    @Override
    protected  void  onCreate(Bundle  savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chunhat);
        TextView  txta  =  (TextView)  findViewById(R.id.canha);
        TextView  txtb  =  (TextView)  findViewById(R.id.canhb);

        Button  Sol=(Button)findViewById(R.id.Sol);
        Sol.setOnClickListener(onSol);
        Button  btnClose  =  (Button)  findViewById(R.id.ToHinhthang);
        Intent i = getIntent();
        String  canha  =  i.getStringExtra("dn");
        String  canhb  =  i.getStringExtra("dl");
        txta.setText(canha);
        txtb.setText(canhb);
        btnClose.setOnClickListener(new  View.OnClickListener(){
            public  void  onClick(View  arg0){ finish();
            }
        });
    }
    private  View.OnClickListener  onSol=new  View.OnClickListener()  {

        public  void  onClick(View  v)  {
            TextView  textView;
            double dt;
            String  rong,  dai;

            chieurong=(EditText)findViewById(R.id.canha);
            chieudai=(EditText)findViewById(R.id.canhb);
            rong  =  chieurong.getText().toString();
            dai  =  chieudai.getText().toString();
            dt  =  Double.parseDouble(rong)*Double.parseDouble(dai);
            String  strSol="";
            strSol  =  "Dien  tich  chu  nhat  =  "+  String.format("%5.2f",dt);
            textView  =  (TextView)  findViewById(R.id.textView1);
            textView.setText(strSol);
        }
    };
}

