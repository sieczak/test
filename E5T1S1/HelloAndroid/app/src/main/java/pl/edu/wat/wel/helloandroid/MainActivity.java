package pl.edu.wat.wel.helloandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText messageEditText;
    TextView textTextView;
    Button toastButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_active);
        messageEditText = findViewById(R.id.messageEditText);

        setContentView(R.layout.activity_main_active);
        textTextView=findViewByID(R.id.messageTextView);

        setContentView(R.layout.activity_main_active);
        Button toastButton = findViewByID(R.id.toastButton);
        toastButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

            }
    });
    }
}
