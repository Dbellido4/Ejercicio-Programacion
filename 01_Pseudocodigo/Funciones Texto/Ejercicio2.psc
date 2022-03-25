Algoritmo sin_titulo
	Escribir "Dime tu nombre"
	Leer nombre
	Para i<-1 Hasta longitud(nombre) Hacer
		p<-subcadena(nombre,i,i)
		Si i%2=0 Entonces
			Escribir Sin Saltar Mayusculas(p)
		Sino
			Escribir Sin Saltar Minusculas(p)
		finsi
	Fin Para
	Escribir ""
FinAlgoritmo
