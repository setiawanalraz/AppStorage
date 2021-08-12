package vsga.mobile.appstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button internal, external;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        internal = (Button) findViewById(R.id.buttonInternal);
        external = (Button) findViewById(R.id.buttonExternal);

        internal.setOnClickListener(this);
        external.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        pilihMediaPenyimpanan(v.getId());
    }

    private void pilihMediaPenyimpanan(int id) {
        switch (id) {
            case R.id.buttonInternal:
                startActivity(new Intent(this, InternalActivity.class));
                break;
            case R.id.buttonExternal:
                startActivity(new Intent(this, ExternalActivity.class));
                break;
        }
    }
}