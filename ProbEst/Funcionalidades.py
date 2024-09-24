import math
import pandas as pd;

def BoxData(titule, info):
    print(titule)
    print("")
    print(info)
    print("")

def toSerie(Array):
    serie = pd.Series(Array)
    return serie

def primaryDates(serie):
    print("---------------------- Datos Primarios ----------------------")
    #Valor mínimo de la serie
    print("Valor minimo: ", serie.min())

    #valoe máximo de la serie
    print("Valor maximo: ", serie.max())

    #Calculamos el rango de nuestra muestra
    Rang = serie.max() - serie.min()
    print("Rango: ", Rang)

    #Número de intervalos para armar mi tabla
    Numint =  1 + 3.3*math.log(serie.size, 10)
    print("Numero de intervalos posibles: ", Numint)

    #Amplitud de cada intervalo
    Amp = Rang / Numint
    print("Amplitud posible: ", Amp)
    print("-------------------------------------------------------------\n")

def createTable(serie):
    print("-------------------------------------------------------------")
    print("En base a los valores devueltos, ingrese el numero de \nintervalos y la amplitud con la que quiere trabajar.", 
        "\nTenga en cuenta que ambos tienen que ser enteros positivos...\n")

    intervalos = int(input("Intervalos: "))
    amplitud = float(input("Amplitud: "))
    print("-------------------------------------------------------------")

    object = {"Verd.Lim.Inf.": [],
              "Verd.Lim.Sup.": [],
              "Frec.Abs.":[],
              "Frec.Relativa.": [],
              "Frec.Abs.Acumu.": [],
              "Frec.Rel.Acumu.": []}
    
    for i in range(intervalos):
        # Agrego los límites inferiores
        if not object["Verd.Lim.Inf."]:
            object["Verd.Lim.Inf."].append(serie.min())
        else:
            object["Verd.Lim.Inf."].append(object["Verd.Lim.Sup."][-1])

        # Agrego los límites superiores
        nuevoLimSup = object["Verd.Lim.Inf."][-1] + amplitud
        object["Verd.Lim.Sup."].append(nuevoLimSup)

        # Frecuencia absoluta (ejemplo, debes calcular las frecuencias reales)
        freq_abs = (serie >= object["Verd.Lim.Inf."][-1]) & (serie < object["Verd.Lim.Sup."][-1])
        object["Frec.Abs."].append(freq_abs.sum())

        # Frecuencia relativa
        freq_rel = freq_abs.sum() / len(serie)
        object["Frec.Relativa."].append(freq_rel)

        # Frecuencia acumulada
        if not object["Frec.Abs.Acumu."]:
            object["Frec.Abs.Acumu."].append(freq_abs.sum())
        else:
            object["Frec.Abs.Acumu."].append(object["Frec.Abs.Acumu."][-1] + freq_abs.sum())

        # Frecuencia relativa acumulada
        if not object["Frec.Rel.Acumu."]:
            object["Frec.Rel.Acumu."].append(freq_rel)
        else:
            object["Frec.Rel.Acumu."].append(object["Frec.Rel.Acumu."][-1] + freq_rel)

    # Crear el DataFrame
    df = pd.DataFrame(object)
    print(df, "\n")

def centraTendencyMeasure(serie):
    print("-------------- Medidas de Tendencia Central----------------")

    #Calculamos la media
    media = serie.mean()
    print("Media Aritmética: ", media)

    #Calculamos Mediana
    mediana = serie.median()
    print("Mediana Aritmética: ", mediana)

    #Calculamos Moda
    moda = serie.mode()[0]
    print("Moda Aritmética: ", moda)

    print("-------------------------------------------------------------\n")

def dispersioMeasure(serie):
    print("------------------ Medidas de Dispersión --------------------")

    #Calculamos la media
    variance = serie.var()
    print("Varianza : ", variance)

    #Calculamos Desvio estandar
    stdVariance = serie.std()
    print("Desvio estandar: ", stdVariance)

    # Coeficiente variacion
    cv = (stdVariance/ serie.mean())
    print("Coeficiente variacion: ", cv, " ==> ", round(cv*100, 2), "%")

    # Asimetría 
    as1 = (serie.mean() - serie.mode()[0]) / stdVariance
    as2 = (3*(serie.mean() - serie.median())) / stdVariance
    print("Asimetría 1: ", as1)
    print("Asimetría 2: ", as2)
    if (as1 > 0 and as2 > 0):
        print("------ASIMETRIA POSITIVA------")
    else:
        print("------ASIMETRIA NEGATIVA------")
    print("-------------------------------------------------------------\n")