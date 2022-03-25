Algoritmo sin_titulo
	Escribir "Dime tres numeros"
	Leer PrimerNumero
	Leer SegundoNumero
	Leer TercerNumero
	Si ((PrimerNumero > SegundoNumero) & (PrimerNumero > TercerNumero)) Entonces
		Escribir "EL" " " PrimerNumero " " "es el mayor"
	SiNo
			Si ((SegundoNumero > PrimerNumero) & (SegundoNumero > TercerNumero)) Entonces
			Escribir "El" " " SegundoNumero " " "es el mayor"
		SiNo
				Si ((TercerNumero > SegundoNumero) & (TercerNumero > PrimerNumero)) Entonces
				Escribir "El" " " TercerNumero " " "es el mayor"
			SiNo
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
