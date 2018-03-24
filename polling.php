<?php
    $link = mysqli_connect("localhost", "root", "","try");
 
    if($link === false){
        die("ERROR: Could not connect. " . mysqli_connect_error());
    }

    echo "Connect Successfully|";

    echo "Updating DB|";
        $q = "INSERT INTO `emp`(`name`) VALUES ('gdfg')";
        mysqli_query($link,$q);
    echo "Updating DB Done|";

    echo "Sending Mail|";
        //sending Mail code here
    echo "Sending Mail Done|";

    mysqli_close($link);

	echo $_GET['mail']."\n";
?>