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
		//SET FUNCIONARIO
		$f->set_nome		  ($_POST['nome1']);
		$f->set_CPF			  ($_POST['CPF1']);
		$f->set_idade		  ($_POST['idade1']);
		$f->set_logradouro	  ($_POST['logradouro1']);
		$f->set_numero		  ($_POST['numero1']);
		$f->set_bairro		  ($_POST['bairro1']);
		$f->set_cidade		  ($_POST['cidade1']);
		$f->set_CEP			  ($_POST['CEP1']);
		$f->set_UF			  ($_POST['UF1']);
		$f->set_quantidadeHora($_POST['qtdHora']);
		$f->set_valorHora	  ($_POST['valorHora']);
	?>
		<br>
		<fieldset>
		<legend>CONFIRMAÇÃO DOS DADOS DO FUNCIONÁRIO</legend>
	<?php
		//GET FUNCIONARIO
		echo "<br>Nome:"	   .$f->get_nome();
		echo "<br>CPF:"		   .$f->get_CPF();
		echo "<br>Idade:"	   .$f->get_idade();
		echo "<br>Logradouro:" .$f->get_logradouro();
		echo "<br>Número:"	   .$f->get_numero();
		echo "<br>Bairro:"	   .$f->get_bairro();
		echo "<br>Cidade:"	   .$f->get_cidade();
		echo "<br>CEP:"		   .$f->get_CEP();
		echo "<br>UF:"		   .$f->get_UF();
		echo "<br>QTD Horas:"  .$f->get_quantidadeHora();
		echo "<br>Valor Horas:".$f->get_valorHora();
		echo "<br>Salario:"	   .$f->get_salario();
	?>
	<a href= "CadFun.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
		</fieldset>
		<?php
		//MYSQL FUNCIONARIO
		$nome           =$f->get_nome();        
		$CPF            =$f->get_CPF();         
		$idade          =$f->get_idade();       
		$logradouro     =$f->get_logradouro();  
		$numero         =$f->get_numero();      
		$bairro         =$f->get_bairro();      
		$cidade         =$f->get_cidade();      
		$CEP            =$f->get_CEP();         
		$UF             =$f->get_UF();
		$quantidadeHora =$f->get_quantidadeHora();
		$valorHora		=$f->get_valorHora();
		$sql="INSERT INTO funcionario(nome,CPF,idade,logradouro,cidade,numero,bairro,CEP,UF,quantidadeHora,valorHora)
		VALUE(:nome,:CPF,:idade,:logradouro,:cidade,:numero,:bairrocidade,:CEP,:UF,:quantidadeHora,:valorHora)";
				
		$stmt=$conn->prepare($sql);
		$stmt->bindParam(':nome',           $nome,           PDO::PARAM_STR);
		$stmt->bindParam(':CPF',            $CPF,            PDO::PARAM_STR);
		$stmt->bindParam(':idade',          $idade,          PDO::PARAM_INT);
		$stmt->bindParam(':logradouro',     $logradouro,     PDO::PARAM_STR);
		$stmt->bindParam(':cidade',         $cidade,         PDO::PARAM_STR);
		$stmt->bindParam(':numero',         $numero,         PDO::PARAM_INT);
		$stmt->bindParam(':bairrocidade',   $bairro,         PDO::PARAM_STR);
		$stmt->bindParam(':CEP',            $CEP,            PDO::PARAM_STR);
		$stmt->bindParam(':UF',             $UF,             PDO::PARAM_STR);
		$stmt->bindParam(':quantidadeHora', $quantidadeHora, PDO::PARAM_INT);
		$stmt->bindParam(':valorHora',	    $valorHora,      PDO::PARAM_INT);
		
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