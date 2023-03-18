package com.example.homeworkeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText HW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HW = findViewById(R.id.homeWork);
    }

    public void onMyButtonClick (View v) {
        if (HW.getText().toString() != null && v.getId() != R.id.paragraph)
            HW.setText(HW.getText() + "\n");

        switch (v.getId()) {
            case R.id.algebra:
                HW.setText(HW.getText() + "Алгебра: ");
                break;
            case R.id.geometry:
                HW.setText(HW.getText() + "Геометрия: ");
                break;
            case R.id.russian:
                HW.setText(HW.getText() + "Русский: ");
                break;
            case R.id.chemistry:
                HW.setText(HW.getText() + "Химия: ");
                break;
            case R.id.informatics:
                HW.setText(HW.getText() + "Информатика: ");
                break;
            case R.id.geography:
                HW.setText(HW.getText() + "География: ");
                break;
            case R.id.history:
                HW.setText(HW.getText() + "История: ");
                break;
            case R.id.historySK:
                HW.setText(HW.getText() + "История СК: ");
                break;
            case R.id.english:
                HW.setText(HW.getText() + "Английский: ");
                break;
            case R.id.biology:
                HW.setText(HW.getText() + "Биология: ");
                break;
            case R.id.physics:
                HW.setText(HW.getText() + "Физика: ");
                break;
            case R.id.literature:
                HW.setText(HW.getText() + "Литература: ");
                break;
            case R.id.society:
                HW.setText(HW.getText() + "Общество: ");
                break;
            case R.id.paragraph:
                HW.setText(HW.getText() + "§ ");
                break;
        }
        HW.setSelection(HW.length());
    }
}