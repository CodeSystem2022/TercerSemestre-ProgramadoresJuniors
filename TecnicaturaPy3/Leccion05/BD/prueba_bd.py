import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user='postgres1', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor: # Cierra el recurso, sin necesidad de cursor.close()
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' # Placeholder
            id_persona = input('Digite un numero para el id persona: ')
            cursor.execute(sentencia, (id_persona,)) # Ejecutamos la sentencia
            registros = cursor.fetchone() # Recuperamos todos los registros (lista)
            print(registros)
except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()
# cursor.close()

