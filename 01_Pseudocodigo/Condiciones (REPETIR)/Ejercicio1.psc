Algoritmo sin_titulo
	Repetir
		Escribir "Codigo de usuario:"
		Leer cod
		Escribir "Contraseña de usuario:"
		leer contraseña
		Si cod<>1 & contraseña<>1234 Entonces
			Escribir "Codigo y contraseña incorrecta"
		Fin Si
	Hasta Que cod=1 & contraseña=1234
	Escribir "Bienvenido"
FinAlgoritmo
