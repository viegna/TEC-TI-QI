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
		//SET PASSEIO
		$p->set_modelo ($_POST['modelo1']);
		$p->set_marca  ($_POST['marca1']);
		$p->set_placa  ($_POST['placa1']);
		$p->set_renavam($_POST['renavam1']);
		$p->set_chassi ($_POST['chassi1']);
		$p->set_carro  ($_POST['carro']);
		$p->set_moto   ($_POST['moto']);
	?>
		<br>
		<fieldset>
		<legend>CONFIRMAÇÃO DOS DADOS DO VEÍCULO - PASSEIO</legend>
	<?php
		//GET PASSEIO
		echo "<br>Modelo:". $p->get_modelo();
		echo "<br>Marca:".  $p->get_marca();
		echo "<br>Placa:".  $p->get_placa();
		echo "<br>Renavam:".$p->get_renavam();
		echo "<br>Chassi:". $p->get_chassi();
		echo "<br>Carro:".  $p->get_carro();
		echo "<br>Moto:".   $p->get_moto();
	?>
	<a href= "CadPasseio.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
		</fieldset>
	<?php
		//MYSQL PASSEIO
		$placa   =$p->get_placa();  
		$modelo  =$p->get_modelo();  
		$marca   =$p->get_marca();  
		$renavam =$p->get_renavam();  
		$chassi  =$p->get_chassi();  
		$carro   =$p->get_carro();  
		$moto    =$p->get_moto();  
		$sql="INSERT INTO passeio(placa,modelo,marca,renavam,chassi,carro,moto)
		VALUE(:placa,:modelo,:marca,:renavam,:chassi,:carro,:moto)";
				
		$stmt=$conn->prepare($sql);
		$stmt->bindParam(':placa',   $placa,   PDO::PARAM_STR);
		$stmt->bindParam(':modelo',  $modelo,  PDO::PARAM_STR);
		$stmt->bindParam(':marca',   $marca,   PDO::PARAM_STR);
		$stmt->bindParam(':renavam', $renavam, PDO::PARAM_STR);
		$stmt->bindParam(':chassi',  $chassi,  PDO::PARAM_STR);
		$stmt->bindParam(':carro',	 $carro,   PDO::PARAM_STR);
		$stmt->bindParam(':moto',	 $moto,    PDO::PARAM_STR);
		
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