package com.mystic.marketcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    public  final String TAG = "Market";
    private TextView one, two, three, four, five, six,
            seven,eight,nine,zero,initialAnswer,
            open,close,percent,del,division,addition,
            subtraction,multiplication,dot,equal,clear, answer ;

    //Stack<Double> numberStack = new Stack<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call the method to define all the views
        define();
        //A call to the  method to recat to every click
        textChange();
    }

//This is where i declared all my views
    public void define(){
        initialAnswer = findViewById(R.id.initial);
        answer = findViewById(R.id.answer);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.figZero);
        open = findViewById(R.id.openbracket);
        close = findViewById(R.id.closebracket);
        percent = findViewById(R.id.percent);
        del = findViewById(R.id.delete);
        division = findViewById(R.id.division);
        addition = findViewById(R.id.addition);
        equal = findViewById(R.id.equal);
        multiplication = findViewById(R.id.multiplication);
        subtraction = findViewById(R.id.subtraction);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
    }


    //this method contains the listener which allows us to easily change the views will are rendering on the calculator screen
    public void textChange(){

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = zero.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = one.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = two.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){//This line is to check if the value on the screen is 0 so we can just remove the zero  and enter the new number
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));//But if the value is not zero just append the value we are entering at the end of the value already on the screen
                }


            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = three.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = four.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = five.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = six.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = seven.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = eight.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = nine.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }


            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                if(number.length() == 1  && number.equals("0")){
                    initialAnswer.setText((number+dot.getText().toString()));
                } else if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/' || number.charAt(number.length()-1) == '%' || number.charAt(number.length()-1) == '.' ){
                    return ;
                } else{
                    String addSymbol = dot.getText().toString();
                    initialAnswer.setText((number+addSymbol));
                }
            }
        });


        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = open.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(msg);
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+msg));
                }
            }
        });


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = close.getText().toString();
                if(initialAnswer.getText().toString().equals("0")){
                    initialAnswer.setText(number);
                } else if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/' || number.charAt(number.length()-1) == '%' || number.charAt(number.length()-1) == '.' ||  number.charAt(number.length()-1) == '('){
                    return ;
                } else{
                    initialAnswer.setText((initialAnswer.getText().toString()+number));
                }
            }
        });



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "0";
                String ans = "";
                initialAnswer.setText(number);
                answer.setText(ans);
            }
        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numbers = initialAnswer.getText().toString();
                if(numbers.length() == 1){
                    String number = "0";
                    initialAnswer.setText(number);
                } else {
                    String latest_numb = numbers.substring(0, (numbers.length() - 1));
                    initialAnswer.setText(latest_numb);
                }
            }
        });


        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Double number = Double.parseDouble(initialAnswer.getText().toString());
                    Double new_num = number/100;
                    answer.setText(Double.toString(new_num));
                }catch(NumberFormatException e){
                    Toast.makeText(MainActivity.this,"Error: "+e,Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/'
                        || number.charAt(number.length()-1) == '%'
                        || number.charAt(number.length()-1) == '.'
                        || number.charAt(number.length()-1) == '('){
                    return ;
                } else{
                    String addSymbol = addition.getText().toString();
                    initialAnswer.setText((number+addSymbol));
                }
            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/'
                        || number.charAt(number.length()-1) == '%'
                        || number.charAt(number.length()-1) == '.'
                        || number.charAt(number.length()-1) == '('
                        || number.charAt(number.length()-1) == ')'){
                    return ;
                } else{
                    String addSymbol = subtraction.getText().toString();
                    initialAnswer.setText((number+addSymbol));
                }
            }
        });


        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/'
                        || number.charAt(number.length()-1) == '%'
                        || number.charAt(number.length()-1) == '.'
                        || number.charAt(number.length()-1) == '('
                        || number.charAt(number.length()-1) == ')'){
                    return ;
                } else{
                    String addSymbol = multiplication.getText().toString();
                    initialAnswer.setText((number+addSymbol));
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                        || number.charAt(number.length()-1) == 'x'
                        || number.charAt(number.length()-1) == '/'
                        || number.charAt(number.length()-1) == '%'
                        || number.charAt(number.length()-1) == '.'
                        || number.charAt(number.length()-1) == '('
                        || number.charAt(number.length()-1) == ')'){
                    return;
                } else{
                    String addSymbol = division.getText().toString();
                    initialAnswer.setText((number+addSymbol));
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number = initialAnswer.getText().toString();
                if(number.contains("+")){//This loops through the entry and look for the operator if it finds addition it carrries out the code line of code below

                    //We also decided to use try and catch in other to prevent our application from breaking due to numberexception error
                    try{
                        String[] numb = number.split("\\+");//This allows us  to split the values entered into two different arrays
                        Double num1 = Double.parseDouble(numb[0]);//We took the first part of the array
                        Double num2 = Double.parseDouble(numb[1]);//We took the second part of the array
                        Double res = add(num1, num2); //Depending the operation we called the corresponding method on it
                        answer.setText(res.toString());//And then decided to update the value of our answer to reflect on the screen
                    }catch(NumberFormatException e){
                        Toast.makeText(MainActivity.this,"Error: "+e,Toast.LENGTH_SHORT).show();
                        return;
                    }

                }else if(number.contains("-")){
                    try{
                        String[] numb = number.split("-");
                        Double num1 = Double.parseDouble(numb[0]);
                        Double num2 = Double.parseDouble(numb[1]);
                        Double res = subtract(num1,num2);
                        answer.setText(res.toString());
                    }catch (NumberFormatException e){
                        Toast.makeText(MainActivity.this,"Error: "+e,Toast.LENGTH_SHORT).show();
                        return;
                    }


                }else if(number.contains("x")){
                    try{
                        String[] numb = number.split("x");
                        double num1 = Double.parseDouble(numb[0]);
                        double num2 = Double.parseDouble(numb[1]);
                        Double res = multiply(num1,num2);
                        answer.setText(res.toString());
                    }catch(NumberFormatException e){
                        Toast.makeText(MainActivity.this,"The error is"+e,Toast.LENGTH_SHORT).show();
                        return;
                    }



                }else if(number.contains("÷")){
                    try{
                        String[] numb = number.split("÷");
                        Double num1 = Double.parseDouble(numb[0]);
                        Double num2 = Double.parseDouble(numb[1]);
                        Double res = divide(num1,num2);
                        answer.setText(res.toString());
                    }catch(NumberFormatException e){
                        Toast.makeText(MainActivity.this,"Error: "+e,Toast.LENGTH_SHORT).show();
                        return;
                    }

                } else{

                    return;
                }


            }
        });





    }


    // Here we define the methods to perform the basic operations

    public Double add(Double first, Double second){
        return first + second;
    }

    public Double subtract(Double first, Double second){
        return first - second;
    }

    public Double multiply(Double first, Double second){
        return first * second;
    }

    public Double divide(Double first, Double second){
        return first / second;
    }


}