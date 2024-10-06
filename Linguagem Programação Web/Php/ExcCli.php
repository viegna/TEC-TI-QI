<html>
<head>
	<?php include 'connection.php';?>
	<meta charset="utf-8"/>
	<title>Exclusão de Cliente</title>
</head>
<body>
<div>
<form method="POST" action="#"><center><h1>Exclusão de Cliente</h1>
	<select name="nome">
	<?php
		$sql="SELECT nome FROM cliente";
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
	<a href= "Cliente.html"><br><center><tr><td><input type="submit" value="Voltar"></td></tr></center></a>
<?php
	if(isset($_POST['excluir'])){
	$nome=$_POST['nome'];
	$sql="DELETE FROM cliente WHERE nome=:nome";
	$stm=$conn->prepare($sql);
	$stm->bindParam(':nome',$nome);
	$result=$stm->execute();
	if(!$result){
		var_dump($stm->errorInfo());
		exit;
	}
}
?>