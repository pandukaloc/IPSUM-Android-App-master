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

    public class FourthActivity extends AppCompatActivity {

        private TextView textView;
     //   private static String plant;
        public Button Btn3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_third);

           // Intent intent = getIntent();
          //  plant = intent.getStringExtra("PLANT_DETAILS");

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            textView = (TextView) findViewById(R.id.plantDetails);
            //textView.setText(plant);
            if (plant.equals("Banana")){

                textView.setText("How to Grow Your Banana Plant"+"\n"+"\n" +"1.Allow sufficient space"+"\n"+"\n" +"While banana plants are technically herbs, they are often mistaken for trees for a reason. Some varieties and individuals can reach 7.6 m (25ft.) in height, although you should check the source of your banana plant 
                    or local banana growers for a more accurate estimate for your locale and variety."+"\n"+"\n" +"Each banana plant requires a hole at least 30cm(1ft.) wide and 30cm (1ft.) deep.
                     Larger holes should be used in areas of high wind (but will require more soil)."+"\n"+"\n" +"Keep banana plants at least 4.5m(15ft) from trees and shrubs (not other banana plants) with large
                      root systems that may compete with the bananas' water."+"\n"+"\n" +"Multiple banana plants help each other maintain beneficial humidity and temperature levels, as long as they are planted at the correct distance. If you can, plant several plants in a clump with 2–3m(6.5–10ft.)
                       between each one, or a large number of banana plants 3–5m(10–16ft.) from each other."+"\n"+"\n" +"Dwarf varieties require less space."+"\n"+"\n" +
                       "2.Consider growing it indoors."+"\n"+"\n" +"If your outdoors environment is inadequate, you'll need an indoor location with similar requirements 
                       (12 hours bright light and constant warm temperature and humidity)."+"\n"+"\n" +"3.Select your planting material."+"\n"+"\n" +"You can acquire a banana sucker (small shoot from the base of a banana plant) from another grower or plant nursery, or buy one online. A banana rhizome or corm is the base from which suckers grow. Tissue cultures are produced in laboratories to create higher fruit yield. 
                   If you're transplanting a mature plant, prepare a hole appropriate to its size and have an assistant help you."
                   +"\n"+"\n" +"4.Trim the plant"+"\n"+"\n" +"Cut off any dead, insect-eaten, rotting or discolored sections of the plant. If most of the plant is affected, dispose of it away from other plants and find another planting material."+"\n"+"\n" +"If using a sucker, remove all but a few centimeters (1–2 inches) of the roots. This will limit the chance of disease. You can also remove any leaves in excess of five and/or cut the top of the plant off with a slanting 
                   cut to increase the amount of sunlight that warms the soil for root growth and rot prevention."+"\n"+"\n" +"5.Dig a hole for each plant."+"\n"+"\n" +"Remove any plants or weeds that are growing on the planting site, then dig a circular hole 30cm wide and 30 cm deep (1ft. x 1 ft.) A larger hole will provide greater support for the plant but require more soil."
                   +"\n"+"\n" +"If planting indoors, instead use a planting pot this size or larger."+"\n"+"\n" +"6.Place the plant upright in the new soil."+"\n"+"\n" +"The leaves should be pointing upward and the soil should cover the roots and 1.5–2.5cm (0.5–1 inches) of the base. Tamp the soil down to keep it in place but don't pack too firmly."
                   +"\n"+"\n" +"Special Tips"+"\n"+"\n" +"If the newly planted banana is accidentally damaged (e.g. hit by ball) or if the plant is growing weak, but the plant is still alive, simply cut the plant in half. The banana plant will regrow." 
                   +"\n"+"\n" +"Immediately after removing a sucker from a live banana plant, care for the mother plant by supporting the weakened side with soil to prevent leaning and applying fertilizer to replace lost nutrients."
                   +"\n"+"\n" +"When it comes to desuckering dwarf bananas, do not be confused. The very first or the second leaf of the emerging sucker should be narrow, not wide."+"\n"+"\n" +"Take care while transplanting/desuckering the mother plant. If this is done incorrectly, the mother or the sucker will die." );

            }

            /*else if (plant.equals("ineapple")){

    }

            else if (plant.equals("ce")){ //rice


            }
    */

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

