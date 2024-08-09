import React from 'react';
import { createRoot } from 'react-dom/client'

class Componente extends React.Component{

    render(){
        //vetor
        let cores = ['Azul', 'Amarelo', 'Vermelho'];

        //listar
        let listar = cores.map((cor, index) => {
            return <li key={index}>{index} - {cor}</li>
        });

        return(
            <ul>
                {listar}
            </ul>
        )
    }
}

const container = document.getElementById('root');
const root = createRoot(container); // createRoot(container!) if you use TypeScript
root.render(<Componente />);