Algoritmo sin_titulo
	definir x Como Caracter
	Definir z Como Caracter
	Definir w Como Caracter
	Escribir "Dime tres numeros"
	Leer x, z, w
	Si ((x>z)&(x>w))&((z>w)) Entonces
		Escribir x, z, w
	SiNo
		Si ((x>z)&(x>w))&((w>z)) Entonces
			Escribir x, w, z
		SiNo
			Si ((z>x)&(z>w))&((x>w)) Entonces
				Escribir z, x, w
			SiNo
				Si ((z>x)&(z>w))&((w>x)) Entonces
					Escribir z, w, x
				SiNo
					Si ((w>x)&(w>z))&((x>z)) Entonces
						Escribir w, x, z
					SiNo
						Si ((w>x)&(w>z))&((z>x)) Entonces
							Escribir w, z, x
						SiNo
							
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
