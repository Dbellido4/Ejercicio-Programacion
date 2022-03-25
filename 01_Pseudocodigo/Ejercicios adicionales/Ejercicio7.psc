Algoritmo sin_titulo
	num1<-natural
	Escribir "Dime un numero de dos cifras"
	Leer num1
	Si num1<=9 Entonces
		num2<-10-num1
		Escribir "El número es de una cifra le falta mínimo " num2 " para ser un número de dos cifras"
	SiNo
		num2<-100-num1
		Escribir "El número es de dos cifras le falta mínimo " num2 " para ser un número de tres cifras"
	Fin Si
FinAlgoritmo
