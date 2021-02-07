package ibodov.smile.todonote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Note_Note_add extends AppCompatActivity {

    ImageView back_to_notes;
    ImageView save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note__note_add);

        //кнопка назад
        back_to_notes = findViewById(R.id.back_notes);



        save = findViewById(R.id.save_icon);

        back_to_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}