#include <BH1750.h>
#include <dht.h>
#include <SoftwareSerial.h>

SoftwareSerial BluetoothSerial(10, 11);

dht DHT;
BH1750 lightIntensityM;

#define DHT11_PIN 2


void setup() {

  Serial.begin(9600);
  BluetoothSerial.begin(9600);
  lightIntensityM.begin();

  delay(1000);
  uint16_t intensityLux = lightIntensityM.readLightLevel();

  Serial.print("Light: ");
  Serial.print(intensityLux);
  Serial.print(" lx");

  delay(1000);
  int soilMoisture = analogRead(A0);

  Serial.print(“Analog value: “);
  Serial.println(soilMoisture);

  int soilMois_perc = getPercentage(soilMoisture);
  Serial.print(soilMois_perc);
  Serial.print(" %");

  delay(1000);
  int chk = DHT.read11(DHT11_PIN);

  Serial.print("Temp: ");
  Serial.print(DHT.temperature);

  Serial.print("Humidity: ");
  Serial.println(DHT.humidity);
}


void loop() {

  sendValuesToApp();
  delay(7000);

}

void sendValuesToApp() {

  BluetoothSerial.print("#");
  BluetoothSerial.print(soilMois_perc);        //sends the soil moisture
  BluetoothSerial.print(",");
  BluetoothSerial.print(intensityLux);            //sends the light intensity
  BluetoothSerial.print(",");
  BluetoothSerial.print(DHT.temperature); //sends the temperature
  BluetoothSerial.print(",");
  BluetoothSerial.print(DHT.humidity);      //sends the humidity
  BluetoothSerial.print(",");
  BluetoothSerial.print("~");
}

int getPercentage(int value)
{
  int percentage = 0;
  percentage = map(value, 1023, 465, 0, 100);
  return percentage;
}
