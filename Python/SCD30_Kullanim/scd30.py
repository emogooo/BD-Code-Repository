import time
import board
import busio
import adafruit_scd30
i2c = busio.I2C(board.SCL, board.SDA, frequency=50000)
scd = adafruit_scd30.SCD30(i2c)
print("Sıcaklık ofseti: ", scd.temperature_offset)
print("Ölçüm aralığı: ", scd.measurement_interval)
print("Otomatik kalibrasyon aktif: ", scd.self_calibration_enabled)
print("Hava basıncı: ", scd.ambient_pressure)
print("Denizden yükseklik: ", scd.altitude, "m")
print("Yeniden kalibrasyon referans değeri: ", scd.forced_recalibration_reference)
print("")

while True:
    data = scd.data_available
    if data:
        print("CO2:", scd.CO2, "PPM")
        print("Sıcaklık:", scd.temperature, "C")
        print("Nem:", scd.relative_humidity, "%%rH")
    time.sleep(0.5)