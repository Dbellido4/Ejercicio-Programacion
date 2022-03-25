Algoritmo Ejercicio3
	Escribir "Introduzca la frase"
	Leer frase
	Para x<-longitud(frase) Hasta 1 Hacer
		n<-subcadena(frase,i,i)
	Fin Para
	Para x<-1 Hasta longitud(frase) Hacer
		n2<-subcadena(frase,i,i)
	Fin Para
	Si n=n2 Entonces
		Escribir "La frase es palindroma"
	SiNo
		Escribir "La frase no es palindroma"
	Fin Si
FinAlgoritmo
