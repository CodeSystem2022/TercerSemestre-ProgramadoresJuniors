archivo = open('prueba.txt', 'r', encoding='utf8')  # r=Read, a=append w=Write x=
# \\ doble diagonal para poner la ruta del archivo ej c:\\carpetas\\prueba.txt
#  print(archivo.read())
#  print(archivo.read(5))  # 5 primeros caractertes de la primer palabra
#  print(archivo.read(5))  # 5 caractertes que siguen
#  iterar un archivo
#  for linea in archivo:
#      print(linea)
#  print(archivo.readlines()[11])
#  print(archivo.readline())


#anexamos info
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()
