from Datos import *
from Funcionalidades import *

# Definimos Data como la variable que almacena nuestra información 
# ---MODIFICAR SOLO ACÁ ---
data = ArrayData
# -------------------------

# Printeamos los datos por pantalla
BoxData("Datos", data)

# Leemos el array de datos y lo transformamos en una Serie
serie = toSerie(data)

# Muestro por pantalla el Rango, el número de intervalos posibles y la amplitud posible
primaryDates(serie)

# Dado estos valores preguntamos al usuario lo siguiente:
print("En base a los valores devueltos, ingrese el numero de intervalos y la amplitud con la que quiere trabajar.", 
      "\nTenga en cuenta que ambos tienen que ser enteros positivos...")

Intervalos = int(input("Intervalos: "))
Amplitud = float(input("Amplitud: "))

createTable(serie, Intervalos, Amplitud)

