package com.example.clowntoy.tpdm_u4_prctica1_alesi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

public class Circulo {
    int x,y;
    int tamano,colorNum;
    int color;
    int velocidad;
    double angulo;
    int desX,desY;
    Paint p;
    public Circulo(int a,int b){
        x=a;
        y=b;
        tamano=(int)(Math.random()*5+1)*100;
        switch(tamano){
            case 100:velocidad=50;break;
            case 200:velocidad=40;break;
            case 300:velocidad=30;break;
            case 400:velocidad=20;break;
            case 500:velocidad=10;break;
            default: velocidad=50;break;
        }

        double c1=Math.random();
        c1=c1*6;

        colorNum=(int)c1;

        switch(colorNum){
            case 0:color=Color.rgb(255,0,0);break;
            case 1:color=Color.rgb(0,255,0);break;
            case 2:color=Color.rgb(0,0,255);break;
            case 3:color=Color.rgb(255,255,0);break;
            case 4:color=Color.rgb(0,255,255);break;
            case 5:color=Color.rgb(255,0,255);break;
        }
        double angRan=Math.random();
        angRan=angRan*12;
        int angNum=(int)angRan;
        switch(angNum){
            case 0:angulo=Math.toRadians(0);break;
            case 1:angulo=Math.toRadians(30);break;
            case 2:angulo=Math.toRadians(60);break;
            case 3:angulo=Math.toRadians(90);break;
            case 4:angulo=Math.toRadians(120);break;
            case 5:angulo=Math.toRadians(150);break;
            case 6:angulo=Math.toRadians(180);break;
            case 7:angulo=Math.toRadians(210);break;
            case 8:angulo=Math.toRadians(240);break;
            case 9:angulo=Math.toRadians(270);break;
            case 10:angulo=Math.toRadians(300);break;
            case 11:angulo=Math.toRadians(330);break;
        }

        double desPX=velocidad*Math.cos(angulo);
        double desPY=velocidad*Math.sin(angulo);
        desX=(int)desPX;
        desY=(int)desPY;
        p=new Paint();
        p.setColor(color);
    }

    public void desplazamiento(int a,int b){
        if(x+tamano>=a || x<=0){
            desX=desX*-1;
        }
        if(y+tamano>=b || y<=0){
            desY=desY*-1;
        }
        x=x+desX;
        y=y+desY;
    }



    public void pintar(Canvas c){

        c.drawOval(x,y,x+tamano,y+tamano,p);

    }


}
