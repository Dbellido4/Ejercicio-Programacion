Algoritmo sin_titulo
	Definir x Como Entero
	Escribir "Dime un numero entre 0 y 9999"
	leer x
	Si x>=0 & x<10  Entonces
		Escribir "El" " " x " " "tine una cifra"
	SiNo
		Si x>=0 & x>=10 & x<=99 Entonces
			Escribir "El" " " x " " "tiene dos cifras"
		SiNo
			Si x>=0 & x>99 & x<=999 Entonces
				Escribir "El" " " x " " "tiene tres cifras"
			SiNo
				Si x>=0 & x>999 & x<=9999 Entonces
					Escribir "El" " " x " " "tiene cuatro cifras"
				SiNo
					Escribir "Tiene que ser un numero de cuatro cifras"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
