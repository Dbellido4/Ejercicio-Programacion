Algoritmo sin_titulo
	num1<-natural
	Escribir "Dime un numero de dos cifras"
	Leer num1
	Si num1<=9 Entonces
		num2<-10-num1
		Escribir "El n�mero es de una cifra le falta m�nimo " num2 " para ser un n�mero de dos cifras"
	SiNo
		num2<-100-num1
		Escribir "El n�mero es de dos cifras le falta m�nimo " num2 " para ser un n�mero de tres cifras"
	Fin Si
FinAlgoritmo
