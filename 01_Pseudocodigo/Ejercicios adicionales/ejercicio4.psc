Algoritmo sin_titulo
	definir edad, diaActual, mesActual, a�oActual como entero
	definir diaNacimiento, mesNacimiento, a�oNacimiento como entero
	Escribir "Dime la fecha actual"
	Leer diaActual, mesActual, a�oActual
	Escribir "Dime tu fecha de nacimiento"
	Leer diaNacimiento, mesNacimiento, a�oNacimiento
	edad<-a�oActual-a�oNacimiento
	Si mesNacimiento>mesActual Entonces
		edad<-edad-1
	SiNo
		Si mesNacimiento=mesActual Entonces
			Si diaNacimiento>diaActual Entonces
				edad<-edad-1
			Fin Si
			Si diaNacimiento=diaActual Entonces
				Escribir "Felicidades por tu cumplea�os"
			Fin Si
		Fin Si
	Fin Si
	Escribir "Tu edad actual es: " edad
	finAlgoritmo
