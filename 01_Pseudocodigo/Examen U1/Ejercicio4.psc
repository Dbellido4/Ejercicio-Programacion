Algoritmo sin_titulo
	Definir x,z Como Entero
	Escribir "Dime las coordenadas de un punto:" 
	Leer x, z
	Si (x<>0)&(z<>0) Entonces
		Si (x>0)&(z>0) Entonces
			Escribir "El punto se encuentra ubicado en el 1º Cuadrante"
		SiNo
			Si (x<0)&(z>0) Entonces
				Escribir "El punto se encuentra ubicado en el 2º Cuadrante"
			SiNo
				Escribir "Solo muestra dos cuadrantes"
			Fin Si
		Fin Si
	SiNo
		Escribir "La coordenada no puede ser 0"
	Fin Si
FinAlgoritmo
