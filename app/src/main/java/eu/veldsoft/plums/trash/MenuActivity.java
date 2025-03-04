package eu.veldsoft.plums.trash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Initial menu screen.
 */
public class MenuActivity extends AppCompatActivity {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
         * Call the super class's onCreate method to perform necessary initialization.
         */
        super.onCreate(savedInstanceState);

        /*
         * Set the content view of this activity to the layout defined in 'activity_menu.xml'.
         */
        setContentView(R.layout.activity_menu);

        /*
         * Open new game screen.
         */
        findViewById(R.id.single_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MenuActivity.this, GameActivity.class));
                    }
                }
        );

        /*
         * Application exit.
         */
        findViewById(R.id.exit_game).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MenuActivity.this.finish();
                    }
                }
        );
    }
}
