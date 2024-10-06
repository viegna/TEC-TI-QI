public class JogoSorte {
    public byte numeroSorteado1;
    public byte numeroSorteado2;
    public byte numeroSorteado3;
    //set e get
    
    //to string
    
    public void jogar(){
          this.numeroSorteado1 = (byte) (Math.random()*3+1);
          this.numeroSorteado2 = (byte) (Math.random()*3+1);
          this.numeroSorteado3 = (byte) (Math.random()*3+1);
    }
    
    public boolean verSeGanhou(){
        if(this.numeroSorteado1==this.numeroSorteado2&&this.numeroSorteado3==this.numeroSorteado1){
            return true;
        }else{
            return false;
        }
    }
        
        
        //
 

        public String toString() {
            String desenho1;
            if(this.numeroSorteado1==1){
                desenho1 = " ♥ ";
            }else if(this.numeroSorteado1==2){
                desenho1 = " ☻ ";
            }else{
                desenho1 = " ☼ ";
            }
            String desenho2;
            if(this.numeroSorteado2==1){
                desenho2 = " ♥ ";
            }else if(this.numeroSorteado2==2){
                desenho2 = " ☻ ";
            }else{
                desenho2 = " ☼ ";
            }
            String desenho3;
            if(this.numeroSorteado3==1){
                desenho3 = " ♥ ";
            }else if(this.numeroSorteado3==2){
                desenho3 = " ☻ ";
            }else{
                desenho3 = " ☼ ";
            }
            return "\nNumeros Sorteado: " +desenho1 + " - " + desenho2 + " - " + desenho3;
        
        }
    }