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

# Dado estos valores preguntamos al usuario como crear la tabla y la mostramos por pantalla
createTable(serie)

# Mostramos las medidas de tendencia central
centraTendencyMeasure(serie)

# Mostramos las medidas de disperción
dispersioMeasure(serie)