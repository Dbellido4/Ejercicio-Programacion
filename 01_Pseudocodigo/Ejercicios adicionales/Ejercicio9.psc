Algoritmo sin_titulo
	Definir nom, nombre como Caracter
    Definir prom_may, promedio, cont como Entero
    prom_may<-0
    Para Cont<-1 Hasta 5 Con Paso 1  Hacer
        Escribir "Dime un nombre ", Cont , " : "
        Leer nombre
        Escribir "Ingrese promedio ", Cont , " : "
        Leer promedio
        Si promedio>=0 y promedio<=20 Entonces
            Si prom_may<promedio Entonces
                prom_may<-promedio
                nom<-nombre
            FinSi		
        SiNo
            cont<-cont-1
        FinSi		
    FinPara
    Escribir "Mejor calificacion: ", nom
    Escribir "Promedio : ", prom_may
FinAlgoritmo
