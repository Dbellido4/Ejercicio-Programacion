Algoritmo sin_titulo
	Dimension datos[3,3]
	Para x<-1 Hasta 3 Hacer
		Para z<-1 Hasta 3 Hacer
				Leer datos[x,z]
			Fin Para
		Fin Para
		Escribir "El determinantes es: " ((datos[1,1]*datos[2,2]*datos[3,3])+(datos[2,1]*datos[3,2]*datos[1,3])+(datos[1,2]*datos[2,3]*datos[3,1]))-((datos[3,1]*datos[2,1]*datos[1,1])+(datos[2,1]*datos[1,2]*datos[3,1])+(datos[3,2]*datos[2,3]*datos[1,1]))
FinAlgoritmo
