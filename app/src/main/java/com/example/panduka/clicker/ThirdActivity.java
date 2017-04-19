package com.example.panduka.clicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView textView;
    private static String plant;
    public Button Btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        plant = intent.getStringExtra("PLANT_DETAILS");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.plantDetails);
        //textView.setText(plant);
        if (plant.equals("Sugarcane")){

            textView.setText("Sugarcane"+"\n"+"\n" +"Sugarcane, or sugar cane, are several species of tall perennial true grasses of the genus Saccharum, tribe Andropogoneae, native to the warm temperate to tropical regions of South Asia and Melanesia, and used for sugar production. It has stout, jointed, fibrous stalks that are rich in the sugar sucrose, which accumulates in the stalk internodes. The plant is 2 to 6 m (6 ft 7 in to 19 ft 8 in) tall. All sugar cane species interbreed and the major commercial cultivars are complex hybrids. Sugarcane belongs to the grass family Poaceae, an economically important seed plant family that includes maize, wheat, rice, and sorghum, and many forage crops.");

        }else if (plant.equals("Barley")){

            textView.setText("Barley"+"\n"+"\n" +"Barley (Hordeum vulgare L.), a member of the grass family, is a major cereal grain grown in temperate climates globally. It was one of the first cultivated grains, particularly in Eurasia as early as 13,000 years ago. Barley has been used as animal fodder, as a source of fermentable material for beer and certain distilled beverages, and as a component of various health foods. It is used in soups and stews, and in barley bread of various cultures. Barley grains are commonly made into malt in a traditional and ancient method of preparation.\n" +
                    "\n" +
                    "In 2014, barley was ranked fourth among grains in quantity produced (144 million tonnes) behind corn, rice and wheat.[3][4]");
        }


    Btn3= (Button)findViewById(R.id.conform);

    Btn3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(getApplicationContext(),
                   Fourth.class);
            startActivity(intent);
        }
    });

}
}



