package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

public class InformationActivity extends AppCompatActivity {


private  FloatingActionButton favoriteButton;
boolean favoriteNeighbour = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Neighbour neighbour = (Neighbour) getIntent().getSerializableExtra("neighbour");

        ImageView backGroundId = findViewById(R.id.backgroundId);
        CardView cardInfo = findViewById(R.id.info);
        TextView cardTextName = findViewById(R.id.name);
        TextView logoPosition = findViewById(R.id.logo_position);
        TextView logoPhone = findViewById(R.id.logo_phone);
        TextView logoWorld = findViewById(R.id.logo_world);
        CardView cardAbout = findViewById(R.id.cardAboutMe);
        TextView textAboutTitle = findViewById(R.id.textAboutTitle);
        TextView textAboutDescription = findViewById(R.id.textAboutDescription);
        FloatingActionButton favoriteButton = findViewById(R.id.favoriteButton);

        cardTextName.setText(neighbour.getName());
        logoPosition.setText(neighbour.getAddress());
        logoPhone.setText(neighbour.getPhoneNumber());
        logoWorld.setText(neighbour.toString());
        textAboutDescription.setText(neighbour.getAboutMe());

        Glide.with(this)
                .load(neighbour.getAvatarUrl())
                .into(backGroundId);

        this.favoriteButton = (FloatingActionButton) findViewById(R.id.favoriteButton);

        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent favoriteActivity = new Intent(getApplicationContext(), NeighbourFavoriteFragment.class);
                startActivity(favoriteActivity);
                FloatingActionButton = favoriteButton;
                DeselectButtons();
                FloatingActionButton.setSelected(true);
            }

            private void DeselectButtons() {
            }

        });

        FloatingActionButton enableOkButton = (FloatingActionButton) findViewById(R.id.favoriteButton);
        enableOkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enableOkButton.setEnabled(true);

            }
        });

        if (favoriteNeighbour == false) {

            EnabledButton = FloatingActionButton.getId(R.id.favoriteButton);
            DeselectButtons();
            FloatingActionButton.setUnSelected(false);
        } else {
            FloatingActionButton.setSelected(true);
        }

        public boolean onOptionsItemSelected (FloatingActionButton) {

                switch (FloatingActionButton.getItemId(R.drawable.ic_star_white_24dp)) {
                    case 1:

                        break;
                    case 2:
                        (FloatingActionButton.getItemId(R.drawable.ic_star_border)) {
                        break;

                        return true;
                    }

                }
        };
    }}


