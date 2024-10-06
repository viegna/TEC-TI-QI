<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<?php
	echo "Nome: ".$_POST['nome'];
	
	switch($_POST['n1']){
		CASE "A":
			echo "A</strong><br>";
			$n1=1;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n1=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n1=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n1=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n1=0;
			break;
		}
			
			switch($_POST['n2']){
		CASE "A":
			echo "A</strong><br>";
			$n2=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n2=1;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n2=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n2=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n2=0;
			break;
		}
		
			switch($_POST['n3']){
		CASE "A":
			echo "A</strong><br>";
			$n3=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n3=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n3=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n3=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n3=1;
			break;
		}
		
			switch($_POST['n4']){
		CASE "A":
			echo "A</strong><br>";
			$n4=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n4=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n4=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n4=1;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n4=0;
			break;
		}
		
			switch($_POST['n5']){
		CASE "A":
			echo "A</strong><br>";
			$n5=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n5=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n5=1;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n5=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n5=0;
			break;
		}
		
			switch($_POST['n6']){
		CASE "A":
			echo "A</strong><br>";
			$n6=1;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n6=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n6=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n6=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n6=0;
			break;
		}
		
			switch($_POST['n7']){
		CASE "A":
			echo "A</strong><br>";
			$n7=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n7=1;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n7=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n7=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n7=0;
			break;
		}
		
			switch($_POST['n8']){
		CASE "A":
			echo "A</strong><br>";
			$n8=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n8=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n8=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n8=1;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n8=0;
			break;
		}
		
			switch($_POST['n9']){
		CASE "A":
			echo "A</strong><br>";
			$n9=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n9=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n9=0;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n9=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n9=1;
			break;
		}
		
			switch($_POST['n10']){
		CASE "A":
			echo "A</strong><br>";
			$n10=0;
			break; 
		CASE "B":  
			echo "B</strong><br>";
			$n10=0;
			break; 
		CASE "C":  
			echo "C</strong><br>";
			$n10=1;
			break; 
		CASE "D":  
			echo "D</strong><br>";
			$n10=0;
			break; 
		CASE "E":  
			echo "E</strong><br>";
			$n10=0;
			break;
		}
		
		$media = $n1+$n2+$n3+$n4+$n5+$n6+$n7+$n8+$n9+$n10;
		echo "<br>Media: ".$media;

		if($media>= 7){
			echo "<br><br>Resultado: Aprovado";
		}else if($media>=5 && $media<=7){
			echo "<br><br>Resultado: Recuperação";
		}else{
			echo "<br><br>Resultado: Reprovado";
		}
		
	
	?>
	
</body>
</html>