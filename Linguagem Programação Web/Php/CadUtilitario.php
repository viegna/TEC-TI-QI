<html>
<head>
	<meta charset="utc-8">
</head>
<body>
	<h1>Cadastro da Locadora - [Confirmação]</h1>
	<?php
		include 'connection.php';
		
		include 'Pessoa.php';
		$f = new Funcionario();
		$c = new Cliente();
		
		include 'Veiculo.php';
		$p = new Passeio();
		$u = new Utilitario();
	?>
	<?php
		//SET UTILITARIO
		$u->set_modelo	   ($_POST['modelo2']);
		$u->set_marca	   ($_POST['marca2']);
		$u->set_placa	   ($_POST['placa2']);
		$u->set_renavam	   ($_POST['renavam2']);
		$u->set_chassi	   ($_POST['chassi2']);
		$u->set_esportivo  ($_POST['esportivo']);
		$u->set_tradicional($_POST['tradicional']);
	?>
		<br>
		<fieldset>
		<legend>CONFIRMAÇÃO DOS DADOS DO VEÍCULO - UTILITÁRIO</legend>
	<?php
		//GET UTILITARIO
		echo "<br>Modelo:"	   .$u->get_modelo();
		echo "<br>Marca:"	   .$u->get_marca();
		echo "<br>Placa:"	   .$u->get_placa();
		echo "<br>Renavam:"	   .$u->get_renavam();
		echo "<br>Chassi:"	   .$u->get_chassi();
		echo "<br>Esportivo:"  .$u->get_esportivo();
		echo "<br>Tradicional:".$u->get_tradicional();
	?>
	<a href= "CadUtilitario.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
		</fieldset>
	<?php
		//MYSQL UTILITARIO
		$placa       =$u->get_placa();  
		$modelo      =$u->get_modelo();  
		$marca       =$u->get_marca();  
		$renavam     =$u->get_renavam();  
		$chassi      =$u->get_chassi();
		$esportivo   =$u->get_esportivo();
		$tradicional =$u->get_tradicional();
		$sql="INSERT INTO passeio(placa,modelo,marca,renavam,chassi,esp,tradicional)
		VALUE(:placa,:modelo,:marca,:renavam,:chassi,:esportivo,:tradicional)";
				
		$stmt=$conn->prepare($sql);
		$stmt->bindParam(':placa',       $placa,       PDO::PARAM_STR);
		$stmt->bindParam(':modelo',      $modelo,      PDO::PARAM_STR);
		$stmt->bindParam(':marca',       $marca,       PDO::PARAM_STR);
		$stmt->bindParam(':renavam',     $renavam,     PDO::PARAM_STR);
		$stmt->bindParam(':chassi',      $chassi,      PDO::PARAM_STR);
		$stmt->bindParam(':esportivo',   $esportivo,   PDO::PARAM_STR);
		$stmt->bindParam(':tradicional', $tradicional, PDO::PARAM_STR);
		
		$resultado=$stmt->execute();
		if(!$resultado){
			var_dump($stmt->errorInfo());
			exit;
		}else{
			echo $stmt->rowCount()." LINHA INSERIDA"."<br>";
		}
	?>
	
	
	

</body>
</html>