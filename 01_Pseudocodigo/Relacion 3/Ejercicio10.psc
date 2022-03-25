Algoritmo sin_titulo
	Definir jug1, jug2 como cadena
	Escribir "Turno del jugador 1"
	Leer jug1
	Escribir "Turno del jugador 2"
	Leer jug2
	Si jug1=jug2 Entonces
		Escribir "Empate"
	SiNo
	Si jug1="piedra" & jug2="papel" Entonces
		Escribir "Gana el jugador 2"
	SiNo
		Si jug1="piedra" & jug2="tijera" Entonces
			Escribir "Gana el jugador 1"
		SiNo
			Si jug1="papel" & jug2="piedra" Entonces
				Escribir "Gana el jugador 1"
			SiNo
				Si jug1="papel" & jug2="tijera" Entonces
					Escribir "Gana el jugador 2"
				SiNo
					Si jug1="tijera" & jug2="piedra" Entonces
						Escribir "Gana el jugador 2"
					SiNo
						Si jug1="tijera" & jug2="papel" Entonces
							Escribir "Gana el jugador 1"
						SiNo
						fin si
					fin si		
				fin si			
			fin si				
		fin SI
	Fin Si
fin si
FinAlgoritmo
