
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
  window.location.href="quiz.html"

}
}
function restaurarPagina() {
  location.reload();
  window.location.href="Registro.html"
}   
