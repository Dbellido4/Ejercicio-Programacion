Algoritmo sin_titulo
	Escribir "Dime los valores del primer vector:"
	Dimension datos[3]
	Para x<-1 Hasta 3  Hacer
		Leer datos[x]
	Fin Para
	Escribir "Dime los valores del segundo vector:"
	Dimension datos2[3]
	Para z<-1 Hasta 3  Hacer
		Leer datos2[z]
	Fin Para
	Para i<-1 Hasta 3 Hacer
		a<-datos[1]*datos2[1]
		b<-datos[2]*datos2[2]
		c<-datos[3]*datos2[3]
	Fin Para
	Escribir "Su porducto escalar es: " " (" a ", " b " , " c ") " 
FinAlgoritmo