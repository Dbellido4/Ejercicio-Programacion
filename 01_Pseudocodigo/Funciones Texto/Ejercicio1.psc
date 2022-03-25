Algoritmo sin_titulo
    Escribir "Dime tu nombre"
    Leer nombre
    Escribir "Tu nombre al reves quedaria, quedaría:"
    Para x <- Longitud(nombre) Hasta  1 Con Paso -1 Hacer
        Escribir Sin Saltar  Subcadena(nombre, x, x)
    FinPara
	Escribir ""
FinAlgoritmo