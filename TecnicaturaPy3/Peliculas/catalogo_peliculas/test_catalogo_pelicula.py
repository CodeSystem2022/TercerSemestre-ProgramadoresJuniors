from dominio.Pelicula import Pelicula
from servicio.Catalogo_Peliculas import CatalogoPeliculas as cp
option = None
while option != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula')
        print('2. Listar Peliculas')
        print('3. Eliminar catálogo de peliculas')
        print('4. Salir')
        option = int(input('Digite una opcion de menu 1-4: '))
        if option == 1:
            name_peli = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(name_peli)
            cp.agregar_peliculas(pelicula)
        elif option == 2:
            cp.listar_peliculas()
        elif option == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f'Ocurrió un error de tipo {e}')
        option = None
    else:
        print('Salimos del programa')

