Algoritmo sin_titulo
	Repetir
		Escribir "Codigo de usuario:"
		Leer cod
		Escribir "Contrase�a de usuario:"
		leer contrase�a
		Si cod<>1 & contrase�a<>1234 Entonces
			Escribir "Codigo y contrase�a incorrecta"
		Fin Si
	Hasta Que cod=1 & contrase�a=1234
	Escribir "Bienvenido"
FinAlgoritmo
