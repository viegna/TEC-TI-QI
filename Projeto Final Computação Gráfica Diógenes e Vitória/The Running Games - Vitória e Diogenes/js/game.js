// Create the canvas
var canvas = document.createElement("canvas");
var ctx = canvas.getContext("2d");
canvas.width = 512;
canvas.height = 480;
document.body.appendChild(canvas);




// Background image
var bgReady = false;
var bgImage = new Image();
bgImage.onload = function () {
	bgReady = true;
	
	
	
};
bgImage.src = "images/rock.jpg";




// Hero image
var heroReady = false;
var heroImage = new Image();
heroImage.onload = function () {
	heroReady = true;
	
	
	
};
heroImage.src = "images/flame.png";

// Monster image
var monsterReady = false;
var monsterImage = new Image();
monsterImage.onload = function () {
	monsterReady = true;
};
monsterImage.src = "images/herodef.png";

// Game objects
var hero = {
	speed: 196 //pixels por segundo - velocidade alterada 
};



var monster = {
	speed: 256 //adicionada velocidade no monstro
	
};

var monstersCaught = 0;

// as keys
var keysDown = {};

addEventListener("keydown", function (e) {
	keysDown[e.keyCode] = true;
}, false);

addEventListener("keyup", function (e) {
	delete keysDown[e.keyCode];
}, false);

// Reinicia o jogo quando o herói pega o goblin
var reset = function () {
	hero.x = canvas.width / 2;
	hero.y = canvas.height / 2;

	// o monstro reaparece na tela aleatoriamente
	monster.x = 32 + (Math.random() * (canvas.width - 64));
	monster.y = 32 + (Math.random() * (canvas.height - 64));
};


var reset1 = function () {

	//  monstro reaparece na tela aleatoriamente
	monster.x = 32 + (Math.random() * (canvas.width - 64));
	monster.y = 32 + (Math.random() * (canvas.height - 64));
};

// movimenta os personagens
var update = function (modifier) {
	if (38 in keysDown && hero.y >=0 ) { // Player // player vai acima
		hero.y -= hero.speed * modifier;
	}
	if (40 in keysDown && hero.y <=canvas.height-64) { // player vai abaixo
		hero.y += hero.speed * modifier;
	}
	if (37 in keysDown && hero.x >=0) { // Player // player vai a esquerda
		hero.x -= hero.speed * modifier;
	}
	if (39 in keysDown && hero.x <=canvas.width-64) { // player vai a direita
		hero.x += hero.speed * modifier;
	}
	// colisão
	if (
		hero.x <= (monster.x + 32)
		&& monster.x <= (hero.x + 32)
		&& hero.y <= (monster.y + 32)
		&& monster.y <= (hero.y + 32)
	) {//coloca audio quando o monstro é pego e aumenta a contagem
		var somPego = new Audio();
		somPego.src = 'sound/plus1.mp3';
		somPego.play();
		++monstersCaught;
		reset1();
	
	}
	
	
	
	if (87 in keysDown && monster.y >=0) { // monster // Player // monster vai acima
		monster.y -= monster.speed * modifier;
	}
	if (83 in keysDown && monster.y <=canvas.height-64) { // monster vai abaixo
		monster.y += monster.speed * modifier;
	}
	if (65 in keysDown && monster.x >=0) { // monster vai a esquerda
		monster.x -= monster.speed * modifier;
	}
	if (68 in keysDown && monster.x <=canvas.width-56) { /// monster vai a direita
		monster.x += monster.speed * modifier;
	}
	// possivel inserção de colisão 
	/* 
if (
		hero.x <= (monster.x + 32)
		&& monster.x <= (hero.x + 32)
		&& hero.y <= (monster.y + 32)
		&& monster.y <= (hero.y + 32)
	) {
		monstersCaught = 0;
		reset();
	}
};*/
	
	
	
};


// desenha tudo
var render = function () {
	if (bgReady) {
		ctx.drawImage(bgImage, 0, 0);
		
	}

	if (heroReady) {
		ctx.drawImage(heroImage, hero.x, hero.y);
		
	}

	if (monsterReady) {//desenha monstro
		ctx.drawImage(monsterImage, monster.x, monster.y);
		
	}
	
	

	// mostra os pontos do herói
	ctx.fillStyle = "rgb(250, 250, 250)";
	ctx.font = "24px Helvetica";
	ctx.textAlign = "left";
	ctx.textBaseline = "top";
	ctx.fillText("Burned Heroes: " + monstersCaught, 160, 32);
	
};

// loop do jogo
var main = function () {
	var now = Date.now();
	var delta = now - then;

	ctx.fillStyle = "rgb(250, 250, 250)";
	ctx.font = "12px Helvetica";
	ctx.textAlign = "center";
	ctx.textBaseline = "right";
	ctx.fillText(" Use the Arrows and W,A,S,D to move ", 20, 20);
	
	// O som de fundo deu bug por alguma razão
	/*var somFundo = new Audio();
		somFundo.src = 'sound/fundo2.mp3';
		somFundo.play();*/
	
	
	update(delta / 1000);
	render();
	then = now;

	// refazer animação
	requestAnimationFrame(main);
	
};

// Cross-browser suporte para requestAnimationFrame
var w = window;
requestAnimationFrame = w.requestAnimationFrame || w.webkitRequestAnimationFrame || w.msRequestAnimationFrame || w.mozRequestAnimationFrame;




// inicia o jogo
var then = Date.now();
reset();
main();
