<?php

//localhost
$db_host = 'localhost';
    $db_user = 'root';
    $db_pass = '';
    $db_name= 'grampanchayat';

    $con = mysqli_connect($db_host, $db_user, $db_pass, $db_name);
    
if(!$con)
{
    echo "Connection error".mysqli_connect_error();
}
else
{
    //echo "Connection established";
*/


$images = array();

    

$sql = "select * from getmyimage";
	

	
	$localhost_url = "http://192.168.31.150/Fetch-Image-Server/";

	$result=mysqli_query($con,$sql);
	if($result){
		while($row=mysqli_fetch_array($result)){
		  	$images[]=array(
		  	    'id'=>$row['id'],
		  	    'imagename'=>$row['imagename'],
		  	    'imagepath'=>$row['imagepath'],
		  	    'imageinfo'=>$row['imageinfo']
		  	    );
		}
    }  
    
echo json_encode($images);
mysqli_close($con);
}
?>