#include <Wire.h>//i2c
int OutPut= 10;//color sensor output
unsigned int frequencyR = 0;
unsigned int frequencyB = 0;
unsigned int frequencyG = 0;
String ph="";
const int btnPin = 13;     // button pin number
 int btnState = 0; 
#include <SoftwareSerial.h>
void setup() {
  Wire.begin(8);                // join i2c bus -> address #8
  // register event
  pinMode(btnPin, INPUT_PULLUP);//Configures the specified pin to behave either as an input or an output.

                // set up the LCD's number of columns and rows
                 Serial.begin(9600);
                pinMode(10, INPUT);//PIN 10 as input
                pinMode(2, OUTPUT);
                pinMode(3, OUTPUT);//PINS 2, 3,4,5 as OUTPUT
                pinMode(4, OUTPUT);
                pinMode(5, OUTPUT);
               
 
                digitalWrite(2,HIGH);
                digitalWrite(3,LOW);//setting the frequency counter to 20% HH-100% LL-0%etc.
}

void loop() {
  delay(100);
   
    // read push button State:
  btnState = digitalRead(btnPin);//Check if the button is pressed
 
  
  if (btnState == HIGH) {
    
   Serial.println("Color Sensor");
                Serial.print("R:");
                digitalWrite(4,LOW);
                digitalWrite(5,LOW);//setting for Red color 
                frequencyR = pulseIn(OutPut, LOW);//read frequency
                Serial.print(frequencyR);//print frequency for Red color
                Serial.print(" | ");
                delay(500);
               
                Serial.print("B:");
                digitalWrite(4,LOW);
                digitalWrite(5,HIGH);// setting for Blue color 
                frequencyB = pulseIn(OutPut, LOW);// read frequency
                Serial.print(frequencyB);// printing frequency Blue color
                Serial.print(" | ");
                delay(500);
               
              Serial.print("G:");
                digitalWrite(4,HIGH);
                digitalWrite(5,HIGH);// setting for GREEN color
                frequencyG = pulseIn(OutPut, LOW);// read frequency
                Serial.print(frequencyG);// printing frequency for GREEN color 
                Serial.print("  |  ");
              
              if((frequencyR>76||frequencyR<82)&&(frequencyB>101&&frequencyB<109)&&(frequencyG>137&&frequencyG<141)){

                 //  Wire.write("0.5");
                   Serial.println("0.5");
                  }

                  else if((frequencyR>50&&frequencyR<54)&&(frequencyB>87&&frequencyB<92)&&(frequencyG>24&&frequencyG<27)){
                  // Wire.write("1"); 
                    Serial.println("1");
                  }
                  else if((frequencyR>55&&frequencyR<60)&&(frequencyB>94&&frequencyB<98)&&(frequencyG>125&&frequencyG<133)){
                 //    Wire.write("1.5");
                      Serial.println("1.5");
                  }
                  else if((frequencyR>46&&frequencyR<50)&&(frequencyB>85&&frequencyB<90)&&(frequencyG>23&&frequencyG<26)){
                //    Wire.write("2");
                     Serial.println("2");
                  }
              
                  else if((frequencyR>47&&frequencyR<52)&&(frequencyG>117&&frequencyG<122)&&(frequencyB>44&&frequencyB<47)){
                 //   Wire.write("2.4");
                     Serial.println("2.4");
                  }

                 else if((frequencyR>48&&frequencyR<52)&&(frequencyB>97&&frequencyB<101)&&(frequencyG>44&&frequencyG<48)){
                 //   Wire.write("2.5");
                     Serial.println("2.5");
                  }

                 else if((frequencyR>44&&frequencyR<47)&&(frequencyB>90&&frequencyB<94)&&(frequencyG>80&&frequencyG<86)){
                  //  Wire.write("2.7");
                     Serial.println("2.7");
                  }

                  else if((frequencyR>42&&frequencyR<45)&&(frequencyB>80&&frequencyB<85)&&(frequencyG>18&&frequencyG<22)){
                 //  Wire.write("3"); 
                    Serial.println("3");
                  }

                 else if((frequencyR>42&&frequencyR<45)&&(frequencyB>86&&frequencyB<89)&&(frequencyG>65&&frequencyG<70)){
                  //  Wire.write("3.5");
                     Serial.println("3.5");
                  }

                  else if((frequencyR>42&&frequencyR<45)&&(frequencyB>82&&frequencyB<85)&&(frequencyG>19&&frequencyG<22)){
                  //  Wire.write("4");
                     Serial.println("4");
                  }
                  else if((frequencyR>43&&frequencyR<46)&&(frequencyB>87&&frequencyB<91)&&(frequencyG>17&&frequencyG<20)){
                 //   Wire.write("4.5");
                     Serial.println("4.5");
                  }

                  else if ((frequencyR>41&&frequencyR<45 )&&(frequencyB>80&&frequencyB<85)&&(frequencyG>18&&frequencyG<22)){
                  //  Wire.write("5");
                     Serial.println("5");
                  }
                  else if((frequencyR>48&&frequencyR<52 )&&(frequencyB>90&&frequencyB<93)&&(frequencyG>20&&frequencyG<25)){
                 //   Wire.write("5.5");
                     Serial.println("5.5");
                  }

                  else if((frequencyR>42&&frequencyR<45)&&(frequencyB>82&&frequencyB<85)&&(frequencyG>19&&frequencyG<22)){
                 //  Wire.write("6");
                    Serial.println("6");
                  }
                  else if((frequencyR>123&&frequencyR<130)&&(frequencyB>114&&frequencyB<119)&&(frequencyG>101&&frequencyG<107)){
                   //  Wire.write("6.5");
                      Serial.println("6.5");
                  }
                  else if((frequencyR>6&&frequencyR<65)&&(frequencyB>88&&frequencyB<93)&&(frequencyG>23&&frequencyG<26)){
                 //  Wire.write("7");
                    Serial.println("7");
                  }
                  else if((frequencyR>114&&frequencyR<123)&&(frequencyB>110&&frequencyB<115)&&(frequencyG>113&&frequencyG<119)){
                   //  Wire.write("7.5");
                      Serial.println("7.5");
                  }

                  else if((frequencyR>96&&frequencyR<108)&&(frequencyB>91&&frequencyB<112)&&(frequencyG>102&&frequencyG<108)){
                   //  Wire.write("8");
                      Serial.println("8");
                  }
                  else if((frequencyR>122&&frequencyR<129)&&(frequencyB>119&&frequencyB<123)&&(frequencyG>41&&frequencyG<45)){
                    // Wire.write("9");
                      Serial.println("9");
                  }
                  else if((frequencyR>100&&frequencyR<107)&&(frequencyB>66&&frequencyB<77 )&&(frequencyG>29&&frequencyG<33)){
                   //  Wire.write("10");
                      Serial.println("10");
                  }
                  else if((frequencyR>135&&frequencyR<145)&&(frequencyB>107&&frequencyB<118)&&(frequencyG>46&&frequencyG<49)){
                    // Wire.write("11");
                      Serial.println("11");
                  }
                  else if((frequencyR>155&&frequencyR<162)&&(frequencyB>56&&frequencyB<58)&&(frequencyG>30&&frequencyG<33)){
                    // Wire.write("11.5");
                      Serial.println("11.5");
                  } 
                  else if((frequencyR>155&&frequencyR<162)&&(frequencyB>133&&frequencyB<143)&&(frequencyG>190&&frequencyG<198)){
                  //   Wire.write("12");
                      Serial.println("12");
                  } 
                  else if((frequencyR>131&&frequencyR<134)&&(frequencyB>121&&frequencyB<130)&&(frequencyG> 49&&frequencyG<53)){
                   //  Wire.write("13");ph="13";
                      Serial.println("13");
                  }
                  else if((frequencyR>146&&frequencyR<156)&&(frequencyB>79&&frequencyB<83)&&(frequencyG>38&&frequencyG<41)){
                  //  Wire.write("13.5");
                     Serial.println("13.5");
                  } 
                  else if((frequencyR>175&&frequencyR<187)&&(frequencyB>178&&frequencyB<185)&&(frequencyG>220&&frequencyG<228)){
                  //  Wire.write("14");
                     Serial.println("14");
                  }
                  else
                      Serial.println("7.1");
                delay(500);      

                //Wire.onRequest(requestEvent);

                 
                  
 

  }
}

//This event which is registered in setup gets excecuted when master recieves data
void requestEvent() {
  
}
