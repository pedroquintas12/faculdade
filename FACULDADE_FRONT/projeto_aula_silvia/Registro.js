function validarFormulario() {

  var dataNascimento = document.getElementById("dataNascimento").value;
  var dataAtual = new Date();
  var anoAtual = dataAtual.getFullYear();
  var mesAtual = dataAtual.getMonth() + 1;
  var diaAtual = dataAtual.getDate();

  var anoNascimento = parseInt(dataNascimento.split("-")[0]);
  var mesNascimento = parseInt(dataNascimento.split("-")[1]);
  var diaNascimento = parseInt(dataNascimento.split("-")[2]);

  var idade = anoAtual - anoNascimento;

  if (mesAtual < mesNascimento || (mesAtual === mesNascimento && diaAtual < diaNascimento)) {
      idade--;
  }

  if (idade >= 18) {
      alert("Você é maior de idade.");
  } else {
      alert("Você é menor de idade.");
      location.reload();
      return false    
    }


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

}