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

        public class FifthActivity extends AppCompatActivity {

            private TextView textView;
            private static String plant;
            public Button Btn3;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_fifth);

               Intent intent = getIntent();
              vplant = intent.getStringExtra("PLANT_DETAILS");

                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);

                textView = (TextView) findViewById(R.id.plantDetails);
               // textView.setText(plant);
                if (plant.equals("Banana")){

                    textView.setText("LOOKING AFTER THE PLANTATION "+"\n"+"\n" +"Keeping the soil clean"+"\n"+"\n" +"When the banana has grown up,
            the grass dies, because it has no light."+"\n"+"\n" +"If the grass does not die, apply Gramoxone."+"\n"+"\n" +"Mix 0.4 litres of the product with 400 litres of water to treat one hectare."+"\n"+"\n" +"
            Add a spreader to the mixture to make it stick to the grass better."+"\n"+"\n" +"You can put down a mulch of dry grass and leaves at the end of the rainy season."+"\n"+"\n" +"This vegetation will rot, and make humus;
            it will help to keep the soil moist during the dry season."+"\n"+"\n" +"Two months earlier,"+"\n"+"\n" +
            "Make the planting holes.Separate the soil at the bottom from the soil at the top. Put compost in the holes."+"\n"+"\n" +"Just before planting them,"+"\n"+"\n" +"Trim them at a point 50 centimetres from the base of the plant and dip them in water in which potassium permanganate is mixed."+"\n"+"\n" +"At planting time,"+"\n"+"\n" +"
            take the compost out of the holes.Put the soil from the top into the bottom of the hole, place the sucker in the earth.The base of the sucker is now 10 centimetres
            from the surface of the ground.Put compost round the young plant.Put the bottom soil on the ground surface."
            +"\n"+"\n" +"Applying fertilizers"+"\n"+"\n" +"You can give a banana plant each year the following:"+"\n"+"\n" +"Nitrogen-
            750 grammes of ammonium sulphate or 300 grammes of urea."+"\n"+"\n" +"Phosphorus-300 grammes of dicalcium phosphate or 500 grammes of Thomas slag (Bessemer basic slag)."
            +"\n"+"\n" +"Potassium-600 grammes of potassium chloride."+"\n"+"\n" +"Give also 500 grammes of dolomitic limestone per plant once a year, in one application."+"\n"+"\n" +"The nitrogen and the potassium are given in several applications (four or five times)."+"\n"+"\n" +"The phosphorus and the lime
            are applied at the end of the dry season or at the end of the rainy season.The fertilizer will not be washed away by the rain."+"\n"+"\n" +"If the banana plants are irrigated,
            fertilizer may be given during the dry season."+"\n"+"\n" +"Instead of applying several different fertilizers,you can use one compound fertilizer-NPK" 
            +"\n"+"\n" +"For young plants you can give 1.5 kilogrammes of 10-10-20 fertilizer per plant per year, in several applications."
            +"\n"+"\n" +"For bananas in production,you can give 1.5 kilogrammes of 5-12-24 fertilizer per plant per year, in several applications."+"\n"+"\n" +"In addition, give 500 grammes of dolomitic limestone in one application per plant per year." );

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
                           Fourth.class); //This should be changed
                    startActivity(intent);
                }
            });

        }
        }

