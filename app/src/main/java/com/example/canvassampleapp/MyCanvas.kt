package com.example.canvassampleapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class MyCanvas(context: Context?) : View(context)
        {
            override fun onDraw(canvas: Canvas?)
              {
                super.onDraw(canvas)

                val paint : Paint = Paint()
                paint.setColor(Color.BLACK)

                println("Width of Screen:" + width);
                println("Height of Screen:" + height);

                for(i in 1..10)
                {
                    //Horizontal line
                    println("height/10:"  + i*height/10)
                    canvas?.drawLine(0F,i*height/10.toFloat(),width.toFloat(),i*height/10.toFloat(),paint)


                    println("width/10:"  + i*width/10)
                    canvas?.drawLine(i*width/10.toFloat(),0F,i*width/10.toFloat(),height.toFloat(),paint)

                }







               for(i in 1..10) {
                     for(j in 1..10){
                         println(" Width: " + i*width/10.toFloat() + " Height: " + j*height/10.toFloat())
                            canvas?.drawText("(" + j + "," + i + ")", ((i-1)*width/10.toFloat() + i*width/10.toFloat())/2,((j-1)*height/10.toFloat() + j*height/10.toFloat())/2 ,paint)
                    }
               }



            }
        }

