package funcPrimitivaRecursiva;

/**
 * @author Sofía Pizarro - alu0100831696
 * @category CC - Práctica3 - Producto - Función Primitiva Recursiva
 * @date 09/11/2017
 * @class ProductoPrimRec
 **/

public class ProductoPrimRec {

	// Función Nula o Cero: z(x) = 0 € N 
	public int z (int x){
		return 0;
	}

	// Función Sucesor o Siguiente: s(x) = x+1 € N 
	public int s (int x){
		return x+1;
	}

	// Función Predecesor: s(x) = x-1 € N 
	public int pred (int x){
		if (x == 0){
			return z(x);
		} else {
			int [] op = {x-1, pred (x-1)};
			return p(1, op);
		}
	}

	// Función Proyección: Pin(x1,...,xn) = xi,n >= 1,1 <= i <= n
	public int p (int i, int[] n){
		return n[i-1];
	}

	// Función Identidad: P1
	public int identidad (int x){
		return s(z(x));
	}

	// Función Suma: suma (x, y) x+y
	public int suma (int x, int y){
		if (y == 0){
			return x;
		}  else {
			int [] op = {x, y-1, suma (x, y-1)};
			return s(p(3, op));
		}
	}

	// Función Resta: resta (x, y) x-y
	public int resta (int x, int y) {
		if (y == 0){
			return x;
		} else {
			int [] op = {x, y-1, resta (x, y-1)};
			return pred(p(3, op));
		}
	}

	// Función Producto: prod (x, y)
	public int producto (int x, int y){
		if (y == 0){
			return z(x);
		} else {
			int [] op = {x, y-1, producto (x, y-1)};
			return suma (p(1, op) ,p(3, op));
		}
	}

	// Función Potencia: pot (x, y)
	public int potencia (int x, int y){
		if (y == 0){
			return identidad (x);
		} else {
			int [] op = {x, y-1, potencia (x, y-1)};
			return producto (p(1, op) ,p(3, op));
		}
	}

	// Función factorial: fact(x) 
	public int factorial (int x){
		if (x == 0){
			return identidad (x);
		} else {
			int [] op = {x-1, factorial (x-1)};
			return producto (s(p(1, op)) ,p(2, op));
		}
	}
	// Signo (x) 1 si x > 0 
	//0 si x < 0
	public int signo (int x){
		if (x == 0){
			return z(x);
		} else {
			int [] op = {x-1, factorial (x-1)};
			return identidad(p(1, op));
		}
	}

	// not (x) 
	public int not (int x){
		if (x == 0){
			return identidad (x);
		} else {
			int [] op = {x-1, factorial (x-1)};
			return z(p(1, op));
		}
	}

	// diferencia en valor absoluto entre x e y
	public int difabs (int x, int y){
		int [] op = {x, y};
		return suma(resta(p(1,op), p(2, op)), resta (p(2,op), p(1, op)));
	}

	// devuelve 1 si x e y son iguales, 0 en caso contrario
	public int igual (int x, int y){
		int [] op = {x, y};
		return not(difabs(p(1,op),p(2,op)));
	}

	// devuelve 1 si x<= que y, 0 en caso contrario
	public int menorigual (int x, int y){
		int [] op = {x, y};
		return not(resta(p(1,op),p(2,op)));
	}

	// devuelve 1 si x > que y, 0 en caso contrario
	public int mayor (int x, int y){
		int [] op = {x, y};
		return not(menorigual(p(1,op),p(2,op)));
	}


	// Función minimizar: f1(x, y) = x + y, si x > y f1(x, y) = y – x, si x ≤ y
	public int f1 (int x, int y) {
		int [] op = {x, y};
		return suma(producto(mayor(p(1,op),p(2,op)),suma(p(1,op),p(2,op))),
				producto(menorigual(p(1,op),p(2,op)),resta(p(2,op),p(1,op))));
	}
}