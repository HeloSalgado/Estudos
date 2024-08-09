import React from 'react';
import ReactDOM from 'react-dom';

class Componente extends React.Component{
    //construtor
    constructor(props){
        super(props);

        this.state = {exibir: false}
    }

    //função
    alterarState = () => {
        let converter = !this.state.exibir;

        this.setState({exibir: converter});
    }

    render(){
        //condicional
        let meuTexto = "";

        if(this.state.exibir === true){
            meuTexto = <h1>Olá! utilizando condicionais </h1>
        }

        return(
            <div>
                {meuTexto}
                <button onClick={this.alterarState}>Clique Aqui</button>
            </div>
        )
    }
}

ReactDOM.render(
    <Componente />,
    document.getElementById('root')
)