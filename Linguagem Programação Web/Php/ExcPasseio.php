<html>
<head>
	<?php include 'connection.php';?>
	<meta charset="utf-8"/>
</head>
<body>
<div>
<form method="POST" action="#"><center><h1>Exclusão de Veículo de Passeio</h1>
	<select name="placa">
	<?php
		$sql="SELECT placa FROM passeio";
		$resultado=$conn->query($sql);
		$tabela=$resultado->fetchALL(PDO::FETCH_ASSOC);
		foreach($tabela as $linha){
			foreach($linha as $coluna){
				echo "<option value='".$coluna."'>".$coluna."</option>";
			}
		}
	?>
	</select>
	<hr>
	<div>
		<input type="submit" value="Excluir" name="excluir">
	</div>
</form>	

	</center>
		<a href= "VeiculoPasseio.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
<?php
	if(isset($_POST['excluir'])){
	$placa=$_POST['placa'];
	$sql="DELETE FROM passeio WHERE placa=:placa";
	$stm=$conn->prepare($sql);
	$stm->bindParam(':placa',$placa);
	$result=$stm->execute();
	if(!$result){
		var_dump($stm->errorInfo());
		exit;
	}
}
?>