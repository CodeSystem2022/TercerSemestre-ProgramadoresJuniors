class ManejoArchivos:
    def __init__(self, name):
        self.name = name

    def __enter__(self):
        print('Obtener el recurso'.center(50, '-'))
        self.name = open(self.name, 'r', encoding='utf8')  # Encapsulamos el codigo dentro del metodo
        return self.name

    def __exit__(self, exc_type, exc_val, exc_tb):  # tb = texto del exception
        print('cerramos el recurso'.center(50, '-'))
        if self.name:  # si existe (esta abierto) hay que cerrarlo
            self.name.close()
