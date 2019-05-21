package br.com.franciscochaves.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup mRadioGroup;
    private RadioButton mRadioButtonSelected;
    private Button mButtonSelected;
    private TextView mTextViewShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRadioGroup = findViewById(R.id.RadioGroup_comidas);
        mButtonSelected = findViewById(R.id.button_escolher);
        mTextViewShow = findViewById(R.id.text_exibicao);

        mButtonSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioButtonEscolhido = mRadioGroup.getCheckedRadioButtonId();
                if(idRadioButtonEscolhido > 0){
                    mRadioButtonSelected = findViewById(idRadioButtonEscolhido);
                    mTextViewShow.setText(mRadioButtonSelected.getText());
                }
            }
        });
    }
}
