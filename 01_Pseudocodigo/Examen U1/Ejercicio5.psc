Algoritmo sin_titulo
	Escribir "Introduzca su sueldo:"
	Leer sueldo
	Escribir "Introduzca los a�os de antiguedad:"
	Leer a�o
	Si sueldo<500 & a�o>=10 Entonces
		Escribir "Usted posee aumento del 20%: " (sueldo*20)/100 + sueldo
	SiNo
		Si sueldo<500 & a�o<10 Entonces
			Escribir "Usted posee aumento del 5%: " (sueldo*5)/100 + sueldo
		SiNo
			Si sueldo>=500 Entonces
				Escribir "Su sueldo no se modifica: " sueldo
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
