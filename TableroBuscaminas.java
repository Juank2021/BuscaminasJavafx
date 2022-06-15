
public class TableroBuscaminas {
		
Casilla [][] casillas;

int numFilas;
int numColumnas;
int numMinas;



public TableroBuscaminas(int numFilas, int numColumnas, int numMinas) {
	this.numFilas = numFilas;
	this.numColumnas = numColumnas;
	this.numMinas = numMinas;
	inicializarCasillas();
}


public void inicializarCasillas () {
	
	casillas = new Casilla[this.numFilas][this.numColumnas];
	
	for (int i=0; i < casillas.length; i++) {
		
		for (int j = 0; j < casillas[i].length; j++) {
			casillas[i][j]= new Casilla(i,j);
		}
	}
}

private void generarMinas() {
	int minasGeneradas = 0;
	while(minasGeneradas != numMinas) {
		int posTmpFila = (int) (Math.random()* casillas.length);
		int posTmpColumna= (int) (Math.random() * casillas[0].length);
		if (!casillas[posTmpFila] [posTmpColumna].isMina()) {
			casillas[posTmpFila][posTmpColumna].setMina(true);
			minasGeneradas++;
		}
	} 
	
}

}
