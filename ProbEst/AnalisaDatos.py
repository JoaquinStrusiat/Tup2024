import pandas as pd;
from Datos import *
import math
# df = pd.read_csv('c:/Users/joaqu/Documents/TUP 2024/Segundo Cuatrimestre/ProbEst/cars.csv')

# Leemos el array de datos y lo transformamos en una Serie
s = pd.Series(arrayDate)
box("Muestra",s)

#Calculamos el rango de nuestra muestra
rang = s.max() - s.min()
box("Rango de mi Muestra",rang)

#Número de intervalos para armar mi tabla
Numint =  1 + 3.3*math.log(s.size, 10)
box("Número de Intervalos", Numint)

#Amplitud de cada intervalo
Amp = rang / Numint
box("Amplitud de los Intervalos", Amp)



