Algoritmo sin_titulo
	Escribir "Dime cinco datos:"
	Dimension datos[5]
	Para x<-1 Hasta 5  Hacer
		Leer datos[x]
	Fin Para
	Para x<-1 Hasta 5 Hacer
		total<-total + datos[x]
	Fin Para
	Escribir "El promedio es: " total/5
FinAlgoritmo
