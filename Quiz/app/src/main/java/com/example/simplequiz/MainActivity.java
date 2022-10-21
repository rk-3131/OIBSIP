package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView headText;
    TextView questionText;
    Button optionA;
    Button optionB;
    Button optionC;
    Button optionD;

    String Question [] = {
            "Who among the following considered as the 'father of artificial intelligence?",
            "Select the example of application software of computer:",
            "Which of the following is also called translator?",
            "How the quality of printer is measured?",
            "Make in India campaign started in: ",
            "What is smallest unit of the information?",
            "Which of the following is the smallest visual element on a video monitor?",
            "Which of the following natural element is the primary element in computer chips?",
            "BIOS is used?",
            "Which of the following is equal to a gigabyte?"
    };

    String ArrayA [] = {
            "Charles Babbage",
            "Ms Word",
            "Data representation",
            "Alphabet per strike",
            "September 2014",
            "A bit",
            "Character",
            "Silicon",
            "By compiler",
            "1024 bytes"
    };
    String ArrayB [] = {
            "Lee De Forest",
            "Ms Excel",
            "MS-DOS",
            "Words per Inch",
            "August 2015",
            "A byte",
            "Pixel",
            "Carbon",
            "By operating system",
            "512 GB"
    };
    String ArrayC[] = {
            "John McCarthy",
            "Both A and B",
            "Operating System",
            "Strike per Inch",
            "December 2014",
            "A block",
            "Byte",
            "Iron",
            "By interpreter",
            "1024 megabytes"
    };
    String ArrayD [] = {
            "JP Eckert",
            "MS-DOS",
            "Language Processor",
            "Dots per Inch",
            "May 2015",
            "A nibble",
            "Bit",
            "Uranium",
            "By application software",
            "1024 bits"
    };

    String Answers [] = {
            "John McCarthy",
            "Both A and B",
            "Language Processor",
            "Dots per Inch",
            "September 2014",
            "A bit",
            "Pixel",
            "Silicon",
            "By operating system",
            "1024 megabytes"
    };

    int index = 0;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        headText = findViewById(R.id.header);
        questionText = findViewById(R.id.question);
        questionText.setText(Question[index]);
        optionA = findViewById(R.id.option1);
        optionB = findViewById(R.id.option2);
        optionC = findViewById(R.id.option3);
        optionD = findViewById(R.id.option4);

        optionA.setText(ArrayA[index]);
        optionB.setText(ArrayB[index]);
        optionC.setText(ArrayC[index]);
        optionD.setText(ArrayD[index]);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionA.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length) {
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You have scored "+score+" points in total", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionB.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You have scored "+score+" in total", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionC.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You have scored "+score+" in total", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index < Question.length){
                    if (optionD.getText().toString().equals(Answers[index])){
                        score++;
                    }
                    index++;
                    if (index < Question.length){
                        questionText.setText(Question[index]);
                        optionA.setText(ArrayA[index]);
                        optionB.setText(ArrayB[index]);
                        optionC.setText(ArrayC[index]);
                        optionD.setText(ArrayD[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "You have scored "+score+" points in total", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}