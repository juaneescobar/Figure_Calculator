package com.example.juanesteban.seccion_dos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Radio, Lado_a, Base, Altura,Lado_b ;
    TextView Resultados, Lado_1,Lado_2,Lado_3,Lado_4,Lado_5;
    RadioGroup RadioGroup;
    String a, b, c, d,e, Aux;
    Double perimetro, area, volumen;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radio = findViewById(R.id.Radio);
        Lado_a = findViewById(R.id.Lado_a);
        Lado_b = findViewById(R.id.Lado_b);
        Base = findViewById(R.id.Base);
        Altura = findViewById(R.id.Altura);
        Resultados = findViewById(R.id.Resultados);
        RadioGroup = findViewById(R.id.RadioGroup);
        img = findViewById(R.id.ImagenActual);
        Lado_1 = findViewById(R.id.Lado_1);
        Lado_2 = findViewById(R.id.Lado_2);
        Lado_3 = findViewById(R.id.Lado_3);
        Lado_4 = findViewById(R.id.Lado_4);
        Lado_5 = findViewById(R.id.Lado_5);


        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkId) {


                if (checkId == R.id.Cuadrado) {
                    Aux="1";
                    img.setImageResource(R.drawable.image_1);
                    Lado_a.setVisibility(View.VISIBLE);
                    Lado_1.setVisibility(View.VISIBLE);
                    Lado_2.setVisibility(View.INVISIBLE);
                    Lado_3.setVisibility(View.INVISIBLE);
                    Lado_4.setVisibility(View.INVISIBLE);
                    Lado_5.setVisibility(View.INVISIBLE);
                    Radio.setVisibility(View.INVISIBLE);
                    Lado_b.setVisibility(View.INVISIBLE);
                    Base.setVisibility(View.INVISIBLE);
                    Altura.setVisibility(View.INVISIBLE);


                }

                if (checkId==R.id.Circulo){
                    Aux="3";
                    img.setImageResource(R.drawable.circulo_1);
                    Lado_1.setVisibility(View.INVISIBLE);
                    Lado_2.setVisibility(View.INVISIBLE);
                    Lado_3.setVisibility(View.INVISIBLE);
                    Lado_4.setVisibility(View.VISIBLE);
                    Lado_5.setVisibility(View.INVISIBLE);
                    Lado_b.setVisibility(View.INVISIBLE);
                    Base.setVisibility(View.INVISIBLE);
                    Altura.setVisibility(View.INVISIBLE);
                    Lado_a.setVisibility(View.INVISIBLE);
                    Radio.setVisibility(View.VISIBLE);




                }

                if (checkId==R.id.Triangulo){
                    img.setImageResource(R.drawable.imagen_2);
                    Aux="2";
                    Lado_4.setVisibility(View.INVISIBLE);
                    Lado_1.setVisibility(View.VISIBLE);
                    Lado_2.setVisibility(View.VISIBLE);
                    Lado_3.setVisibility(View.VISIBLE);
                    Lado_5.setVisibility(View.VISIBLE);
                    Lado_b.setVisibility(View.VISIBLE);
                    Base.setVisibility(View.VISIBLE);
                    Altura.setVisibility(View.VISIBLE);
                    Lado_a.setVisibility(View.VISIBLE);
                    Radio.setVisibility(View.INVISIBLE);
                }

                if (checkId==R.id.Cubo){

                    Aux="4";
                    img.setImageResource(R.drawable.cubo_1);
                    Lado_a.setVisibility(View.VISIBLE);
                    Lado_1.setVisibility(View.VISIBLE);
                    Lado_2.setVisibility(View.INVISIBLE);
                    Lado_3.setVisibility(View.INVISIBLE);
                    Lado_4.setVisibility(View.INVISIBLE);
                    Lado_5.setVisibility(View.INVISIBLE);
                    Radio.setVisibility(View.INVISIBLE);
                    Lado_b.setVisibility(View.INVISIBLE);
                    Base.setVisibility(View.INVISIBLE);
                    Altura.setVisibility(View.INVISIBLE);


                }
            }
        });


    }


    public void OnClickCalculate(View view) {

        int id = view.getId();

        if (id == R.id.Calcular) {

            if(Aux=="1"){
                a = Lado_a.getText().toString();

                if(a.equals("")){
                    Resultados.setText("Introduzca el valor del Lado a");
                }else{
                    perimetro = (Double.valueOf("4") * Double.valueOf(a));
                    area = (Double.valueOf(a) * Double.valueOf(a));


                    Resultados.setText("Perimetro:"+perimetro+"m"+ "                   " + "Area:" + area+"m²");
                    Lado_a.setText("");


                }
            }

            if(Aux=="2"){

                a = Lado_a.getText().toString();
                e = Lado_b.getText().toString();
                b = Base.getText().toString();
                c = Altura.getText().toString();

                if(a.equals("") ) {
                    Resultados.setText("Introduzca el valor del Lado a");
                }else if(e.equals("")){
                    Resultados.setText("Introduzca el valor del Lado b");
                }else if(b.equals("")){
                    Resultados.setText("Introduzca el valor de la Base");
                }else if(c.equals("")){
                    Resultados.setText("Introduzca el valor de la ALtura");
                }else{
                    perimetro = (Double.valueOf(a) + Double.valueOf(b) + Double.valueOf(e));
                    area = (Double.valueOf(b)* Double.valueOf(c))/2.0;


                    Resultados.setText("Perimetro:"+perimetro+"m"+ "             " + "Area:" + area+"m²");

                    Lado_a.setText("");
                    Lado_b.setText("");
                    Base.setText("");
                    Altura.setText("");


                }

            }

            if(Aux=="3"){
                d = Radio.getText().toString();

                if(d.equals("")){
                    Resultados.setText("Introduzca el valor del Radio");
                }else{
                    area = (Double.valueOf(d) * Double.valueOf(d)*Double.valueOf(Math.PI));

                    Resultados.setText("Area:" + area+"m²");
                    Radio.setText("");

                }
            }

            if(Aux=="4"){
                a = Lado_a.getText().toString();

                if(a.equals("")){
                    Resultados.setText("Introduzca el valor del Lado a");
                }else{
                    area = (Double.valueOf(a))*(Double.valueOf(a))*6;
                    volumen =(Double.valueOf(a))*(Double.valueOf(a))*(Double.valueOf(a));

                    Resultados.setText("Volumen:"+volumen+"m3"+ "          " + "Area:" + area +"m²");

                    Lado_a.setText("");

                }
            }

        }

    }
}
