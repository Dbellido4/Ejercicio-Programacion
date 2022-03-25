Algoritmo sin_titulo
	Escribir "Dime la base y la alura del triangulo"
	Leer x, z
	Escribir "Dime el radio del circulo"
	Leer w
	Escribir "El area del triangulo es:" (x*z)/2
	Escribir "El area del circulo es:" PI*w*w
	Si ((x*z)/2)>(PI*w*w) Entonces
		Escribir "Por tanto el area del triangulo es mayor que el area del circulo"
	SiNo
		Escribir "Por tanto el area del circulo es mayor que el area del triangulo"
	Fin Si
FinAlgoritmo
