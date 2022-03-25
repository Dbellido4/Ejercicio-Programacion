Algoritmo Ejercicio1
	Escribir "MENU DE OPCIONES"
	Escribir "1. Sumar dos numeros"
	Escribir "2. Restar dos numeros"
	Escribir "3. Multiplicar dos numeros"
	Escribir "4. Dividir dos numeros"
	Escribir "0. Salir"
	Escribir "Introduce una opcion: "
	Leer menu
	Repetir
		Mientras menu<>0
			Escribir "Introduce el primer numero"
			Leer num1
			Escribir "Introduce el segundo numero"
			Leer num2
			Segun menu Hacer
				1:
					Escribir "Resultado: " suma(num1,num2)
				2:
					Escribir "Resultado: " resta(num1,num2)
				3:
					Escribir "Resultado: " multiplicacion(num1,num2)
				4:
					Escribir "Resultado: " division(num1,num2)
			Fin Segun
			Escribir "MENU DE OPCIONES"
			Escribir "1. Sumar dos numeros"
			Escribir "2. Restar dos numeros"
			Escribir "3. Multiplicar dos numeros"
			Escribir "4. Dividir dos numeros"
			Escribir "0. Salir"
			Escribir "Introduce una opcion: "
			Leer menu
	FinMientras
Hasta Que menu = 0
FinAlgoritmo
SubAlgoritmo resultado1<-suma(num1,num2)
	resultado1<-(num1+num2)
FinSubAlgoritmo
SubAlgoritmo resultado2<-resta(num1,num2)
	resultado2<-(num1-num2)
FinSubAlgoritmo
SubAlgoritmo resultado3<-multiplicacion(num1,num2)
	resultado3<-(num1*num2)
FinSubAlgoritmo
SubAlgoritmo resultado4<-division(num1,num2)
	resultado4<-(num1/num2)
FinSubAlgoritmo
