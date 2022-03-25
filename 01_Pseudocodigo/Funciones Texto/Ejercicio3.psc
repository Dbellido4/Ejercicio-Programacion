Algoritmo sin_titulo
	Definir x Como Caracter
	Escribir "Dime tu nombre"
	Leer nombre
	n<-Longitud(nombre)
	cont<-1
	v<-0
	c<-0
	Mientras cont<=n Hacer
		Segun Subcadena(nombre,cont,cont) Hacer
			"a" o "A":
				v=v+1
			"e" o "E":
				v=v+1
			"i" o "I":
				v=v+1
			"o" o "O":
				v=v+1
			"u" o "U":
				v=v+1
			De Otro Modo:
				c=c+1
		Fin Segun
		cont=cont+1
	Fin Mientras
	Escribir "El nombre " nombre " tiene " v " vocales"
FinAlgoritmo
