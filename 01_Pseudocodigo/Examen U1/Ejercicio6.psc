Algoritmo sin_titulo
	Escribir "Introduzca la cantidad total de preguntas realizadas:" 
	Leer preguntas
	Escribir "Introduzca la cantidad de preguntas correctas:"
	Leer correctas
	Si correctas<((preguntas*50)/100) Entonces
		Escribir "Fuera de nivel"
	SiNo
		Si correctas>=((preguntas*50)/100) & correctas<((preguntas*75)/100) Entonces
			Escribir "Nivel regular"
		SiNo
			Si correctas>=((preguntas*75)/100) & correctas<((preguntas*90)/100) Entonces
				Escribir "Nivel medio"
			SiNo
				Si correctas>=((preguntas*90)/100) Entonces
					Escribir "Nivel maximo"
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
