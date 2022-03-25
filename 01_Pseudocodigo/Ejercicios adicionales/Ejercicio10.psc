Algoritmo sin_titulo
	Definir num1, z, cont como Entero
    Definir r, d, suma como Real
    Escribir "Dime un numero: "
    Leer num1
    z<-0
    cont<-1
    suma<-0
    Si num1<10 Entonces
        Escribir num1
    SiNo
		Mientras z=0 Hacer			
			Si num1>(cont * 10) Entonces
				cont<-cont * 10
			SiNo
				z<-1
			FinSi				
		FinMientras
		Mientras (num1 > 10) Hacer
			r <-num1 MOD cont
			d<-(num1 - r)/ cont
			suma<-suma + d
			num1<-r
			cont<-cont / 10
		FinMientras		
        Escribir "La suma de las cifras son " suma + r
    FinSi
FinAlgoritmo
