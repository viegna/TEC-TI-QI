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
		//SET CLIENTE
		$c->set_nome		($_POST['nome2']);
		$c->set_CPF			($_POST['CPF2']);
		$c->set_idade		($_POST['idade2']);
		$c->set_logradouro	($_POST['logradouro2']);
		$c->set_numero		($_POST['numero2']);
		$c->set_bairro		($_POST['bairro2']);
		$c->set_cidade		($_POST['cidade2']);
		$c->set_CEP			($_POST['CEP2']);
		$c->set_UF			($_POST['UF2']);
		$c->set_cartaCredito($_POST['cartaCredito']);
		$c->set_dataCadastro($_POST['dataCadastro']);
	?>
		<br>
		<fieldset>
		<legend>CONFIRMAÇÃO DOS DADOS DO CLIENTE</legend>
	<?php
		//GET CLIENTE
		echo "<br>Nome:"			.$c->get_nome();
		echo "<br>CPF:"				.$c->get_CPF();
		echo "<br>Idade:"			.$c->get_idade();
		echo "<br>Logradouro:"		.$c->get_logradouro();
		echo "<br>Número:"			.$c->get_numero();
		echo "<br>Bairro:"			.$c->get_bairro();
		echo "<br>Cidade:"			.$c->get_cidade();
		echo "<br>CEP:"				.$c->get_CEP();
		echo "<br>UF:"				.$c->get_UF();
		echo "<br>Carta de Crédito:".$c->get_cartaCredito();
		echo "<br>Data do Cadastro:".$c->get_dataCadastro();
	?>
	<a href= "CadCli.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
		</fieldset>
	<?php
		//MYSQL CLIENTE
		$nome         =$c->get_nome();        
		$CPF          =$c->get_CPF();         
		$idade        =$c->get_idade();       
		$logradouro   =$c->get_logradouro();  
		$numero       =$c->get_numero();      
		$bairro       =$c->get_bairro();      
		$cidade       =$c->get_cidade();      
		$CEP          =$c->get_CEP();         
		$UF           =$c->get_UF();          
		$cartaCredito =$c->get_cartaCredito();
		$dataCadastro =$c->get_dataCadastro();
		$sql="INSERT INTO cliente(nome,CPF,idade,logradouro,cidade,numero,bairro,CEP,UF,cartaCredito,dataCadastro)
		VALUE(:nome,:CPF,:idade,:logradouro,:cidade,:numero,:bairrocidade,:CEP,:UF,:cartaCredito,:dataCadastro)";
				
		$stmt=$conn->prepare($sql);
		$stmt->bindParam(':nome',         $nome,         PDO::PARAM_STR);
		$stmt->bindParam(':CPF',          $CPF,          PDO::PARAM_STR);
		$stmt->bindParam(':idade',        $idade,        PDO::PARAM_INT);
		$stmt->bindParam(':logradouro',   $logradouro,   PDO::PARAM_STR);
		$stmt->bindParam(':cidade',       $cidade,       PDO::PARAM_STR);
		$stmt->bindParam(':numero',       $numero,       PDO::PARAM_INT);
		$stmt->bindParam(':bairrocidade', $bairro,       PDO::PARAM_STR);
		$stmt->bindParam(':CEP',          $CEP,          PDO::PARAM_STR);
		$stmt->bindParam(':UF',           $UF,           PDO::PARAM_STR);
		$stmt->bindParam(':cartaCredito', $cartaCredito, PDO::PARAM_STR);
		$stmt->bindParam(':dataCadastro', $dataCadastro, PDO::PARAM_STR);
		
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