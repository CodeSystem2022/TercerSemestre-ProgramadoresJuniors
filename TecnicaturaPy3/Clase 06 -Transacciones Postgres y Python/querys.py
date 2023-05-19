import os
import psycopg2 as db
from dotenv import load_dotenv

load_dotenv()

conexion = db.connect(user=os.environ['USER_POSTGRES'], 
                      password=os.environ['PASSWORD_POSTGRES'],
                      host= os.environ['HOST_POSTGRES'],
                      port= os.environ['PORT_POSTGRES'],
                      database= os.environ['DATABASE_POSTGRES'])

try:
    conexion.autocommit = False
    cursor.conexion.cursor()

    # QUERYS
    sentencia = f'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    valores = ('Gaston', 'Franco', 'gaston@gmail.com')
    cursor.execute(sentencia, valores)

    sentencia = f'UPDATE persona SET nombre=%s, apellido=%s, email=%s'
    valores = ('Patricio', 'Estrella', 'patrick@gmail.com')
    cursor.execute(sentencia, valores)

    conexion.commit()
    print('termina la transacción')
except Exception as e:
    conexion.rollback()
    print(f'El error es: \n {e}')

finally:
    conexion.close()
