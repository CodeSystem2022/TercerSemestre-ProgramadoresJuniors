import psycopg2 # Esto es para poder conectarnos a Postgre

conexion = psycopg2.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
try:
    with conexion:
        with conexion.cursor() as cursor: # Cierra el recurso, sin necesidad de cursor.close()
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = (
                (' Juan Carlos', 'Roldan', 'jcroldan@gmail.com', 11),
                ('Romina', 'Ayala', 'rayalagmail.com', 8)
            ) # Es una tupla
            cursor.executemany(sentencia, valores) # Ejecutamos la sentencia
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')


except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()