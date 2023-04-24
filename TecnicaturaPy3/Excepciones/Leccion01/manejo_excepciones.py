from NumerosIgualesException import NumerosIgualesException
result = None

try:
    a = int(input('Digite un number: ')) #son variables locales dentro del try, no las podemos usar fuera de este
    b = int(input('Digite another number: '))
    if a == b:
        raise NumerosIgualesException('Son numbers iguales')
    result = a / b
except TypeError as e:
    print(f' Type Division Error: {type(e)}')
except ZeroDivisionError as e:
    print(f' Zero Division Error: {type(e)}')
except Exception as e:
    print(f'Error {type(e)}')
else:
    print('Funciona correctamente, sin excpt')
finally:
    print('Ejecucion de finally, se ejecuta si o si')

print(f'El resultado es: {result}')
print('seguimos')
