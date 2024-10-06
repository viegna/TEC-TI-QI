<html>
<head>
<?php include 'connection.php';?>
	<meta charset="utf-8"/>
	<title>Veiculos de Passeio</title>
</head>
<body>

<center>
	<table border="2">
		<tr><td>
		<center><h3>  Todos os veículos de passeio cadastrados:  </h3></center>
		<center>
	<?php
		$sql="SELECT placa FROM passeio";
		$resultado=$conn->query($sql);
		$tabela=$resultado->fetchALL(PDO::FETCH_ASSOC);
		foreach($tabela as $linha){
			foreach($linha as $coluna){
				echo $coluna."<br>";
			}
		}
	?>
	<br>
	
		</table>
		<center>
		<a href= "VeiculoPasseio.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></a></center>
	</center>
	</center>
	</center>
</body>
</html>