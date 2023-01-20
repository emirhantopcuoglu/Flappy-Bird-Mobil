package com.example.flappybird;

import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.util.Random;

public class Pipe extends BaseObject{
    public static int speed;
    public Pipe(float x,float y,int width,int height){//Constructor oluşturduk.
        super(x,y,width,height);
        speed=10*Constants.SCREEN_WIDTH/1080;//Boruların hızının ekranda sağdan sola doğru ayarlanması.
    }
    public void draw(Canvas canvas){//Ekrana su borularını çizdiren metot.
        this.x-=speed;//su borusunun x yönünde inecek şekilde konumlandırılması ve su borusunun sağdan sola hareketetmesine neden olur.
        canvas.drawBitmap(this.bm,this.x,this.y,null);
    }
    public void randomY(){
        Random r = new Random();
        this.y=r.nextInt((0+this.height/4)+1)-this.height/4;
    }
    @Override
    public void setBm(Bitmap bm) {
        this.bm=Bitmap.createScaledBitmap(bm,width,height,true);
    }
}
