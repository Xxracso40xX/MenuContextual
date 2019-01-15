package com.example.pc.menucontextual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView lblMensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblMensaje = findViewById(R.id.lblMensaje);
        // Asociamos el menú contextual al control
        registerForContextMenu(lblMensaje);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_contextual, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcionCtx1:  // Acción a realizar por contextual 1
            case R.id.opcionCtx2:  // Acción a realizar por contextual 2
            case R.id.opcionCtx3:  // Acción a realizar por contextual 3
        }
        return true;
    }
}
