package com.example.afinal

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class afterlogin : AppCompatActivity() {
    private val booleanArray = BooleanArray(40)
    private var c=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afterlogin)

        val calculate = findViewById<Button>(R.id.calc)
        val presentStudents= findViewById<TextView>(R.id.presentStudents)
        val roll1=findViewById<Button>(R.id.roll1)
        val roll2=findViewById<Button>(R.id.roll2)
        val roll3=findViewById<Button>(R.id.roll3)
        val roll4=findViewById<Button>(R.id.roll4)
        val roll5=findViewById<Button>(R.id.roll5)
        val roll6=findViewById<Button>(R.id.roll6)
        val roll7=findViewById<Button>(R.id.roll7)
        val roll8=findViewById<Button>(R.id.roll8)
        val roll9=findViewById<Button>(R.id.roll9)
        val roll10=findViewById<Button>(R.id.roll10)
        val roll11=findViewById<Button>(R.id.roll11)
        val roll12=findViewById<Button>(R.id.roll12)
        val roll13=findViewById<Button>(R.id.roll13)
        val roll14=findViewById<Button>(R.id.roll14)
        val roll15=findViewById<Button>(R.id.roll15)
        val roll16=findViewById<Button>(R.id.roll16)
        val roll17=findViewById<Button>(R.id.roll17)
        val roll18=findViewById<Button>(R.id.roll18)
        val roll19=findViewById<Button>(R.id.roll19)
        val roll20=findViewById<Button>(R.id.roll20)
        val roll21=findViewById<Button>(R.id.roll21)
        val roll22=findViewById<Button>(R.id.roll22)
        val roll23=findViewById<Button>(R.id.roll23)
        val roll24=findViewById<Button>(R.id.roll24)
        val roll25=findViewById<Button>(R.id.roll25)
        val roll26=findViewById<Button>(R.id.roll26)
        val roll27=findViewById<Button>(R.id.roll27)
        val roll28=findViewById<Button>(R.id.roll28)
        val roll29=findViewById<Button>(R.id.roll29)
        val roll30=findViewById<Button>(R.id.roll30)
        val roll31=findViewById<Button>(R.id.roll31)
        val roll32=findViewById<Button>(R.id.roll32)
        val roll33=findViewById<Button>(R.id.roll33)
        val roll34=findViewById<Button>(R.id.roll34)
        val roll35=findViewById<Button>(R.id.roll35)
        val roll36=findViewById<Button>(R.id.roll36)
        val roll37=findViewById<Button>(R.id.roll37)

    roll1.setOnClickListener{
        if(booleanArray[1]==false)
        {
            booleanArray[1]=true
            roll1.setBackgroundColor(Color.GREEN)
            c++
        }
        else{
            booleanArray[1]=false
            roll1.setBackgroundColor(Color.GRAY)
            c--
        }
    }

        roll2.setOnClickListener{
            if(booleanArray[2]==false)
            {
                booleanArray[2]=true
                roll2.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[2]=false
                roll2.setBackgroundColor(Color.GRAY)
                c--
            }
        }

        roll3.setOnClickListener{
            if(booleanArray[3]==false)
            {
                booleanArray[3]=true
                roll3.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[3]=false
                roll3.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll4.setOnClickListener{
            if(booleanArray[4]==false)
            {
                booleanArray[4]=true
                roll4.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[4]=false
                roll4.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll5.setOnClickListener{
            if(booleanArray[5]==false)
            {
                booleanArray[5]=true
                roll5.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[5]=false
                roll5.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll6.setOnClickListener{
            if(booleanArray[6]==false)
            {
                booleanArray[6]=true
                roll6.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[6]=false
                roll6.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll7.setOnClickListener{
            if(booleanArray[7]==false)
            {
                booleanArray[7]=true
                roll7.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[7]=false
                roll7.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll8.setOnClickListener{
            if(booleanArray[8]==false)
            {
                booleanArray[8]=true
                roll8.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[8]=false
                roll8.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll9.setOnClickListener{
            if(booleanArray[9]==false)
            {
                booleanArray[9]=true
                roll9.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[9]=false
                roll9.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll10.setOnClickListener{
            if(booleanArray[10]==false)
            {
                booleanArray[10]=true
                roll10.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[10]=false
                roll10.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll11.setOnClickListener{
            if(booleanArray[11]==false)
            {
                booleanArray[11]=true
                roll11.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[11]=false
                roll11.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll12.setOnClickListener{
            if(booleanArray[12]==false)
            {
                booleanArray[12]=true
                roll12.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[12]=false
                roll12.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll13.setOnClickListener{
            if(booleanArray[13]==false)
            {
                booleanArray[13]=true
                roll13.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[13]=false
                roll13.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll14.setOnClickListener{
            if(booleanArray[14]==false)
            {
                booleanArray[14]=true
                roll14.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[14]=false
                roll14.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll15.setOnClickListener{
            if(booleanArray[15]==false)
            {
                booleanArray[15]=true
                roll15.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[15]=false
                roll15.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll16.setOnClickListener{
            if(booleanArray[16]==false)
            {
                booleanArray[16]=true
                roll16.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[16]=false
                roll16.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll17.setOnClickListener{
            if(booleanArray[17]==false)
            {
                booleanArray[17]=true
                roll17.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[17]=false
                roll17.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll18.setOnClickListener{
            if(booleanArray[18]==false)
            {
                booleanArray[18]=true
                roll18.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[18]=false
                roll18.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll19.setOnClickListener{
            if(booleanArray[19]==false)
            {
                booleanArray[19]=true
                roll19.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[19]=false
                roll19.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll20.setOnClickListener{
            if(booleanArray[20]==false)
            {
                booleanArray[20]=true
                roll20.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[20]=false
                roll20.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll21.setOnClickListener{
            if(booleanArray[21]==false)
            {
                booleanArray[21]=true
                roll21.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[21]=false
                roll21.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll22.setOnClickListener{
            if(booleanArray[22]==false)
            {
                booleanArray[22]=true
                roll22.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[22]=false
                roll22.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll23.setOnClickListener{
            if(booleanArray[23]==false)
            {
                booleanArray[23]=true
                roll23.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[23]=false
                roll23.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll24.setOnClickListener{
            if(booleanArray[24]==false)
            {
                booleanArray[24]=true
                roll24.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[24]=false
                roll24.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll25.setOnClickListener{
            if(booleanArray[25]==false)
            {
                booleanArray[25]=true
                roll25.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[25]=false
                roll25.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll26.setOnClickListener{
            if(booleanArray[26]==false)
            {
                booleanArray[26]=true
                roll26.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[26]=false
                roll26.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll27.setOnClickListener{
            if(booleanArray[27]==false)
            {
                booleanArray[27]=true
                roll27.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[27]=false
                roll27.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll28.setOnClickListener{
            if(booleanArray[28]==false)
            {
                booleanArray[28]=true
                roll28.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[28]=false
                roll28.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll29.setOnClickListener{
            if(booleanArray[29]==false)
            {
                booleanArray[29]=true
                roll29.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[29]=false
                roll29.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll30.setOnClickListener{
            if(booleanArray[30]==false)
            {
                booleanArray[30]=true
                roll30.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[30]=false
                roll30.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll31.setOnClickListener{
            if(booleanArray[31]==false)
            {
                booleanArray[31]=true
                roll31.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[31]=false
                roll31.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll32.setOnClickListener{
            if(booleanArray[32]==false)
            {
                booleanArray[32]=true
                roll32.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[32]=false
                roll32.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll33.setOnClickListener{
            if(booleanArray[33]==false)
            {
                booleanArray[33]=true
                roll33.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[33]=false
                roll33.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll34.setOnClickListener{
            if(booleanArray[34]==false)
            {
                booleanArray[34]=true
                roll34.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[34]=false
                roll34.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll35.setOnClickListener{
            if(booleanArray[35]==false)
            {
                booleanArray[35]=true
                roll35.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[35]=false
                roll35.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll36.setOnClickListener{
            if(booleanArray[36]==false)
            {
                booleanArray[36]=true
                roll36.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[36]=false
                roll36.setBackgroundColor(Color.GRAY)
                c--
            }
        }
        roll37.setOnClickListener{
            if(booleanArray[37]==false)
            {
                booleanArray[37]=true
                roll37.setBackgroundColor(Color.GREEN)
                c++
            }
            else{
                booleanArray[37]=false
                roll37.setBackgroundColor(Color.GRAY)
                c--
            }
        }


        val count = c
        calculate.setOnClickListener{
            Toast.makeText(this@afterlogin,"Total Students Present: "+c,Toast.LENGTH_SHORT).show()
            presentStudents.text = "Total Students Present : ${c}"
        }


    }
}