const express = require('express');
const mysql = require('mysql');

const app = express();
const port = 3000;

const db = mysql.createConnection({
    host: process.env.MYSQL_HOST,
    user: process.env.MYSQL_USER,
    password: process.env.MYSQL_PASSWORD,
    database: process.env.MYSQL_DATABASE,
    port: process.env.MYSQL_PORT
});

db.connect(err => {
    if(err){
        console.log('Error de conexion a MYSQL: ', err);
        return;
    }
    console.log('Conexión con MySQL');
});

app.get('/', (req, res) => {
    res.send('¡Hola Mundo!');
});

app.listen(port, () => {
    console.log(`Servidor escuchando en el puerto ${port}`);
});