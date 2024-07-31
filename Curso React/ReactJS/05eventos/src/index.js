import React from 'react';
import ReactDOM from 'react-dom';

class MeuComponente extends React.Component{
    // Função
    mensagem(nome){
        alert('Olá ' + nome);
        console.log(this);
    }

    minhaArrowFunction = (curso) => {
        alert('Estou fazendo o curso de ' + curso);
    }

    teclado = (obj) => {
        console.log(obj.target.value);
    }

    render(){
        return(
           <div>
                <button onClick={this.mensagem.bind(this, 'Heloisa')}>Clique aqui</button>
                <button onClick={() => this.minhaArrowFunction('ReactJS')}>Arrow Function</button>

                <hr/>
                <input type='text' onChange={this.teclado}/>
           </div> 
        ); 
    }
}

ReactDOM.render(
    <MeuComponente />,
    document.getElementById('root')
);