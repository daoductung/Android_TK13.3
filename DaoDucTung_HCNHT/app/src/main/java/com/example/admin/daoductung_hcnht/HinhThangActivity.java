package com.example.admin.daoductung_hcnht;

import  android.support.v7.app.AppCompatActivity;
import  android.os.Bundle;
import  android.content.Intent;
import  android.view.View;
import  android.widget.Button;
import  android.widget.EditText;
import  android.widget.TextView;



public  class  HinhThangActivity  extends  AppCompatActivity  {
    EditText  dn;
    EditText  dl;
    EditText  cc;

    @Override
    protected  void  onCreate(Bundle  savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hinhthang);
        Button  Sol=(Button)findViewById(R.id.Sol);
        Sol.setOnClickListener(onSol);
        Button  Next=(Button)findViewById(R.id.ToChunhat);
        Next.setOnClickListener(onNext);
    }
    private  View.OnClickListener  onNext=new  View.OnClickListener()  {
        public  void  onClick(View  v)  {
            Intent  nextScreen  =  new Intent(getApplicationContext(),ChunhatActivity.class);
            nextScreen.putExtra("dn",dn.getText().toString());
            nextScreen.putExtra("dl",  dl.getText().toString());
            nextScreen.putExtra("cc",cc.getText().toString());
            startActivity(nextScreen);
        }
    };
    private  View.OnClickListener  onSol=new  View.OnClickListener()  {
        public  void  onClick(View  v)  {
            TextView  textView;
            double dientich;
            dn=(EditText)findViewById(R.id.dn);
            dl=(EditText)findViewById(R.id.dl);
            cc=(EditText)findViewById(R.id.cc);
            String  daynho,  daylon,  cao;
            daynho  =  dn.getText().toString();
            daylon  =  dl.getText().toString();
            cao  =  cc.getText().toString();
            dientich  =  (Double.parseDouble(daynho)+ Double.parseDouble(daylon))*	Double.parseDouble(cao)/2;
            String  strSol="";
            strSol  =  "Diện  tích  hình  thang  =  "+ String.format("%5.2f",dientich)  ;
            textView  =  (TextView)  findViewById(R.id.textView1);
            textView.setText(strSol);
        }
    };
}


