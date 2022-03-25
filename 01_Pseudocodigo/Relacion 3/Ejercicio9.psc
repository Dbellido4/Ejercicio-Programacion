Algoritmo sin_titulo
	Definir x, z, w Como Entero
	Escribir "Dime tres numero"
	Leer x, z, w
	Si x+z=w Entonces
		Escribir "La suma de" " " x " " "+" " " z " " "=" " " w
	SiNo
		Si x+w=z Entonces
			Escribir "La suma de" " " x " " "+" " " w " " "=" " " z
		SiNo
			Si z+w=x Entonces
				Escribir "La suma de" " " z " " "+" " " w " " "=" " " x
			SiNo
				Escribir "Ninguna suma es el resultado de otro numero"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
