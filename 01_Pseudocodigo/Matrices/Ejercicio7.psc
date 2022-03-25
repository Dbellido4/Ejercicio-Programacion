Algoritmo sin_titulo
	Dimension datos[10]
		datos[1]<-1
		datos[2]<-1
		datos[3]<-1
		datos[4]<-6
		datos[5]<-5
		datos[6]<-22
		datos[7]<-44
		datos[8]<-5
		datos[9]<-8
		datos[10]<-7
	Escribir "¿Que dato desea buscar?"
	Leer x
	cont<-0
	Para i<-1 Hasta 10 Hacer
		Si datos[i]=x Entonces
			cont<-cont+1
		Fin Si
	Fin Para
	Si cont>0 Entonces
		Escribir "El dato se ha encontrado " cont " veces"
	SiNo
		Escribir "El dato no aparece"
	Fin Si
FinAlgoritmo
