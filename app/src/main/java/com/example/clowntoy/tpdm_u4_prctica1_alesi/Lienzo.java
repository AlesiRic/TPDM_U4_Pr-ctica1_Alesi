package com.example.clowntoy.tpdm_u4_prctica1_alesi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.View;
import java.lang.Runnable;

public class Lienzo extends View {


    Circulo uno,dos,tres,cuatro,cinco,seis;
    public Lienzo(Context context){
        super(context);

        double a,b;
        a=Math.random()*1000;
        b=Math.random()*1500;
        uno=new Circulo((int)a,(int)b);

        a=Math.random()*1000;
        b=Math.random()*1500;
        dos=new Circulo((int)a,(int)b);

        a=Math.random()*1000;
        b=Math.random()*1500;
        tres=new Circulo((int)a,(int)b);

        a=Math.random()*1000;
        b=Math.random()*1500;
        cuatro=new Circulo((int)a,(int)b);

        a=Math.random()*1000;
        b=Math.random()*1500;
        cinco=new Circulo((int)a,(int)b);

        a=Math.random()*1000;
        b=Math.random()*1500;
        seis=new Circulo((int)a,(int)b);


    }

    @Override
    protected void onDraw(Canvas c) {

        uno.pintar(c);
        dos.pintar(c);
        tres.pintar(c);
        cuatro.pintar(c);
        cinco.pintar(c);
        seis.pintar(c);

        uno.desplazamiento(1000,1500);
        dos.desplazamiento(1000,1500);
        tres.desplazamiento(1000,1500);
        cuatro.desplazamiento(1000,1500);
        cinco.desplazamiento(1000,1500);
        seis.desplazamiento(1000,1500);

        invalidate();
    }
}