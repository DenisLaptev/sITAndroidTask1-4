package ua.a5.sourceit4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNumber1;
    EditText etNumber2;

    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;

    TextView tvResult;


    double number1;
    double number2;
    double result;
    String stringResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = (EditText) findViewById(R.id.et_number1);
        etNumber2 = (EditText) findViewById(R.id.et_number2);

        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnPlus.setOnClickListener(this);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMinus.setOnClickListener(this);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnMultiply.setOnClickListener(this);
        btnDivide = (Button) findViewById(R.id.btn_divide);
        btnDivide.setOnClickListener(this);

        tvResult = (TextView) findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_plus:

                number1 = Double.parseDouble(etNumber1.getText().toString());
                number2 = Double.parseDouble(etNumber2.getText().toString());

                result = number1 + number2;

                //stringResult = String.valueOf(result);

                stringResult = String.valueOf(number1) + " + " + String.valueOf(number2) + " = " + String.valueOf(result);

                tvResult.setText(stringResult);
                break;

            case R.id.btn_minus:

                number1 = Double.parseDouble(etNumber1.getText().toString());
                number2 = Double.parseDouble(etNumber2.getText().toString());

                result = number1 - number2;

                //stringResult = String.valueOf(result);

                stringResult = String.valueOf(number1) + " - " + String.valueOf(number2) + " = " + String.valueOf(result);

                tvResult.setText(stringResult);
                break;

            case R.id.btn_multiply:

                number1 = Double.parseDouble(etNumber1.getText().toString());
                number2 = Double.parseDouble(etNumber2.getText().toString());

                result = number1 * number2;

                //stringResult = String.valueOf(result);

                stringResult = String.valueOf(number1) + " * " + String.valueOf(number2) + " = " + String.valueOf(result);

                tvResult.setText(stringResult);
                break;

            case R.id.btn_divide:

                number1 = Double.parseDouble(etNumber1.getText().toString());
                number2 = Double.parseDouble(etNumber2.getText().toString());

                if (number2 == 0) {
                    stringResult = "Division by zero!";
                } else {
                    result = number1 / number2;
                    //stringResult = String.valueOf(result);
                    stringResult = String.valueOf(number1) + " / " + String.valueOf(number2) + " = " + String.valueOf(result);
                }
                tvResult.setText(stringResult);
                break;
        }
    }
}
