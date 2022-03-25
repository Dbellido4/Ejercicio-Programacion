Algoritmo sin_titulo
	Escribir "Dime 7 numeros: "
	Dimension datos[7]
	Para x<-1 Hasta 7  Hacer
		Leer datos[x]
	Fin Para
	z=datos[1]
	Para x<-1 Hasta 7  Hacer
		Si datos[x]>z Entonces
			z<-datos[x]
		Fin Si
	Fin Para
	Escribir z
FinAlgoritmo
