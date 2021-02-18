package ibodov.smile.todonote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView todoNotePlus;
    ImageView exit_icon;
    ImageView note_icon;
    ImageView todoList_icon;
    ImageView buyList_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoNotePlus = findViewById(R.id.todoNotePlus);
        exit_icon = findViewById(R.id.exit_icon);
        note_icon = findViewById(R.id.note_icon);
        todoList_icon = findViewById(R.id.todoList_icon);
        buyList_icon = findViewById(R.id.buyList_icon);

        note_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //нажатия на рисунок
                //getApplicationContext() - возврашает контекст
                Intent intent = new Intent(getApplicationContext(), Note.class);
                //запуск активити.
                startActivity(intent);
            }
        });
        exit_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}