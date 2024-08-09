import React from 'react';
import { createRoot } from 'react-dom/client';
import './style.css';

class Componente extends React.Component{
    render(){
        const estilo = {
            color: 'blue',
            borderBottom: 'solid 5px pink',
            fontSize: '20px'
        };

        return(
            <div>
                <h1 style={{color: 'red', backgroundColor: 'gray'}}>CSS inline</h1>
                <h1 style={estilo}>CSS com variáveis e constantes</h1>
                <h1 className='minhaClasse'>CSS através de classes</h1>
            </div>
        )
    }
}

let container = document.getElementById('root');
let root = createRoot(container);
root.render(<Componente />);