Algoritmo sin_titulo
	Dimension datos[10,2]
	Para x<-1 Hasta 10 Hacer
		Para z<-1 Hasta 2 Hacer
			leer datos[x,z]
		Fin Para
	Fin Para
	i=0
	j=0
	Para x<-1 Hasta 10  Hacer
			Para z<-1 Hasta 2 Hacer
			Si datos[x,z]>i Entonces
				i<-datos[x,z]
			Fin Si
			FinPara
	Fin Para
	Para x<-1 Hasta 10  Hacer
		Para z<-1 Hasta 2 Hacer
			Si datos[x,z]>j Entonces
				j<-datos[x,z]
			Fin Si
		FinPara
	Fin Para
Escribir "El numero mayor del primer bloque es: " i
Escribir "El numero mayor del segundo bloque es: " j
FinAlgoritmo
