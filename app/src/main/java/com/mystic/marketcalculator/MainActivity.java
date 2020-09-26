package com.mystic.marketcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;
import java.util.Stack;
import java.lang.StringIndexOutOfBoundsException;


public class MainActivity extends AppCompatActivity {
    public  final String TAG = "Market";
    private TextView one, two, three, four, five, six,
            seven,eight,nine,zero,initialAnswer,
            open,close,percent,del,division,addition,
            subtraction,multiplication,dot,equal,clear, answer ;

    Stack<String> numberStack = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call the method to define all the views
        Log.e("Mainactivity","Whine");
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
                } else if(number.contains(".") ){
                    Toast.makeText(MainActivity.this, "contains dot",Toast.LENGTH_SHORT).show();
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
                numberStack.clear();
            }
        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numbers = initialAnswer.getText().toString();
                if(numbers.length() <= 1){
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
                    double number = Double.parseDouble(initialAnswer.getText().toString());
                    double new_num = number/100;
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
                try{
                    if(!numberStack.isEmpty()){ //Check if the stack is not empty
                        if(!number.contentEquals("")){ //Check if the value we are pushing to the stack is not an empty string
                            numberStack.push(number);//If it is not an empty string then the number is pushed to the stack otherwise nothing is added to the stack
                        }
                        if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText()) //This allows us to check if there is any operator as the last element in the stacj if it returns an operator as the last element then we change it to whatever the user enters
                                || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                            numberStack.set((numberStack.size() - 1),addition.getText().toString()); //This is where we make the changes
                            return ;
                        }

                        double res = evaluate(numberStack); //Then the normal operation is carried out
                        numberStack.push(Double.toString(res));
                        answer.setText(Double.toString(res));
                    }
                    else {
                        numberStack.push(number);
                    }

                    numberStack.push(addition.getText().toString());
                    initialAnswer.setText("");
/////////////////////////////////////////////////////////////////////////////////
                    /*if(numberStack.get(numberStack.size()-1).contentEquals("+")
                            || numberStack.get(numberStack.size()-1).contentEquals("-")
                            || numberStack.get(numberStack.size()-1).contentEquals("x")
                            || numberStack.get(numberStack.size()-1).contentEquals("/")) {
                        numberStack.set(numberStack.size() - 1, addition.getText().toString());
                        return;
                    }
                   if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                            || number.charAt(number.length()-1) == 'x'
                            || number.charAt(number.length()-1) == '/'
                            || number.charAt(number.length()-1) == '%'
                            || number.charAt(number.length()-1) == '.'
                            || number.charAt(number.length()-1) == '('){
                        return ;
                    }
                   else{
                        if(!numberStack.isEmpty()){
                            if(!number.contentEquals("")){
                                numberStack.push(number);
                            }
                            if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText())
                                    || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                                    || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                                    || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                                numberStack.set((numberStack.size() - 1),addition.getText().toString());
                                return ;
                            }

                            double res = evaluate(numberStack);
                            numberStack.push(Double.toString(res));
                            answer.setText(Double.toString(res));

                        }else{
                            numberStack.push(number);
                        }

                        numberStack.push(addition.getText().toString());
                        initialAnswer.setText("");
                    }*/

                }catch (StringIndexOutOfBoundsException ex){
                    Toast.makeText(MainActivity.this,"Error: "+ex,Toast.LENGTH_SHORT)
                            .show();
                    return;

                }

            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                try{
                    if(!numberStack.isEmpty()){
                        if(!number.contentEquals("")){
                            numberStack.push(number);
                        }
                        if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                            numberStack.set((numberStack.size() - 1),subtraction.getText().toString());
                            return ;
                        }

                        double res = evaluate(numberStack);
                        numberStack.push(Double.toString(res));
                        answer.setText(Double.toString(res));
                    }
                    else {
                        numberStack.push(number);
                    }

                    numberStack.push(subtraction.getText().toString());
                    initialAnswer.setText("");
//////////////////////////////////////////////////////////////////////////////////////////
                  /*  if(numberStack.get(numberStack.size()-1).contentEquals("+")
                            || numberStack.get(numberStack.size()-1).contentEquals("-")
                            || numberStack.get(numberStack.size()-1).contentEquals("x")
                            || numberStack.get(numberStack.size()-1).contentEquals("/")){
                        numberStack.set(numberStack.size()-1,subtraction.getText().toString());
                        return;

                    if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                            || number.charAt(number.length()-1) == 'x'
                            || number.charAt(number.length()-1) == '/'
                            || number.charAt(number.length()-1) == '%'
                            || number.charAt(number.length()-1) == '.'
                            || number.charAt(number.length()-1) == '('
                            || number.charAt(number.length()-1) == ')'){
                        return ;
                    } else{
                        if(!numberStack.isEmpty()){
                            numberStack.push(number);
                            Double res = evaluate(numberStack);
                            numberStack.push(res.toString());
                            answer.setText(res.toString());
                            numberStack.push(subtraction.getText().toString());
                            initialAnswer.setText("");
                        }else{
                            numberStack.push(number);
                            numberStack.push(subtraction.getText().toString());
                            initialAnswer.setText("");
                        }
                    }*/

                }catch(StringIndexOutOfBoundsException ex){
                    Toast.makeText(MainActivity.this,"Error: "+ex,Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

            }
        });


        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                try{

                    if(!numberStack.isEmpty()){
                        if(!number.contentEquals("")){
                            numberStack.push(number);
                        }
                        if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                            numberStack.set((numberStack.size() - 1),multiplication.getText().toString());
                            return ;
                        }

                        double res = evaluate(numberStack);
                        numberStack.push(Double.toString(res));
                        answer.setText(Double.toString(res));
                    }
                    else {
                        numberStack.push(number);
                    }

                    numberStack.push(multiplication.getText().toString());
                    initialAnswer.setText("");

                    ////////////////////////////////////////////////////////////////
                   /* if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                            || number.charAt(number.length()-1) == 'x'
                            || number.charAt(number.length()-1) == '/'
                            || number.charAt(number.length()-1) == '%'
                            || number.charAt(number.length()-1) == '.'
                            || number.charAt(number.length()-1) == '('
                            || number.charAt(number.length()-1) == ')'){
                        return ;
                    } else{

                        if(!numberStack.isEmpty()){
                            numberStack.push(number);
                            Double res = evaluate(numberStack);
                            numberStack.push(res.toString());
                            answer.setText(res.toString());
                            numberStack.push(multiplication.getText().toString());
                            initialAnswer.setText("");

                        }else{
                            numberStack.push(number);
                            numberStack.push(multiplication.getText().toString());
                            initialAnswer.setText("");
                        }

                    }*/
                   ///////////////////////////////////////////////////////////////
                }catch(StringIndexOutOfBoundsException ex){
                    Toast.makeText(MainActivity.this,"Error: "+ex,Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                try{


                    if(!numberStack.isEmpty()){
                        if(!number.contentEquals("")){
                            numberStack.push(number);
                        }
                        if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                                || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                            numberStack.set((numberStack.size() - 1),division.getText().toString());
                            return ;
                        }

                        double res = evaluate(numberStack);
                        numberStack.push(Double.toString(res));
                        answer.setText(Double.toString(res));
                    }
                    else {
                        numberStack.push(number);
                    }

                    numberStack.push(division.getText().toString());
                    initialAnswer.setText("");


                    ////////////////////////////////////////////////////////

                   /* if(number.charAt(number.length()-1) == '+' || number.charAt(number.length()-1) == '-'
                            || number.charAt(number.length()-1) == 'x'
                            || number.charAt(number.length()-1) == '/'
                            || number.charAt(number.length()-1) == '%'
                            || number.charAt(number.length()-1) == '.'
                            || number.charAt(number.length()-1) == '('
                            || number.charAt(number.length()-1) == ')'){
                        return ;
                    } else{

                        if(!numberStack.isEmpty()){
                            numberStack.push(number);
                            Double res = evaluate(numberStack);
                            numberStack.push(res.toString());
                            answer.setText(res.toString());
                            numberStack.push(division.getText().toString());
                            initialAnswer.setText("");
                        }else{
                            numberStack.push(number);
                            numberStack.push(division.getText().toString());
                            initialAnswer.setText("");
                        }

                    }*/
                   ////////////////////////////////////////////////////////////////
                }
                catch (StringIndexOutOfBoundsException ex){
                    Toast.makeText(MainActivity.this,"Error: "+ex,Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = initialAnswer.getText().toString();
                try{
                   if(!number.contentEquals("")){
                       numberStack.push(number);
                    }

                    if(numberStack.get(numberStack.size()-1).contentEquals(addition.getText())
                            || numberStack.get(numberStack.size()-1).contentEquals(subtraction.getText())
                            || numberStack.get(numberStack.size()-1).contentEquals(multiplication.getText())
                            || numberStack.get(numberStack.size()-1).contentEquals(division.getText())){
                        Toast.makeText(MainActivity.this,"Not  allowed",Toast.LENGTH_SHORT).show();
                        return ;

                    }


                    double res = evaluate(numberStack);
                    answer.setText(Double.toString(res));
                    initialAnswer.setText(Double.toString(res));

                }catch(NullPointerException nu){
                    Toast.makeText(MainActivity.this,"Error: "+nu,Toast.LENGTH_SHORT)
                            .show();
                    return;
                }

            }
        });

    }

    private Double evaluate(Stack<String> numberStack) {
    try{
    Double secondNum = Double.parseDouble(numberStack.pop());
    String operand = numberStack.pop();
    Double firstNum = Double.parseDouble(numberStack.pop());

    if(operand.contentEquals(addition.getText())){
        return add(firstNum,secondNum);

    }else if(operand.contentEquals(subtraction.getText())){
        return subtract(firstNum,secondNum);
    }else if(operand.contentEquals(division.getText())){
        return divide(firstNum,secondNum);
    }else if(operand.contentEquals(multiplication.getText())){
        return multiply(firstNum,secondNum);
    }

    }catch(EmptyStackException em){
    Toast.makeText(MainActivity.this,"Error: "+em, Toast.LENGTH_SHORT)
            .show();
    return null;
   }

        return null;
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