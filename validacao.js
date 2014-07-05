function validacao(form){
	
	if(document.form.nome.value==""){
		alert("nome vazio");
		
		document.form.nome.focus();
	
		return false;
	}
	
}
