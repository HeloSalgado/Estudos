import React from 'react';
import {createRoot} from 'react-dom/client';

class Componente extends React.Component{
    minhaFuncao = (elemento) => {
        elemento.preventDefault(); //evita de regarregar a página
        alert("Testando evento onSubmit")
    }

    render(){
        return(
            <form onSubmit={this.minhaFuncao}>
                <input type='submit' />
            </form>
        )
    }
}

let container = document.getElementById('root');
let root = createRoot(container);
root.render(<Componente />)
