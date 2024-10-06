<html>
<head>
<?php include 'connection.php';?>
	<meta charset="utf-8"/>
	<title>Funcionario</title>
</head>
<body>

<center>
	<table border="2">
		<tr><td>
		<center><h3>  Todos os funcionários cadastrados:  </h3></center>
		<center>
	<?php
		$sql="SELECT nome FROM funcionario";
		$resultado=$conn->query($sql);
		$tabela=$resultado->fetchALL(PDO::FETCH_ASSOC);
		foreach($tabela as $linha){
			foreach($linha as $coluna){
				echo $coluna."<br>";
			}
		}
	?>
	<br></center>
		</table>
		<center>
		<a href= "Funcionario.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></a></center>
	</center>
	</center>
</body>
</html>