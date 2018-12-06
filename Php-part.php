<?php

//this part off the code posts the sensor data sent from the esp8266 to an html file in the target website

   if( $_REQUEST["var"]) 
   {
        //print var
        echo "var has a value of var is". $_REQUEST['var'];
   }

$var1 = $_REQUEST['var'];

$WriteMyRequest="<p> the value of var is ".$var1."</p><br/>";

file_put_contents('dataDisplayer.html', $WriteMyRequest, FILE_APPEND);

?>
