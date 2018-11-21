# esp8266-nodeMCU-with-MPU6050-sensor
this code allows an esp8266 nodeMCU to work with a MPU6050 sensor, sending the resulting readings to a web page generated by the micro controller.  (the majority of the code which allows the two boards to interact comes from this page:   https://olivertechnologydevelopment.wordpress.com/2017/08/17/esp8266-sensor-series-gy-521-imu-part-1/      I want to make sure that this page gets most of the credit for the arduino part of the code)  The arduino code reads the sensor results, which are set to a web page.  The java part of the code reads the information from the page, and reprints it back to the command prompt.
