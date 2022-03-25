Algoritmo sin_titulo
	Escribir "Dime dos numeros"
	Leer PrimerNumero
	Leer SegundoNumero
	Si PrimerNumero > 0 & SegundoNumero > 0 Entonces
		Escribir "Los numeros son positivos"
	SiNo
		Si PrimerNumero > 0 & SegundoNumero < 0 Entonces
			Escribir "El primer numero es positivo y el segundo es negativo"
		SiNo
			Si PrimerNumero < 0 & SegundoNumero > 0 Entonces
				Escribir "El primer numero es negativo y el segundo positivo"
			SiNo
				Escribir "Los dos numero son negativos"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
