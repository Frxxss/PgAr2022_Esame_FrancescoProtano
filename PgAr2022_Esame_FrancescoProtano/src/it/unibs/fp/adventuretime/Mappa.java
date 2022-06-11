package it.unibs.fp.adventuretime;
/**
 * La classe mappa genera la mappa graficamente e rende possibile il movimento.
 * @author Francesco
 *
 */
public class Mappa {
	char[][] mappa = new char[22][31];
	
	LetturaXML leggiMap = new LetturaXML();
	
	public char[][] getMappa() {
		return mappa;
	}



	public void setMappa(char[][] mappa) {
		this.mappa = mappa;
	}
	
	

	public void leggiMappa(String livello) {
		setMappa(LetturaXML.leggiMappaXML(livello));
		
	}
	public void stampaMappa() {
		for(int i = 0; i < 22 ; i++) {
			for(int j =0 ; j < 31 ; j++) {
				System.out.print(getMappa()[i][j] + "  ");
				if(getMappa()[i][j] == 'S')  {
					mappa[i][j] = '.';
					setMappa(mappa);
				}
				else if(getMappa()[i][j] == 'P')  {
					mappa[i][j] = '.';
					setMappa(mappa);
				}
				else if(getMappa()[i][j] == 'T')  {
					mappa[i][j] = '.';
					setMappa(mappa);
				}
				else	if(getMappa()[i][j] == 't')  {
					mappa[i][j] = '.';
					setMappa(mappa);
				}
				else if(getMappa()[i][j] == 'p')  {
					mappa[i][j] = '.';
					setMappa(mappa);
				}
			}
			System.out.println("  \n");
		}
		
}
	
	
	public void destra(Personaggio P) {
		for(int i = 0; i<22 ; i++) {
			for(int j =0; j<31; j++) {
				if(getMappa()[i][j] == 'O') {
					if(mappa[i][j+1] == '#' || j-1 < 0|| j+1 > 31) {
						System.out.println("Un muro!");
						mappa[i][j] = 'O';
						setMappa(mappa);
						break;
					}
					else if(mappa[i][j+1] == 'M') {
						System.out.println("Un mostro!\n");
						Fight lotta = new Fight();
						lotta.sceltaArma(P);
						Mostro M = lotta.generaMostro();
						boolean win;
						win = lotta.generaScontro(P,M);
						
						if(win == true) {
							System.out.println("Puoi proseguire.");
							mappa[i][j+1] = 'O';
							mappa[i][j] = '.';
							setMappa(mappa);
						}
						else if(win == false) break;
						else if(mappa[i][j+1] == 'C') {
							Chest cesta = new Chest();
							cesta.aperturaChest(P);
							mappa[i][j+1] = 'O';
							mappa[i][j]='.';
							setMappa(mappa);
						}
						
						
					}
					else {
					mappa[i][j+1] ='O';
					mappa[i][j] = '.';
					stampaMappa();
					break;
					
					}
				}
			}
		}
	}
	public void dritto(Personaggio P) {
		for(int i = 0; i<22 ; i++) {
			for(int j =0; j<31; j++) {
				if(getMappa()[i][j] == 'O') {
					if(mappa[i-1][j] == '#' || i-1 <0|| i+1 > 22) {
						System.out.println("Un muro!");
						mappa[i][j] = 'O';
						setMappa(mappa);
						break;
					}
					else if(mappa[i-1][j] == 'M') {
						System.out.println("Un mostro!\n");
						Fight lotta = new Fight();
						lotta.sceltaArma(P);
						Mostro M = lotta.generaMostro();
						boolean win;
						win = lotta.generaScontro(P,M);
						
						if(win == true) {
							System.out.println("Puoi proseguire.");
							mappa[i-1][j] = 'O';
							mappa[i][j] = '.';
							setMappa(mappa);
						}
						else if(win == false) break;
						else if(mappa[i-1][j] == 'C') {
							Chest cesta = new Chest();
							cesta.aperturaChest(P);
							mappa[i-1][j] = 'O';
							mappa[i][j]='.';
							setMappa(mappa);
						}
						
						
					}
					else {
					mappa[i-1][j] ='O';
					mappa[i][j] = '.';
					stampaMappa();
					break;
					
					}
				}
			}
		}
	}
	public void indietro(Personaggio P) {
		for(int i = 0; i<22 ; i++) {
			for(int j =0; j<31; j++) {
				if(getMappa()[i][j] == 'O') {
					if(mappa[i+1][j] == '#' || i-1 < 0|| i+1 > 22) {
						System.out.println("Un muro!");
						mappa[i][j] = 'O';
						setMappa(mappa);
						break;
					}
					else if(mappa[i+1][j] == 'M') {
						System.out.println("Un mostro!\n");
						Fight lotta = new Fight();
						lotta.sceltaArma(P);
						Mostro M = lotta.generaMostro();
						boolean win;
						win = lotta.generaScontro(P,M);
						
						if(win == true) {
							System.out.println("Puoi proseguire.");
							mappa[i+1][j] = 'O';
							mappa[i][j] = '.';
							setMappa(mappa);
						}
						else if(win == false) break;
						else if(mappa[i+1][j] == 'C') {
							Chest cesta = new Chest();
							cesta.aperturaChest(P);
							mappa[i+1][j] = 'O';
							mappa[i][j]='.';
							setMappa(mappa);
						}
						
						
					}
					else {
					mappa[i+1][j] ='O';
					mappa[i][j] = '.';
					stampaMappa();
					break;
					
					}
				}
			}
		}
	}
	public void sinistra(Personaggio P) {
		for(int i = 0; i<22 ; i++) {
			for(int j =0; j<31; j++) {
				if(getMappa()[i][j] == 'O') {
					if(mappa[j-1][j] == '#' || j-1 < 0|| j+1 >31) {
						System.out.println("Un muro!");
						mappa[i][j] = 'O';
						setMappa(mappa);
						break;
					}
					else if(mappa[j-1][j] == 'M') {
						System.out.println("Un mostro!\n");
						Fight lotta = new Fight();
						lotta.sceltaArma(P);
						Mostro M = lotta.generaMostro();
						boolean win;
						win = lotta.generaScontro(P,M);
						
						if(win == true) {
							System.out.println("Puoi proseguire.");
							mappa[j-1][j] = 'O';
							mappa[i][j] = '.';
							setMappa(mappa);
						}
						else if(win == false) break;
						else if(mappa[i]j-1] == 'C') {
							Chest cesta = new Chest();
							cesta.aperturaChest(P);
							mappa[i][j-1] = 'O';
							mappa[i][j]='.';
							setMappa(mappa);
						}
						
						
					}
					else {
					mappa[i-1][j] ='O';
					mappa[i][j] = '.';
					stampaMappa();
					break;
					
					}
				}
			}
		}
	}
}


