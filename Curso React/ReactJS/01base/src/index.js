//Importar módulos
import React from 'react';
import ReactDOM from 'react-dom';

//Estrutura
const estrututra =
<div>
    <h1>Meu primeiro render</h1>
    <p>Testando...</p>
</div>

// Sem JSX
const elemento = React.createElement('h1', {}, 'Sem JSX');

ReactDOM.render(
    elemento,
    document.getElementById('root') 
);

// Com JSX
ReactDOM.render(
    <h1>Com JSX</h1>,
    document.getElementById('root')
);
