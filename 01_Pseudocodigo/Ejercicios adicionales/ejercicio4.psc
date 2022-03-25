Algoritmo sin_titulo
	definir edad, diaActual, mesActual, añoActual como entero
	definir diaNacimiento, mesNacimiento, añoNacimiento como entero
	Escribir "Dime la fecha actual"
	Leer diaActual, mesActual, añoActual
	Escribir "Dime tu fecha de nacimiento"
	Leer diaNacimiento, mesNacimiento, añoNacimiento
	edad<-añoActual-añoNacimiento
	Si mesNacimiento>mesActual Entonces
		edad<-edad-1
	SiNo
		Si mesNacimiento=mesActual Entonces
			Si diaNacimiento>diaActual Entonces
				edad<-edad-1
			Fin Si
			Si diaNacimiento=diaActual Entonces
				Escribir "Felicidades por tu cumpleaños"
			Fin Si
		Fin Si
	Fin Si
	Escribir "Tu edad actual es: " edad
	finAlgoritmo
