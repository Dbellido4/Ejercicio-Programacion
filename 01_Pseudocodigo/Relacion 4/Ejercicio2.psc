Algoritmo sin_titulo
	Definir sumar, restar, multiplicar, dividir Como cadena
	Definir operacion como numero
	Escribir "Dime dos numero"
	Leer num1, num2
	Escribir "¿Que operacion desea?"
	Escribir "1. Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Leer operacion
	Segun operacion Hacer
		1:
			Escribir num1 + num2
		2:
			Escribir num1-num2
		3:
			Escribir num1*num2
		4:
			Escribir num1/num2
		De Otro Modo:
			Escribir "Opcion incorrecta"
	Fin Segun
FinAlgoritmo
