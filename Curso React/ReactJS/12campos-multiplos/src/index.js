import React from 'react';
import {createRoot} from 'react-dom/client';

class MeuComponente extends React.Component{
    constructor(props){
        super(props)

        this.state = {
            nome: '',
            idade: null
        }
    }

    enviarParaState = (campo) => {
        this.setState({[campo.target.name]: campo.target.value});
    }

    render(){
        return(
            <form>
                <input type='text' placeholder='Nome' name='nome' onChange={this.enviarParaState} />
                <br/>
                <input type='number' placeholder='Idade' name='idade' onChange={this.enviarParaState} />
                <p>{this.state.nome}</p>
                <p>{this.state.idade}</p>
            </form>
        )
    }
}


let container = document.getElementById('root');
let root = createRoot(container);
root.render(<MeuComponente />);