Algoritmo sin_titulo
	Definir x Como Real
	Escribir "Dime un numero"
	Leer x
	Si x>=0 & x<5 Entonces
		Escribir x " " "es INSUFICIENTE"
	SiNo
		Si x>=5 & x<6 Entonces
			Escribir x " " "es SUFICIENTE"
		SiNo
			Si x>=6 & x<7 Entonces
				Escribir x " " "es un BIEN"
			SiNo
				Si x>=7 & x<9 Entonces
					Escribir x " " "es un NOTABLE"
				SiNo
					Escribir x " " "es SOBRESALIENTE"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
