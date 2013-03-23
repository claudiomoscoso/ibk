function loadBankInfo(){
	
	var xhr = $.ajax({
		  url: contextPath+"/servlet/login/LoadBankInfo",
		  cache: false
		});
	
	xhr.done(function( html ) {
		alert(html);
//		  $("#bankInfo").append(html);
		});
}