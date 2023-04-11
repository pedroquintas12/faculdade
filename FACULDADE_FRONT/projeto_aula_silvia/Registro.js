function validarFormulario() {
  var caixas = document.getElementsByClassName("input");

  for (var i = 0; i < caixas.length; i++) {
    if (caixas[i].value == "") {
      alert("Por favor, preencha todas as caixas.");
      return false;
    }
}
if(caixas!= ""){

  location.reload();
  alert("Voce foi resgistrado!")
  window.location.href="quiz.html"

}

var idade = document.getElementsByClassName("input")

if  (idade<18){

  alert("Você é menor de idade")

}

}