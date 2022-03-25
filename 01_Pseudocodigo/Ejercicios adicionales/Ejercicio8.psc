Algoritmo sin_titulo
	Definir num1, dec, und como Entero
	Definir decena, unidad como Caracter
	Escribir "Dime un numero de hasta 2 cifras: "
	Leer num1
	Si num1 > 0 Y num1 < 100 Entonces
		Si num1 > 10 Y num1 < 16 Entonces
			Segun num1 Hacer
				11: Escribir "Once"
				12: Escribir "Doce"
				13: Escribir "Trece"
				14: Escribir "Catorce"
				15: Escribir "Quince"
			FinSegun
		SiNo
			dec <- (num1 - (num1 MOD 10))/10
			und <- num1 MOD 10
			Segun dec Hacer
				1: decena <- "Diez"
				2: decena <- "Veinte"
				3: decena <- "Treinta"
				4: decena <- "Cuarenta"
				5: decena <- "Cincuenta"
				6: decena <- "Sesenta"
				7: decena <- "Setenta"
				8: decena <- "Ochenta"
				9: decena <- "Noventa"
			FinSegun
			Si und <> 0 Entonces
				Segun und Hacer
					1: unidad <- "Uno"
					2: unidad <- "Dos"
					3: unidad <- "Tres"
					4: unidad <- "Cuatro"
					5: unidad <- "Cinco"
					6: unidad <- "Seis"
					7: unidad <- "Siete"
					8: unidad <- "Ocho"
					9: unidad <- "Nueve"
				FinSegun
				Si dec = 1 Entonces
					decena <- "Dieci"
				FinSi
				Si dec = 2 Entonces
					decena <- "Veinti"
				FinSi
				Si dec > 2 Y dec < 10 Entonces
					Escribir decena, " y ", unidad
				SiNo
					Escribir decena, "", unidad
				FinSi
			SiNo
				Escribir decena
			FinSi
		FinSi
	SiNo
		Escribir "Numero incorrecto"
	FinSi
FinAlgoritmo
