Algoritmo sin_titulo
	Definir num1, cen, res, dec, unid como Entero;
    Escribir "Dime un numero de tres crifras: "
    Leer num1
    cen<-(num1 - (num1 MOD 100))/100
    res<-num1 MOD 100
    dec<-(res - (res MOD 10))/10
    unid<-res MOD 10 
    Escribir "Centena : ", cen "00"
    Escribir "Decena : ", dec "0"
    Escribir "Unidad : ", unid
FinAlgoritmo
