Algoritmo sin_titulo
	Definir PrimerNumero Como Entero
	Definir SegundoNumero Como Entero
	Escribir "Dime dos numeros"
	Leer PrimerNumero
	Leer SegundoNumero
	Si PrimerNumero%SegundoNumero=0 Entonces
		escribir "El numero" " " PrimerNumero " " "es multiplo de" " " SegundoNumero
	SiNo
		Si SegundoNumero%PrimerNumero=0 Entonces
			Escribir "El numero" " " SegundoNumero " " "es multiplo de" " " PrimerNumero
		SiNo
			Escribir "Ninguno de los numero son multiples del otro"
		Fin Si
	Fin Si
FinAlgoritmo
