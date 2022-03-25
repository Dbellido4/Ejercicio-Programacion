Algoritmo sin_titulo
	definir letra como caracter
	Escribir "Ingrese una frase"
    Leer frase
	frase<-Minusculas(frase)
    cont<-0
    Para i<-1 hasta Longitud(frase) Hacer
		Si Subcadena(frase,i,i)= " " Entonces
			cont=cont+1
		FinSi
    FinPara
    Escribir "Las palabras encontradas en la frase son: ", cont+1
FinAlgoritmo
