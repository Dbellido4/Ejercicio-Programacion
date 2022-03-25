Algoritmo sin_titulo
	Definir PrimerNumero Como Entero
	Definir SegundoNumero Como Entero
	Escribir "Dime dos numeros"
	Leer PrimerNumero
	Leer SegundoNumero
	Si PrimerNumero > SegundoNumero Entonces
		Escribir "El numero" " " PrimerNumero " " "es mayor que" " " SegundoNumero
	SiNo
		Si SegundoNumero > PrimerNumero Entonces
			Escribir "El numero" " " SegundoNumero " " "es mayor que" " " PrimerNumero
		SiNo
			Escribir "Los dos numeros son iguales"
		Fin Si
	Fin Si
FinAlgoritmo
