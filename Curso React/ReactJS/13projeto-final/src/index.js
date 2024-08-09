import React from 'react';
import {createRoot} from 'react-dom/client';
import Formulario from './formulario';
import Tabela from './tabela';
import './style.css';

class Principal extends React.Component{
    render(){
        return(
            <div>
                <Formulario/>
                <Tabela />
            </div>
        );
    }
}

let container = document.getElementById('root');
let root = createRoot(container);
root.render(<Principal />);  