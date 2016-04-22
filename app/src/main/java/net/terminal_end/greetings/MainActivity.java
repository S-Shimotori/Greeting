package net.terminal_end.greetings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView outputView;
    private EditText inputName;
    private Button okButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputView = (TextView)findViewById(R.id.output_view);
        inputName = (EditText)findViewById(R.id.input_name);
        okButton = (Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok_button:
                String name = inputName.getText().toString();
                if (name != null && name.length() > 0)
                    outputView.setText("Hello, " + name + "\nNice to see you!");
                break;
        }
    }
}
