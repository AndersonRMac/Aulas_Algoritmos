import mysql.connector

conectado = mysql.connector.connect(
    user ='root',
    password = '12345',
    host = '127.0.0.1',
    database = 'alunos_presencial'
    
)
print('conectado com o banco')
cursor = conectado.cursor()
print(cursor)