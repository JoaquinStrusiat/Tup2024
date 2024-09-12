import pandas as pd;
from Datos import *
import math
# s = pd.read_csv('c:/Users/joaqu/Documents/TUP 2024/Segundo Cuatrimestre/ProbEst/cars.csv')

# Leemos el array de datos y lo transformamos en una Serie
s = pd.Series(arrayDate)
boxTable("Muestra de Datos",s)

#Calculamos el rango de nuestra muestra
rang = s.max() - s.min()
boxData("Rango de mi Muestra: ",rang)

#Número de intervalos para armar mi tabla
Numint =  1 + 3.3*math.log(s.size, 10)
boxData("Número de Intervalos: ", Numint)

#Amplitud de cada intervalo
Amp = rang / Numint
boxData("Amplitud de los Intervalos: ", Amp)



