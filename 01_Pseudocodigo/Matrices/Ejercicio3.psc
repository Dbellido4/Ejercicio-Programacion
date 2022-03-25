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
	Si datos[1]>(total/5) Entonces
        may<-datos[1]
    Sino
		Si datos[2]>(total/5) Entonces
			may<-datos[2]
		SiNo
			Si datos[3]>(total/5) Entonces
				may<-datos[3]
			SiNo
				Si datos[4]>(total/5) Entonces
					may<-datos[4]
				SiNo
					Si datos[5]>(total/5) Entonces
						may<-datos[5]
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
    Escribir "El mayor es: " may
  
FinAlgoritmo
