
function validarRegistro() {
    var caixaRegistro = document.getElementById("caixa_registro").value;
    if (caixaRegistro == "") {
      alert("Por favor, preencha todos os campos");
      return false;
    }
    else{

        location.reload();
        alert("Vôce foi entrou na conta!");
        window.location.href="quiz.html"
    }
}
  