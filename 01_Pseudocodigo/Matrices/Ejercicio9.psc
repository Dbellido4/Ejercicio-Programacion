Algoritmo sin_titulo
	Dimension datos[2,2]
	Para x<-1 Hasta 2 Hacer
		Para z<-1 Hasta 2 Hacer
			leer datos[x,z]
		Fin Para
	FinPara
	Escribir "El determinantes es: " (datos[1,1]*datos[2,1])-(datos[1,2]*datos[2,2])
FinAlgoritmo
