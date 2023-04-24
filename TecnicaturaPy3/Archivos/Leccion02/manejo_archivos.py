#  Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding= 'utf8')  # w de write
    archivo.write('Programamos con difrenetes tipos de archivos, ahora en txt. \n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y producción \n')
    archivo.write('Las letras son:\n r=Read, a=append w=Write x= crea un archivo \n')
    archivo.write('\n t= para texto, tipo de archivo text\nb=archivos binarios \nw+=write and read\n r+= lo mismo a w+\n')
    archivo.write('Terminamos')
except Exception as e:
    print(e)
finally:
    archivo.close()  # Con esto se debe cerrar el archivo
