# MANEJO DE CONTEXTO WITH: sintaxis simplificada, abre y cierra el archivo
# with open('prueba.txt', 'r', encoding='utf8') as archivo:
# print(archivo.read())
#  No hace falta ni el try ni finally, en el contexto de with lo que se ejecuta de manera automatica
# Utiliza diferentes metodos: __enter__ este es el que abre y __exit__ cierra
from ManejoArchivos import ManejoArchivos

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())
