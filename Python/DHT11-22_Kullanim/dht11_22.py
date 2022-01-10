import Adafruit_DHT

DHT_SENSOR = Adafruit_DHT.DHT11
DHT_PIN = 4

while True:
    nem, sicaklik = Adafruit_DHT.read(DHT_SENSOR, DHT_PIN)
    if nem is not None and sicaklik is not None:
        print("Sıcaklık = {0:0.1f}C Nem = %{1:0.1f}".format(sicaklik, nem))
    else:
        print("Sensör hatası. Bağlantıyı kontrol edin.")