package com.example.kostya_igra;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;

import java.util.Arrays;


class Section{
    String question;
    String[] answers = new String[4];
    Number correct;
}



public class MainActivity extends AppCompatActivity {

    Section[] sections = new Section[10];

    Section section1 = new Section();
    Section section2 = new Section();
    Section section3 = new Section();
    Section section4 = new Section();
    Section section5 = new Section();
    Section section6 = new Section();
    Section section7 = new Section();
    Section section8 = new Section();
    Section section9 = new Section();
    Section section10 = new Section();






    public void arrayFilling(){
        section1.question = "Какой газ является основным компонентом атмосферы Земли?";
        section1.answers[0] = "Кислород";
        section1.answers[1] = "Углекислый газ";
        section1.answers[2] = "Азот";
        section1.answers[3] = "Водород";
        section1.correct = 2;
        sections[0] = section1;

        section2.question = "Кто из перечисленных является изобретателем телефона?";
        section2.answers[0] = "Александр Флеминг";
        section2.answers[1] = "Томас Эдисон";
        section2.answers[2] = "Александр Грэм Белл";
        section2.answers[3] = "Никола Тесла";
        section2.correct = 2;
        sections[1] = section2;

        section3.question = "Какое из перечисленных животных является национальным символом Австралии?";
        section3.answers[0] = "Кенгуру";
        section3.answers[1] = "Коала";
        section3.answers[2] = "Вомбат";
        section3.answers[3] = "Эму";
        section3.correct = 0;
        sections[2] = section3;

        section4.question = "Какой элемент является самым распространенным в земной коре?";
        section4.answers[0] = "Кислород";
        section4.answers[1] = "Углерод";
        section4.answers[2] = "Кремний";
        section4.answers[3] = "Алюминий";
        section4.correct = 0;
        sections[3] = section4;

        section5.question = "Какая из перечисленных планет является ближайшей к Солнцу?";
        section5.answers[0] = "Венера";
        section5.answers[1] = "Марс";
        section5.answers[2] = "Меркурий";
        section5.answers[3] = "Юпитер";
        section5.correct = 2;
        sections[4] = section5;

        section6.question = "Какой фермент в желудке отвечает за расщепление белков?";
        section6.answers[0] = "Амилаза";
        section6.answers[1] = "Липаза";
        section6.answers[2] = "Протеаза";
        section6.answers[3] = "Пепсин";
        section6.correct = 3;
        sections[5] = section6;

        section7.question = "Какой из перечисленных городов является столицей Франции?";
        section7.answers[0] = "Берлин";
        section7.answers[1] = "Лондон";
        section7.answers[2] = "Париж";
        section7.answers[3] = "Рим";
        section7.correct = 2;
        sections[6] = section7;

        section8.question = "Какой химический элемент является основным компонентом алмазов?";
        section8.answers[0] = "Углерод";
        section8.answers[1] = "Алмаз";
        section8.answers[2] = "Аллюминий";
        section8.answers[3] = "Железо";
        section8.correct = 0;
        sections[7] = section8;

        section9.question = "Какое из перечисленных является самым большим озером в мире по площади?";
        section9.answers[0] = "Озеро Байкал";
        section9.answers[1] = "Каспийское море";
        section9.answers[2] = "Озеро Виктория";
        section9.answers[3] = "Великое озеро";
        section9.correct = 1;
        sections[8] = section9;

        section10.question = "Какое из перечисленных изобретений приписывается Галилею Галилею?";
        section10.answers[0] = "Телескоп";
        section10.answers[1] = "Фонарь";
        section10.answers[2] = "Воздушный шар";
        section10.answers[3] = "Пороход";
        section10.correct = 0;
        sections[9] = section10;



    }
    int roundNumber = 1;
    int scoreNumber = 0;


    @SuppressLint("SetTextI18n")
    public void handleClickToAnswer(View view){
        if(scoreNumber == 0){
            scoreNumber=500;
        }else{
            scoreNumber=scoreNumber*3+500;
        }
        if(roundNumber==10){
            question.setText("You WINNER!"+ " "+ " " + " " + " " + " "+ " " + " " + " "+ " "+ " " + " " + " "+ " "+ " " + " " + " "+ "Your score: " + scoreNumber);
            return;
        }
        question.setText(sections[roundNumber].question);
        a.setText(sections[roundNumber].answers[0]);
        b.setText(sections[roundNumber].answers[1]);
        c.setText(sections[roundNumber].answers[2]);
        d.setText(sections[roundNumber].answers[3]);
        score.setText("Score: " + scoreNumber);
        round.setText("Round: " + (roundNumber + 1));

        roundNumber++;

    }



    TextView round;
    TextView score;
    TextView question;

    Button a;
    Button b;
    Button c;
    Button d;

    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        round = findViewById(R.id.round);
        score = findViewById(R.id.score);
        question = findViewById(R.id.question);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);



        arrayFilling();

        round.setText("Round: " + 1);
        score.setText("Score: " + 0);
        question.setText(sections[0].question);
        a.setText(sections[0].answers[0]);
        b.setText(sections[0].answers[1]);
        c.setText(sections[0].answers[2]);
        d.setText(sections[0].answers[3]);


    }
}