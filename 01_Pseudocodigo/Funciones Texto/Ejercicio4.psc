Algoritmo sin_titulo
	Escribir "Dime tu nombre"
	Leer nombre
	vocales<-"a, e, i, o, u"
	Para i<-1 Hasta Longitud(nombre) Hacer
		Para x<-1 Hasta Longitud(vocales) Con Paso 1 Hacer
			Si Subcadena(nombre,i,i)=Subcadena(vocales,x,x) Entonces
				cont<-cont+1
				Escribir Subcadena(nombre,i,i) Sin Saltar," "
			Fin Si
		Fin Para
	Fin Para
FinAlgoritmo
