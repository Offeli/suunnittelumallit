package chain_method;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChainMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner s = new Scanner(new InputStreamReader(System.in));
		
        AliJohtaja aj = new AliJohtaja();
        YliJohtaja yj = new YliJohtaja();
        CEO ceo = new CEO();

        aj.setHandler(yj);
        yj.setHandler(ceo);
        
        while(true) {
        	System.out.println("Kirjoita palkkasi");
        	int i = s.nextInt();
        	System.out.println("Kirjoita palkkapyyntösi");
        	double d = s.nextDouble();
        	System.out.println("Anna hyvä syy");
        	String y = s.next();
        	
        	aj.prosessoiPyyntö(new PalkkaPyyntö(i, d, y));   	
        }
	}

}
