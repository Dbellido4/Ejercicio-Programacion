Algoritmo sin_titulo
	Escribir "Dime un numero: "
	Leer Num
	c1<-(Num - (Num MOD 100)) / 100
	r1<-Num MOD 100
	c2<-(r1 - (R1 MOD 10)) / 10
	r2<-r1 MOD 10
	Si Num = ((r2 * 100) + (c2 * 10) + C1) Entonces
		Escribir "El numero es capicuo"
	SiNo
		Escribir "El numero no es capicuo"
	Fin Si
FinAlgoritmo
