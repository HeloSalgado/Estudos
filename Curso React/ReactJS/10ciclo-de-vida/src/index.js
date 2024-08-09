import React from 'react';
import {createRoot} from 'react-dom/client';

class MeuComponente extends React.Component{
    constructor(props){
        super(props)

        this.state = {cor: 'vermelho'};
    }

    //depois de realizar o render
    componentDidMount(){
        setTimeout(() => {
            this.setState({cor: 'azul'});
        }, 2000);
    }

    render(){
        return(
            <div>
                <h1>Minha cor preferida é {this.state.cor}</h1>
            </div>
        )
    }
}

let container = document.getElementById('root');
let root = createRoot(container);

root.render(<MeuComponente />);