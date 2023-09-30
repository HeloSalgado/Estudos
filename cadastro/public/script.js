
function entrar() {
    var nome = nome_usuario.value;
    var email = email_usuario.value;
    var senha = senha_usuario.value;

    if (nome.indexOf(nome[0]) < 0 || email.indexOf(email[0]) < 0 || senha.indexOf(senha[0]) < 0) {
        alert(`Campo obrigatório`)
    } else if (senha.length < 8 || email.indexOf('@') < 0 || email.indexOf('sptech') < email.indexOf('@')) {
        if (senha.length < 8) {
            alert(`Senha muito pequena`)
        } else {
            alert(`Email inválido`)
        }
    } else if (email.indexOf('@') > -1) {
        if (email.indexOf('sptech') > -1) {
            if (email.indexOf('sptech') > email.indexOf('@')) {
                if (email.toLowerCase().indexOf('@sptech') > -1) {
                    alert(`Tem domínio @sptech`)
                } else {
                    alert(`sptech não após o @`)
                }
            } else {
                alert(`@ aparece após sptech`)
            }
        } else {
            alert(`Não tem sptech`)
        }
    } else {
        alert(`Não tem @`)
    }





}