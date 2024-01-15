    Algoritmo DontGiveMeFive
        Funcion NumeroContieneCinco(numero) Logico
            Mientras numero != 0 Hacer
                Si numero % 10 = 5 o numero % 10 = -5 Entonces
                    Devolver Verdadero
                FinSi
                numero = numero / 10
            Fin Mientras
            Devolver Falso
        FinFuncion

    Funcion ContarSinCinco(inicio, fin) Como Entero
        contador = 0
        Para i = inicio Hasta fin Con Paso 1 Hacer
            Si No NumeroContieneCinco(i) Entonces
                contador = contador + 1
            FinSi
        Fin Para
        Devolver contador
    FinFuncion

    // Ejemplo de llamada a la función
    Escribir ContarSinCinco(5, 17)
    FinAlgoritmo
