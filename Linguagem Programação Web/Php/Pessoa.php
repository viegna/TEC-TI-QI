<?php
	class Pessoa{
		protected $nome;
		protected $CPF;
		protected $idade;
		protected $logradouro;
		protected $numero;
		protected $bairro;
		protected $cidade;
		protected $CEP;
		protected $UF;
		
		public function get_nome(){
			return $this->nome;
		}
		public function set_nome($nome){
			$this->nome=$nome;
		}
		public function get_CPF(){
			return $this->CPF;
		}
		public function set_CPF($CPF){
			$this->CPF=$CPF;
		}
		public function get_idade(){
			return $this->idade;
		}
		public function set_idade($idade){
			$this->idade=$idade;
		}
		public function get_logradouro(){
			return $this->logradouro;
		}
		public function set_logradouro($logradouro){
			$this->logradouro=$logradouro;
		}
		public function get_numero(){
			return $this->numero;
		}
		public function set_numero($numero){
			$this->numero=$numero;
		}
		public function get_bairro(){
			return $this->bairro;
		}
		public function set_bairro($bairro){
			$this->bairro=$bairro;
		}
		public function get_cidade(){
			return $this->cidade;
		}
		public function set_cidade($cidade){
			$this->cidade=$cidade;
		}
		public function get_CEP(){
			return $this->CEP;
		}
		public function set_CEP($CEP){
			$this->CEP=$CEP;
		}
		public function get_UF(){
			return $this->UF;
		}
		public function set_UF($UF){
			$this->UF=$UF;
		}
	}

	class Funcionario extends Pessoa{
		private $salario;
		private $quantidadeHora;
		private $valorHora;
		/*
		public function __construct(){
			echo "Criação de Objeto da Classe Funcionario"."<br><br>";
		}
		*/
		private function calculaSalario(){
			return ($this->salario=$this->quantidadeHora*$this->valorHora);
		}
		public function get_salario(){
			return Funcionario::calculaSalario();
		}
		public function set_salario($valor){
			$this->salario=$valor;
		}
		public function get_quantidadeHora(){
			return $this->quantidadeHora;
		}
		public function set_quantidadeHora($valor){
			$this->quantidadeHora=$valor;
		}
		public function get_valorHora(){
			return $this->valorHora;
		}
		public function set_valorHora($valor){
			$this->valorHora=$valor;
		}
	}

	class Cliente extends Pessoa{
		private $cartaCredito;
		private $dataCadastro;
		/*
		public function __construct(){
			echo "Criação de Objeto da Classe Cliente"."<br><br>";
		}
		*/
		public function get_cartaCredito(){
			return $this->cartaCredito;
		}
		public function set_cartaCredito($cartaCredito){
			$this->cartaCredito=$cartaCredito;
		}
		public function get_dataCadastro(){
			return $this->dataCadastro;
		}
		public function set_dataCadastro($dataCadastro){
			$this->dataCadastro=$dataCadastro;
		}
	}
?>