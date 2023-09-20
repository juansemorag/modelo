package parcial1;
 import java.util.Scanner;

 
public class main {
	
	private Tablero tablero;
	
	public void principal() {
		this.tablero = new Tablero();
		
	}
	 public static void main(String[] args) {
		 main main=new main();
		 main.iniciar();
		 
	 }
	 
	 private void iniciar() {
		 Scanner sc= new Scanner(System.in);
		 int op;
		 do {
			 System.out.println("Digite una opion\n"
                    +"0.salir\n"
					+"1.mover peon\n"
                    +"2.mover caballo\n"
					+"3.mover torre\n"
					+"4.mover alfin\n"
					+"5.mover rey\n"
					+"6.moverdama\n");
			 op= sc.nextInt();
			
		 
		 }while(op != 0);
		 
	 }

}
