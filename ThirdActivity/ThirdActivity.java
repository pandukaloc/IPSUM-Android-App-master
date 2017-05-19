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
        if (plant.equals("Banana")){

            textView.setText("Banana"+"\n"+"\n" +"Today, bananas are grown in at least 107 countries and are ranked fourth among the world's food crops in monetary value."+"\n"+"\n" +"The banana plant is not a tree."+"\n"+"\n" +"It is a giant herbaceous plant with an apparent trunk that bends without breaking"+"\n"+"\n" +"The banana has an underground stem with adventitious roots.It is full of food for the plant."+"\n"+"\n" +"Alongside the main stem, it has other stems called suckers.These stems grow into banana plants."+"\n"+"\n" +"The banana plant produces its fruit and dies. Another sucker replaces it."+"\n"+"\n" +"The banana plant has large leaves closely rolled up one over the other.Together they look like a trunk, but they form only an apparent trunk."+"\n"+"\n" +"Inside it there is a bud which produces leaves.After 7 or 8 months,when some 30 leaves have grown,the bud produces flowers."+"\n"+"\n" +"The flowers of the banana plant form a large spike.It turns downward, to the soil and opens.It bears male and female flowers."+"\n"+"\n" +"a red bud at the end of the spike containing the male flowers; the male flowers die quickly and the bud slowly becomes smaller. ");

        }else if (plant.equals("ineapple")){

            textView.setText("Pineapple"+"\n"+"\n" +"Pineapple is native to Uruguay, Brazil, and Paraguay of South America, a tropical perennial herb with multiple fruit. It is the only common food plant in the Bromeliaceae. It is cultivated commercially in the tropics and parts of the subtropics of the world, with Hawaii producing one-third of the world’s crop."+"\n"+"\n" +"Pineapple is cultivated predominantly for its fruit that is consumed fresh or as canned fruit and juice."+"\n"+"\n" +"The stems and leaves of pineapple plant are also a source of fibre that is white, creamy and lustrous as silk. Pineapple fibre has been processed into paper with remarkable qualities of thinness, smoothness and pliability. Parts of the plant are used for silage and hay for cattle feed. Processing wastes in the form of shell, core materials and centrifuged solids from juice production are also used as animal feed. Alcoholic beverages can also be made from juice."+"\n"+"\n" +"TPineapple belongs to the order Bromeliales, family Bromeliaceae, sub-family Bromelioideae."+"\n"+"\n" +"Itis a perennial monocotyledonous plant having a terminal inflorescence and a terminal multiple fruit. Adult pineapple plants are up to 1 m high and 0.5 m wide while adult ‘Smooth Cayenne’ plants are up to 1.5 m high and 1 m wide."+"\n"+"\n" +"At blooming time, the stem elongates and enlarges near the apex and puts forth an inflorescence of small purple or red flowers. The inflorescence consists of 50 – 200 individual hermaphrodite flowers with tubular corolla. The inflorescence consists of 100 to 200 flowers arranged in a compact spiral cluster."+"\n"+"\n" +"The pineapple, which is oval to cylindrical-shaped is a multiple fruit formed by the partial fusion of numerous fleshy segments from several separate flowers in which the hardened sepals form a continuous rind over the outside.");
        }

        else if (plant.equals("ce")){ //rice

        textView.setText("Rice"+"\n"+"\n" +"There are only two species of cultivated rice in the world, Oryza sativa (Asian rice) and Oryza glaberrima (African rice). Both species are annual grasses (except in the tropics, where the plant can be perennial) belonging to the family Poaceae which are cultivated for their grain which is considered a staple food in most parts of the world. "+"\n"+"\n" +"Asian and African rice plants are morphologically very similar and can be difficult to tell apart. They have rounded stems (called culms) which are divided into nodes and internodes. "+"\n"+"\n" +"The plant leaves are borne on the nodes of the stem and are long and slender with a pronounced midrib. The plant produces three flowers, two of which are reduced, on a spikelet on the terminal (last) internode of the stem. "+"\n"+"\n" +"The rice grain is formed by the ripened ovary of the flower and is between 5 and 12 mm in length. Rice is an annual plant, harvested after one growing season and can reach a height of between 1 and 1.8 m (3.3–5.9 ft) depending on variety."+"\n"+"\n" +"After removal of the rice grain from the chaff, the rice can be used as brown rice or further processed to remove the bran to produce white rice. Brown and white rice may be consumed after cooking or may be ground into rice flour. Rice can be puffed under low pressure to produce puffed rice that is commonly used as a breakfast cereal. Rice bran oil can be produced from the inner husk and can be used as a cooking oil. Rice starch can be extracted and fermented to produce rice wine or brewed to produce sake.");

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

