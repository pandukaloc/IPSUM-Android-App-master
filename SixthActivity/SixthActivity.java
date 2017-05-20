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

    public class SixthActivity extends AppCompatActivity {

        private TextView textView;
        private static String plant;
        public Button Btn3;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sixth);

              Intent intent = getIntent();
              plant = intent.getStringExtra("PLANT_DETAILS");

            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            textView = (TextView) findViewById(R.id.plantDetails);
            //textView.setText(plant);
            if (plant.equals("Banana")){

                textView.setText("---Ntrient Deficiencies---"+"\n"+"\n" +"1.Nitrogen"+"\n"+"\n" +"Leaves of all ages become pale green. Mid ribs, petioles and leaf sheaths turn reddish pink and rosette in appearance. Plantations with poor root growth exhibit such symptoms. Bunch weight and fruit quality is affected."
                  +"\n"+"\n" +"Control: Application of urea (300g/plant) followed by irrigation is recommended."+"\n"+"\n" +"2.Phosphorus"+"\n"+"\n" +"Plants show stunted growth with poor root development. Old leaves show saw tooth marginal chlorosis, curling of leaves, breaking of petioles and bluish green colour of younger leaves."
                  +"\n"+"\n" +"Control: Application of DAP (50g/plant) followed by irrigation is recommended."+"\n"+"\n" +
                       "3.Potassium"+"\n"+"\n" +"The deficiency symptoms include orange yellow colour of old leaves, scorching along the margins, reduction in total leaf area, curving of midribs etc. Choking of leaves delay flower initiation leading to reduction in yield and quality."
                       +"\n"+"\n" +"Control: Spraying Potassium Sulphate (1%) solution on the leaves is recommended."+"\n"+"\n" +"4.Boron"+"\n"+"\n" +"Deficiency symptoms include reduced leaf area, curling of leaves, lamina deformation, appearance of white stripes perpendicular to the veins on the lamina of young leaves, thickening of secondary veins and inhibition of root and flower formation."
                       +"\n"+"\n" +"Control: Application of Borax salt (25 g/plant) in the soil around the root zone of the plant is recommended"+"\n"+"\n" +"5.Magnesium"
                       +"\n"+"\n" +"Yellow discolouration is observed in the mid blade and midrib portion, however, the margins of the leaf remain green. Purple mottling of the petioles, marginal necrosis and separation of leaf sheaths from the pseudostem is also seen."
                       +"\n"+"\n" +"Control: Application of Magnesium Sulphate (25g/plant) followed by irrigation is recommended."+"\n"+"\n" +"6.Sulphur"+"\n"+"\n" +"Symptoms include yellow or white appearance of young leaves, necrotic patches on the leaf margins, thickening of veins, stunted growth and small or choked bunches."
                       +"\n"+"\n" +"Control: Application of complex fertilizer (20:20:0:15) @ 20 g/plant followed by irrigation is recommended."+"\n"+"\n" +"7.Iron" 
                       +"\n"+"\n" +"The younger leaves turn yellow or white."+"\n"+"\n" +"Control: Spraying Iron Sulphate (0.5%) along with Urea (1%) on the leaves is recommended."
                       +"\n"+"\n" +"8.Copper"+"\n"+"\n" +"Both young and old leaves show symptoms of chlorosis and curve towards the base, which gives an umbrella like appearance to the plant."
                       +"\n"+"\n" +"Control: Spraying Copper Sulphate (0.5%) on the leaves is recommended."+"\n"+"\n" +"9.Zinc"+"\n"+"\n" +"Symptoms appear mostly in limed soils or soils with high pH. Young leaves become smaller in size and more lanceolate in shape. In the furling leaf high amount of anthocyanin pigmentation appear on its underside. The unfurled leaf has alternating chlorotic and green bands. Fruit is light green, twisted, short and thin."
                       +"\n"+"\n" +"Control: Spraying Zinc Sulphate (0.5%) on the leaves is recommended."+"\n"+"\n" +"10.Manganese"+"\n"+"\n" +"Narrow green edge appears at the leaf margins of second or third youngest leaf, which further spreads along the main veins towards the midrib. However, the interveinal areas remain green giving comb tooth appearance."
                       +"\n"+"\n" +"Control: Spraying Manganese Sulphate (0.5%) on the leaves is recommended."+"\n"+"\n" +"11.Calcium"+"\n"+"\n" +"The deficiency symptoms include deformation or absence of leaf lamina (spike leaf), marginal leaf necrosis and thickening of veins"
                       +"\n"+"\n" +"Control : Application of lime (50g/plant) followed by irrigation is recommended."

                       +"\n"+"\n" +"---Protection against insects and diseases---"+"\n"+"\n" +"1.Banana weevil"
                       +"\n"+"\n" +"They eat out the heart of the banana plant.You do not see the weevils, but if the fruit bunch does not develop,or if the bunch is small and badly shaped,there may be weevils."+"\n"+"\n" +"Control-use BHC.Put 25 to 30 grammes of BHC round each plant."+"\n"+"\n" +"2.Banana eelworm or nematode"
                       +"\n"+"\n" +"They eat the roots,and once the banana has no roots,it cannot feed,and may be blown over by the wind."+"\n"+"\n" +"Control-Before planting,dip the suckers in lukewarm water,or in water mixed with Némagon.If there are eelworms in the plantation,put Némagon in the soil."+"\n"+"\n" +"3. Panama disease"
                       +"\n"+"\n" +"This disease is caused by a tiny fungus in the soil.It makes the leaves break.If you cut the banana plant,the apparent trunk is coloured brownish red."+"\n"+"\n" +"Control-To control the disease,plant resistant dwarf varieties such as Poyo or Lacatan.These bananas are very resistant to Panama disease.The Gros Michel variety is not resistant." );

            }

            /*else if (plant.equals("ineapple")){

    }

            else if (plant.equals("ce")){ //rice


            }
    */

        Btn3= (Button)findViewById(R.id.conform);//should be directed to home

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

