class NumerosIgualesException (Exception): #extende de la clase padre exception
    def __init__(self, mensaje):
        self.message = mensaje