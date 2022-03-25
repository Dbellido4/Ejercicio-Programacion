Algoritmo Ejercicio2 
	Escribir "MENU DE OPCIONES"
	Escribir "1. Operaciones basicas"
	Escribir "2. Operaciones variadas"
	Escribir "0.SALIR"
	Escribir "Introduce una opcion: "
	Leer menu_opciones
	Repetir
		Mientras menu_opciones=1
			Escribir "MENU DE OPERACIONES BASICAS"
			Escribir "1. Sumar dos numeros"
			Escribir "2. Restar dos numeros"
			Escribir "3. Multiplicar dos numeros"
			Escribir "4. Dividir dos numeros"
			Escribir "0. Salir"
			Escribir "Introduce una opcion: "
			Leer menu1
			Mientras menu1<>0
				Escribir "Introduce el primer numero"
				Leer num1
				Escribir "Introduce el segundo numero"
				Leer num2
				Segun menu1 Hacer
					1:
						Escribir "Resultado: " suma(num1,num2)
					2:
						Escribir "Resultado: " resta(num1,num2)
					3:
						Escribir "Resultado: " multiplicacion(num1,num2)
					4:
						Escribir "Resultado: " division(num1,num2)
				Fin Segun
				Escribir "MENU DE OPERACIONES BASICAS"
				Escribir "1. Sumar dos numeros"
				Escribir "2. Restar dos numeros"
				Escribir "3. Multiplicar dos numeros"
				Escribir "4. Dividir dos numeros"
				Escribir "0. Salir"
				Escribir "Introduce una opcion: "
				Leer menu1
			FinMientras
		FinMientras
Hasta Que manu_opciones=0


Repetir
		Mientras menu_opciones=2
			Escribir "MENU DE OPERACIONES VARIADAS"
			Escribir "1. Numero y dia"
			Escribir "2. Suma de los primero n numeros naturales"
			Escribir "3. Numero Primo"
			Escribir "4. Invertir un numero de 4 cifras"
			Escribir "0. Salir"
			Escribir "Introduce una opcion: "
			Leer menu2
			Mientras menu2<>0
				Segun menu2 Hacer
					1:
						Escribir "CONVIERTE NUMERO A DIA"
						Escribir "Introduce numero de dia"
						Leer num
						Escribir dia(num)
						
					2:
						Escribir "SUMA DE LOS PRIMEROS N NUMEROS"
						Escribir "Introduce numero n"
						Leer num
						Para n<-1 Hasta num  Hacer
							total<-total+n
						Fin Para
						Escribir "La suma de los primeros numeros es: " total
					3:
						Escribir "Introduce un numero"
						Leer p
						c=0
						Para n<-1 Hasta p Hacer
							Si p%n=0 Entonces
								c=c+1
							Fin Si
						Fin Para
						Si c=2 Entonces
							Escribir "El numero " p " es primo"
						SiNo
							Escribir "El numero " p " no es primo"
						Fin Si
					4:
						Escribir "INVERTIR UN NUMERO DE 4 CIFRAS"
						Escribir "Introduzca el numero:"
						Leer z
				Fin Segun
				Escribir "MENU DE OPERACIONES VARIADAS"
				Escribir "1. Numero y dia"
				Escribir "2. Suma de los primero n numeros naturales"
				Escribir "3. Numero Primo"
				Escribir "4. Invertir un numero de 4 cifras"
				Escribir "0. Salir"
				Escribir "Introduce una opcion: "
				Leer menu2
			FinMientras
		FinMientras
	Hasta Que menu_opciones=0
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
SubAlgoritmo resultado<-dia(num)
	Segun num Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miercoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sabado"
		7:
			Escribir "Domingo"
	Fin Segun
FinSubAlgoritmo
	