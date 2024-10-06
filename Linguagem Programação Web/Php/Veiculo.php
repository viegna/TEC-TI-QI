<?php
	class Veiculo{
		protected $modelo;
		protected $marca;
		protected $placa;
		protected $renavam;
		protected $chassi;
		
		public function get_modelo(){
			return $this->modelo;
		}
		public function set_modelo($modelo){
			$this->modelo=$modelo;
		}
		public function get_marca(){
			return $this->marca;
		}
		public function set_marca($marca){
			$this->marca=$marca;
		}
		public function get_placa(){
			return $this->placa;
		}
		public function set_placa($placa){
			$this->placa=$placa;
		}
		public function get_renavam(){
			return $this->renavam;
		}
		public function set_renavam($renavam){
			$this->renavam=$renavam;
		}
		public function get_chassi(){
			return $this->chassi;
		}
		public function set_chassi($chassi){
			$this->chassi=$chassi;
		}
	}	
	
	class Passeio extends Veiculo{
		private $carro;
		private $moto;
		
		public function get_carro(){
			return $this->carro;
		}
		public function set_carro($carro){
			$this->carro=$carro;
		}
		public function get_moto(){
			return $this->moto;
		}
		public function set_moto($moto){
			$this->moto=$moto;
		}
	}
	
	class Utilitario extends Veiculo{
		private $esportivo;
		private $tradicional;
		
		public function get_esportivo(){
			return $this->esportivo;
		}
		public function set_esportivo($esportivo){
			$this->esportivo=$esportivo;
		}
		
		public function get_tradicional(){
			return $this->tradicional;
		}
		public function set_tradicional($tradicional){
			$this->tradicional=$tradicional;
		}
	}