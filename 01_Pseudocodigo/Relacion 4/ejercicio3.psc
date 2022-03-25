Algoritmo ejercicio3
	Definir num1, num2 Como Cadena
	Escribir "¿Cuantos has sacado en la primera tirada?"
	Leer num1
	Segun num1 Hacer
		"uno":
			total<-total+1
		"dos":
			total<-total+2
		"tres":
			total<-total+3
		"cuatro":
			total<-total+4
		"cinco":
			total<-total+5
		"seis":
			total<-total+6
		De Otro Modo
			Escribir "La tirada no es valida"
	Fin Segun
	Escribir "¿Cuantos has sacado en la segunda tirada?"
	Leer num2
	Segun num2 Hacer
		"uno":
			total<-total+1
		"dos":
			total<-total+2
		"tres":
			total<-total+3
		"cuatro":
			total<-total+4
		"cinco":
			total<-total+5
		"seis":
			total<-total+6
			De Otro Modo
			Escribir "La tirada no es valida"
	Fin Segun
	Escribir "La suma de las dos tiradas es:" " " total
FinAlgoritmo
